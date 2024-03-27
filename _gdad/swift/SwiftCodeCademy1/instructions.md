---
layout: project
category: p5js
title: Swift CodeCademy 1
---

Copy/paste your code from the P5Whiteboard project.

This assignment is inspired by the game Art Sqool: https://en.wikipedia.org/wiki/Art_Sqool


Add a SUBMIT ASSIGNMENT button.

When the button is clicked, display some sort of animation that says something like "Analyzing... Grading..." for about 2 seconds.

Display the user's grade. The grade should either range from 0 to 100 OR from A+ to F.

 

The grade MUST NOT be random.

There MUST be a minimum amount of dots. The player can't submit an empty canvas and get a good grade.

 

Ideas for how to determine grade...

- If there are more dots in the top half of the canvas, then you get a good grade?
- Color... count the number of colors used. Larger is better.
- xSymmetry... what's the ratio of left_dots / right_dots? Closer to 1.0 is better.
- ySymmetry... what's the ratio of top_dots / bottom_dots? Closer to 1.0 is better.
- Connectivity... what is the average distance between dots? Maybe smaller distance is better? Scattered/longer distance is worse?
- Spread... what is the maximum distance from the center of the screen? Only drawing in the center = bad. 
- Make a rubric/formula like this... 0.2 x colorCount + 0.2 x xSymmetry + 0.2 x ySymmetry +0.2 x connectivity + 0.2 x spread. You can adjust the weights (the 0.2's) based on how important each factor is in your grading system. 
 

Stuck on how to display an animation for 2 seconds? This animation must last for at least 2 seconds. frameCount is a built in variable that increases ~60 times per second. When the animation is displayed you could set a timer for 120 and subtract 1 each frame. When the timer hits 0, display the grade.