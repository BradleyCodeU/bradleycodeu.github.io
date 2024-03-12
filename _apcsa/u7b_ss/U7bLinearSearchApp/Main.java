import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String[] myList = {
      "Your",
      "List",
      "Goes",
      "Here"
    };

    // Print something like "Welcome to Mo's Popular Movie Search"
    System.out.println("Welcome to *YOUR_NAME*'s *LIST_TOPIC* Search!");
    System.out.print("Please type a word: ");
    // Collect user input
    String userInput = input.nextLine();
    // Loop through each item in the full array
    for (??? each : myList) {
      // If each LOWERCASE item contains the LOWERCASE user input
      if (???.indexOf(userInput) > -1) {
        // Print the item
        System.out.println(each);
      }
    }

    // If no matches were found, then print a Not Found message.
    // For example, if you searched for “xyz” it might say “xyz Not Found”
    
  }
}