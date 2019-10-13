---
layout: project
category: inheritance
title: UDLR
---

Watch this tutorial [Coding Train 16.17: Inheritance in JavaScript](https://drive.google.com/file/d/1f31Hv4RS_QHj-aPZUUjJyY07w8wgRcUg/view?usp=sharing)

Create an RPG-style game with Up/Down/Left/Right controls.


Create a player class. The player must have 2 or more states (for example, "standing" and "walking"). Animate the walking state by alternating 2 or more images. Use scale(this.direction,1) to flip the image. Use Up/Down/Left/Right to control the player.

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
  - a player class with 2+ states, walking animation, scale(this.direction,1) to flip the image, UDLR controls.
  - a collectible class (for example: coins, seeds, jellyfish)
  - an enemy class (for example: Koopas, crows, Hash Slinging Slashers)
  - all classes must be stored in separate files
  - 5 or more images ([https://p5js.org/reference/#/p5/image](https://p5js.org/reference/#/p5/image)): 2+ images for player animation, collectibles, enemies, AND a background image that fills the entire screen
  - Background music
  - three or more sound effects


 For Javascript audio, you will do something like this:
<pre>
var bubblePopSound = new Audio("https://cdn.glitch.com/3ea3f7b0-b76d-4d46-a07c-96d8a42fd4ea%2FMINE%20DIAMONDS%20%20miNECRAFT%20PARODY%20OF%20TAKE%20ON%20ME.mp3?1535764574813");
bubblePopSound.play();
</pre>
