---
layout: project
category: u01numbersAndStrings
title: U01 Make Art
---

Generative Art is a process of algorithmically generating graphics/patterns/shapes often using randomness.

Click here for examples: [https://www.google.com/search?udm=2&q=Generative+Art](https://www.google.com/search?udm=2&q=Generative+Art)

## Directions

Using P5.js create some Generative Art.

Your project MUST have a limited color palette. At least 2 colors (not counting black and white). No more than 5 colors.

Your project MUST have some randomness. For example...
- Random shape (circle, square, triangle, etc.)
- Random size
- Random position
- Random color (from your chosen palette)
- Random rotation/angle

You MUST change `createCanvas(400, 400);` to `createCanvas(windowWidth, windowHeight);` so that it fills the screen.

Refresh the page several times to see how the artwork changes.

NOTE: You might want to remove the `background(220)` call so that your shapes are not being erased each loop.

NOTE: You could either write your code in the `setup()` function where the code will run once OR in the `draw()` function where it will loop repeatedly.



### Challenges

Include motion in order to create a generative art animation.

Add an interactive element. Randomize something when the mouse is clicked or when the mouse moves. The art should *mostly* be generated without user input. I do NOT want a mouse drawing app.