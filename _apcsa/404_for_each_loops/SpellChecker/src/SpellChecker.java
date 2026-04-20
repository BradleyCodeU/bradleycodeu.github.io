import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class SpellChecker {

    // private instance variables
    private int number_of_entries;
    private String[] dictionaryArray;

    // constructor
    public SpellChecker() throws IOException {
        // Create File object
        // TODO

        // Create Scanner object to read File
        // Scanner scan = new Scanner(dictionaryFile);

        // Count the number of entries
        // number_of_entries = 0;
        // while(scan.hasNextLine())
        // {
        // String line = scan.nextLine();
        // number_of_entries++;
        // }

        // We now know the number of entries in the file
        dictionaryArray = new String[number_of_entries];

        // Make a new Scanner to read each line
        // TODO

        // Re-read and add the lines to the dictionaryArray
        // for(int i = 0; i < number_of_entries; i++)
        // {
        // // read each line with Scanner and add to dictionaryArray
        // // TODO
        // }

        // scan.close();
    }

    // 1. Write a getFirstTen method that returns a new array with only the first 10
    // words of the String array. Use a standard for loop (for int i = 0). Do not
    // print!



    // 2. Write a hasWord method that takes a word as a parameter and returns true
    // if it is in the String array. It should return false if it is not found (When
    // can you tell that you have not found a word in the String array?). Test your
    // code by changing the word sent to the hasWord() method in SpellCheckerApp.
    // This algorithm is called a *linear search* where we step through the array
    // one element at a time (the 10000 word String array) looking for a certain
    // element. Use a for-each loop.



    // 3. Write a method getCountStartingWith that returns an int. Take a parameter
    // for the firstLetters as a String. Count how many items in the array begin
    // with those firstLetters. Use a for-each loop. Use the String indexOf method.



    // 4. Write a method getWordsStartingWith that returns an array of Strings that
    // start with a String of letters in the String array. Your method should take a
    // parameter for the firstLetters as a String. Use getCountStartingWith to
    // determine how long the result array must be. Use a for-each loop. Use the
    // String indexOf method.



}
