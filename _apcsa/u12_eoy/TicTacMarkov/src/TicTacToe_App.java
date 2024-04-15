import java.util.Scanner;

public class TicTacToe_App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TicTacToeMarkovChain markovChain = new TicTacToeMarkovChain(false, false);

        TicTacToeGame game;
        
        while (true) {
            game = new TicTacToeGame(markovChain);
            game.play(scanner);
            System.out.print("Do you want to play again? (y/n): ");
            String playAgain = scanner.nextLine().toLowerCase();
            if (playAgain.equals("n")) {
                System.out.println("Thank you for playing! Goodbye!");
                break;
            }
        }
        scanner.close();
    }
}
