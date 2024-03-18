package tradewars;

/**
 * Holds product state
 */
public class Product implements TraderConstants {
  // create static constants for...
  // int EVENT_CHANCE which if set to 10 means a 10% chance of an item being either at a super low price or super high price
  // int EVENT_MULTIPLIER which if set to 3 means price would either divide by 3 or multiply by 3
  

  // create instance variables for...
  // str name, int highPrice, int lowPrice, int currentPrice, and Message message
  
  /*
   * sets initial values for all instance variables. set message to null.
   */
  public Product(String name, int lowPrice, int highPrice) {
    
  }

  /*
   * returns price as an int
   */
  public int getPrice() {
    return 1;
  }

  /*
   * returns price as a string with $ in front
   */
  public String getPriceValue() {
    return "";
  }

  /*
   * returns the product's name
   */
  public String getName() {
    return "";
  }

  /*
   * returns message that [name] prices are sky high!
   */
  protected String getHighMessage() {
    return "";
  }

  /*
   * returns message that [name] prices have bottomed out!
   */
  protected String getLowMessage() {
    return "";
  }

  /*
   * returns the product's name
   */
  @Override
  public String toString() {
    return "";
  }

  /*
   * updates the price and sets the message to null, highMessage, or lowMessage
   */
  final public void updatePrice() {
    // set the price to a random number between lowPrice and highPrice

    // set the message to null
    
    // generate a random number (rand) between 0 and 100
    
    // if rand is less than EVENT_CHANCE divided by 2
    
        // set price to be price multiplied by EVENT_MULTIPLIER
      
        // set message to be a new Message with args getHighMessage() and Color.GREEN
      
    // else if rand is less than EVENT_CHANCE
    
        // set price to be price divided by EVENT_MULTIPLIER
      
        // set message to be a new Message with args getLowMessage() and Color.RED
      
    
  }

  /*
   * returns the instance variable message
   */
  public Message getMessage() {
    return null;
  }
}
