class Main {

/*
  Create a public static method named calculateTotalSquareFeet 
  that has 5 parameters: length, width, height, doors, windows. 
  Returns the surface area of the walls as a double.
  */

/*
  Create a public static method named calculateIfGallonsOnly 
  that has 1 parameter: totalSqFeet. Returns a String that 
  says "If gallons only = " and the number of gallons rounded up.
  */

  /*
  Create a public static method named calculateIfQuartsAvailable 
  that has 1 parameter: totalSqFeet. Returns a String that says 
  "If quarts are available = " and the number of gallons and quarts. 
  NOTE: If there are no quarts needed, do NOT display “0 quarts”.
  */
  
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the room dimensions below");
    System.out.print("Length (for example, 12.5): ");
    // collect the user input as a double
    input.nextDouble();
    System.out.print("Width: ");
    System.out.print("Height: ");
    System.out.print("How many doors does the room have: ");
    // collect the user input as an int
    input.nextInt();
    System.out.print("How many windows does the room have: ");

    System.out.println("Total square feet =");
    System.out.println("If gallons only =");
    System.out.println("If quarts are available =");
  }
}
