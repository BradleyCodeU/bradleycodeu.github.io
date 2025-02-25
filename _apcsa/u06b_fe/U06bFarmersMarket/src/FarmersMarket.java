public class FarmersMarket {
    // Static variables

    // - static String array of city names. put at least 3 city names in the array.

    // - static int cityCounter to keep track of the current city index. initialize it to zero.


    // private Instance variables

    // - String name is the name of the city where this FarmersMarket is located.

    // - a PriceTracker array named trackerArray that holds all of the individual PriceTracker objects.



    // Constructor
    public FarmersMarket() {
        // Set the name of the market based on static String array of city names AND static int cityCounter

        // increment the cityCounter

        // Create a PriceTracker array of size 3 for corn (index 0 in PriceTracker array), apples (index 1), eggs (index 2)
        // Use a for-loop to Construct all of the trackers in the trackerArray. use the no-args constructor PriceTracker()

    }



    // updateAllTrackers() Method to update prices of all items by using the update() method on each item's PriceTracker.
    // Use a for each loop to update all of the trackers in the trackerArray.
    // No parameters. Returns nothing.



    // getName Method to get the String name
    // Returns: the name of this FarmersMarket



    // getPriceTracker(String name) Method to get the PriceTracker object for a specific item. corn is index 0, apples 1, eggs 2.
    // Parameters:
    // - String item: The name of the item. Either "corn", "apples", or "eggs"
    // Returns:
    // - The PriceTracker object for the specified item or null if the String is invalid



    // getAvailableSupply(String name) Method to get the available supply of a specific item
    // Parameters:
    // - String item: The name of the item. Either "corn", "apples", or "eggs"
    // Returns:
    // - The available supply of the specified item or 0 if the String is invalid



    // toString() Method to generate a string representation of the FarmersMarket object
    // Returns:
    // - A string containing the name of the market and the prices and supplies of all items 
    //   with "\n" separating each item. Use the PriceTracker's toString to easily get the price and supply.



}
