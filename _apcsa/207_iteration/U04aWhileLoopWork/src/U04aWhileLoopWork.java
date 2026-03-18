import java.util.Scanner;

public class U04aWhileLoopWork {
    
    // See the instructions




    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // --- Test Sequence Methods ---
        System.out.print("Enter a limit (n) for sequences: ");
        int n = input.nextInt();

        System.out.println("\nSquares less than " + n + ":");
        System.out.println(findSquares(n));

        System.out.println("\nDivisible by 10 and less than " + n + ":");
        System.out.println(findDivisibleByTen(n));

        System.out.println("\nPowers of two less than " + n + ":");
        System.out.println(findPowersOfTwo(n));

        // --- Test Digit Sum Method ---
        System.out.print("\nEnter an integer to sum its odd digits: ");
        int a = input.nextInt();
        
        int oddSum = sumOddDigits(a);
        System.out.println("The sum of odd digits in " + a + " is: " + oddSum);

        input.close();
    }

}
