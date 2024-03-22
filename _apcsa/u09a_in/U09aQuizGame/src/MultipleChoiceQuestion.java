import javax.swing.*;
import java.awt.*;


public class MultipleChoiceQuestion extends Question {
    private String[] options;
    private JRadioButton[] radioButtons;

    public MultipleChoiceQuestion(String questionText, String correctAnswer, String[] options, int points) {
        super(questionText, correctAnswer, points);
        this.options = options;
        this.radioButtons = new JRadioButton[options.length];
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
            radioButtons[i] = radioButton; // Store the radio button
        }

        myJPanel.add(optionsPanel, BorderLayout.CENTER);

        myJPanel.revalidate();
        myJPanel.repaint();
    }

    @Override
    public String getUserAnswer(JPanel myJPanel) {
        for (JRadioButton radioButton : radioButtons) {
            if (radioButton.isSelected()) {
                return radioButton.getText();
            }
        }
        return ""; // If no option selected, return an empty string
    }
}
