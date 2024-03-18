import java.util.Arrays;

public class WordScrambler {
    

private static String recombine(String word1, String word2){ 
    return null;
}


private static String[] mixedWords(String[] words){
   return null;
}



    public static void main(String args[]) {

      System.out.println("Expected: apple pear --> apar");
      System.out.println(recombine("apple","pear"));
      System.out.println("Expected: pear apple --> peple");
      System.out.println(recombine("pear","apple"));
      System.out.println("Expected: 12 34 --> 14");
      System.out.println(recombine("12","34"));
      System.out.println("Expected: abc xyz --> ayz");
      System.out.println(recombine("abc","xyz"));
      System.out.println("Expected: Columbus Ohio --> Coluio");
      System.out.println(recombine("Columbus","Ohio"));
      System.out.println("\n");
      
      System.out.println("Expected: {\"apple\", \"pear\", \"this\", \"cat\"} --> {\"apar\", \"peple\", \"that\", \"cis\"}");
      String[] arr1 = {"apple", "pear", "this", "cat"};
      System.out.println(Arrays.toString(mixedWords(arr1)));
      System.out.println("Expected: {\"12\", \"34\", \"abc\", \"xyz\"} --> {\"14\", \"32\", \"ayz\", \"xbc\"}");
      String[] arr2 = {"12", "34", "abc", "xyz"};
      System.out.println(Arrays.toString(mixedWords(arr2)));
      System.out.println("Expected: {\"foo\", \"bar\"} --> {\"far\", \"boo\"}");
      String[] arr3 = {"foo", "bar"};
      System.out.println("Expected: {\"Columbus\", \"Ohio\"} --> {\"Coluio\", \"Ohmbus\"}");
      String[] arr4 = {"Columbus", "Ohio"};
      System.out.println(Arrays.toString(mixedWords(arr4)));
}


}