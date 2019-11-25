---
layout: project
category: ch7arraysandarraylists
title: Pet Shop Register
---
Pet Shop Register
A pet shop gives a discount to its clients if they buy one or more pets and at least 5 other items. The discount is equal to 20% of the cost of the non-pet items, but not the price of the pets.

Create three files: PetShopTester, PetShopRegister, and PetShopItem

[Starter code for PetShopTester](#starter-code-for-petshoptester) is at the bottom of the page. The tester prompts a cashier to add an item, remove an item, and check out. To add an item, the cashier will enter the item’s name, price, quantity, and then a "y" for a pet (anything living) or "n" for any other non-pet item (pet food, pet toys, pet collars, etc). To remove an item, the cashier will enter the item name and quantity. Use a sentinel to check out and complete the sale. After exiting the loop, call methods from the PetShopRegister class (described below) to display the results: the order qualifies for a discount or not, the subtotal, sales tax, and total.

[Starter code for PetShopRegister](#starter-code-for-petshopregister) is also at the bottom of the page. Complete the class so that it that contains:

  - an instance variable arraylist named cart. This is the customer's items that are being purchased during this sale (instances of the PetShopItem class)
  - a cartToString method that requires no arguments. Iterate through the cart, call the toString method for each item, add the newline escape character between each item, and return a string with all of the contents of the cart.
  - a purchase method that requires arguments for item name, price, quantity, and pet/non-pet. If the quantity is >1, add the item to the customer's cart more than once.
  - a remove method that allows the cashier to remove an item from the customer's cart (if it exists in the arraylist) with arguments for item name and quantity. If the item exists, remove it and return a string with the names of all items remaining in the customer's cart. If that item does not exist, return an error string.
  - a checkDiscount method which checks if the customer's cart qualifies for the 20% discount on non-pet items and returns a message stating if the order qualifies for a discount or not. You might want to use a counter (or two) to help determine if the order qualifies for the discount.
  - a subtotal method that requires one argument: double discountAmount. Calculates the subtotal of the order before sales tax, but after the (optional) discount has been subtracted
  - a salesTax method that calculates the amount of taxes due after the (optional) discount. The current sales tax rate in Hilliard, OH is 7.5%
  - a total method that calculates the total of the order plus taxes
  - a reset method that clears the register for the next customer

Write a class called PetShopItem that creates objects with:

  - Item name
  - Item price
  - boolean isPet: If the item if a pet (something living) or a non-pet item (something non-living)


## Starter code for PetShopTester:
<textarea name="Text1" rows="5">import java.util.Scanner;

public class PetShopTester{
  public static void main(String[] args){
    //declare variables
    PetShopRegister myRegister = new PetShopRegister();
    Scanner scanner = new Scanner(System.in);

    while(true){
      // prompt a cashier to add an item, remove an item, and check out (sentinel)
      System.out.print("Type either 'add', 'remove', or 'checkout': ");
      String input = scanner.nextLine();

      if(input.equals("add")){
        /*To add an item, the cashier will enter the item’s name, price, quantity, and then a "y" for a pet
        (anything living) or "n" for any other non-pet item (pet food, pet toys, pet collars, etc) */
        System.out.print("Name: ");
        String item = scanner.nextLine();
        System.out.print("Price: ");
        double price = scanner.nextDouble();
        System.out.print("Quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Living? 'y' or 'n'? ");
        String isLiving = scanner.nextLine();
        boolean living;
        if(isLiving.equals("y")){
          living = true;
        } else{
          living = false;
        }
        PetShopRegister.purchase(item, price, quantity, living);
        System.out.println(myRegister.cartToString());
      } else if(input.equals("remove")){
        // To remove an item, the cashier will enter the item name and quantity
        System.out.print("What item would you like to remove? ");
        String item = scanner.nextLine();
        System.out.print("How many would you like to remove? ");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        PetShopRegister.remove(item, quantity, cart);
        System.out.println(myRegister.cartToString());
      } else{
        System.out.println("Invalid input try again.");
      }
    }

    /* call methods from the PetShopRegister class (described below) to display the results: the order
    qualifies for a discount or not, the subtotal, sales tax, and total */
    boolean discount = PetShopRegister.checkDiscount(cart);
    System.out.println("Qualifies for discount? " + discount);
    double subtotal = PetShopRegister.subtotal(cart, discount);
    System.out.printf("Subtotal: $%.2f\n", subtotal);
    double salesTax = PetShopRegister.salesTax(subtotal);
    System.out.printf("Sales Tax: $%.2f\n", salesTax);
    System.out.printf("Total Price: $%.2f",PetShopRegister.total(subtotal, salesTax));
  }
}

</textarea>
```java
import java.util.Scanner;

public class PetShopTester{
  public static void main(String[] args){
    //declare variables
    PetShopRegister myRegister = new PetShopRegister();
    Scanner scanner = new Scanner(System.in);

    while(true){
      // prompt a cashier to add an item, remove an item, and check out (sentinel)
      System.out.print("Type either 'add', 'remove', or 'checkout': ");
      String input = scanner.nextLine();

      if(input.equals("add")){
        /*To add an item, the cashier will enter the item’s name, price, quantity, and then a "y" for a pet
        (anything living) or "n" for any other non-pet item (pet food, pet toys, pet collars, etc) */
        System.out.print("Name: ");
        String item = scanner.nextLine();
        System.out.print("Price: ");
        double price = scanner.nextDouble();
        System.out.print("Quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Living? 'y' or 'n'? ");
        String isLiving = scanner.nextLine();
        boolean living;
        if(isLiving.equals("y")){
          living = true;
        } else{
          living = false;
        }
        PetShopRegister.purchase(item, price, quantity, living);
        System.out.println(myRegister.cartToString());
      } else if(input.equals("remove")){
        // To remove an item, the cashier will enter the item name and quantity
        System.out.print("What item would you like to remove? ");
        String item = scanner.nextLine();
        System.out.print("How many would you like to remove? ");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        PetShopRegister.remove(item, quantity, cart);
        System.out.println(myRegister.cartToString());
      } else{
        System.out.println("Invalid input try again.");
      }
    }

    /* call methods from the PetShopRegister class (described below) to display the results: the order
    qualifies for a discount or not, the subtotal, sales tax, and total */
    boolean discount = PetShopRegister.checkDiscount(cart);
    System.out.println("Qualifies for discount? " + discount);
    double subtotal = PetShopRegister.subtotal(cart, discount);
    System.out.printf("Subtotal: $%.2f\n", subtotal);
    double salesTax = PetShopRegister.salesTax(subtotal);
    System.out.printf("Sales Tax: $%.2f\n", salesTax);
    System.out.printf("Total Price: $%.2f",PetShopRegister.total(subtotal, salesTax));
  }
}

```

## Starter code for PetShopRegister
```java
import java.util.ArrayList;

public class PetShopRegister{

  // your instance variable here

  public static String cartToString(){
    String result = "";
    for(PetShopItem cartItem : myRegister.getCart()){
      result += cartItem.name + " $" + cartItem.price + " isPet=" + cartItem.isPet + "\n");
    }
    return result;
  }

  public static void purchase(String itemName, double itemPrice, int quantity, boolean itemLiving){
    // your code here
  }

  public static void remove(String item, int quantity){
    // your code here
  }

  public static boolean checkDiscount(){
    // your code here
  }

  public static double subtotal(double discountAmount){
    // your code here
  }

  public static double salesTax(double total){
    // your code here
  }

  public static double total(double subTotal, double tax){
    // your code here
  }

  public static void reset(){
    // your code here to empty the cart
  }
}
```
