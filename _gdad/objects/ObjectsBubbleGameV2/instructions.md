---
layout: project
category: objects
title: Objects Bubble Game V2
---

Copy/paste your previous code into this new p5js project.

Add the following features...

  -  add 3 or more sounds
  -  load the sounds in the preload function
  -  play the sounds the game begins or when a bubble is popped or a bubble hits the floor or you win or you lose.
  -  delete the you win and you lose popups
  -  add 4 different Game States: "title", "playing", "win", and "lose"
  -  the win state MUST have a green background and text that says "you win"
  -  the lose state MUST have a red background and text that says "you lose"

For Javascript audio, you will do something like this:
```
let bubblePopSound = new Audio("pop.mp3");
bubblePopSound.play();
```

Download one of these and pick 10 sounds to use:
  - [Alice Sound Library 1](https://www.alice.org/wp-content/uploads/2017/05/AliceSoundLibrary.zip)
  - [Alice Sound Library 2](https://www.alice.org/wp-content/uploads/2017/08/AliceSoundLibraryExpansionPackOne.zip)
  - [Essential Retro Video Game Sound Effects Collection](https://opengameart.org/sites/default/files/The%20Essential%20Retro%20Video%20Game%20Sound%20Effects%20Collection%20%5B512%20sounds%5D.zip)

### What are game states???

Game States are *ways to organize the different phases of your game*. In an FPS, you can have a "Start Menu" state, then a "Lobby" state where people pick their weapons. Next, the round begins. The game is in the "Play" state and you play for 4 minutes and at the end, you enter a "Round End" state where you can show everyone's score. If the player clicks the Continue button it sends them back to the "Lobby" state, but if they press the Menu button then it sends them back to the "Start Menu" state.

The concept of Game State is connected to the idea of the Finite-State Machine: [https://en.wikipedia.org/wiki/Finite-state_machine](https://en.wikipedia.org/wiki/Finite-state_machine)

Here is an example of using Game States in p5.js...
```
//using game states in p5.js
//code by Matthew Bardin [2020]

// to make create different play states, we first need to make a 
// variable to control said states. This can be done in different 
// ways: setting the value to the name of the desired state, storing 
// them in an array and calling a specific value, to giving them a 
// number. I have chosen the first method for this example because 
// it is the most clear/user friendly.

//create a variable and give it a beginning value
let gameState = 'start';

function setup() {
  createCanvas(400, 400);
}

function draw() {
  background(220);
  // by creating an if() statement for each possible value of the 
  // gameState variable, we can control what happens at a specific 
  // part of the user experience. 
  if (gameState === 'start') {
    // place all of the code you want to have happen for each state 
    // in its specific section of the if else if.
    fill('purple');
    textAlign(CENTER);
    text('click mouse to play', width / 2, height / 2);
    // create a nested if() statement for the trigger to move to a 
    // different game state. You could move in order or jump around 
    // to different ones depending on what you want to have happen 
    // in your game.
    if (mouseIsPressed) {
      gameState = 'play';
    }
  } else if (gameState === 'play') {
    text('You are playing the game now, press down arrow to stop', width / 2, 25);
    rect(100, 300, 25, 75);
    ellipse(300, 100, 50, 25);
    if (keyIsPressed === true && keyCode === 40){
        gameState = 'end';
        }
  } else if (gameState === 'end') {
    text('game over, press space bar to restart', width / 2, height / 2);
    if (keyIsPressed === true && keyCode === 32){
     gameState = 'start'; 
    }
  }
}
```