---
layout: project
category: turtleart
title: Turtle Bouncing Off Walls
---
For this project you will use some new commands:
```python
while True:   # Creates a "forever" loop. Indent next line(s) to place them inside the loop
xcor()        # Get the x location of the turtle
ycor()        # Get the y location of the turtle
towards(0,0)  # Get the angle from turtle's position to another position (x,y) or another turtle
setheading(0) # Set turtle facing an angle. Examples: 0 (East), 45 (NE), 90 (N), 180 (W), 270 (S)
              # For example, setheading(90) will always point the turtle North.
```
This project is the Python version of the Scratch Bouncing Off The Walls project. If you are using Mu, the "walls" are -450 and 450 horizontally and then -400 and 400 vertically. If you are using Trinket, the "walls" are -200 and 200 horizontally and then -200 and 200 vertically.

IMPORTANT: For this project, ```do NOT use goto() or home() or setposition()```. I want you to demonstrate that you know how to use if statements and use setheading()

- Switch the shape to turtle.
- Put the pen down.
- Set the tracer with an argument 2.
- Define a function called bounceOffWalls() in which you do these steps:
  - Get the turtle's x location
  - Get the turtle's y location
  - If the turtle's x location is less than -450, then set the heading to point towards arguments 0,0
  - If the turtle's x location is greater than 450, then set the heading to point towards arguments 0,0
  - If the turtle's y location is less than -400, then set the heading to point towards arguments 0,0
  - If the turtle's y location is greater than 400, then set the heading to point towards arguments 0,0

Write code so that your turtle will forever:
- Move forward a random amount
- Turn a random angle
- Bounce off walls

![Example](/apcsp/turtleart/randwalk11.jpg)
