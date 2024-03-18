class U07bWordGame {

//  Create a static method named checkLetter that returns a one-emoji String.
//  Requires 3 arguments: String secretWord, String letter, int indexLocation.
//  If the letter is at indexLocation of the secretWord, return…
//  a single green ✅ Check Mark Button emoji
//  If the letter exists somewhere else in the secretWord, return…
//  a single 🔀 shuffle tracks button emoji.
//  Otherwise, return a single 🔳 White Square Button Emoji.
// checkLetter("coder", "c", 0) ⟶ "✅"
// checkLetter("coder", "r",2) ⟶ "🔀"
// checkLetter("coder", "x", 4) ⟶ "🔳"


//  Create a static method named checkGuess that returns a 5-emoji hint String.
//  Requires 2 arguments: String secretWord, String userGuess. Check each letter
//  of userGuess. Each time you check a letter, you will get a single emoji.
//  Return a hint string of 5 emojis.
// checkGuess("coder", "clown") ⟶ "✅🔳🔀🔳🔳"
// checkGuess("coder", "raced") ⟶ "🔀🔳🔀✅🔀"
// checkGuess("coder", "cedar") ⟶ "✅🔀✅🔳✅"


//  Create a static method named randomSecret that returns a String.
//  Requires 1 argument: String[ ] listOfWords. Randomly select one secret word
//  from the listOfWords. If the array length is less than 1, then always return
//  the word "error". If the secret word is not exactly 5 letters long, always return
//  the word "sorry". Otherwise convert it to lowercase and return the secret word.



//  Create a static method named getUserInput that returns a String.
//  Requires 1 argument: Scanner input.
//  Prompt the user to type in a 5-letter word. If the word is not exactly 5
//  letters long, then say it must be exactly 5 letters and prompt again.
//  Otherwise, return the user's guess. The method must prompt them over and
//  over until they enter a valid word.


// Create a static method named getWordList that returns a String array that
// contains the following 5-letter words…
      // "apple", "mario", "luigi", "sonic", "mouse", "peach", "grade", "teach",
      // "shrek", "snake", "wario", "which", "there", "their", "about", "would",
      // "these", "other", "words", "could", "write", "first", "water", "after",
      // "where", "right", "think", "three", "years", "place", "sound", "great",
      // "again", "still", "every", "small", "found", "those", "never", "under",
      // "might", "while", "house", "world", "below", "asked", "going", "large",
      // "until", "along", "shall", "being", "often", "earth", "began", "since",
      // "study", "night", "light", "pizza", "above", "paper", "mines", "craft"


  public static void main(String[] args) {
    // declare variables for String[] word array, secret word, user guess, Scanner input.
    // create a String ArrayList to store player history (don't know how long this list needs to be)
    
    // call the getWordArray method and save what it returns in wordArray variable

    // call randomSecret(wordArray) and save what it returns in the secret word variable
    // do this… while the secret word does not equal the user guess

    // // call the getUserInput and save what it returns in the user guess variable
    // // call the checkGuess(secretWord, userGuess) and save the result as hintString
    // // add the hintString to the player history list
    // // print the hintString

    // print YOU GOT IT!!! The secret word was secretWord
    // print the player history list with each item on its own line.
  }


}