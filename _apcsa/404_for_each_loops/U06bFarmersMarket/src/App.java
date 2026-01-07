public class App {
    public static void main(String[] args) {
        System.out.println("\n");
        // Print top border
        for (int i = 0; i < "FARMERS MARKET GAME".length() + 4; i++) {
            System.out.print("*");
        }
        System.out.println();

        // Print sides with word
        System.out.println("* " + "FARMERS MARKET GAME" + " *");

        // Print bottom border
        for (int i = 0; i < "FARMERS MARKET GAME".length() + 4; i++) {
            System.out.print("*");
        }
        System.out.println("\n\n You start with $1000.00 and some apples, corn, and eggs.\n\n  How long will it take you to double your money???");
        FarmersMarketGame game = new FarmersMarketGame(3); // Create a game with 3 markets
        game.runGame();
    }
}
