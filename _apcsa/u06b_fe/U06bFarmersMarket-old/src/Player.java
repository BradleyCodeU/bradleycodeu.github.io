public class Player {
    private int corn;
    private int apples;
    private int eggs;
    private double money;
    private int currentLocationIndex;

    public Player(int corn, int apples, int eggs, double money, int currentLocationIndex) {
        this.corn = corn;
        this.apples = apples;
        this.eggs = eggs;
        this.money = money;
        this.currentLocationIndex = currentLocationIndex;
    }

    public int getCurrentLocation(){
        return currentLocationIndex;
    }

    public void move(FarmersMarket[] markets){
        this.currentLocationIndex = (this.currentLocationIndex + 1) % markets.length;
    }

    public void sellCorn(FarmersMarket[] markets) {
        double salePrice = markets[currentLocationIndex].getPriceTracker("corn").getPrice();
        money += salePrice * corn;
        markets[currentLocationIndex].getPriceTracker("corn").addSupply(corn);
        corn = 0;
    }

    public void sellApples(FarmersMarket[] markets) {
        double salePrice = markets[currentLocationIndex].getPriceTracker("apples").getPrice();
        money += salePrice * apples;
        markets[currentLocationIndex].getPriceTracker("apples").addSupply(corn);
        apples = 0;
    }

    public void selleggs(FarmersMarket[] markets) {
        double salePrice = markets[currentLocationIndex].getPriceTracker("eggs").getPrice();
        money += salePrice * eggs;
        markets[currentLocationIndex].getPriceTracker("eggs").addSupply(corn);
        eggs = 0;
    }

    // Getter and setter methods for other attributes

    public String toString() {
        return "Player has... \n  Corn:   " + corn + "\n  Apples: " + apples + "\n  Eggs:   " + eggs + "\n  Money:  " + String.format("%.2f", money);
    }

    public double getMoney() {
        return money;
    }

    public void buyItem(String item, int quantityToBuy, double totalPrice, FarmersMarket[] markets) {
        if (totalPrice > money) {
            return;
        }

        // Deduct the total price from the available money
        money -= totalPrice;

        // Update the inventory based on the purchased item
        switch (item) {
            case "corn":
                if(quantityToBuy > markets[currentLocationIndex].getPriceTracker("corn").getSupply()){
                    return;
                }
                corn += quantityToBuy;
                markets[currentLocationIndex].getPriceTracker("corn").addSupply(-quantityToBuy);
                break;
            case "apples":
            if(quantityToBuy > markets[currentLocationIndex].getPriceTracker("apples").getSupply()){
                return;
            }
                apples += quantityToBuy;
                markets[currentLocationIndex].getPriceTracker("apples").addSupply(-quantityToBuy);
                break;
            case "eggs":
            if(quantityToBuy > markets[currentLocationIndex].getPriceTracker("eggs").getSupply()){
                return;
            }
                eggs += quantityToBuy;
                markets[currentLocationIndex].getPriceTracker("eggs").addSupply(-quantityToBuy);
                break;
            default:
                return;
        }
    }
}
