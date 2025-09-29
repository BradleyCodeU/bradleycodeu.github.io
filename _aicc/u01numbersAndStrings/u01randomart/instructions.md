---
layout: project
category: u01numbersAndStrings
title: U01 Random Art
---



Using P5.js create a Random Picture Generator. 


### Requirements

1. You MUST draw a stationary work of art, NOT an infinite random animation. 

1. You MUST draw at least 10 shapes and at most 100 shapes. For example, drawing 100 circles.

1. You MUST have a limited color palette. At least 2 colors (not counting black and white). No more than 5 colors.

1. Your project MUST have 3 random elements that change each time the user clicks PLAY. For example...
    - Random shape (circle, square, triangle, etc.)
    - Random size
    - Random position
    - Random color (from your chosen palette)
    - Random rotation/angle

1. You MUST change `createCanvas(400, 400);` to `createCanvas(windowWidth, windowHeight);` so that it fills the screen.

With 3 random elements, each time your project loads we should see a slightly different version of the art. Refresh the page several times to see how the artwork changes.

The art should *mostly* be generated without user input. I do NOT want a mouse drawing app.

NOTE: You could either write your code in the `setup()` function where the code will run once OR in the `draw()` function where it will loop repeatedly.

NOTE: You might want to remove the `background(220)` call so that your shapes are not being erased each loop.

### Challenges

Add an interactive element. Randomize something when the mouse is clicked or when the mouse moves. The art should *mostly* be generated without user input. I do NOT want a mouse drawing app.