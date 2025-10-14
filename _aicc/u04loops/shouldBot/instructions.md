---
layout: project
category: u04loops
title: Should Bot
---

Create a chatbot app that randomly answers this or that questions

<table border="1" cellspacing="0" cellpadding="6">
    <tbody>
        <tr>
            <th>The user asks "_____"</th>
            <th>Sometimes the bot will randomly reply "_____"</th>
        </tr>
        <tr>
            <td>hawaiian pizza or hamburgers</td>
            <td>hawaiian pizza</td>
        </tr>
        <tr>
            <td>aaa or bbb or ccc or ddd or eee or fff or ggg</td>
            <td>eee</td>
        </tr>
        <tr>
            <td>hot dog or salad or sushi</td>
            <td>salad</td>
        </tr>
        <tr>
            <td>pizza, burgers, hot dogs or subs</td>
            <td>burgers</td>
        </tr>
        <tr>
            <td>chocolate, vanilla, or strawberry?</td>
            <td>strawberry</td>
        </tr>
        <tr>
            <td>should i play mario or should i play sonic?</td>
            <td>you should play mario</td>
        </tr>
    </tbody>
</table>

### Setup

```
let textInput;
let sendButton;
let textY = 30;


function setup() {
  createCanvas(windowWidth, windowHeight);
  background(???); // TODO
  addUserInterface();
}

function draw() {
  if(roundQueue.length > 0){
    // do nothing
  }
}

function resetMessages(){
  textY = 30;
  background(???); // TODO
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

### Build Bot Reply
```
// given a userInput string in all lowercase, randomly return a logical response
function buildBotReply(userInput){
    // SEE DETAILED DIRECTIONS BELOW
    // Make replacements
    // Separate the options
    // Randomly select an option and return it
}
```

#### Detailed Directions for Build Bot Reply

If the text "should i" appears in the userInput, replace it with "you should". Use indexOf to detect if userInput contains "should i" You may also need to replace additional text before you split the string into an array.

Separate the two (OR MORE) options in the userInput with split. 

Randomly select an option.

For example…

- The user asks “pizza or hamburgers” and the bot might randomly reply “pizza”
- The user asks “hot dog or salad or sushi” and the bot might randomly reply “salad”
- The user asks “pizza, burgers, hot dogs or subs” and the bot might randomly reply “burgers”
- The user asks “chocolate, vanilla, or strawberry?” and the bot might randomly reply “strawberry”

** NOTICE: Your program MUST be able to correctly handle oxford commas **

If the user inputs “A, B, or C” then the program must NEVER reply “ or C” or “ “. Given that user input, you do NOT want array values:

`["A","B"," ","C"]`

You should only have:

`["A","B","C"]`


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
  // Display the user message
  // TODO
  // Call build bot reply function and send user message as an argument
  // TODO
  // Dipslay the bot message
  // TODO
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
