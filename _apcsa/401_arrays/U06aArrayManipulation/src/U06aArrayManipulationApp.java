import java.util.Arrays;

public class U06aArrayManipulationApp {

    // NOTE: this is an example of what NOT to do.
    // Do NOT mutate an object that is stored in a parameter.
    public static int[] oopsAllZeros(int[] myArray) {
        for(int i=0; i<myArray.length; i++){
            myArray[i] = 0; // OH NO!
        }
        return myArray;
    }


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

        System.out.println("------------------------------------------------- PART SIX -----------------------------");

        System.out.println("All zeros = " + Arrays.toString( oopsAllZeros(numbers) ));
        System.out.println("The array is unchanged??? = " + Arrays.toString(numbers));
    }

}
