---
layout: project
category: p5js
title: P5 Bouncing DVD Logo
---

Concepts covered in this project:

- JavaScript Concepts: declaring/initializing variables, updating variables, conditionals.
- P5.js Concepts: random() function, ellipse() or circle() function, fill() function, width variable, height variable, dist() function, mouseX variable, mouseY variable.

Tutorials:

- Calling Functions [https://happycoding.io/tutorials/p5js/calling-functions](https://happycoding.io/tutorials/p5js/calling-functions)
- Using Variables [https://happycoding.io/tutorials/p5js/using-variables](https://happycoding.io/tutorials/p5js/using-variables)
- Creating Variables [https://happycoding.io/tutorials/p5js/creating-variables](https://happycoding.io/tutorials/p5js/creating-variables)
- If Statements [https://happycoding.io/tutorials/p5js/if-statements](https://happycoding.io/tutorials/p5js/if-statements)
- Animation [https://happycoding.io/tutorials/p5js/animation](https://happycoding.io/tutorials/p5js/animation)
- Random [https://happycoding.io/tutorials/p5js/random](https://happycoding.io/tutorials/p5js/random)


You will be creating a bouncing ball animation that is similar to the “bouncing dvd logo” screensaver. If you don’t know what that is, Google bouncing dvd logo

Create a Ball that moves around the screen, bounces off walls, and changes color each bounce. You MUST:

- Use variables (or instance variables) to store:
    - x location
    - y location
    - x speed
    - y speed
- red amount (from 0 to 255)
- green amount (from 0 to 255)
- blue amount (from 0 to 255)
- The Ball should start in the top-left portion of the screen.
- The Ball automatically moves around the screen using its speed to change its location.
- If the Ball’s x is less than OR EQUAL TO zero, it is touching the left wall. Switch its x speed to a random amount from 1 to 5. Set the red, green, blue to new random amounts.
- If the Ball’s x is greater than OR EQUAL TO the width of the screen, it is touching the right wall. Switch its x speed to a random amount from -1 to -5. Set the colors to new random amounts.
- If the Ball’s y is less than OR EQUAL TO zero, it is touching the top wall. Switch its y speed to a random amount from 1 to 5. Set the colors to new random amounts.
- If the Ball’s y is greater than OR EQUAL TO the height of the screen, it is touching the bottom wall. Switch its y speed to a random amount from -1 to -5. Set the colors to new random amounts.
- Use the P5.js dist() function to find the distance between the Ball and the mouse. Use the built-in mouseX and mouseY variables. If the distance is less than 10, give the Ball a new random position and new random speeds.
