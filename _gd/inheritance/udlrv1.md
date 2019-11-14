---
layout: project
category: inheritance
title: UDLR v1
---

Watch this tutorial [Coding Train 16.17: Inheritance in JavaScript](https://drive.google.com/file/d/1f31Hv4RS_QHj-aPZUUjJyY07w8wgRcUg/view?usp=sharing)

Create an RPG-style game with Up/Down/Left/Right controls and collectables.

Create a Sprite class.

Create a Player class that EXTENDS THE SPRITE CLASS. The player must have 2 or more states (for example, "standing" and "walking"). Animate the walking state by alternating 2 or more images. One way to do this is to create an image array for the sprite (this.imageArray) and then use this.currentPic to keep track of the array index to display.
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

Here is the complete list of features that your finished game MUST have:
  - Title screen
  - Ingame game state
  - Win screen (collect all of the collectables to win)
  - a Sprite class for collectables (for example: coins, mushrooms, rings, jellyfish, etc)
  - a Player class (that extends Sprite) with 2+ states, walking animation, UDLR controls.
  - all classes must be stored in separate files
  - 4 or more images ([https://p5js.org/reference/#/p5/image](https://p5js.org/reference/#/p5/image)): 2+ images for player animation, collectible image, AND a background image that fills the entire screen
  - Background music
  - three or more sound effects

 For Javascript audio, you will do something like this:
<pre>
var bubblePopSound = new Audio("https://cdn.glitch.com/3ea3f7b0-b76d-4d46-a07c-96d8a42fd4ea%2FMINE%20DIAMONDS%20%20miNECRAFT%20PARODY%20OF%20TAKE%20ON%20ME.mp3?1535764574813");
bubblePopSound.play();
</pre>
