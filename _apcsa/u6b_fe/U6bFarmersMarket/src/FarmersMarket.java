public class FarmersMarket {
    // Static variables

    // - static String array of city names

    // - static int cityCounter to keep track of the current city index


    // private Instance variables

    // - String name

    // - a PriceTracker array named trackerArray that holds all of the individual PriceTracker objects



    // Constructor
    public FarmersMarket() {
        // Set the name of the market based on the current city

        // increment the cityCounter

        // Initialize PriceTrackers for corn, apples, and eggs
        // Use a loop to construct all of the trackers in the trackerArray.

    }

    // updateAllTrackers Method to update prices of all items by using the update() method on each item's PriceTracker.
    // Use a loop to update all of the trackers in the trackerArray.
    // No parameters. Returns nothing.


    // getName Method to get the String name
    // Returns: the name of this FarmersMarket


    // getPriceTracker Method to get the PriceTracker object for a specific item
    // Parameters:
    // - String item: The name of the item. Either "corn", "apples", or "eggs"
    // Returns:
    // - The PriceTracker object for the specified item or null if the String is invalid


    // getAvailableSupply Method to get the available supply of a specific item
    // Parameters:
    // - String item: The name of the item. Either "corn", "apples", or "eggs"
    // Returns:
    // - The available supply of the specified item or 0 if the String is invalid


    // toString Method to generate a string representation of the FarmersMarket object
    // Returns:
    // - A string containing the name of the market and the prices and supplies of all items 
    //   with "\n" separating each item. Use the PriceTracker's toString to easily get the price and supply.


}
