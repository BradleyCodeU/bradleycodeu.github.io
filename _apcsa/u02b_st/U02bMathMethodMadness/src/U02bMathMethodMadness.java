import java.util.Scanner;

public class U02bMathMethodMadness {

  // ## Part 1:
  // Create a public static method named whichIsLarger that takes two int
  // arguments and returns a String. Use Math.min() and Math.max() to create the
  // following. This is a sample transcript of what your program should do. The
  // numbers 15 and 25 are user input and should not be put on the screen by your
  // program.
  // ```
  // whichIsLarger(15, 25) --> "25 is larger than 15"
  // whichIsLarger(6, 4) --> "6 is larger than 4"
  // ```

  // TODO public static ??? ???(??? ???, ??? ???)






  // ## Part 2:
  // Create a public static method named funFacts that takes two int aguments and
  // returns a String. You will use Math.abs(), Math.pow(), Math.sqrt(), and
  // Math.random(). 
  // Use \n to insert line breaks between each sentence.
  // See the example inputs and outputs below.
  // ```
  // funFacts(3,4) --> "Absolute value of 3 is 3.\n3 to the power of 4 is 81.0.\nSquare root of 3 is 1.7320508075688772.\nRandom number between -3 and 4 is 3.7556221204278137"
  // funFacts(-3,4) --> "Absolute value of -3 is 3.\n-3 to the power of 4 is -81.0.\nSquare root of -3 is NaN.\nRandom number between -3 and 4 is -0.14515833567916303"
  // funFacts(9,5) --> "Absolute value of 9 is 9.\n9 to the power of 5 is 59049.0.\nSquare root of 9 is 3.0.\nRandom number between 9 and 5 is 8.102658047778291"
  // funFacts(-9,-5) --> "Absolute value of -9 is 9.\n-9 to the power of -5 is -1.6935087808430286E-5.\nSquare root of -9 is NaN.\nRandom number between -9 and -5 is -7.81863598457924"
  // ```

  // TODO public static ??? ???(??? ???, ??? ???)






  // ## Part 3:
  // Create a public static method named textOrder that takes two String arguments
  // and returns a String. This method will determine the correct [lexicographic
  // ordering](https://en.wikipedia.org/wiki/Lexicographic_order) of those
  // strings. For this exercise you will need to use the compareTo() String
  // method. Look up the compareTo method in the API docs. This is a sample
  // transcript of what your program should do. The words "apple" and "bananas"
  // are user input and should not be put on the screen by your program.
  // ```
  // textOrder("apple", "banana") --> "apple comes before banana
  // lexicographically"
  // textOrder("dragonfruit", "coconut") --> "coconut comes before dragonfruit
  // lexicographically"
  // ```

  // TODO public static ??? ???(??? ???, ??? ???)






  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Part 1-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    System.out.print("Enter your first number: ");
    // TODO collect input
    System.out.print("Enter your second number: ");
    // TODO collect input

    // TODO pass the user input as arguments to the whichIsLarger static method
    // Like this... System.out.println(whichIsLarger(???,???));

    System.out.println("Part 2-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    System.out.println("Fun Facts!");
    // TODO pass the user input from Part 1 as arguments to the funFacts static
    // method
    // Like this... System.out.println(funFacts(???,???));

    System.out.println("Part 3-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    System.out.print("Gimme a word: ");
    // TODO collect input
    System.out.print("Gimme another word: ");
    // TODO collect input

    // TODO pass the user input as arguments to the textOrder static method
    // Like this... System.out.println(textOrder(???,???));

    System.out.println("Part 4-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    // "Part 4"

    // Your program will use the two numbers from Part 1 and then ask a series of
    // math questions. Each question will be evaluated as to whether it is the right
    // or wrong answer.
    // You will need to use a conditional with an if and an else. [Read this
    // tutorial](https://www.w3schools.com/java/java_conditions_else.asp)
    // In the end a final score should be reported for the user. This is an example
    // of what your program should do. User input always comes after a colon : and
    // should not be put on the screen by your program.


    // Enter your name: Jeremy
    System.out.print("Enter your name: ");
    // TODO collect input

    // TODO print a welcome message using the user's name
    // Like this... Welcome Jeremy! Please answer the following questions...
    System.out.println();

    // TODO make a math quiz like the following. Use the two ints from Part 1
    // You will need to use conditionals with an if and an else.

    // The following is an example math quiz IF the user input was 6 and 4...
    // 6 + 4: 1
    // Wrong!
    // The correct answer is 10
    // 6 * 4: 24
    // Correct!
    // 6 / 4: 1
    // Correct!
    // 6 % 4: 2
    // Correct!
    // You got 3 correct answers
    // That's 75.0%!

  }
}