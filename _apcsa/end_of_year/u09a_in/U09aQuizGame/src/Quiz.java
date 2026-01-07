import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quiz extends JFrame {
    private Question[] questions;
    private int currentQuestionIndex;
    private JPanel panel;

    public Quiz(Question[] questions) {
        this.questions = questions;
        this.currentQuestionIndex = 0;
        setTitle("Quiz");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 200);
        setLocationRelativeTo(null); // Center the window
        initUI();
        setVisible(true);
    }

    private void initUI() {
        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20)); // Add 10 pixels of padding
        questions[currentQuestionIndex].display(panel);

        // Add the panel to the JFrame
        add(panel, BorderLayout.CENTER);

        // Add the submit button
        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                submitAnswer();
            }
        });
        add(submitButton, BorderLayout.SOUTH);

        // Add ActionListener to text fields to capture Enter key press event
        for (Component component : panel.getComponents()) {
            if (component instanceof JTextField) {
                JTextField textField = (JTextField) component;
                textField.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        submitAnswer();
                    }
                });
            }
        }
        setSize(800, 200);
        //pack(); // Sizes the frame to fit the preferred size and layout of its subcomponents
    }

    private void submitAnswer() {
        String userAnswer = questions[currentQuestionIndex].getUserAnswer(panel);
        String correctAnswer = questions[currentQuestionIndex].getCorrectAnswer();
        if (userAnswer.equalsIgnoreCase(correctAnswer)) {
            JOptionPane.showMessageDialog(Quiz.this, "Correct!");
            currentQuestionIndex++;
            if (currentQuestionIndex < questions.length) {
                panel.removeAll();
                questions[currentQuestionIndex].display(panel);
                setSize(800, 200);
                setupActionListeners(panel);
            } else {
                JOptionPane.showMessageDialog(Quiz.this, "Quiz completed!");
                dispose(); // Close the window when the quiz is completed
            }
        } else {
            JOptionPane.showMessageDialog(Quiz.this, "Incorrect. Try again.");
        }
    }

    public void setupActionListeners(JPanel panel){
        // Add ActionListener to text fields to capture Enter key press event
        for (Component component : panel.getComponents()) {
            if (component instanceof JTextField) {
                JTextField textField = (JTextField) component;
                textField.addActionListener(e -> submitAnswer());
            } 
        }
    }
    


}
