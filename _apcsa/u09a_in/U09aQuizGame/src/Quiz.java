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
    
        questions[currentQuestionIndex].display(panel);
    
        // Add the panel to the JFrame
        add(panel, BorderLayout.CENTER);
    
         // Add the submit button
         JButton submitButton = new JButton("Submit");
         submitButton.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 String userAnswer = questions[currentQuestionIndex].getUserAnswer(panel);
                 String correctAnswer = questions[currentQuestionIndex].getCorrectAnswer();
                 if (userAnswer.equalsIgnoreCase(correctAnswer)) {
                     JOptionPane.showMessageDialog(Quiz.this, "Correct!");
                     currentQuestionIndex++;
                     if (currentQuestionIndex < questions.length) {
                         panel.removeAll();
                         questions[currentQuestionIndex].display(panel);
                         pack();
                     } else {
                         JOptionPane.showMessageDialog(Quiz.this, "Quiz completed!");
                         dispose(); // Close the window when the quiz is completed
                     }
                 } else {
                     JOptionPane.showMessageDialog(Quiz.this, "Incorrect. Try again.");
                 }
             }
         });
        add(submitButton, BorderLayout.SOUTH);
    
        pack(); // Sizes the frame to fit the preferred size and layout of its subcomponents
    }
    

    // private void adjustWindowSize() {
    //     Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    //     Dimension panelSize = getPreferredSize();

    //     // Check if the panel width is greater than the screen width
    //     if (panelSize.width > screenSize.width) {
    //         // Set the width of the window to the screen width
    //         setSize(screenSize.width, getHeight());
    //     } else {
    //         // Resize the window to fit the panel size
    //         pack();
    //     }

    //     // Set the maximum width for the answer field
    //     int maxAnswerFieldWidth = getWidth() / 2; // Set a fraction of the window width as the maximum width for the answer field
    // }

}
