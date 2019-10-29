---
layout: project
category: turtleart
title: Turtle Mandala Art
---
A [mandala](https://en.wikipedia.org/wiki/Mandala) is a type of art that has [rotational symmetry](https://en.wikipedia.org/wiki/Rotational_symmetry). It has been used in works of art throughout human history, all around the world.

![mandalaArt](/apcsp/turtleart/mandala.PNG)

[https://www.dispatch.com/entertainmentlife/20181012/monks-making-mandala-as-part-of-dublin-festival](https://www.dispatch.com/entertainmentlife/20181012/monks-making-mandala-as-part-of-dublin-festival)

To complete this assignment you will create a simple drawing with rotational symmetry. Your simple drawing **cannot** be a squiggle, spiral, zig-zag, star, triangle or square. The simple drawing should use 6 or more lines, for example: stick person, house, flower or tree, cat face or bunny face, car or truck, cube, block-letter B.

Define a function that will draw one simple drawing using forward(), backward(), left(), right(), penup(), pendown(), and home(). Home will move the turtle back to the center of the canvas.

Define a function named isValidNumber that requires one argument (myNumber) and returns True or False if myNumber is valid. For this project, any integer larger than 1 is valid.

The program will ask the user "How many repetitions: " If the user says 5, it should draw 5 evenly spaced, rotated around the center. If the user says 7, it should draw 7 evenly spaced, rotated around the center.

Your program should:

- Ask the user "How many repetitions: "
- If user input is not a valid number, print "Not a valid number" and don't draw anything.
- Generate a random color using color() and random(). Each time you run the program it will draw with a new random color.
- Use a for loop to repeat the simple drawing. Each time you draw it, you will use setheading() to rotate the drawing around the center of the canvas. Set Heading works like Scratch's "point towards." You will probably need something like, ```setheading(360 / sides * i)```


Here are a few examples...
![turtlemandala](/apcsp/turtleart/TurtleMandala.PNG)
