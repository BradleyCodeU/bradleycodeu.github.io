import java.util.Scanner;

public class U02bStringBuilderComparisonApp {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
            
        //         StringBuilder Comparison

        // Create *ONE* Java program that does *ALL* of the following:

        // 1. Write Java statements that initialize a string message with "Apple" and then change it to "APPLE" using the toUpperCase() method. <ins>Print the results</ins>

        System.out.println("Part 1 of 8");
        // TODO
        System.out.println();

        // 2. Write Java statements that initialize a string message with "Banana" and then change it to "banana" using the toLowerCase() method. <ins>Print the result</ins>

        System.out.println("Part 2 of 8");
        // TODO
        System.out.println();

        // 3. Mr Riley has initialized a string message with "Cocoon" and wants to change it to "Cocomelon" using the String replace() method: replace(String target, String replacement). You need to fill in the arguments to turn "Cocoon" into "Cocomelon". <ins>Print the result</ins>

        System.out.println("Part 3 of 8");
        String partThree = "Cocoon";
        partThree = partThree.replace("???","???"); // TODO fill in the arguments to turn "Cocoon" into "Cocomelon"
        System.out.println(partThree);

        // 4. The StringBuilder class also has a replace() method: replace(int start, int end, String str). Notice that a StringBuilder is mutable and allows changes to the object. Mr Riley has initialized a string message with "Grapefruit" and wants to change it to "Dragonfruit" using the StringBuilder replace() method. You need to fill in the arguments to turn "Grapefruit" into "Dragonfruit". <ins>Print the result</ins>

        System.out.println("Part 4 of 8");
        StringBuilder partFour = new StringBuilder("Grapefruit");
        partFour.replace(999, 999, "???"); // TODO fill in the arguments to turn "Grapefruit" into "Dragonfruit"
        System.out.println(partFour);

        // 5. Write code that initializes a string with "Mississippi". Use the String [replaceAll method](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#replaceAll(java.lang.String,%20java.lang.String)) to change the string... First, replace all "i" with "ii", then replace all "ss" with "s" and <ins>print the length</ins> of the resulting string.

        System.out.println("Part 5 of 8");
        // TODO
        System.out.println("Print the length");

        // 6. The StringBuilder class has a [reverse](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html) method for reversing a string. Write code to construct a StringBuilder object from a given string ("desserts"), call the reverse method followed by the toString method, and <ins>print the result</ins>.

        System.out.println("Part 6 of 8");
        // TODO
        System.out.println();

        // 7. Create a StringBuilder foxSentence with the text "the quick brown fox jumps over the lazy dog". Prompt the user to type a single, lowercase letter. Use the indexOf method to find the index number of the user's letter within foxSentence. Next, use another of StringBuilder's methods to delete that letter from foxSentence. Finally, <ins>print foxSentence</ins>.

        System.out.println("Part 7 of 8");
        // TODO
        System.out.print("Please type a single, lowercase letter: ");
        String singleLetter = input.nextLine();
        // TODO
        System.out.println();

        // 8. Create a String sphinxSentence with the text "sphinx of black quartz judge my vow". Prompt the user to type a single, lowercase letter. Use the indexOf method to find the index number of the user's letter within foxSentence. Use the substring method to get everything BEFORE that index and concatenate it with everything AFTER that index. Finally, <ins>print sphinxSentence</ins>.

        System.out.println("Part 8 of 8");
        // TODO
        System.out.print("Please type a single, lowercase letter: ");
        singleLetter = input.nextLine();
        // TODO
        System.out.println();
            
    }
}
