import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.io.IOException;

class Main {
  public static void main(String[] args) throws FileNotFoundException, IOException {
    int order = 5;
    String inputText = "";
    
    ArrayList<Ngram> ngrams = new ArrayList<Ngram>();

    File txt = new File("sourceText.txt");
    Scanner zeldaInput = new Scanner(txt);
    while( zeldaInput.hasNextLine()){
      inputText += zeldaInput.nextLine();
    }

    txt = new File("poetry.txt");
    Scanner txtInput = new Scanner(txt);
    while( txtInput.hasNextLine()){
      inputText += txtInput.nextLine();
    }
   
   
    // URL url = new URL("https://raw.githubusercontent.com/philipk19238/send-your-friends-the-script-from-the-bee-movie-one-word-at-a-time/master/script.txt");
    // Scanner beeInput = new Scanner(url.openStream());
    // while( beeInput.hasNextLine()){
    //   inputText += beeInput.nextLine();
    // }


    // slice up the input
    ngrams = sliceUpText(inputText, order);
    
    // glue it back together randomly
    System.out.println(generateText(ngrams, order));
    // for(Ngram each : ngrams){
    //    System.out.println(each);
    // }
   
  }

  // prints random generated garbage
  public static String generateText(ArrayList<Ngram> ngrams, int order){
    String currentGram = ngrams.get((int)(Math.random()*ngrams.size())).getName();
    for(int i=0; i < 900; i++){
      // look up the last order letters
      String lastThree = currentGram.substring(currentGram.length()-order);
      int index = Collections.binarySearch(ngrams, new Ngram(lastThree));
      // add a random follower
      currentGram += ngrams.get(index).getFollower();
    }
    return currentGram;
    
    
  }


  public static ArrayList<Ngram> sliceUpText(String myText, int order){
    ArrayList<Ngram> result = new ArrayList<Ngram>();
    for(int i=0; i<myText.length() - (order+1); i++){
      String name = myText.substring(i, i + order);
      int index = Collections.binarySearch(result, new Ngram(name));
     
      // if it doesn't exist in list
      if(index < 0){
        // find next highest word, get index
        index = -index - 1; // If key is not present, returns "(-(insertion point) - 1)"
        // construct ngram obj
        // add it at that index location
        result.add(index, new Ngram(name));
      }
      // add the follower
      result.get(index).add(myText.substring(i + order, i + order+1));
    }
    
    return result;
  }



  
}