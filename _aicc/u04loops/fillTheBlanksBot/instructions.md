---
layout: project
category: u04loops
title: Fill The Blanks Bot
---

Create a chatbot app that uses a Markov chain to try to fill in the blanks.

![screenshot of a chat conversation between a human in blue text and a bot in red text](../fillTheBlanksScreenshot.png)

When the user types a message with an unknown word, the bot will attempt to predict the unknown word.

For example...

```
User: how do * do?
Bot: how do you do.
User: I * not like olives on my pizza
Bot: I do not like olives on my pizza
User: It's nice * meet you
Bot: It's nice to meet you
User: Are you interested in * your coding skills?
Bot: Are you interested in improving your coding skills.
User: We * need to study for the test
Bot: We just need to study for the test
```



### Source Text

Add a new file and name it `sourceText.txt`

Copy and paste sentences from various webpages into this file.


### Setup

```
let dictionary = {};
let textInput, sendButton, myText;
let textY = 30;

function preload() {
  myText = loadStrings('sourceText.txt');
}

function setup() {
  createCanvas(windowWidth, windowHeight);
  background(???); // TODO
  addUserInterface();
  trainModel(myText.join(" "));
}

function draw() {}

function resetMessages(){
  textY = 30;
  background(???); // TODO
}

// replaceMultipleSpaces() replaces extra spaces with a single space
function replaceMultipleSpaces(someText){
  // Use a regex to find all sequences of spaces and replace them with one space
  return someText.replace(/\s+/g, " ");
}
```

### Display Message
```
// Display one message on the canvas with a color based on who is speaking.
// It can show the user's move, the bot's move, or the result of a round.
function displayMessage(username, textString){
  // Check if the username equals "User"
  if(???) { // TODO
    // Set the fill color for the user's message
    fill(???); // TODO
  } 
  // Check if the username equals "Bot"
  else if(???) { // TODO
    // Set the fill color for the bot's message
    fill(???); // TODO
  }
  // Otherwise, assume it's a result message (who wins)
  else {
    // Set the fill color for the who wins text (black)
    fill(???); // TODO
  }
  // Draw the message on the canvas at x=???, y=textY
  text(username + ": " + textString, ???, textY); // TODO
  // Move the vertical text position downward for the next line
  textY += ???; // TODO
}

```

### Send Message

```
// sendMessage() handles what happens when the user clicks "Send"
// It displays the user's message, checks for a "*", and shows a response from the bot
function sendMessage(){
  // Set the font size for messages displayed on the canvas
  textSize(???); // TODO
  
  // If the text has reached too close to the bottom of the canvas,
  // clear the screen and reset the text position
  if(textY > ???){ // TODO
    resetMessages();
  }

  // Get the text that the user typed in the input box
  let userMessage = textInput.value();
  // Clear the input box after sending the message
  textInput.value("");

  // Show the user's message on the canvas in blue
  displayMessage("User", ???); // TODO
  
  // Create a variable to hold the bot's reply
  let botMessage = "";

  // Check if the user's message contains a "*"
  if(userMessage.indexOf(???) ??? ???){ // TODO
    // There IS a "*" in the user input
    // Replace exclamation marks with periods for consistency
    let fixedPunctuationInput = replacePunctuation(???, ???, ???); // TODO
    // Replace question marks with periods for consistency
    fixedPunctuationInput = replacePunctuation(???, ???, ???); // TODO
    // Use the trained model to predict a word to replace the "*"
    botMessage = predict(fixedPunctuationInput);
  }
  else{
    // There is no "*" tell the user how to format their input
    botMessage = "Give me some text with * in the middle. For example... how * you";
  }

  // Display the bot's message on the canvas in red
  displayMessage("Bot", ???); // TODO
}
```

### Allow User To Send Message With ENTER Key
```
// Define a function to handle keyboard input events
function keyPressed(){
  // Check if the pressed key was the ENTER key
  if (keyCode === ???) { // TODO
    // Call sendMessage to process and display the input
    ???; // TODO
  }
}
```


### Predict

```
// predict() replaces "*" in user input with a predicted word
function predict(userInput){
  // Initialize an empty array to store the output words
  let result = [];
  // Split the user input string into an array of words
  let arrayOfWords = ??? // TODO
  // Loop through each index of the word array using a for loop
  for(???){ // TODO
    // Get the current word
    let currentWord = ??? // TODO
    // Get the word before the current word
    let previous = ??? // TODO
    // Get the word after the current word
    let next = ??? // TODO
    // If the current word is not an asterisk
    if(currentWord != "*"){
      // Add the word into the result array
      ??? // TODO
    } 
    // If the word is an asterisk, try to predict a replacement
    else {
      // Combine the previous and next words as a key
      let previousAndNext = ??? + "*" + ??? // TODO
      // Convert key to lowercase for consistency
      previousAndNext = previousAndNext.toLowerCase();
      // Look up the key in the dictionary
      let possibleWords = dictionary[previousAndNext];
      // If no matching entry is found
      if(possibleWords == undefined){
        // Insert a placeholder UNKNOWN
        result.push("UNKNOWN");
      }
      // Otherwise, randomly choose one of the possible words
      else {
        // Generate a random index from the possible words list
        let randomIndex = ??? // TODO
        // Add the randomly selected word to the result
        result.push(???); // TODO
      }
    }
  }
  // Join the result array into a string and return it
  return result.join(" ");
}
```

### Add Words To Dictionary

```
// addWordsToDictionary() builds a dictionary of word relationships
function addWordsToDictionary(wordArray){
  // Loop through each index of the word array using for loop
  for(???){ // TODO
    // Get the current word
    let currentWord = ??? // TODO
    // Get the word before the current word
    let previous = ??? // TODO
    // Get the word after the current word
    let next = ??? // TODO
    // If this (previous*next) pair does not exist yet in the dictionary
    if(dictionary[previous + "*" + next] == undefined){
      // Create a new empty array for that pair
      dictionary[previous + "*" + next] = [];
    }
    // Add the current word to the list of possible words for that pair
    dictionary[previous + "*" + next].push(???); // TODO
  }
}
```

### Replace Punctuation

```
// replacePunctuation() replaces one punctuation character with another
function replacePunctuation(someText, punctuationCharacter, replaceCharacter){
  // Find the first occurrence of the punctuation character
  let index = someText.indexOf(???); // TODO
  // Continue until there are no more occurrences of that punctuation
  while (index ??? ???) { // TODO
    // Replace the punctuation character with the replacement character
    someText = someText.substring(0, index) + replaceCharacter + ??? // TODO
    // Find the next occurrence
    index = someText.indexOf(???); // TODO
  }
  // Return the updated string
  return ??? // TODO
}
```

### Train Model

```
// trainModel() processes the text and fills the dictionary
function trainModel(myText){
  // Convert all characters to lowercase for consistency
  myText = myText.toLowerCase();
  // Replace multiple spaces with a single space
  let fixedMultipleSpaces = replaceMultipleSpaces(???); // TODO
  // Replace exclamation marks with periods
  let fixedPunctuationText = replacePunctuation(???, ???, ???); // TODO
  // Replace question marks with periods
  fixedPunctuationText = replacePunctuation(fixedPunctuationText, ???, ???); // TODO
  // Split text into an array of sentences using ". " as the delimiter
  let sentenceArray = fixedPunctuationText.??? // TODO

  // Loop through each sentence
  for(let ??? of ???){ // TODO
    // Split sentence into words dividing at each empty space
    let wordArray = ???.split(???); // TODO
    // Add words and their relationships to the dictionary
    addWordsToDictionary(???); // TODO
  }
}
```


