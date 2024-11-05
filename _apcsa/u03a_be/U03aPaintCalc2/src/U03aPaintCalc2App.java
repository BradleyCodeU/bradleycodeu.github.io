import java.util.Scanner;

public class U03aPaintCalc2App {

    /*
     * Create a public static method named calculateTotalSquareFeet
     * that has 5 parameters: length, width, height, doors, windows.
     * Returns the surface area of the walls as a double.
     */
    // TODO 

    /*
     * Create a public static method named calculateIfGallonsOnly
     * that has 1 parameter: totalSqFeet. Returns a String that
     * says "If gallons only = " and the number of gallons rounded up.
     */
    // TODO 

    /*
     * Create a public static method named calculateIfQuartsAvailable
     * that has 1 parameter: totalSqFeet. Returns a String that says
     * "If quarts are available = " and the number of gallons and quarts.
     * NOTE: If there are no quarts needed, do NOT display “0 quarts”.
     */
    // TODO 

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the room dimensions below");
        System.out.print("Length (for example, 12.5): ");
        // TODO collect the user input as a double
        input.nextDouble();
        System.out.print("Width: ");
        // TODO 
        System.out.print("Height: ");
        // TODO
        System.out.print("How many doors does the room have: ");
        // TODO collect the user input as an int
        input.nextInt();
        System.out.print("How many windows does the room have: ");
        // TODO

        System.out.println("Total square feet =");
        // TODO use calculateTotalSquareFeet to get the result
        System.out.println("If gallons only =");
        // TODO use calculateIfGallonsOnly to get the result
        System.out.println("If quarts are available =");
        // TODO use calculateIfQuartsAvailable to get the result
    }
}