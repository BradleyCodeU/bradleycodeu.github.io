---
layout: project
category: ch1introduction
title: Ch1 Kings Island
---

# Ch1 Kings Island

A group of people are traveling to King's Island for the day.
Everyone in the group is car-pooling and has agreed to split the cost evenly.
Write a program to determine the total cost of the trip and
the cost per person.

Assume that each ticket is $32.99.

You MUST:
- Fill in the body for the static method calculateTotalCost(int num_people, double ticket_cost, double parking_cost, double gas_cost) and return a double
- Fill in the body for the static method calculateCostPerPerson(double total_cost, int num_people) and return a double
- In public static void main...
  - Declare variables for number of people, parking cost, cost of gas, ticket cost, total cost, and cost per person
  - Use Scanner to collect user input
  - Print the total cost and the cost per person
  

### SAMPLE OUTPUT 1
```
Enter the number of people: 3
Enter the cost of parking: 15.75
Enter the amount spent on gas: 18.54

King's Island Cost Report
Total Cost = $133.26
Cost Per Person = $44.419999999999995
```
### SAMPLE OUTPUT 2
```
Enter the number of people: 4
Enter the cost of parking: 16.50
Enter the amount spent on gas: 18.38

King's Island Cost Report
Total Cost = $166.84
Cost Per Person = $41.71
```


### Starter Template
```
import java.util.Scanner;

// A group of people are traveling to King's Island for the day.
// Everyone in the group is car-pooling and has agreed to split the cost evenly.
// Write a program to determine the total cost of the trip and
// the cost per person.
// Assume that each ticket is $32.99

public class Main
{
  public static double calculateTotalCost(int num_people, double ticket_cost, double parking_cost, double gas_cost)
  {
    return 0.00;
  }

  public static double calculateCostPerPerson(double total_cost, int num_people)
  {
    return 0.00;
  }
  
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		// MUST declare variables for number of people, parking cost,
		// cost of gas, ticket cost, total cost, and cost per person

		// Prompt for and collect input for number of people in
		// the group.
		// Hint: use input.nextInt() to collect an integer number


		// Prompt for and collect input for cost of parking
		// for example, 5.50


		// Prompt for and collect amount spent on gas
		// for example, 15.75


		// Calculate the total expenses. Each ticket is 32.99
        // Use the method calculateTotalCost(int num_people, double ticket_cost, double parking_cost, double gas_cost)


		// Calculate the average cost per person
        // Use the method calculateCostPerPerson(double total_cost, int num_people)

		// Display results


	}
}
```
