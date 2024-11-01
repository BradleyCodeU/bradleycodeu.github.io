---
layout: project
category: turtleart
title: Turtle Arguments and Shapes
---
Turtle Arguments and Shapes

You will create THREE functions. The purpose of this assignment is to create functions with arguments so that you can customize each shape by supplying different arguments.

NOTE: Both of your functions MUST use 2 or more arguments.

Pick 1 or 2 of these...

  - drawStar(size, color)
  - drawCircle(size, color)
  - drawPetal(size, color) // flower petal or football shape
  - drawHouse(size, color) // square with equilateral triangle roof
  - drawPentagon(size, color)
  - drawTriangle(size, color) // equilateral triangle
  - drawSquare(size, color)

Pick 1 or 2 of these...

  - drawRectangle(width, height)
  - drawPineTree(width, height) // a rectangle trunk and 2 or 3 triangles
  - drawRightTriangle(width, height)
  - drawEllipse(width, height)
  - drawRhombus(sideLength, angleOne)
  - drawParallelogram(sideLengthA, sideLengthB, angleOne)
  - drawTrapezoid(sideLengthA, sideLengthB, sideLengthC, angleOne)

Finally, create a function named main(). In this function, you will call your 3 functions and provide different arguments to demonstrate the custom shapes. The main function should contain at least 6 function calls.

REMEMBER: 
  1. Do NOT ask for user input. Demonstrate 2 tests of each function inside of main.
  1. Both of your functions MUST use 2 or more arguments.
  1. You may NOT use any random numbers in this assignment.

Your main() function will begin like this...
```
def main():
    penup()
    goto(-200,0)
    pendown()
    drawStar(2,"red")
    penup()
    goto(-100,0)
    pendown()
    drawStar(3,"blue")
```

Here is an example with two pentagons, two houses, and two rectangles...

![example 1 pentagons, houses, and rectangles](https://bradleycodeu.github.io/apcsp/turtleart/TurtleArgsAndShapes/trtArguments1.png)

Another example with two circles, two triangles, and two rectangles...

![example 2 circles, triangles, and rectangles](https://bradleycodeu.github.io/apcsp/turtleart/TurtleArgsAndShapes/trtArguments2.png)

Another example with two rhombuses, two rectangles, and two triangles...

![example 3 rhombuses, rectangles, and triangles](https://bradleycodeu.github.io/apcsp/turtleart/TurtleArgsAndShapes/trtArguments3.png)