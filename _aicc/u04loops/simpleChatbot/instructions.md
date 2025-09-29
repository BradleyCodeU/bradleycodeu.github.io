---
layout: project
category: u04loops
title: Simple Chatbot
---

Create a chatbot that uses a JavaScript object to store keywords and replies.

![screenshot of a chat conversation between a human in blue text and a bot in red text](https://bradleycodeu.github.io/aicc/u03chatbots/u03simpleChatbot/simpleChatbotScreenshot.png)

### Setup

Make a new p5js project and set it up like this...

```
let textInput;
let sendButton;
let textY = 30;

const dictionary = {
  hello: "Hello there, how are you today?",
  hi: "Hi, how are you?",
  default: "I see.",
}

function setup() {
  createCanvas(windowWidth, windowHeight);
  background(???); // TODO
  addUserInterface();
}

function draw() {
  // Draw function is not used
}

function resetMessages(){
  textY = 30;
  background(200);
}
```

### Add The User Interface

```
// Create the text input and send button elements
function addUserInterface(){
  // Create an input element.
  // Set its default text to "hello!".
  textInput = createInput('hello!');
  // Set the font size for the input
  textInput.style('font-size', '25px');
  // Place it at the bottom of the canvas. 
  textInput.position(???, ???); // TODO
  // Set its width and height 
  textInput.size(width*0.8,30);
  // Create a send button.
  sendButton = createButton("Send");
  // Place it at the bottom of the canvas. 
  sendButton.position(???, ???); // TODO
  // Set its width and height 
  sendButton.size(50,36);
  // Tell it what function to call when clicked
  sendButton.mousePressed(sendMessage);
}
```

### Filter Out Punctuation
```

// Function to remove common punctuation characters from a given text string
function filterOutPunctuation(textString){
  // Define a string containing common punctuation characters to filter out
  let commonPunctuation = ???; // TODO
  // Initialize an empty string to store the cleaned result
  let result = "";
  // Loop through each character of the input text string
  for(let i = ???; i < ???; i++){ // TODO
    // Use substring to extract the current character at position i
    let currentLetter = textString.substring(???); // TODO
    // Check if the current character is NOT found in the punctuation list
    if(commonPunctuation.indexOf(???) == ???){ // TODO
      // If it’s not punctuation, add it to the result string
      ???; // TODO
    }
  }
  // Return the text string with punctuation removed
  ???; // TODO
}
```

### Build Reply
```
// Function that generates a reply message based on input text
function buildReply(message){
  // Convert the user's message to lowercase for consistent matching
  message = ???.toLowerCase(); // TODO
  // Remove punctuation from the message for cleaner word comparisons
  message = filterOutPunctuation(???); // TODO
  // Split the cleaned message into an array of individual words
  let messageArray = ???; // TODO 
  // Initialize an empty array to store possible replies
  let replyArray = ???; // TODO
  // Loop through each word in the message array
  for(let eachWord of ???){ // TODO
    // Check if the current word exists in the dictionary
    if(dictionary[eachWord]){
      // If found, add the corresponding dictionary response to replyArray
      replyArray.push(dictionary[eachWord]);
    }
  }
  // If the size of the reply array is 0 then no matching keywords were found in the dictionary
  if(???){  // TODO
    // Add the default reply to the replyArray
    replyArray.push(dictionary["default"]);
  }
  // Combine all collected replies into a single string separated by spaces
  let replyString = replyArray.join(" ");
  // Return the final reply string
  ???; // TODO
}
```

### Send Messages
```
// Define a function named sendMessage, responsible for handling chat input/output
function sendMessage(){
  // Set the text size for the messages
  textSize(???); // TODO
  // If the textY is too low
  if(textY > ???){ // TODO
    // Call the reset messages function
    ???; // TODO
  }
  // Get the current value typed into the text input field
  let userMessage = textInput.value();
  // Clear the text input field after capturing the message
  textInput.value("");
  // Align text to the right for displaying the user's message
  textAlign(RIGHT)
  // Set the fill color for the user's text
  fill(???); // TODO
  // Draw the user's message near the right side of the canvas at the current Y position
  text(userMessage, ???, textY); // TODO
  // Move the text position downward for the next line of text
  textY += ???; // TODO
  // Align text to the left for displaying the bot’s reply
  textAlign(LEFT)
  // Set the fill color for the bot's reply
  fill(???); // TODO
  // Draw the chatbot’s reply text at the left side of the canvas at the current Y position
  text(buildReply(userMessage), ???, textY); // TODO
  // Move the text position downward for the next message/reply
  textY += ???; // TODO
}
```

### Allow ENTER Key To Send Message
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

### Add 10 More Keyword and Response Pairs

Look at the dictionary JavaScript object on line 5.

You MUST add 10 additional keywords and responses to the dictionary object.

