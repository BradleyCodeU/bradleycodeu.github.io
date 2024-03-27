---
layout: project
category: objects
title: Objects UDLR
---

Watch this tutorial [Coding Train 16.17: Inheritance in JavaScript](https://drive.google.com/file/d/1f31Hv4RS_QHj-aPZUUjJyY07w8wgRcUg/view?usp=sharing)

Create an RPG-style game with Up/Down/Left/Right controls and collectables.

Create a Sprite class. Should have a "show" method

Create a Player class that EXTENDS THE SPRITE CLASS. Should have a method called "isTouching" that will check for collisions with a point. The method requires two arguments: otherX, otherY. It checks the distance between this.x, this.y and otherX, otherY. Returns true or false if the distance is less than the radius of the player.

In the Player class, the player must have 2 or more states (for example, "standing" and "walking"). Show one image if the state is "standing" and a different image if the state is "walking". I recommend that you create an image array for the sprite (this.imageArray) and then use this.currentPic to keep track of the array index to display.

Here is the complete list of features that your finished game MUST have:
  - Title screen (the "titlescreen" game state)
  - An "ingame" game state
  - Win screen when you collect all of the collectables (the "win" game state)
  - a Sprite class for collectables (for example: coins, mushrooms, rings, jellyfish, etc)
  - a Player class (that extends Sprite) UDLR controls.
  - all classes must be stored in separate files
  - 4 or more images ([https://p5js.org/reference/#/p5/image](https://p5js.org/reference/#/p5/image)): 2+ player images, collectible image, AND a background image that fills the entire screen
  - Background music
  - two or more sound effects

 For Javascript audio, you will do something like this:
<pre>
var bubblePopSound = new Audio("https://cdn.glitch.com/3ea3f7b0-b76d-4d46-a07c-96d8a42fd4ea%2FMINE%20DIAMONDS%20%20miNECRAFT%20PARODY%20OF%20TAKE%20ON%20ME.mp3?1535764574813");
bubblePopSound.play();
</pre>
