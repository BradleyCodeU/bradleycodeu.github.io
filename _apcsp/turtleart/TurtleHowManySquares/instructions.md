# Turtle How Many Squares
---
[Read this tutorial about using Python's input() function](https://www.w3schools.com/python/ref_func_input.asp)

Define a function named isValidNumber that requires one argument (myNumber) and returns True or False if myNumber is valid. For this project, any integer 1-10 is valid.

Define a function named drawSquare() that draws a single square.

Define a main function named main(). Inside of the main function do the following...

  - Ask the user "How many squares? Type 1-10" and save their answer in a variable named userAnswer

  - If isValidNumber(userAnswer) is True, then draw that many squares. Otherwise, print "Not a valid number"

Squares must be drawn one after another in a straight line. All squares must be visible! If I ask for 5, I must be able to see 5.

NOTE: You MUST use a "for i in range()" loop so that the project is less than 30 lines of code.

---

## EXAMPLE OUTPUT

Example Run #1
```
How many squares would you like to draw?
11
Not a valid number
```

Example Run #2
```
How many squares would you like to draw?
4
```
![squares](/squares.jpeg)


### GOLD MEDAL CHALLENGE

Set the pen color (the outline) and the fill color to two different colors

Gradually increase the size of each square

Gradually change the color for each square (either each square gets lighter or each gets darker, your choice)