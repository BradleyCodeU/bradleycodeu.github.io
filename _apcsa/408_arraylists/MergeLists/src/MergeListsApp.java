import java.util.ArrayList;
import java.util.Scanner;

public class MergeListsApp {

    // *****Create methods getList(), displayList(), and mergeLists() to complete
    // this exercise*****

    // - getList() has the following method header: public static ArrayList<String>
    // getList(Scanner inScanner).
    // Prompts the user to Enter a word ('XXX' to quit): and loops until the user
    // types "XXX". Returns an ArrayList of all the words that the user typed before
    // "XXX".
    public static ArrayList<String> getList(Scanner inScanner) {
        // TODO
        return null;
    }

    // - displayList() has the following method header: public static String
    // displayList(ArrayList<String> myList).
    // Returns a String with \n seperating each list item. Create a new String and
    // concatenate the contents of myList Each item on a new line with index
    // numbers. argument ["a"] would return "0: a\n" and argument ["a", "b"] would
    // return "0: a\n1: b\n"
    public static String displayList(ArrayList<String> myList) {
        // TODO
        return null;
    }

    // - mergeList() has the following method header: public static
    // ArrayList<String> mergeLists(ArrayList<String> list1, ArrayList<String>
    // list2) It should take two lists of Strings as input. Adding items from list1,
    // then list2, then list 1, then list2, etc.
    // - Example 1: with arguments ["a", "b", "c", "d"] and ["x", "y"] then it would
    // return ["a", "x", "b", "y", "c", "d"]
    // - Example 2: with arguments ["rr", "ss"] and ["gg", "hh", "ii", "jj"] then it
    // would return ["rr", "gg", "ss", "hh", "ii", "jj"]
    // - Example 3: with arguments ["za"] and ["ma", "na", "pa"] then it would
    // return ["za", "ma", "na", "pa"]
    // - Example 4: with arguments [ ] and ["f"] then it would return ["f"]
    public static ArrayList<String> mergeLists(ArrayList<String> list1, ArrayList<String> list2) {
        // TODO
        return null;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Collect the two lists from user input
        System.out.println("Enter the first wordlist:");
        ArrayList<String> list1 = getList(input);

        System.out.println("Enter the second wordlist:");
        ArrayList<String> list2 = getList(input);

        // Display Wordlist 1
        System.out.println("Wordlist 1");
        System.out.println("----------");
        System.out.print(displayList(list1));

        // Display Wordlist 2
        System.out.println("Wordlist 2");
        System.out.println("----------");
        System.out.print(displayList(list2));

        // Display List 1 merged with List 2
        System.out.println("List 1 merged with List 2");
        System.out.println("-------------------------");
        ArrayList<String> merged12 = mergeLists(list1, list2);
        System.out.print(displayList(merged12));

        // Display List 2 merged with List 1
        System.out.println("List 2 merged with List 1");
        System.out.println("-------------------------");
        ArrayList<String> merged21 = mergeLists(list2, list1);
        System.out.print(displayList(merged21));

        input.close();
    }

}