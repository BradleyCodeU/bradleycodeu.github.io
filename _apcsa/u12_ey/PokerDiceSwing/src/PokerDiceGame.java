import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PokerDiceGame extends JFrame {
    private int[] dice;
    private int rollsRemaining;
    private JPanel dicePanel;
    private JLabel resultLabel;
    private JLabel rollsLabel;
    private JButton rollButton;
    private JButton playAgainButton;

    public PokerDiceGame() {
        setTitle("Poker Dice Game");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        dicePanel = new JPanel(new GridLayout(1, 5));
        resultLabel = new JLabel();
        rollsLabel = new JLabel("Rolls: 3     ");
        rollButton = new JButton("Roll Dice");
        playAgainButton = new JButton("Play Again");

        rollButton.addActionListener(new RollButtonListener());
        playAgainButton.addActionListener(new PlayAgainButtonListener());

        add(dicePanel, BorderLayout.NORTH);
        add(rollButton, BorderLayout.EAST);
        add(resultLabel, BorderLayout.CENTER);
        add(playAgainButton, BorderLayout.SOUTH);
        add(rollsLabel, BorderLayout.WEST);

        dice = new int[5];
        resetDice();
        createDiceButtons();

        updateResultLabel("");
        rollsRemaining = 3;
        pack();
        setVisible(true);
    }

    private void resetDice() {
        for (int i = 0; i < dice.length; i++) {
            dice[i] = 0;
        }
    }

    private void rollDice() {
        for (int i = 0; i < dice.length; i++) {
            if (dice[i] == 0) {
                dice[i] = (int) (Math.random() * 6) + 1;
            }
        }
    }

    private void createDiceButtons() {
        dicePanel.removeAll();
        for (int i = 0; i < dice.length; i++) {
            JPanel diceButtonPanel = new JPanel(new BorderLayout());

            JButton diceButton = new JButton(Integer.toString(dice[i]));
            JCheckBox rerollCheckbox = new JCheckBox("Reroll");

            diceButtonPanel.add(diceButton, BorderLayout.CENTER);
            diceButtonPanel.add(rerollCheckbox, BorderLayout.SOUTH);

            dicePanel.add(diceButtonPanel);
        }
        dicePanel.revalidate();
        dicePanel.repaint();
    }

    private void updateResultLabel(String result) {
        resultLabel.setText("Result: " + result);
    }

    private void updateRollsLabel() {
        rollsLabel.setText("Rolls: " + rollsRemaining + "     ");
    }

    private class RollButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (rollsRemaining > 0) {
                rollsRemaining--;
                updateRollsLabel();
                for (int i = 0; i < dice.length; i++) {
                    JPanel diceButtonPanel = (JPanel) dicePanel.getComponent(i);
                    JCheckBox rerollCheckbox = (JCheckBox) diceButtonPanel.getComponent(1);
                    if (rerollCheckbox.isSelected()) {
                        dice[i] = 0;
                    }
                }
                rollDice();
                createDiceButtons();
                String result = getResult(dice); // Calculate result after rolling dice
                updateResultLabel(result); // Update result label with the calculated result
                if (rollsRemaining == 0) {
                    rollButton.setEnabled(false);
                }
            }
        }
    }

    private class PlayAgainButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int option = JOptionPane.showConfirmDialog(null, "Do you want to play again?", "Play Again",
                    JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                resetDice();
                createDiceButtons();
                rollButton.setEnabled(true);
                updateResultLabel("");
                rollsRemaining = 3;
                updateRollsLabel();
            } else {
                System.exit(0);
            }
        }
    }

    public static int[] getCounts(int[] dice) {
        int[] counts = new int[10];
        for (int die : dice) {
            counts[die - 1]++;
        }
        return counts;
    }

    public static String getResult(int[] dice) {
        int[] counts = getCounts(dice);
        boolean fiveOfAKind = false;
        boolean fourOfAKind = false;
        boolean fullHouse = false;
        boolean threeOfAKind = false;
        boolean twoPair = false;
        boolean onePair = false;
        boolean straight = false;

        if (counts[0] == counts[1] &&
                counts[1] == counts[2] &&
                counts[2] == counts[3] &&
                counts[3] == counts[4]) {
            straight = true;
        }
        if (counts[5] == counts[1] &&
                counts[1] == counts[2] &&
                counts[2] == counts[3] &&
                counts[3] == counts[4]) {
            straight = true;
        }

        for (int count : counts) {
            if (count == 5) {
                fiveOfAKind = true;
            } else if (count == 4) {
                fourOfAKind = true;
            } else if (count == 3) {
                threeOfAKind = true;
            } else if (count == 2) {
                if (onePair) {
                    twoPair = true;
                } else {
                    onePair = true;
                }
            }
        }

        if (fiveOfAKind) {
            return "Five of a Kind";
        } else if (fourOfAKind) {
            return "Four of a Kind";
        } else if (straight) {
            return "Straight";
        } else if (threeOfAKind && onePair) {
            return "Full House";
        } else if (threeOfAKind) {
            return "Three of a Kind";
        } else if (twoPair) {
            return "Two Pair";
        } else if (onePair) {
            return "One Pair";
        } else {
            int highestValue = 0;
            for (int die : dice) {
                if (die > highestValue) {
                    highestValue = die;
                }
            }
            return "High Card: " + highestValue;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new PokerDiceGame();
            }
        });
    }
}
