import java.util.*;

public class TicTacToeGame {
    private char[][] board;
    private TicTacToeMarkovChain markovChain;
    private int size;
    private int wins;
    private int loses;
    private int draws;

    public TicTacToeGame(TicTacToeMarkovChain markovChain) {
        this.markovChain = markovChain;
        this.size = 3;
        this.board = new char[size][size];
        for (char[] row : board) {
            Arrays.fill(row, ' ');
        }
        System.out.println("Welcome to Tic Tac Toe against Markov Chain!");
        System.out.println("Markov Chain size = " + markovChain.getMarkovChainSize());
    }

    public void printBoard() {
        System.out.println("  a b c");
        for (int r = 0; r < size; r++) {
            System.out.print((r + 1) + " ");
            for (int c = 0; c < size; c++) {
                System.out.print(board[r][c]);
                if (c < size - 1) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (r < size - 1) {
                System.out.println("  " + "-".repeat(size * 2 - 1));
            }
        }
    }

    public void makeMove(int row, int col) {
        board[row][col] = 'X'; // Assuming the player is always 'X'
    }

    public boolean isCellEmpty(int row, int col) {
        return board[row][col] == ' ';
    }

    public boolean isGameOver() {
        return checkWinner() != null;
    }

    public void reset() {
        for (char[] row : board) {
            Arrays.fill(row, ' ');
        }
        // Randomly decide whether Markov goes first
        if (Math.random() > 0.5) {
            this.markovChainMove(); // Markov goes first
        }
    }

    public char[][] getBoard() {
        return board;
    }

    public int getWins() {
        return wins;
    }

    public int getLoses() {
        return loses;
    }

    public int getDraws() {
        return draws;
    }

    // Methods to update win, lose, and draw counts
    public void incrementWins() {
        wins++;
    }

    public void incrementLoses() {
        loses++;
    }

    public void incrementDraws() {
        draws++;
    }

    public TicTacToeMarkovChain getMarkovChain() {
        return markovChain;
    }

    public String checkWinner() {
        // Check rows for a winner
        for (int i = 0; i < size; i++) {
            if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return board[i][0] == 'X' ? "win" : "lose";
            }
        }

        // Check columns for a winner
        for (int i = 0; i < size; i++) {
            if (board[0][i] != ' ' && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                return board[0][i] == 'X' ? "win" : "lose";
            }
        }

        // Check diagonal from top-left to bottom-right
        if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return board[0][0] == 'X' ? "win" : "lose";
        }

        // Check diagonal from top-right to bottom-left
        if (board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return board[0][2] == 'X' ? "win" : "lose";
        }

        // Check for draw
        boolean isDraw = true;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == ' ') {
                    isDraw = false;
                    break;
                }
            }
            if (!isDraw) {
                break;
            }
        }
        if (isDraw) {
            return "draw";
        }

        // No winner or draw yet
        return null;
    }

    public void playerMove(Scanner scanner) {
        while (true) {
            try {
                System.out.print("Enter row (1-3): ");
                int row = Integer.parseInt(scanner.nextLine()) - 1;
                System.out.print("Enter column (a-c): ");
                char colChar = scanner.nextLine().toLowerCase().charAt(0);
                int col = colChar - 'a'; // Convert column letter to index
                if (row >= 0 && row < size && col >= 0 && col < size && board[row][col] == ' ') {
                    board[row][col] = 'X';
                    return;
                } else {
                    System.out.println("That cell is already taken or input is invalid. Try again.");
                }
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException ex) {
                System.out.println("Invalid input. Please enter valid row and column values.");
            }
        }
    }

    public void markovChainMove() {
        char[][] currentState = new char[size][size];
        for (int i = 0; i < size; i++) {
            currentState[i] = Arrays.copyOf(board[i], size);
        }
        board = markovChain.getNextMove(currentState);
    }

    public void play(Scanner scanner) {
        boolean gameOver = false;
        if (Math.random() > 0.5) {
            markovChain.setToOffense();
            markovChainMove();
            System.out.println("Markov Chain's move:");
        } else {
            markovChain.setToDefense();
        }
        printBoard();
        while (!gameOver) {
            playerMove(scanner);
            printBoard();
            String outcome = checkWinner();
            if (outcome != null) {
                if (outcome.equals("win")) {
                    System.out.println("Congratulations! You won!");
                    markovChain.addLoss();
                } else if (outcome.equals("lose")) {
                    System.out.println("You lost. Better luck next time!");
                    markovChain.addWin();
                } else if (outcome.equals("draw")) {
                    System.out.println("It's a draw!");
                    markovChain.addDraw();
                }
                gameOver = true;
            }

            if (!gameOver) {
                markovChainMove();
                System.out.println("Markov Chain's move:");
                printBoard();
                outcome = checkWinner();
                if (outcome != null) {
                    if (outcome.equals("win")) {
                        System.out.println("Congratulations! You won!");
                        markovChain.addLoss();
                    } else if (outcome.equals("lose")) {
                        System.out.println("You lost. Better luck next time!");
                        markovChain.addWin();
                    } else if (outcome.equals("draw")) {
                        System.out.println("It's a draw!");
                        markovChain.addDraw();
                    }
                    gameOver = true;
                }
            }
        }
    }
}
