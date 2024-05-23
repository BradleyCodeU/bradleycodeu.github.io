import java.io.BufferedReader;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URL;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        int magicSize = 5;
        String userInput = readFile("src/sourceText.txt");
        // File f = new File("src/sourceText.txt");

        // Scanner input = new Scanner( f ) ;
        // // System.out.print("Hello, please type some text: ");
        // StringBuilder userInput = new StringBuilder();;
        // while(input.hasNext()){
        // userInput.append(input.nextLine());
        // System.out.println(input.hasNext());
        // }
        // userInput.append("");
        System.out.println(userInput.length());
        System.out.println(userInput);

        ArrayList<MagicWord> words = new ArrayList<MagicWord>();
        // loop to make multiple MagicWord objs
        for (int i = 0; i < userInput.length() - magicSize; i++) {
            String currentWord = userInput.substring(i, i + magicSize);
            char nextLetter = userInput.charAt(i + magicSize);
            int locationInList = App.findMagicWordInList(currentWord, words);
            if (locationInList > -1) {
                // already in list
                words.get(locationInList).addFollowers(nextLetter);
            } else {
                // not in list yet
                words.add(
                        new MagicWord(currentWord, nextLetter));

            }

        }

        System.out.println(words);

    }

    public static String readFile(String filename) {
        String result = "";
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(new File(filename)));
            String available;
            while ((available = br.readLine()) != null) {
                result += available;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }

    // finds the index location of a MagicWord or returns -1 if not found
    public static int findMagicWordInList(String searchText, ArrayList<MagicWord> myList) {
        for (int i = 0; i < myList.size(); i++) {
            // check if this magic word is what we're searchin for
            if (searchText.equals(myList.get(i).getPreviousText()))
                return i;

        }
        return -1;
    }
}

// the:r
// her:e
// ere:_
// re_:i

// the:i