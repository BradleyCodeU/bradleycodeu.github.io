import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int magicSize = 3;
        Scanner input = new Scanner(System.in);
        System.out.print("Hello, please type some text: ");
        String userInput = input.nextLine();
        ArrayList<MagicWord> words = new ArrayList<MagicWord>();
        // loop to make multiple MagicWord objs
        for(int i=0; i < userInput.length()-magicSize;i++){
            words.add(
                new MagicWord(
                    userInput.substring(i,i+magicSize), userInput.charAt(i+magicSize))
            );
            System.out.println(words.get(words.size()-1));
        }

        
        
    }

    // finds the index location of a MagicWord or returns -1 if not found
    public int findMagicWordInList(ArrayList myList){
        for(){

        }
        return -1;
    }
}
