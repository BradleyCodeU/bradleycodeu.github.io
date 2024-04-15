import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicTacToeGUI extends JFrame {
    private JButton[][] buttons;
    private TicTacToeGame game;
    private JLabel statusLabel;
    private JLabel settingsLabel;

    public TicTacToeGUI(TicTacToeGame game) {
        super("Tic Tac Toe");
        this.game = game;
        buttons = new JButton[3][3];

        JPanel panel = new JPanel(new GridLayout(3, 3));

        // Create buttons and add action listeners
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                buttons[row][col] = new JButton("");
                buttons[row][col].setFont(new Font("Arial", Font.PLAIN, 40));
                final int r = row, c = col;
                buttons[row][col].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        buttonClicked(r, c);
                    }
                });
                panel.add(buttons[row][col]);
            }
        }

        getContentPane().add(panel, BorderLayout.CENTER);

        statusLabel = new JLabel("Wins: 0\nLoses: 0\nDraws: 0", SwingConstants.CENTER);
        statusLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        getContentPane().add(statusLabel, BorderLayout.NORTH);

        settingsLabel = new JLabel("obvious moves: " + game.getMarkovChain().canMakeObviousMoves() + ", trained: " + game.getMarkovChain().isTrained(), SwingConstants.CENTER);
        settingsLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        getContentPane().add(settingsLabel, BorderLayout.SOUTH);

        setSize(300, 350); // Increased height to accommodate the status label and settings label
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        if(Math.random()>0.5){
            game.markovChainMove();
            updateButtons();
        }
        
    }

    private void buttonClicked(int row, int col) {
        if (game.isCellEmpty(row, col) && !game.isGameOver()) {
            game.makeMove(row, col);
            updateButtons();
            String outcome = game.checkWinner();
            if (outcome != null) {
                JOptionPane.showMessageDialog(this, getOutcomeMessage(outcome));
                game.reset();
                updateButtons();
            } else {
                game.markovChainMove(); // Make Markov Chain move
                updateButtons();
                outcome = game.checkWinner();
                if (outcome != null) {
                    JOptionPane.showMessageDialog(this, getOutcomeMessage(outcome));
                    game.reset();
                    updateButtons();
                }
            }
        }
    }

    private void updateButtons() {
        char[][] board = game.getBoard();
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                buttons[row][col].setText(Character.toString(board[row][col]));
            }
        }
        // Update status label
        statusLabel.setText("Wins: " + game.getWins() + "\nLoses: " + game.getLoses() + "\nDraws: " + game.getDraws());
    }

    private String getOutcomeMessage(String outcome) {
        switch (outcome) {
            case "win":
                game.incrementWins();
                return "Congratulations! You won!";
            case "lose":
                game.incrementLoses();
                return "You lost. Better luck next time!";
            default:
                game.incrementDraws();
                return "It's a draw!";
        }
    }

    public static void main(String[] args) {
        boolean canMakeObviousMoves = false;
        boolean canTrain = false;

        // Prompt the user for the first question
        int reply = JOptionPane.showConfirmDialog(null, "Should Markov make obvious moves?", "Markov Moves", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            canMakeObviousMoves = true;
        }

        // Prompt the user for the second question
        reply = JOptionPane.showConfirmDialog(null, "Should Markov train with winning strategies?", "Markov Training", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            canTrain = true;
        }

        TicTacToeMarkovChain markovChain = new TicTacToeMarkovChain(canMakeObviousMoves, canTrain);
        TicTacToeGame game = new TicTacToeGame(markovChain);
        TicTacToeGUI gui = new TicTacToeGUI(game);
    }
}
