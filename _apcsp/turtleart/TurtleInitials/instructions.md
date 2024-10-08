---
layout: project
category: turtleart
title: Turtle Initials
---

Turtle Initials


The goal of this exercise is to practice use Turtle Graphics in Python by defining two Python functions that use Turtle Graphics to draw letter shapes.

You MUST define *TWO* functions, one for each of your initials. For example, Justin Riley would define the functions drawJ and drawR. 

At the end of your file, call both functions.

If your initials are the same (like Amy Adams or Ryan Reynolds), then define a function for your initial letter and another function for any other letter.

Here are four different example projects...

![four different example projects with drawings of initials](https://bradleycodeu.github.io/apcsp/turtleart/turtleinitials.jpg)

Here are some of the basic Python Turtle commands you may need:
```python
from turtle import *
tracer(0)
Turtle()
penup()
goto()
pendown()
forward()
left()
right()
update()
mainloop()
```

*Note: You may NOT use write() or print()*

### GOLD MEDAL CHALLENGE

Add a size argument to your functions. Use the size to control the scale of the shape. For example, `drawJ(0.5)` would draw a small J and `drawJ(1.5)` would draw a big J. Do NOT use any if statements.