import java.util.*;
import java.util.ArrayList;

public class Main{
  public static void main(String[] args){
    ArrayList<Item> storeInventory = new ArrayList<Item>(); // ArrayList for items available in the store
    ArrayList<Product> shoppingCart = new ArrayList<Product>(); // ArrayList for items that one customer is purchasing
    LocalDate today = LocalDate.now();

    // instantiate 2 or more customers (different membership levels)
    StarMember member1 = //
    member1.setLevel(//
    StarMember member2 = //
    member2.setLevel(//

    // instantiate multiple dogs (some with shot records and some without) and associate them with the customers that own them
    String[] shots = {"vaccine#1","vaccine#2"};
    Pet dog1 = //

    String[] shots2 = {};
    Pet dog2 = //

    member1.addPet(dog1);
    member2.addPet(dog2);

    // instantiate multiple items NOT low in stock
    for(int i = 0; i < 20; i++){
      storeInventory.add(//
      storeInventory.add(//
    }
    // add some items that are low in stock
    storeInventory.add(//
    storeInventory.add(//
    // add some perishables that are past their sell-by date
    storeInventory.add(//
    storeInventory.add(//

    ArrayList<String> lowStock = checkForLowStock(storeInventory);
    System.out.println("Low Stock: ");
    // create a for each loop to print low stock items

    // output a list of items that are past their sell-by date
    System.out.println("Past Sell By: ");
    ArrayList<String> pastSellBy = checkSellByDate(storeInventory);
    // for each loop to print items past sell by date

    // appointments
    // instantiate 2 or more appointments (some successful and some that will generate output such as “Star Members can make item purchases only, no appointments” and “That appointment time is not available” and “A valid shot record is required to schedule that appointment”)
    System.out.println("\n=-=-=-=-=-=-=-=-=-= Member 1 trying to create appointment =-=-=-=-=-=-=-=-=-=\n");
    if(canCreateAppointment(member1,dog1)){
      // create a LocalDate date
      LocalDate appointmentDate = LocalDate.of(2021, 12, 31);
      // instanciate an appointment

      shoppingCart.add(); // add to cart
    }
    System.out.println("\n=-=-=-=-=-=-=-=-=-= Member 2 trying to create appointment =-=-=-=-=-=-=-=-=-=\n");
    if(canCreateAppointment(member2,dog2)){
      // create a LocalDate date
      LocalDate appointmentDate = LocalDate.of(2021, 12, 31);
      // instanciate an appointment
      shoppingCart.add(); // add to cart
    }

    // create a shopping shoppingCart with multiple items:
    shoppingCart.add(toy);
    shoppingCart.add(toy);
    shoppingCart.add(cleaner);
    shoppingCart.add(cleaner);

    //checkout
    System.out.println("\n=-=-=-=-=-=-=-=-=-=-= Member 1 checkout =-=-=-=-=-=-=-=\n");
    checkout(shoppingCart);
    System.out.println("\n=-=-=-=-=-=-=-=-=-=-= Member 2 checkout =-=-=-=-=-=-=-=\n");
    ArrayList<Product> shoppingCart2 = new ArrayList<Product>();
    shoppingCart2.add(toy);
    checkout(shoppingCart2);
  }


  // given the inventory array, returns an arraylist of items that are low stock
  private static ArrayList<String> checkForLowStock(ArrayList<Item> myArray){
    // create result arraylist of strings
    for(int i = 0; i < myArray.size(); i++){
      String itemNameSearch = myArray[i].getName()
      int itemCount = //
      for(int j = 0; j < myArray.size(); j++){
        // if itemNameSearch == myArray[j].getName() increase the count
      }
      // if the count is less than some minimum value,
        // then concatenate the item name +": "+ count
        // if not already in the result arraylist,
          // then add to the arraylist
    }
    return result
  }


  // given the inventory array, returns an arraylist of items that are low stock
  private static ArrayList<String> checkSellByDate(ArrayList<Item> someArray){
    // create result arraylist of strings
    for(int i = 0; i < someArray.size(); i++){
      if(true){ // ???
        // then concatenate the item name +": "+ sell by date
        // then add to the arraylist
      }
    }
    return result
  }


  // given a member and pet, returns true/false
  private static boolean canCreateAppointment(Member someMember, Pet somePet){
    if(true){ // if correct member level and pet has a shot record
       // print "signup successful"
      return true
    }
    if(true){ // if not correct member level
       // print "Star Members can make item purchases only, no appointments"
    }
    if(true){ // if pet does not have shot record
       // print "A valid shot record is required to schedule that appointment"
    }
    return false
  }


  // given a member and arraylist, prints the prices, total, and starpoints/cashback
  private static void checkout(Member someMember, ArrayList<Product> cartArray){
    // print the individual prices for all items
    for(){
      //
    }
    // print the total price for the shopping shoppingCart (don’t worry about tax)
    System.out.printf(//
    // print the number of star points OR amount of cash back
    System.out.printf(//
  }
}
