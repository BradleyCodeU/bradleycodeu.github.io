import java.util.Scanner; 

public class PaintCalculatorIntOnly {
  public static int calculateWallArea(int length, int width, int height, int num_doors, int num_windows) {
    // TODO Calculate the total surface area of the walls
    // Assume that doors are 21 square feet and windows are 12 square feet.
    return 0;
  }

  public static int calculatePaintGallons(int total_area) {
    // TODO Calculate the number of gallons of paint
    // Assume that 1 gallon can of paint will cover 300 square feet
    // Here is a trick to calculate it so that it rounds up (NOTE: this trick only
    // works with int values) by adding 299 to the total area, then divide by 300.
    // For example...
    // calculatePaintGallons(1) --> 1
    // calculatePaintGallons(300) --> 1
    // calculatePaintGallons(350) --> 1
    // calculatePaintGallons(632) --> 2
    // calculatePaintGallons(0) --> 0
    return 0;
  }

  public static int calculateCostEstimate(int gallons_needed, int price_per_gallon, int sales_tax_percent) {
    // TODO Calculate the total cost including sales tax
    // To get price plus tax, add 100 + the sales tax, multiply that by the cost,
    // then divide by 100.
    // Integer division will automatically cause this calculation to round down.
    // 1 gallon at $16 per gallon with 10% tax will cost ABOUT $17
    // For example...
    // calculateCostEstimate(1, 16, 10) --> 17
    // calculateCostEstimate(2, 16, 10) --> 35
    // calculateCostEstimate(4, 16, 10) --> 70
    // calculateCostEstimate(0, 0, 10) --> 0
    return 0;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // TODO Declare all variables here

    System.out.println("Enter the room dimensions below");
    System.out.print("Length: ");
    // TODO collect input
    System.out.print("Width: ");
    // TODO collect input
    System.out.print("Height: ");
    // TODO collect input
    System.out.print("How many doors does the room have: ");
    // TODO collect input
    System.out.print("How many windows does the room have: ");
    // TODO collect input
    System.out.print("Enter the price of a gallon of paint: ");
    // TODO collect input
    System.out.print("Enter the sales tax percent: ");
    // TODO collect input

    // TODO Use the methods to calculate the results
    // calculateWallArea(int length, int width, int height, int num_doors, int
    // num_windows)
    // calculatePaintGallons(int total_area)
    // calculateCostEstimate(int gallons_needed, int price_per_gallon, int
    // sales_tax_percent)

    System.out.println("Results");
    System.out.println("Total square feet = ");
    System.out.println("Gallons of paint needed = ");
    System.out.println("Cost estimate = ");

  }
}