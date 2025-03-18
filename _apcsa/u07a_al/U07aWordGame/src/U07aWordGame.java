import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class U07aWordGame {

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
    
    
    // Create a static method named getWordArray that returns a String array that
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
        // declare variables String[] word array, String secret word, String user guess, String hint string.
        // create a String ArrayList to store hint history (don't know how long this list needs to be)
        
        // call the getWordArray method and save what it returns in wordArray variable
    
        // call randomSecret(wordArray) and save what it returns in the secret word variable
        // do this… while the secret word does not equal the user guess
            // // call getUserInput and save what it returns in the user guess variable
            // // call the checkGuess(secretWord, userGuess) and save the result as hintString
            // // add the userGuess + " " + hintString to the hint history list
            // // call the displayHints method and pass hint history as an argument
        // add "YOU GOT IT!!! The secret word was " + secretWord to the hint history
        // call the displayHints method and pass hint history as an argument
      }


      public static String getUserInput() {
        final String[] userInput = {null};
        JFrame frame = new JFrame("Word Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLocation(100, 100);
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        JLabel instructionLabel = new JLabel("Enter a 5-letter word:", SwingConstants.CENTER);
        panel.add(instructionLabel, BorderLayout.NORTH);
        JTextField guessField = new JTextField(10);
        JButton submitButton = new JButton("Submit");
        JPanel inputPanel = new JPanel();
        inputPanel.add(guessField);
        inputPanel.add(submitButton);
        panel.add(inputPanel, BorderLayout.CENTER);
        final Object lock = new Object();
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String guess = guessField.getText().trim().toLowerCase();
                if (guess.length() == 5) {
                    synchronized (lock) {
                        userInput[0] = guess;
                        lock.notify();
                    }
                    frame.dispose();
                } else {
                    JOptionPane.showMessageDialog(frame, "Word must be exactly 5 letters long.");
                }
            }
        });
        frame.add(panel);
        frame.setVisible(true);
        synchronized (lock) {
            while (userInput[0] == null) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        return userInput[0];
    }

    public static void displayHints(ArrayList<String> hintHistory) {
        JFrame frame = new JFrame("Word Game - Hints");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLocation(100, 300);
        JTextArea hintArea = new JTextArea();
        hintArea.setEditable(false);
        for (String hint : hintHistory) {
            hintArea.append(hint + "\n");
        }
        JScrollPane scrollPane = new JScrollPane(hintArea);
        frame.add(scrollPane);
        frame.setVisible(true);
    }
    
    
}