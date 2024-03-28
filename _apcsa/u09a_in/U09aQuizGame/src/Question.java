import javax.swing.*;
import java.awt.*;

public class Question {
    // Declare instance variables to store question text, correct answer, and points.
    private String questionText;
    private String correctAnswer;
    private int points;

    public Question(String questionText, String correctAnswer){
        // Assign the provided question text to the instance variable.
        this.questionText = questionText;
        // Assign the provided correct answer to the instance variable.
        this.correctAnswer = correctAnswer;
        // Assume that points should be set to 1
        this.points = 1;
    }
    // Constructor for the Question class. Initializes instance variables with provided values.
    public Question(String questionText, String correctAnswer, int points) {
        // Assign the provided question text to the instance variable.
        this.questionText = questionText;
        // Assign the provided correct answer to the instance variable.
        this.correctAnswer = correctAnswer;
        // Assign the provided points to the instance variable.
        this.points = points;
    }

    // Getter method to retrieve the question text.
    public String getQuestionText() {
        // Return the stored question text.
        return questionText;
    }

    // Getter method to retrieve the correct answer.
    public String getCorrectAnswer() {
        // Return the stored correct answer.
        return correctAnswer;
    }

    // Getter method to retrieve the points associated with the question.
    public int getPoints(){
        // Return the stored points.
        return points;
    }


    // Display the question text and a text entry field
    public void display(JPanel myJPanel) {
        myJPanel.removeAll();
        myJPanel.setLayout(new BorderLayout());

        JLabel questionLabel = new JLabel(questionText);
        myJPanel.add(questionLabel, BorderLayout.NORTH);

        JTextField answerField = new JTextField();
        myJPanel.add(answerField, BorderLayout.CENTER);
        myJPanel.revalidate();
        myJPanel.repaint();
    }
    // Retrieve the user's answer
    public String getUserAnswer(JPanel myJPanel) {
        Component[] components = myJPanel.getComponents();
        for (Component component : components) {
            if (component instanceof JTextField) {
                return ((JTextField) component).getText().trim();
            }
        }
        return ""; // If no text field found, return an empty string
    }
}

