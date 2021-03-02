---
layout: project
category: scrum
title: Foobar v2
---
In this project, your team will finish your text-based game

## The Map Class

Must use [the Map class](https://bradleycodeu.github.io/wd/scrum/map.js) to draw a map for your game (hide or show the items is up to you). The Map class requires that you import p5js by adding the following to the head section: ``` <script src="https://cdnjs.cloudflare.com/ajax/libs/p5.js/1.2.0/p5.js"></script> ```

## ASCII Art

Go to your index.html and add ```<pre> </pre>``` tags. These tags are for [preformatted text](https://www.w3schools.com/tags/tag_pre.asp). Text in a ```<pre>``` element is displayed in a fixed-width font, and the text preserves both spaces and line breaks.

Visit [this site](http://patorjk.com/software/taag/#p=display&f=ANSI%20Shadow&t=Game%20Title) to get an ASCII art version of your game title. Notice that you can change the "font" to something else like Bulbhead, Doom, or Ogre. Some of the fonts might make the text too big, so pick one that fits.

Paste the ASCII art into the preformatted section of your index.html

## More Rooms

When finished, you should have a total of 25 or more rooms. Each of these rooms must have a unique description, NOT just "you're in a room". Have 10 or more items that the player can pick up.

## Special Rooms

Have 1 or more locked rooms/enemies/mini-games that you must complete. You can base this on the Boss Battle project OR the JS Form Game project (the one that had 4 trivia questions to answer).

I recommend creating a function called checkIfSpecialRoom that redirects the player if they are in one of your special locations. FOR EXAMPLE...
```
function checkIfSpecialRoom(mylocation, roomArray, inventory, isQuizCompleted, isBossDead) {

  // NOTICE you automatically unlock rm 403 FROM rm 303
  if (location == 303){
    if (inventory.includes("gold key") == true){
      alert("You use the gold key to unlock the door.");
      roomArray[403] = "The unlocked door leads into a small, dark hallway";
      // update the description div
    }
    if (inventory.includes("gold key") == false){
      alert("The room to the east is locked. You need a key.");
      roomArray[403] = undefined;
    }
  }

  if (location == 6 && isQuizCompleted == False) {
    susansQuizGame();
  }  

  if (location == 105 && isBossDead == False) {
    adamsBossBattle();
  }

}
```
Call the checkIfSpecialRoom function at the bottom of the move function (just above return mylocation). This way, as soon as you step into a special room it puts you into a mini-game.

## Take Button

In index.html...
  - Add a button that says Take and onclick it calls the takeItem() function
  - Create a new div to show the contents of the player's inventory and give it the id "backpack"

In Javascript...

Create an array to store the player's inventory.

Create a function named takeItem().
  - Push the itemArray[mylocation] into the player's inventory using the [push() method](https://www.w3schools.com/jsref/jsref_push.asp).
  - Next, set the itemArray[mylocation] equal to undefined.
  - Finally, display the player's inventory in the "backpack"


## Save and Load Buttons

Add a SAVE button. Define a function named saveGame() that saves all of the variables into localStorage

Add a LOAD button. Define a function named loadGame() that loads all of the variables from localStorage. Don't forget that everything is saved as a string in localStorage! Use [parseInt()](https://www.w3schools.com/jsref/jsref_parseint.asp) or JSON.parse() to convert string to number. Use the [.split(",") method](https://www.w3schools.com/jsref/jsref_split.asp) to convert string to array.

## Full List of Requirements

You will be graded on the following requirements:
- Must use [the Map class](https://bradleycodeu.github.io/wd/scrum/map.js) to draw a map for your game
- Visit [this site](http://patorjk.com/software/taag/#p=display&f=ANSI%20Shadow&t=Game%20Title) to get an ASCII art version of your game title.
- Have a total of 25 or more rooms. Have 10 or more items that the player can pick up.
- Print the room description, any item in the room, any items in the player's inventory/backpack
- Must be able to change rooms and give a message like "You can't go there" when necessary.
- Have 1 or more locked room/enemy/mini-game.
- Add a TAKE button.
- Add a SAVE button. Define a function named saveGame() that saves all of the variables into localStorage
- Add a LOAD button. Define a function named loadGame() that loads all of the variables from localStorage.
- The game ends if the user loses the game, or wins the game.
    * Create an alert
    * Change the background color to either red (lose) or green (win)
    * Hide all of the buttons
