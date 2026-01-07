import java.util.Scanner;

public class U02bSubstringApp {

    /**
    * findFirstVowel(String inputWord)
    * Returns the index of first vowel or
    * returns -1 if the word has no vowels.
    * @param String inputWord
    * @return int index of the first vowel
    */
    public static int findFirstVowel(String inputWord){
        // convert the inputWord to lowercase
        inputWord = ??? // TODO 
        // create a String named vowels that is "aeiouy"
        ??? // TODO 
        // create an int counter starts at 0
        ??? // TODO 
        // while the counter is less than the length of inputWord
        while(counter < ???) { // TODO 
            // get a singleLetter using inputWord substring from counter to counter+1
            String singleLetter = ??? // TODO 
            // if vowels index of singleLetter equals -1
            if (??? == -1) { // TODO 
                // add one to counter so we check the next letter in the string
                ??? // TODO 
            }
            else{
                // done! counter is the index of the first vowel
                return counter;
            }
        }
        // didn't find a vowel
        return -1; 
    }

    public static void main(String[] args) {
        System.out.println("SUBSTRING PROJECT");

        // 1. Ask the user for a word and collect it with Scanner.
        Scanner input = new Scanner(System.in);
        System.out.println("1. Ask the user for a word and collect it with Scanner.");
        // TODO 



        // 1. Convert the word to all caps. For example, if the user input "hello" and
        // then change it to "HELLO". Use the toUpperCase method. *Print the
        // result*
        System.out.println("2. Convert the word to all caps.");
        // TODO 



        // 1. Convert the word to all lowercase. For example, if the user input "Justin"
        // and then change it to "justin". Use the toLowerCase method. <ins>Print the
        // result</ins>
        System.out.println("3. Convert the word to all lowercase.");
        // TODO 



        // 1. Convert the word so that the first letter is capitalized. For example, if
        // the user input "hello" it becomes "Hello" and if the user input "BRADLEY" it
        // becomes "Bradley". Use the substring, toUpperCase, and toLowerCase methods.
        // <ins>Print the result</ins>
        System.out.println("4. Convert the word so that the first letter is capitalized.");
        // TODO 



        // 1. Convert the word so "ab" is inserted before the first vowel. For example,
        // if the user input "Justin" it becomes "Jabustin" and if the user input
        // "screen" it becomes "scrabeen". Use the String class substring method and the
        // static findFirstVowel(inputWord) method. <ins>Print the result</ins>
        System.out.println("5. Convert the word so \"ab\" is inserted before the first vowel.");
        // TODO 



        // 1. Shm-reduplication. You will need to use findFirstVowel and replace the
        // characters before the first vowel with "shm". If the user input "Justin" it
        // becomes "Justin-shmustin" and if the user input "bradley" it becomes
        // "bradley-shmadley". Use the String class substring method and the static
        // findFirstVowel(inputWord) method. <ins>Print the result</ins>
        System.out.println("6. Shm-reduplication.");
        // TODO 



        // 1. Pig Latin. For example, if the user input "Justin" it becomes "Ustin-jay"
        // and if the user input "bradley" it becomes "Adley-bray". Use the String class
        // substring method, the String toUpperCase method, the String toLowerCase
        // method, and the static findFirstVowel(inputWord) method. <ins>Print the
        // result</ins>
        System.out.println("7. Pig Latin.");
        // TODO 



        // 1. Generate a username using the first letter (converted to lowercase), the
        // last letter (converted to uppercase), and a random three-digit number from
        // 100 to 999. For example, if the user input "Justin" it might generate "jN371"
        // or "jN784" or "jN196". Use the String length and substring to get the last
        // letter. For the random number...
        // - Use double randomDouble = the Math.random() function (which returns a
        //   decimal number from 0.0 up to 0.99999999999)
        // - Convert it to a String, use String randomString = randomDouble + "";
        // - Use the substring method to ONLY print 3 digits. <ins>Print the random user
        //   name (like "jN371" or "jN784" or "jN196")</ins>
        System.out.println("8. Generate a username.");
        // TODO 



    }
}