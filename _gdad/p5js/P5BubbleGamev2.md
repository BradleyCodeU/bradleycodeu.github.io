---
layout: project
category: p5js
title: Bubble Game v2
---

In this project you will extend your simple Javascript / P5.JS clicker game.

**Remix your previous Bubble Game project!**

You will extend your bubble game so that you have collectibles and enemies. Collectibles are good and enemies are bad. There are lots of possible games that could be created. Here are some examples...

  - You (Mario) and a few koopas are collecting coins. If you collect more than the turtles, you win.

  - You (a farmer) are planting seeds in your garden, but the evil crows keep eating the seeds. Add as many seeds as you can before the time runs out.

  - You (Spongebob) are trying to catch jellyfish, but a few Hash Slinging Slashers are trying to catch you (your mouse pointer). If you catch all the jellyfish before getting caught by a Hash Slinging Slasher, you win.

Your finished game MUST have:

  1. a timer ([https://www.w3schools.com/jsref/met_win_setinterval.asp](https://www.w3schools.com/jsref/met_win_setinterval.asp))

  1. display the game title, the score, and the timer ([https://p5js.org/reference/#/p5/text](https://p5js.org/reference/#/p5/text))

  1. the background turns red if you lose AND turns green if you win ([https://p5js.org/reference/#/p5/background](https://p5js.org/reference/#/p5/background))

  1. a collectible class based on the bubble class (for example: coins, seeds, jellyfish)

  1. an enemy class based on the bubble class (for example: Koopas, crows, Hash Slinging Slashers)

  1. three or more images ([https://p5js.org/reference/#/p5/image](https://p5js.org/reference/#/p5/image)): an image for collectibles, an image for enemies, AND an image that follows your mouse pointer (for example: Mario, a farmer, Spongebob)

  1. two or more sounds


For Javascript audio, you will do something like this:
<pre>
var bubblePopSound = new Audio("pop.mp3");
bubblePopSound.play();
</pre>
