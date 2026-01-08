import java.util.Random;

public class IntegerOverflowApp {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("\n\nInteger Overflow Practice");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Given that we are working in a language where the following is true, perform each calculation:");
        System.out.println("Integer.MAX_VALUE = 15");
        System.out.println("Integer.MIN_VALUE = -16 \n");
        System.out.println("1.    " + (12 + random.nextInt(3)) + " + " + (5 + random.nextInt(3)) + " =");
        System.out.println("2.    " + (12 + random.nextInt(3)) + " + " + (8 + random.nextInt(3)) + " =");
        System.out.println("3.    " + (7 + random.nextInt(3)) + " + " + (10 + random.nextInt(3)) + " =");
        System.out.println("4.    " + (-16 + random.nextInt(3)) + " - " + (3 + random.nextInt(3)) + " =");
        System.out.println("5.    " + (-16 + random.nextInt(3)) + " - " + (8 + random.nextInt(3)) + " =");
        System.out.println("6.    " + (-5 + random.nextInt(3)) + " - " + (14 + random.nextInt(3)) + " =");
        System.out.println("7.    " + (2 + random.nextInt(3)) + " - " + (21 + random.nextInt(3)) + " =");
        System.out.println("8.    " + (-4 + random.nextInt(3)) + " + " + (23 + random.nextInt(3)) + " =\n\n");
    }
}

