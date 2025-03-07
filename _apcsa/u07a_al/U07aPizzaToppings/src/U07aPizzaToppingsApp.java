public class U07aPizzaToppingsApp {
    public static void main(String[] args) {
      // Step 1: Create an ArrayList called myList with five pizza toppings (any five random pizza toppings you would like)
      
      // Step 2: Print the list using the toString method
      System.out.println("Displaying the list using the toString method...");
      
      // Step 3: Prompt the user for a new topping to add to the list
      System.out.print("\nGimme a new pizza topping to add to the list: ");
      // something with scanner goes here
      
      // Step 4: Search the array using a FOR EACH loop to determine if the string is already in the arraylist
      
      // Step 5: If it is NOT already in the list, use the add method to add insert it at index 2 and use toString to print the new arraylist
      System.out.println("Using the add method to add " + userString + " at index 2.");
      System.out.println("All values are shifted and " + userString + " is inserted at index 2.");
      System.out.println("The new list is displayed using the toString method...");
      
      // Step 6:
      // Create a WHILE loop so that the user can try to remove any number of toppings. They could even try to remove something not in the arraylist
      
      //      Prompt user for a pizza topping to remove from the array and tell them what sentinel value will allow them to quit
              System.out.print("\nGimme a pizza topping to remove from the list or type Q to quit: ");
      
      //      Search the array using a FOR EACH LOOP to determine if the string is in the arraylist
      
      //           If you find it, use the remove method to remove that pizza topping from the arraylist
      
      //      Either print the new, smaller list OR print "That is not in the list"
      
      // Step 7:
      // After the user has entered the sentinel value and exited the loop, print the list using the toString method
      System.out.println("Displaying the list using the toString method...");
      
      //Finally, use the clear method to remove all elements from the arraylist
    }
  }