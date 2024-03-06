import java.util.Scanner;

// A group of people are traveling to King's Island for the day.
// Everyone in the group is car-pooling and has agreed to split the cost evenly.
// Write a program to determine the total cost of the trip and
// the cost per person.
// Assume that each ticket is $32.99

public class U1aKingsIsland {

  public static double calculateTotalCost(int num_people, double ticket_cost, double parking_cost, double gas_cost) {
    return 0.00;
  }

  public static double calculateCostPerPerson(double total_cost, int num_people) {
    return 0.00;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // MUST declare variables for number of people, parking cost,
    // cost of gas, ticket cost, total cost, and cost per person

    // Prompt for and collect input for number of people in
    // the group.
    // Hint: use input.nextInt() to collect an integer number
    System.out.print("Enter the number of people: ");

    // Prompt for and collect input for cost of parking
    // for example, 5.50
    System.out.print("Enter the cost of parking: ");

    // Prompt for and collect amount spent on gas
    // for example, 15.75
    System.out.print("Enter the amount spent on gas: ");

    // Calculate the total expenses. Each ticket is 32.99
    // Use the method calculateTotalCost(int num_people, double ticket_cost, double
    // parking_cost, double gas_cost)

    // Calculate the average cost per person
    // Use the method calculateCostPerPerson(double total_cost, int num_people)

    // Display results
    System.out.println("King's Island Cost Report");
    System.out.println("Total Cost = $");
    System.out.println("Cost Per Person = $");
  }
}
