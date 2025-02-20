import java.util.Arrays;

public class U06aArrayManipulationApp {



    public static void main(String[] args) {
        System.out.println("PART ONE -------------------------------------------------------------------------------");
        int[] numbers;


        System.out.println("Initial random array = " + Arrays.toString(numbers));

        System.out.println("-------- PART TWO ----------------------------------------------------------------------");


        System.out.println("Smallest value = ");

        System.out.println("Sum = ");
        
        System.out.println("Sum without smallest = ");

        System.out.println("----------------- PART THREE -----------------------------------------------------------");


        System.out.println("Shifted array = " + Arrays.toString( shiftRight(numbers) ));
        System.out.println("The array is unchanged = " + Arrays.toString(numbers));

        System.out.println("---------------------------- PART FOUR -------------------------------------------------");

        System.out.println("Even values replaced = " + Arrays.toString( replaceAllEven(numbers) ));
        System.out.println("The array is unchanged = " + Arrays.toString(numbers));

        System.out.println("-------------------------------------- PART FIVE ---------------------------------------");

        System.out.println("Half values = " + Arrays.toString( halve(numbers) ));
        System.out.println("The array is unchanged = " + Arrays.toString(numbers));
    }

}
