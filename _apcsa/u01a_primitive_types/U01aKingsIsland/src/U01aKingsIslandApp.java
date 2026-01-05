
import java.util.Scanner;

// A group of people are traveling to King's Island for the day.
// Everyone in the group is car-pooling and has agreed to split the cost evenly.
// Write a program to determine the total cost of the trip and
// the cost per person.
// Assume that each ticket is $32.99

public class U01aKingsIslandApp {

  public static double calculateTotalCost(int num_people, double ticket_cost, double parking_cost, double gas_cost) {
    // TODO caculate the total cost
    return 0.00;
  }

  public static double calculateCostPerPerson(double total_cost, int num_people) {
    // TODO calculate the cost per person
    return 0.00;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // TODO MUST declare variables for number of people, parking cost, cost of gas,
    // ticket cost, total cost, and cost per person

    // TODO Prompt for and collect input for number of people in the group.
    // Hint: use input.nextInt() to collect an integer number
    System.out.print("Enter the number of people: ");

    // TODO Prompt for and collect input for cost of parking. For example, 5.50
    System.out.print("Enter the cost of parking: ");

    // TODO Prompt for and collect amount spent on gas. For example, 15.75
    System.out.print("Enter the amount spent on gas: ");

    // Calculate the total expenses. Each ticket is 32.99.
    // TODO Use the method calculateTotalCost(int num_people, double ticket_cost, double
    // parking_cost, double gas_cost) to get the total cost

    // Calculate the average cost per person
    // TODO Use the method calculateCostPerPerson(double total_cost, int num_people)

    // TODO Display the total cost and the cost per person
    System.out.println("King's Island Cost Report");
    System.out.println("Total Cost = $");
    System.out.println("Cost Per Person = $");
  }
}
