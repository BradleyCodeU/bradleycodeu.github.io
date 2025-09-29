---
layout: project
category: u04loops
title: RPS Random
---

Create a chatbot app that plays Rock Paper Scissors with a bot that selects its moves randomly.

![screenshot of a chat conversation between a human in blue text and a bot in red text](https://bradleycodeu.github.io/aicc/u03chatbots/u03simpleChatbot/simpleChatbotScreenshot.png)

### Setup

```
let textInput;
let sendButton;
let textY = 30;
let gameCount = 0;
let userWins = 0;
let botWins = 0;
let roundQueue = [];

function setup() {
  createCanvas(windowWidth, windowHeight);
  background(200);
  addUserInterface();
}

function draw() {
  if(roundQueue.length > 0){
    // do nothing
  }
}

function resetMessages(){
  textY = 30;
  background(200);
}
```

### Add User Interface

```
// Create the text input and send button elements
function addUserInterface(){
  // Create an input element.
  // Set its default text to "hello!".
  textInput = createInput('');
  textInput.attribute('placeholder', 'type either: r, p, or s');
  // Set the font size for the input
  textInput.style('font-size', '25px');
  // Place it at the bottom of the canvas. 
  textInput.position(???); // TODO
  // Set its width and height 
  textInput.size(width*0.8,30);
  // Create a send button.
  sendButton = createButton("Send");
  // Place it at the bottom of the canvas. 
  sendButton.position(???); // TODO
  // Set its width and height 
  sendButton.size(50,36);
  // Tell it what function to call when clicked
  sendButton.mousePressed(sendMessage);
}
```

### Get Win Percent
```
// Calculates the win percentage for a given player (user or bot).
// Returns a String, the rounded percentage
function getWinPercent(winCount){
  // Calculate the win percentage by dividing the number of wins
  // by the total number of games played, then multiply by 100
  let percent = ???; // TODO
  // Round the percentage to the nearest whole number and add a "%" symbol
  percent = ???; // TODO
  return percent;
}
```

### Get Who Wins
```
// Determine the winner of a single rock-paper-scissors round.
// It updates the game count and the win counts for the user and bot.
// Returns a message indicating the winner or if it's a tie.
function getWhoWins(userString, botFirstLetter){
  // Increment the total number of games played
  ???; // TODO

  // Use substring to take only the first character of the user string to ensure it's r, p, or s
  let userFirstLetter = ???; // TODO

  // Convert the user's first letter to lowercase for consistent comparison
  userFirstLetter = userFirstLetter.toLowerCase();

  // Combine user and bot moves and determine the winner using switch cases
  switch(userFirstLetter + botFirstLetter) {
    // Cases where the bot wins
    case "rp": // user: rock, bot: paper
    case ???: // user: paper, bot: scissors // TODO
    case ???: // user: scissors, bot: rock // TODO
      ???; // Increment bot's win count // TODO
      // Return a message indicating the bot won, including its win percentage
      return "*** The bot wins *** Bot has won " + getWinPercent(botWins);

    // Cases where the user wins
    case "pr": // user: paper, bot: rock
    case ???: // user: scissors, bot: paper // TODO
    case ???: // user: rock, bot: scissors // TODO
      ???; // Increment user's win count // TODO
      // Return a message indicating the user won, including their win percentage
      return "$ $ $ User wins $ $ $ User has won " + getWinPercent(userWins);

    // Default case: tie
    default:
      return "tie"; // No one wins this round
  }
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



### Play One Round
```
// Handles one round of rock-paper-scissors. 
// It displays the user's move, generates a bot move, determines the winner, 
// and updates the canvas with the results.
function playOneRound(userMessage){

  // Array of moves for the bot "r", "p", or "s"
  let botMoves = ???; // TODO
  // Use the random method to get a random choice from the bot moves list
  let botMessage = ???; // TODO

  // Set the font size for all messages in this round
  textSize(???); // TODO

  // Check if the vertical text position is too low on the canvas
  if(textY > ???){ // TODO
    // Call the reset messages function to clear the canvas and reset text position
    ???; // TODO
  }

  // Display the user's message
  displayMessage("User", userMessage);
  // Display the bot's message
  displayMessage("Bot", ???); // TODO

  // Call the get who wins function, send the user message and bot message as arguments, and save the who wins message
  let whoWinsMessage = ???; // TODO
  // Display the who wins message
  displayMessage("Result", ???); // TODO
}

```


### Send Message
```
// Handle the user input when they press Send or Enter.
function sendMessage(){
  // Get the current value typed into the text input field
  let userMessage = textInput.value();
  // Clear the text input field so the user can type a new message
  textInput.value("");
  // Convert the userMessage to lowercase
  userMessage = userMessage.toLowerCase();
  // Extract the first character of the user's input to use as a single move
  let firstLetter = ???; // TODO
  // Call the play one round function and pass the first letter as an argument
  ???; // TODO
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

<hr>

## CHALLENGE

Use the roundQueue array to allow the user to type their choice for multiple rounds. This way, if the user types "rrprsprsp", they’ll see the rounds unfold one by one.

Go to the sendMessage function and remove the playOneRound function call. Instead you will push each letter of the user message into the roundQueue...
```
for(let eachLetter of userMessage){
  roundQueue.push(???); // TODO
}
```

Add a function named revealNextRound with no parameters.
```
// Play the next round in the queue, if there is one.
function revealNextRound(){
  // If the round queue is empty (no more moves left), exit the function early
  if(???){ // TODO
    return;
  }
  // Play one round using the first move in the queue
  playOneRound(???); // TODO
  // Use the array splice method the first move from the queue since it has been processed
  roundQueue.???; // TODO
}
```

Update the draw function
```
function draw() {
  if(roundQueue.length > 0){
    revealNextRound();
  }
}
```