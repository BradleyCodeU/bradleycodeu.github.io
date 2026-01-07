import javax.swing.*;
import java.awt.*;

public class TrueFalseQuestion extends MultipleChoiceQuestion {

    // Constructor for the TrueFalseQuestion class. Takes question text, correct answer, and points as parameters.
    public TrueFalseQuestion(String questionText, boolean correctAnswer, int points) {
        // Call the superclass constructor (MultipleChoiceQuestion) with modified parameters.
        super(questionText, Boolean.toString(correctAnswer), new String[]{"true", "false"}, points);
    }

   // Override the display method to customize the layout of true/false options.
@Override
public void display(JPanel myJPanel) {
    // Call the display method of the superclass to set up the basic layout.
    super.display(myJPanel);

    // Create true and false radio buttons.
    JRadioButton trueButton = new JRadioButton("true");
    JRadioButton falseButton = new JRadioButton("false");

    // Group the radio buttons.
    ButtonGroup buttonGroup1 = new ButtonGroup(); // Rename the variable to avoid duplication
    buttonGroup1.add(trueButton);
    buttonGroup1.add(falseButton);

    // Create a panel to contain the radio buttons.
    JPanel trueFalsePanel = new JPanel();
    trueFalsePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
    trueFalsePanel.add(trueButton);
    trueFalsePanel.add(falseButton);

    // Add the panel to the question panel.
    myJPanel.add(trueFalsePanel, BorderLayout.CENTER);
    }
   // Override the getUserAnswer method to retrieve the user's answer from the true/false radio buttons.
@Override
public String getUserAnswer(JPanel myJPanel) {
    // Get the true/false radio buttons from the panel.
    JRadioButton trueButton = null, falseButton = null;
    Component[] components = myJPanel.getComponents();
    for (Component component : components) {
        if (component instanceof JPanel) {
            Component[] subComponents = ((JPanel) component).getComponents();
            for (Component subComponent : subComponents) {
                if (subComponent instanceof JRadioButton) {
                    String buttonText = ((JRadioButton) subComponent).getText();
                    if (buttonText.equals("true")) {
                        trueButton = (JRadioButton) subComponent;
                    } else if (buttonText.equals("false")) {
                        falseButton = (JRadioButton) subComponent;
                    }
                }
            }
        }
    }

    // Check which radio button is selected and return the corresponding answer.
    if (trueButton != null && trueButton.isSelected()) {
        return "true";
    } else if (falseButton != null && falseButton.isSelected()) {
        return "false";
    } else {
        // If neither true nor false is selected, return an empty string.
        return "";
    }
}


}