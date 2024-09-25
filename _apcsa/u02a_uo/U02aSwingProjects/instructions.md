---
layout: project
category: u02a-using-objects
title: U02a Swing Projects
---

You will complete 6 exercises for this assignment.

### Part 1 of 6
    
Run the following. Then modify it to print “Hello, name!”, displaying the name that the user typed in.
```
String name = JOptionPane.showInputDialog("What is your name?");
System.out.println(name);
```
In addition to saying “Hello, name!” in the console, can you say "Hello, name!" in a JOptionPane MessageDialog?

### Part 2 of 6

Modify the program from part 1 so that the dialog continues with the message "My name is Hal! What would you like me to do?" Discard the user’s input and display a message such as I'm sorry, Dave. I'm afraid I can't do that. Replace Dave with the name that was provided by the user.

### Part 3 of 6

Run the following. Then modify it to show a different greeting and image.
```
URL imageLocation = new URL("https://upload.wikimedia.org/wikipedia/en/d/d7/Dukesource125.gif");
JOptionPane.showMessageDialog(null, "Hello", "Title",
JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
```
### Part 4 of 6

Double the height and width.

Construct a Rectangle object square representing a square with top-left corner (100, 100) and side length 50, then print its location by calling System.out.println(square). Use the translate and grow methods to make the square twice the size and move it to location (300,400). Finally, call System.out.println(square) again.

This code will not produce a drawing. It will simply print the locations of square before and after calling the mutator methods. Look up the description of the grow method in the API documentation.

### Part 5 of 6

Halve the width only.

Construct a Rectangle object square representing a square with top-left corner (55, 55) and side length 600, then print its location by calling System.out.println(square). Use the translate and grow methods to make the square half the width and move it to location (55,0). Finally, call System.out.println(square) again.

This code will not produce a drawing. It will simply print the locations of square before and after calling the mutator methods. Look up the description of the grow method in the API documentation.

**NOTE**: In computer science, the y-axis is inverted and 0,0 is in the top-left corner of the screen.



### Part 6 of 6

In this exercise, you will explore a simple way of visualizing a Rectangle object. The setBounds method of the JFrame class moves a frame window to a given rectangle. Complete the following program to visually show the translate method of the Rectangle class.
```
Construct a frame and show it
JFrame frame = new JFrame();
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);

Your work goes here: Construct a rectangle and set the frame bounds

JOptionPane.showMessageDialog(frame, "Click OK to continue");

Your work goes here: Move the rectangle and set the frame bounds again
```


