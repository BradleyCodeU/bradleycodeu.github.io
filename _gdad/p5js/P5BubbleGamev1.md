---
layout: project
category: p5js
title: P5 Bubble Game v1
---
Create a simple Javascript / P5.JS clicker game in which you pop bubbles. For example... bubbles start on the ceiling and you must pop them before they hit the floor.

Here are some example games that could be created for this project. [https://drive.google.com/open?id=1vKWvEVYdziomOPKc5CvnQzG8H3M1k3w-](https://drive.google.com/open?id=1vKWvEVYdziomOPKc5CvnQzG8H3M1k3w-)

You should have:

- a Bubble class with at least two attributes
- a method that moves a bubble AND a method called isTouching(x,y) that returns True or False if point x,y is inside the bubble
- a sound to play when a bubble is popped (or added or whatever makes you win) AND a bad sound to play when a bubble hits the floor (or whatever makes you lose)
- the background turns red if you lose AND turns green if you win



Watch these tutorials: [https://drive.google.com/drive/folders/1DtbX9YIUTBWfRXEQFbkiC4MRZu8hGgex?usp=sharing](https://drive.google.com/drive/folders/1DtbX9YIUTBWfRXEQFbkiC4MRZu8hGgex?usp=sharing)

For Javascript audio, you will do something like this:
```
var bubblePopSound = new Audio("pop.mp3");
bubblePopSound.play();
```
