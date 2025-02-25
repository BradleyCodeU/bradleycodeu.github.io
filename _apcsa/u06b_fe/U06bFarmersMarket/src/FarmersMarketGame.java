import java.util.Scanner;

public class FarmersMarketGame {
    private FarmersMarket[] markets;
    private Player player;
    private Scanner scanner;

    public FarmersMarketGame(int numMarkets) {
        // Instantiate the array of FarmersMarket objects
        markets = new FarmersMarket[numMarkets];
        for (int i = 0; i < numMarkets; i++) {
            markets[i] = new FarmersMarket();
        }

        // Instantiate a Player object
        player = new Player(100, 50, 20, 1000.0, 0); // Initial location is the first market

        // Instantiate a Scanner object for user input
        scanner = new Scanner(System.in);
    }

    public void runGame() {
        // Simulate the game
        while(true) {
            // Random changes and updates for all markets
            for (FarmersMarket market : markets) {
                market.updateAllTrackers();
            }
            System.out.println("---------------------------------------------------");
            System.out.println(markets[player.getCurrentLocation()]);
            System.out.println(player);

            // Prompt user for action
            System.out.print("What do you want to do? (b = buy, s = sell, m = move to next location, q = quit): ");
            String action = scanner.nextLine();

            // Process user action
            switch (action) {
                case "b":
                    buyAction();
                    break;
                case "s":
                    sellAction();
                    break;
                case "m":
                    moveAction();
                    break;
                case "q":
                    return;
                default:
                    System.out.println("Invalid action!");
            }

            // // Print player's information
            // System.out.println("Player's Information:");
            // System.out.println(player);
            // System.out.println();
            if(player.getMoney() > 2000){
                System.out.println(player);
                for(int i=0;i<"YOU WIN!!!!!!!".length();i++){
                    System.out.println("YOU WIN!!!!!!!".substring(0,i));
                    
                }
                break;
            }
        }
        // Close scanner
        scanner.close();
    }

    private void buyAction() {
        System.out.print("What do you want to buy? (c = corn, a = apples, e = eggs): ");
        String item = scanner.nextLine();
        switch (item) {
            case "c":
                buyItem("corn");
                break;
            case "a":
                buyItem("apples");
                break;
            case "e":
                buyItem("eggs");
                break;
            default:
                System.out.println("Invalid item!");
        }
    }
    
    private void buyItem(String item) {
        PriceTracker priceTracker = markets[player.getCurrentLocation()].getPriceTracker(item);
        double price = priceTracker.getPrice();
        int availableSupply = markets[player.getCurrentLocation()].getAvailableSupply(item);
        int maxQuantityAffordable = (int) (player.getMoney() / price);
    
        System.out.print("Buy how many?: ");
        if (scanner.hasNextInt()) {
            int quantityToBuy = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
    
            if (quantityToBuy <= 0) {
                System.out.println("Invalid quantity!");
            } else if (quantityToBuy > availableSupply) {
                System.out.println("Not enough supply available!");
            } else if (quantityToBuy > maxQuantityAffordable) {
                System.out.println("You don't have enough money to buy that much!");
            } else {
                double totalPrice = price * quantityToBuy;
                player.buyItem(item, quantityToBuy, totalPrice, markets);
            }
        } else {
            System.out.println("Invalid input! Please enter a valid quantity.");
            scanner.nextLine(); // Consume invalid input
        }
    }
    
    

    private void sellAction() {
        System.out.print("What do you want to sell? (c = corn, a = apples, e = eggs): ");
        String item = scanner.nextLine();
        switch (item) {
            case "c":
                // Sell corn
                player.sellCorn(markets);
                break;
            case "a":
                // Sell apples
                player.sellApples(markets);
                break;
            case "e":
                // Sell eggs
                player.selleggs(markets);
                break;
            default:
                System.out.println("Invalid item!");
        }
    }

    private void moveAction() {
        // Randomly select a market to move to
        player.move(markets);
        System.out.println("Moved to a new location.");
    }

    
}

// Rest of the classes remain the same...
