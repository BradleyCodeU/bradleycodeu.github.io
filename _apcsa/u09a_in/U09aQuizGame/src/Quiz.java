import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quiz extends JFrame {
    private Question[] questions;
    private int currentQuestionIndex;
    private JLabel questionLabel;
    private JTextField answerField;
    private JButton submitButton;

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
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
    
        questionLabel = new JLabel(questions[currentQuestionIndex].getQuestionText());
        panel.add(questionLabel, BorderLayout.NORTH);
    
        answerField = new JTextField();
        answerField.setColumns(questions[currentQuestionIndex].getQuestionText().length() + 5); // Adjusting the width of the answer field
        JPanel answerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        answerPanel.add(answerField);
        panel.add(answerPanel, BorderLayout.CENTER);
    
        submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userAnswer = answerField.getText().trim();
                String correctAnswer = questions[currentQuestionIndex].getCorrectAnswer();
                if (userAnswer.equalsIgnoreCase(correctAnswer)) {
                    JOptionPane.showMessageDialog(Quiz.this, "Correct!");
                    currentQuestionIndex++;
                    if (currentQuestionIndex < questions.length) {
                        questionLabel.setText(questions[currentQuestionIndex].getQuestionText());
                        answerField.setText("");
                        adjustWindowSize(); // Adjust window size for new question text
                        //answerField.setColumns(questions[currentQuestionIndex].getQuestionText().length() + 5); // Adjusting the width of the answer field for the new question
                    } else {
                        JOptionPane.showMessageDialog(Quiz.this, "Quiz completed!");
                        dispose(); // Close the window when the quiz is completed
                    }
                } else {
                    JOptionPane.showMessageDialog(Quiz.this, "Incorrect. Try again.");
                }
            }
        });
        panel.add(submitButton, BorderLayout.SOUTH);
    
        add(panel);
        pack(); // Sizes the frame to fit the preferred size and layout of its subcomponents
    }
    
    private void adjustWindowSize() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension panelSize = getPreferredSize();
    
        // Check if the panel width is greater than the screen width
        if (panelSize.width > screenSize.width) {
            // Set the width of the window to the screen width
            setSize(screenSize.width, getHeight());
        } else {
            // Resize the window to fit the panel size
            pack();
        }
    
        // Set the maximum width for the answer field
        int maxAnswerFieldWidth = getWidth() / 2; // Set a fraction of the window width as the maximum width for the answer field
    
        // Set the width of the answer field
        answerField.setColumns(Math.min(maxAnswerFieldWidth / 10, 20)); // Adjust the division factor for better spacing and limit to maximum of 20 columns
    }
    
    
    
    

    
    
    
    


}
