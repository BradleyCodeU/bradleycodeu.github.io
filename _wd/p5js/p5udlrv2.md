---
layout: project
category: p5js
title: UDLR v2
---
Watch this tutorial [Coding Train 16.17: Inheritance in JavaScript](https://drive.google.com/file/d/1f31Hv4RS_QHj-aPZUUjJyY07w8wgRcUg/view?usp=sharing)

Create an RPG-style game with Up/Down/Left/Right controls.

In the Player class, the player must have 2 or more states (for example, "standing" and "walking"). Animate the walking state by alternating 2 or more images. One way to do this is to create an image array for the sprite (this.imageArray) and then use this.currentPic to keep track of the array index to display.
```
update(){
  if (this.state == "standing"){
    this.currentPic = 0;
  }
  if (this.state == "walking"){
    if (frameCount % 6 == 0){ // change pics every 6 frames
      this.currentPic++;
    }
    if (this.currentPic > 3){ // if currentPic > last array index of walking image
      this.currentPic = 0;
    }
  }
}
```
![megaman run cycle](/gd\inheritance\megaman.gif)

Must have collectibles and enemies. Collectibles are good and enemies are bad. There are lots of possible games that could be created. Here are some examples...

  1. You (Mario) and a few koopas are collecting coins. If you collect more than the turtles, you win.
  1. You (a farmer) are planting seeds in your garden, but the evil crows keep eating the seeds. Add as many seeds as you can before the time runs out.
  1. You (Spongebob) are trying to catch jellyfish, but a few Hash Slinging Slashers are trying to catch you. If you catch all the jellyfish before getting caught by a Hash Slinging Slasher, you win.

Here is the complete list of features that your finished game MUST have:
  - Title screen
  - Level 1 game state
  - Level 2 title screen
  - Level 2 game state
  - Win screen
  - Lose screen
  - a timer ([https://www.w3schools.com/jsref/met_win_setinterval.asp](https://www.w3schools.com/jsref/met_win_setinterval.asp))
  - display the score, and the timer ([https://p5js.org/reference/#/p5/text](https://p5js.org/reference/#/p5/text))
  - a Sprite class
  - a Collectible class (extends Sprite) *OR* just use the Sprite class. For example: coins, seeds, jellyfish
  - a Player class (extends Sprite) with 2+ states, walking animation, scale(this.direction,1) to flip the image, UDLR controls.
  - an Enemy class (extends Sprite). For example: Koopas, crows, Hash Slinging Slashers
  - all classes must be stored in separate files
  - 5 or more images ([https://p5js.org/reference/#/p5/image](https://p5js.org/reference/#/p5/image)): 2+ images for player animation, collectible image, enemy image, AND a background image that fills the entire screen
  - Background music
  - three or more sound effects


 For Javascript audio, you will do something like this:
<pre>
var bubblePopSound = new Audio("https://cdn.glitch.com/3ea3f7b0-b76d-4d46-a07c-96d8a42fd4ea%2FMINE%20DIAMONDS%20%20miNECRAFT%20PARODY%20OF%20TAKE%20ON%20ME.mp3?1535764574813");
bubblePopSound.play();
</pre>
