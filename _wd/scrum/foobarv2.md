---
layout: project
category: scrum
title: Foobar v2
---
In this project, your team will finish your text-based game

You will be graded on the following requirements:

- Have 30 rooms. Each of these rooms must have a unique description. NOT just "you're in a room". Have 10 or more items that the player can pick up.
- Print the room description, any item in the room, any items in the player's inventory/backpack
- Must be able to change rooms and give a message like "You can't go there" when necessary.
- Have 1 final enemy/mini-game that you must defeat. You can either base this on the Boss Battle project OR the JS Form Game project (the one that had 4 trivia questions to answer).
- Must use [the Map class](https://bradleycodeu.github.io/wd/scrum/map.js) to draw a map for your game (hide or show the items is up to you). The Map class requires that you import p5js by adding the following to the head section: ``` <script src="https://cdnjs.cloudflare.com/ajax/libs/p5.js/1.2.0/p5.js"></script> ```
- Add a TAKE button. Must be able to collect an item (using "take" button), place the item in the player's inventory/backpack, and remove the item from the room.
- Add a SAVE button. Define a function named saveGame() that saves all of the variables into localStorage
- Add a LOAD button. Define a function named loadGame() that loads all of the variables from localStorage. Don't forget that everything is saved as a string in localStorage! Use [parseInt()](https://www.w3schools.com/jsref/jsref_parseint.asp) or JSON.parse() to convert string to number. Use the [.split(",") method](https://www.w3schools.com/jsref/jsref_split.asp) to convert string to array.
- The game ends if the user loses the game, or wins the game.
    * Create an alert
    * Change the background color to either red (lose) or green (win)
    * Hide all of the buttons

### How to unlock doors and start mini-games

I recommend creating a function called checkIfSpecialRoom that redirects the player if they are in one of your special locations. FOR EXAMPLE...
```
function checkIfSpecialRoom(mylocation, roomArray, inventory, isQuizCompleted, isBossDead) {
  if (location == 6 && isQuizCompleted == False) {
    susansQuizGame();
  }  
  if (location == 105 && isBossDead == False) {
    adamsBossBattle();
  }
  // NOTICE you unlock room 303 FROM room 304
  if (location == 304){
    if (inventory.includes("gold key") == true){
      alert("You use the gold key to unlock the door.");
      roomArray[303] = "The unlocked door leads into a small, dark hallway";
    }
    if (inventory.includes("gold key") == false){
      alert("The room to the north is locked. You need a key.");
      roomArray[303] = undefined;
    }
  }
}



```
Call the checkIfSpecialRoom function in the main function right after move. This way, as soon as you step into a special room it puts you into a mini-game.
