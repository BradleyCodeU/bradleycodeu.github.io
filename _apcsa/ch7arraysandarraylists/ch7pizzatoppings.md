---
layout: project
category: ch7arraysandarraylists
title: Pizza Toppings
---
Read this [w3schools ArrayList tutorial](https://www.w3schools.com/java/java_arraylist.asp)

Use an ArrayList to store your favorite toppings for pizza.

Use this starter template:
```java
// Step 1: Create an ArrayList called myList with five pizza toppings (any five random pizza toppings you would like)

// Step 2: Print the list using the toString method
System.out.println("Displaying the list using the toString method...");

// Step 3: Prompt the user for a new topping to add to the list
System.out.print("Gimme a new pizza topping to add to the list: ");
// something with scanner goes here

// Step 4: Search the array using a FOR loop to determine if the string is already in the arraylist

// Step 5: If it is NOT already in the list, use the add method to add insert it at index 2 and use toString to print the new arraylist
System.out.println("Using the add method to add " + userString + " at index 2.");
System.out.println("All values are shifted and " + userString + " is inserted at index 2.");
System.out.println("The new list is displayed using the toString method...");

// Step 6:
// Create a loop so that the user can try to remove any number of toppings. They could even try to remove something not in the arraylist

//      Prompt user for a pizza topping to remove from the array and tell them what sentinel value will allow them to quit
        System.out.print("Gimme a pizza topping to remove from the list: ");

//      Search the array using a FOR EACH loop (enhanced for loop) to determine if the string is in the arraylist

//           Use the contains method, indexOf method, and remove method to find and remove that pizza topping

//           Use toString to print the new list OR print "That is not in the list"

// Step 7:
// After the user has entered the sentinel value and exited the loop, use the clear method to remove all elements from the arraylist
```
