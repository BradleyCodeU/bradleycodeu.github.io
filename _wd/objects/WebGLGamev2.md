---
layout: project
category: objects
title: WebGL game v2
---

Create a simple P5js game in which you are collecting pickups and earning points. Maybe you are trying to collect the pickups before they hit the floor? Maybe you are racing against a timer?

You should have:

- a Pickup class with at several attributes (x, y, z, color, hasBeenCollected)
- a method that moves a pickup AND a method called isTouchingPlayer() that returns True or False if distance between player.x, player.z and this.x, this.z is below some minimum.
- a sound to play when a pickup is collected (or added or whatever makes you win) AND a bad sound to play when a pickup hits the floor (or whatever makes you lose)
- the background turns red if you lose AND turns green if you win


For Javascript audio, you will do something like this:
```
var bubblePopSound = new Audio("pop.mp3");
bubblePopSound.play();
```
