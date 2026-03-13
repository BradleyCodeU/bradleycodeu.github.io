import java.util.Scanner;

public class U04aForLoopsApp {

    // See the instructions











    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // --- First Input Section ---
        System.out.print("Gimme a positive integer: ");
        int a = input.nextInt();

        // Calling the first two methods and the digit method
        int evenSum = sumEvensExclusive(a);
        int squareSum = sumSquaresExclusive(a);
        int digitSum = sumOddDigits(a);

        System.out.println("The sum of all even numbers between 2 and " + a + " (exclusive) = " + evenSum);
        System.out.println("The sum of all squares between 1 and " + a + " (exclusive) = " + squareSum);

        // --- Second Input Section ---
        System.out.print("Gimme a positive integer larger than " + a + ": ");
        int b = input.nextInt();

        // Calling the range method
        int rangeSum = sumOddsInRangeExclusive(a, b);

        System.out.println("The sum of all odd numbers between " + a + " and " + b + " (exclusive) = " + rangeSum);
        System.out.println("The sum of all odd digits of " + a + " = " + digitSum);
        
        input.close();
    }
}
