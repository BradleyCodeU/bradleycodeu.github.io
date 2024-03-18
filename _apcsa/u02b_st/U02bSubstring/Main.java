public class Main
{
    

    /**
    * findFirstVowel(String inputWord)
    * Returns the index of first vowel or
    * returns -1 if the word has no vowels.
    * @param String inputWord
    * @return int index of the first vowel
    */
    public static int findFirstVowel(String inputWord){
        // create a string named vowels that is "aeiouy"
        ???
        // create a counter starts at 0
        ???
        // while the counter is less than the length of inputWord
        while(counter < ???) {
            // get a singleLetter using inputWord substring from counter to counter+1
            String singleLetter = ???
            // if vowels index of singleLetter equals -1
            if (??? == -1) {
                // add one to counter so we check the next letter in the string
                ???
            }
            else{
                // done! here is the index of the first vowel
                return counter;
            }
        }
        // didn't find a vowel
        return 0;
    }


    public static void main(String[] args)
    {
        System.out.println("SUBSTRING PROJECT");
    }
}