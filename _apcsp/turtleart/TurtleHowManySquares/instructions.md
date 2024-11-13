---
layout: project
category: turtleart
title: Turtle How Many Squares
---
Turtle How Many Squares

The goal of this assignment is to combine our knowledge from September's Py unit (collecting user input and validating input) with October's Turtle Art unit. Working with a partner you will create a project that collects several different drawings (smiley, house, etc), different shapes (square, star, etc), and initials. In addition to copy/pasting in your old drawings/shapes/initials from previous projects, I would like each person to add one new drawing/shape/initial.



Define seperate functions for all of your drawings/shapes/initials. For example, you might define drawSquare() that draws a single square. Add comments so that we know who coded each function


Define a function named isValidNumber that requires one argument (myNumber) and returns True or False if myNumber is valid. For this project, any integer 1-10 is valid.



Define a main function named main(). Inside of the main function do the following...

  - Ask the user a question about what drawing they want and then provide a list of options. For example, "What drawing would you like? 1=square, 2=star, 3=triangle, 4=smiley"

  - Collect user input. [Review this tutorial about using Python's input() function](https://www.w3schools.com/python/ref_func_input.asp)

  - If the user did NOT type a valid answer, print something like "That is not a valid drawing option"

  - If the user typed in a valid answer...

    - Ask the user "How many squares? Type 1-10" and save their answer in a variable

    - Collect user input.

    - If isValidNumber(userAnswer) is True, then draw that many squares, stars, etc. Otherwise, print "Not a valid number". NOTE: You MUST use a "for i in range()" loop so that the project is a reasonable length.


Drawings must be shown one after another in a straight line (not overlapping, not at random locations, not rotated in weird directions). All squares must be visible! If I ask for 5, I must be able to see 5.


---

## EXAMPLE OUTPUT

Example Run #1
```
What drawing would you like? 1=square, 2=star, 3=triangle, 4=smiley
1
How many would you like to draw?
4
```
![squares](https://bradleycodeu.github.io/apcsp/turtleart/TurtleHowManySquares/squares.jpeg)


Example Run #2
```
What drawing would you like? 1=square, 2=star, 3=triangle, 4=smiley
9458358
That is not a valid drawing option
```

Example Run #3
```
What drawing would you like? 1=square, 2=star, 3=triangle, 4=smiley
3
How many would you like to draw?
11
Not a valid number
```





### GOLD MEDAL CHALLENGE

1. While the user types in an invalid option, repeat the question. If they typed in a valid option, break out of the loop.

2. Set the pen color (the outline) and the fill color to two different colors

3. Gradually increase the size of each drawing

4. Gradually change the color for each drawing (either each drawing gets lighter or each gets darker, your choice)