public class PriceTracker {
    private int supply;
    private int demand;
    private double price;
    private double previousPrice;
    private double minimumPrice;

    public PriceTracker(int supply, int demand, double price) {
        this.supply = supply;
        this.demand = demand;
        this.price = price;
        this.previousPrice = price;
        this.minimumPrice = 1 + Math.random() + Math.random();
        // allow the price to reach a more normal level by updating 100 times
        for(int i=0;i<100;i++){
            update();
        }
    }

    public void update() {
        randomChange();
        // Adjust demand based on price
        if (price > previousPrice) {
            demand -= (int) (Math.random() * 6) + (int) (Math.random() * 6);  // Decrease demand if price is above average price
        } else if (price < previousPrice) {
            demand += (int) (Math.random() * 6) + (int) (Math.random() * 6);  // Increase demand if price is below average price
        }

        // Adjust supply based on price
        if (price > previousPrice) {
            supply -= (int) (Math.random() * 6) + (int) (Math.random() * 6);  // Decrease supply if price exceeds average price
        } else if (price < previousPrice) {
            supply += (int) (Math.random() * 6) + (int) (Math.random() * 6);  // Increase supply if price is less than average price
        }

        previousPrice = price;

        // Adjust price based on supply and demand
        if (supply > demand && price > minimumPrice) {
            price *= (0.99 - Math.abs(price) * 0.01); // Decrease price if supply exceeds demand
        } else if (supply < demand) {
            price *= 1.01;  // Increase price if demand exceeds supply
        }

        // Reduce the supply by 1/10 demand
        if (supply > demand / 10) {
            supply -= demand / 10;
        } else {
            supply = 0;
            demand = (int) (0.9 * demand);
        }
    }

    public void randomChange() {
        // Randomly increase or decrease supply or demand
        if (supply > 10) {
            supply += (int) (Math.random() * 13) - 6;
        } else {
            supply += (int) (Math.random() * 7);
        }
        demand += (int) (Math.random() * 13) - 6;
    }

    @Override
    public String toString() {
        return "Price = " + String.format("%.2f", this.getPrice()) + ", Supply = " + this.getSupply();
    }

    public double getPrice() {
        return price;
    }

    public int getSupply() {
        return supply;
    }

    public void addSupply(int amount) {
        supply += amount;
    }
    public void setPrice(double newPrice){
        price = newPrice;
    }
}
