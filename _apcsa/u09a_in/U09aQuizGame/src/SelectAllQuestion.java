import javax.swing.*;
import java.awt.*;

public class SelectAllQuestion extends MultipleChoiceQuestion {

    // Constructor for SelectAllQuestion class. Takes question text, options, correct options, and points as parameters.
    public SelectAllQuestion(String questionText, String[] options, String[] correctOptions, int points) {
        // Call the superclass constructor for MultipleChoiceQuestion with modified parameters.
        super(questionText, mergeCorrect(correctOptions), options, points);
    }

    // Method to merge the correct options into a single string.
    private static String mergeCorrect(String[] correctOptions){
        // Initialize an empty string to store the merged correct options.
        String correctAnswer = "";
        // Iterate through each correct option.
        for(String each : correctOptions){
            // Concatenate each correct option to the string with a comma and space.
            correctAnswer += each + ", ";
        }
        // Remove the last 2 characters, which are the trailing comma and space.
        return correctAnswer.substring(0, correctAnswer.length()-2);
    }

    @Override
    public void display(JPanel myJPanel) {
        myJPanel.removeAll();
        myJPanel.setLayout(new BorderLayout());
        JLabel questionLabel = new JLabel(getQuestionText());
        myJPanel.add(questionLabel, BorderLayout.NORTH);
        JPanel optionsPanel = new JPanel();
        optionsPanel.setLayout(new GridLayout(0, 1)); // One column for checkboxes
        JCheckBox[] checkBoxes = new JCheckBox[super.getOptions().length];
        for (int i = 0; i < super.getOptions().length; i++) {
            checkBoxes[i] = new JCheckBox(super.getOptions()[i]);
            optionsPanel.add(checkBoxes[i]);
        }
        myJPanel.add(optionsPanel, BorderLayout.CENTER);
        myJPanel.revalidate();
        myJPanel.repaint();
    }
    @Override
    public String getUserAnswer(JPanel myJPanel) {
        StringBuilder userAnswer = new StringBuilder();
        // Find the panel containing the checkboxes
        JPanel optionsPanel = null;
        for (Component component : myJPanel.getComponents()) {
            if (component instanceof JPanel) {
                optionsPanel = (JPanel) component;
                break;
            }
        }
        if (optionsPanel != null) {
            // Iterate over the components of the options panel to find the checkboxes
            for (Component component : optionsPanel.getComponents()) {
                if (component instanceof JCheckBox) {
                    JCheckBox checkBox = (JCheckBox) component;
                    if (checkBox.isSelected()) {
                        userAnswer.append(checkBox.getText()).append(", ");
                    }
                }
            }
        }
        if (userAnswer.length() > 0) {
            userAnswer.delete(userAnswer.length() - 2, userAnswer.length()); // Remove the last comma and space
        }
        return userAnswer.toString();
    }
}
