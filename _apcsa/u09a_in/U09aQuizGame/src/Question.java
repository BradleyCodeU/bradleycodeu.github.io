import javax.swing.*;
import java.awt.*;

public class Question {
    private String questionText;
    private String correctAnswer;
    private int points;

    public Question(String questionText, String correctAnswer, int points) {
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
        this.points = points;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public int getPoints(){
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

