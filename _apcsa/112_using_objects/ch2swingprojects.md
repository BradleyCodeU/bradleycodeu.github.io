---
layout: project
category: u02a_using_objects
title: Ch2 Swing Projects
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

Modify the program from part 1 so that the dialog continues with the message “My name is Hal! What would you like me to do?” Discard the user’s input and display a message such as I'm sorry, Dave. I'm afraid I can't do that. Replace Dave with the name that was provided by the user.

### Part 3 of 6

Run the following. Then modify it to show a different greeting and image.
```
URL imageLocation = new URL("https://upload.wikimedia.org/wikipedia/en/d/d7/Dukesource125.gif");
JOptionPane.showMessageDialog(null, "Hello", "Title",
JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
```
### Part 4 of 6

Construct a Rectangle object square representing a square with top-left corner (100, 100) and side length 50, prints its location by calling System.out.println(square), applies the translate and grow methods, and calls System.out.println(square) again. The calls to translate and grow should modify the square so that it has twice the size and the same top-left corner as the original. If the squares were drawn, they would look like the figure below.

![Demo image of rectangle being resized so that it has twice the size and the same top-left corner as the original](https://bradleycodeu.github.io/apcsa/u02a_using_objects/Java%20Resize%20Rect.jpg)

This code will not produce a drawing. It will simply print the locations of square before and after calling the mutator methods.

Look up the description of the grow method in the API documentation.

### Part 5 of 6

Construct a Rectangle object square representing a square with top-left corner (100, 100) and side length 200, prints its location by calling System.out.println(square), applies the grow and translate methods, and calls System.out.println(square) again. The calls to grow and translate should modify the square so that it has half the width and is centered in the original square. If the squares were drawn, they would look like the figure below.

This code will not produce a drawing. It will simply print the locations of square before and after calling the mutator methods. Look up the description of the grow method in the API documentation.

**NOTE**: In computer science, the y-axis is inverted and 0,0 is in the top-left corner of the screen.

![Demo image of rectangle being resized so that it has half the width and is centered in the original square](https://bradleycodeu.github.io/apcsa/u02a_using_objects/Java%20Resize%20Rect2.jpg)

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




## Starter Template
```
import java.awt.*;
import java.awt.Rectangle;
import javax.swing.*;
import javax.swing.ImageIcon;
import java.net.URL;

public class Main {

    
  public static void main(String[] args) throws Exception {
    
    JOptionPane.showMessageDialog(null, "Hello World");

    // Part 1 of 6
    
    // Run the following. Then modify it to print “Hello, name!”, displaying the name that the user typed in.
    
    String name = JOptionPane.showInputDialog("What is your name?");
    System.out.println(name);
    
    // In addition to saying “Hello, name!” in the console, can you say "Hello, name!" in a JOptionPane MessageDialog?

    // Part 2 of 6

    // Modify the program from part 1 so that the dialog continues with the message “My name is Hal! What would you like me to do?” Discard the user’s input and display a message such as I'm sorry, Dave. I'm afraid I can't do that. Replace Dave with the name that was provided by the user.

    // Part 3 of 6

    // Run the following. Then modify it to show a different greeting and image.
    URL imageLocation = new URL("https://upload.wikimedia.org/wikipedia/en/d/d7/Dukesource125.gif");
    JOptionPane.showMessageDialog(null, "Hello", "Title",
    JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));

    // Part 4 of 6

    // Construct a Rectangle object square representing a square with top-left corner (100, 100) and side length 50, prints its location by calling System.out.println(square), applies the translate and grow methods, and calls System.out.println(square) again. The calls to translate and grow should modify the square so that it has twice the size and the same top-left corner as the original. If the squares were drawn, they would look like the figure below.

    // ![Demo image of rectangle being resized so that it has twice the size and the same top-left corner as the original](https://bradleycodeu.github.io/apcsa/u02a_using_objects/Java%20Resize%20Rect.jpg)
    
    // This code will not produce a drawing. It will simply print the locations of square before and after calling the mutator methods.
    
    // Look up the description of the grow method in the API documentation.

    // Part 5 of 6

    // Construct a Rectangle object square representing a square with top-left corner (100, 100) and side length 200, prints its location by calling System.out.println(square), applies the grow and translate methods, and calls System.out.println(square) again. The calls to grow and translate should modify the square so that it has half the width and is centered in the original square. If the squares were drawn, they would look like the figure below.
    
    // This code will not produce a drawing. It will simply print the locations of square before and after calling the mutator methods. Look up the description of the grow method in the API documentation.
    
    // **NOTE**: In computer science, the y-axis is inverted and 0,0 is in the top-left corner of the screen.
    
    // ![Demo image of rectangle being resized so that it has half the width and is centered in the original square](https://bradleycodeu.github.io/apcsa/u02a_using_objects/Java%20Resize%20Rect2.jpg)

    // Part 6 of 6

    // In this exercise, you will explore a simple way of visualizing a Rectangle object. The setBounds method of the JFrame class moves a frame window to a given rectangle. Complete the following program to visually show the translate method of the Rectangle class.

    // Construct a frame and show it
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);

    // Your work goes here: Construct a rectangle and set the frame bounds

    JOptionPane.showMessageDialog(frame, "Click OK to continue");

    // Your work goes here: Move the rectangle and set the frame bounds again
```
