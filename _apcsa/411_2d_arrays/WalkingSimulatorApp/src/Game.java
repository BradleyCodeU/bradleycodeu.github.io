import java.util.Scanner;



public class Game {
    private Map gameMap;
    private int playerRow;
    private int playerCol;
    private Scanner input;

    // Constructor initializes the game state
    public Game() {

        // We'll start with a 2 x 2 grid, but your grid MUST be larger than 2 x 2.
        
        gameMap = new Map(2, 2); // TODO !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! 

        input = new Scanner(System.in);

        // Place player at a random starting location
        playerRow = (int) (Math.random() * gameMap.getRows());
        playerCol = (int) (Math.random() * gameMap.getCols());

        // Mark the starting square as visited
        gameMap.getLocation(playerRow, playerCol).setVisited(true);
    }

    public void play() {
        Location currentLocation = null;
        
        // The game continues until all locations are visited
        while (gameMap.getRemaining() > 0) {
            // 1. Show current status
            currentLocation = gameMap.getLocation(playerRow, playerCol);
            WalkingSimulatorApp.typewriter("\n-----------------------------------------\n");
            // this next line is for debugging only
            // it's more fun if the player's location data is hidden
            // System.out.println("You are at: (" + playerRow + ", " + playerCol + ")");
            WalkingSimulatorApp.typewriter("Description: " + currentLocation.getDescription() + "\n");
            WalkingSimulatorApp.typewriter("Locations remaining: " + gameMap.getRemaining() + "\n");
            
            // 2. Get user move
            WalkingSimulatorApp.typewriter("Enter move (n, s, e, w): ");
            String move = input.nextLine().toLowerCase();

            // 3. Process the move
            handleMove(move);
        }
        // print the final description
        WalkingSimulatorApp.typewriter("Description: " + currentLocation.getDescription() + "\n");
        WalkingSimulatorApp.typewriter("*****************************************\n");
        WalkingSimulatorApp.typewriter("Congratulations! You have explored the entire map.\n");
        WalkingSimulatorApp.typewriter("YOU WIN!\n");
        WalkingSimulatorApp.typewriter("*****************************************\n");
    }

    /**
     * Helper method to process movement logic.
     * Checks boundaries before updating the player's position.
     */
    private void handleMove(String move) {
        int nextRow = playerRow;
        int nextCol = playerCol;

        if (move.equals("n")) {
            nextRow--;
        } else if (move.equals("s")) {
            nextRow++;
        } else if (move.equals("e")) {
            nextCol++;
        } else if (move.equals("w")) {
            nextCol--;
        } else {
            WalkingSimulatorApp.typewriter("Invalid input. Use n, s, e, or w.\n");
            return;
        }

        // Validate coordinates: Don't let the player walk off the edge!
        if (gameMap.isValid(nextRow, nextCol)) {
            playerRow = nextRow;
            playerCol = nextCol;
            
            // Mark the new location as visited
            gameMap.getLocation(playerRow, playerCol).setVisited(true);
        } else {
            WalkingSimulatorApp.typewriter("Ouch! You hit the edge of the map. Try a different direction.\n");
        }
    }
}