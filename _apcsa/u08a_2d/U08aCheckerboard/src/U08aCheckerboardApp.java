import java.util.Scanner;

public class U08aCheckerboardApp {



    // TODO: - public static boolean isValid(int userInput, int size) // returns true if userInput is in the range of [0...size) exclusive of size
    // TODO: - public static void displayCheckerboard(int[][] arr) // prints the checkboard
    // TODO: - public static int[][] fill2DArray(int size) // Returns a 2d array fill with alternating 0s and 1s. 
    //         USING TWO NESTED LOOPS, initialize the board so that zeros and ones alternate, as on a checkerboard. <small>Hint: Check whether i + j is even.</small>




    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Gimme an integer >1: "); // prompt the user for a size (an integer > 1)
        int size = input.nextInt();
        
        while (size <= 1) {
            System.out.print("Oops! Gimme an integer >1: ");
            size = input.nextInt();
        }
        
        // TODO: declare the 2d array and set it to be fill2DArray(size)

        
        for (int i = 0; i < size * size; i++) {
            // TODO: print the checkerboard using the displayCheckerboard() method
            
            System.out.print("Gimme a value: "); // prompt the user for the value that they want to place
            int value = input.nextInt();
            
            System.out.print("Gimme a row: "); // prompt the user for the row number
            int row = input.nextInt();
            
            System.out.print("Gimme a col: "); // prompt the user for the col number
            int col = input.nextInt();
            
            // TODO: - - if the row number and col number are valid
            // TODO: - - - set that row and col in the 2d array to be the value
            // TODO: - - else
            // TODO: - - - print invalid

        }
    }
}
