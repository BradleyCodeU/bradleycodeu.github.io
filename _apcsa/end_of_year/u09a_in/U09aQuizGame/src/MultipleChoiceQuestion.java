import javax.swing.*;
import java.awt.*;


public class MultipleChoiceQuestion extends Question {
    // Declare instance variable to store options for the multiple-choice question.
    private String[] options;

    // Constructor for the MultipleChoiceQuestion class. Takes question text, correct answer, options, and points as parameters.
    public MultipleChoiceQuestion(String questionText, String correctAnswer, String[] options, int points) {
        // Call the superclass constructor (Question) with modified parameters.
        super(questionText, correctAnswer, points);
        // Assign the provided options to the instance variable.
        this.options = options;
    }

    // Getter method to retrieve the options for the multiple-choice question.
    public String[] getOptions() {
        // Return the stored options.
        return options;
    }


    @Override
    public void display(JPanel myJPanel) {
        myJPanel.removeAll();
        myJPanel.setLayout(new BorderLayout());
        JLabel questionLabel = new JLabel(getQuestionText());
        myJPanel.add(questionLabel, BorderLayout.NORTH);

        JPanel optionsPanel = new JPanel();
        optionsPanel.setLayout(new GridLayout(options.length, 1)); // One column for each radio button

        ButtonGroup buttonGroup = new ButtonGroup();
        for (int i = 0; i < options.length; i++) {
            JRadioButton radioButton = new JRadioButton(options[i]);
            buttonGroup.add(radioButton);
            optionsPanel.add(radioButton);
            //radioButtons[i] = radioButton; // Store the radio button
        }
        myJPanel.add(optionsPanel, BorderLayout.CENTER);
        myJPanel.revalidate();
        myJPanel.repaint();
    }

    @Override
    public String getUserAnswer(JPanel myJPanel) {
        JPanel optionsPanel = null;
        for (Component component : myJPanel.getComponents()) {
            if (component instanceof JPanel) {
                optionsPanel = (JPanel) component;
                break;
            }
        }
        if (optionsPanel != null) {
            // Iterate over the components of the options panel to find the radioButtons
            for (Component component : optionsPanel.getComponents()) {
                if (component instanceof JRadioButton) {
                    JRadioButton radioButton = (JRadioButton) component;
                    if (radioButton.isSelected()) {
                        return radioButton.getText();
                    }
                }
            }
        }
        return ""; // If no option selected, return an empty string
    }
    
    
}
