---
layout: project
category: u01numbersAndStrings
title: U01 Intro To Sound
---

Create a simple audio player app.

## Directions

Upload 3 sounds.

Declare 3 variables that will store your sounds.

Use the async keyword with the setup function [https://beta.p5js.org/reference/p5/async_await/](https://beta.p5js.org/reference/p5/async_await/)

Inside of setup, use the keyword await when you call the loadSound() function [https://p5js.org/reference/p5/loadSound/](https://p5js.org/reference/p5/loadSound/). The loadSound function returns a p5.SoundFile object. Check the p5.SoundFile reference for how to play a sound: [https://p5js.org/reference/p5.sound/p5.SoundFile/](https://p5js.org/reference/p5.sound/p5.SoundFile/)

Check if a key is pressed by EITHER:

- Use keyPressed() function to play a sound when a keyboard key is pressed: [https://p5js.org/reference/p5/keyPressed/](https://p5js.org/reference/p5/keyPressed/)

- Use keyIsDown() function to check if a certain key is pressed: [https://p5js.org/reference/p5/keyIsDown/](https://p5js.org/reference/p5/keyIsDown/)

Display text on the canvas to tell the user what keyboard keys to press. For example... "Press keys Q, W, and E" [https://p5js.org/reference/p5/text/](https://p5js.org/reference/p5/text/)