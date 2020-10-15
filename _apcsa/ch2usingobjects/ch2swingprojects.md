---
layout: project
category: ch2usingobjects
title: Ch2 Swing Projects
---




You will complete 6 exercises for this assignment:
  - Ch 1 exercises from pg 26
      - E1.16
      - E1.17
      - E1.18
  - Ch 2 Programming Projects from pg 74
      - P2.2
      - P2.3
      - P2.5

## E1.16
Type in and run the following program. Then modify it to print “Hello, name!”, displaying the name that the user typed in.
```java
import javax.swing.JOptionPane;
public class DialogViewer
{
   public static void main(String[] args)
   {
      String name = JOptionPane.showInputDialog("What is your name?");
      System.out.println(name);
   }
}
```
## E1.17
Modify the program from E1.16 so that the dialog continues with the message “My name is Hal! What would you like me to do?” Discard the user’s input and display a message such as `I'm sorry, Dave. I'm afraid I can't do that.` Replace *Dave* with the name that was provided by the user.

## E1.18
Type in and run the following program. Then modify it to show a different greeting and image.
```
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class Test
{
   public static void main(String[] args) throws Exception
   {
      URL imageLocation = new URL(
            "http://horstmann.com/java4everyone/duke.gif");
      JOptionPane.showMessageDialog(null, "Hello", "Title",
            JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
   }
}
```

## P2.2

Write a GrowSquarePrinter program that constructs a Rectangle object square representing a square with top-left corner (100, 100) and side length 50, prints its location by calling System.out.println(square), applies the translate and grow methods, and calls System.out.println(square) again. The calls to translate and grow should modify the square so that it has twice the size and the same top-left corner as the original. If the squares were drawn, they would look like the figure below.

![rectangle being resized so that it has twice the size and the same top-left corner as the original](/apcsa/ch2usingobjects/Java Resize Rect.jpg)

This code will not produce a drawing. It will simply print the locations of square before and after calling the mutator methods.

Look up the description of the grow method in the API documentation.

## P2.3

Write a CenteredSquaresPrinter program that constructs a Rectangle object square representing a square with top-left corner (100, 100) and side length 200, prints its location by calling System.out.println(square), applies the grow and translate methods, and calls System.out.println(square) again. The calls to grow and translate should modify the square so that it has half the width and is centered in the original square. If the squares were drawn, they would look like the figure below.

This code will not produce a drawing. It will simply print the locations of square before and after calling the mutator methods. Look up the description of the grow method in the API documentation.

**NOTE**: In computer science, the y-axis is inverted and 0,0 is in the top-left corner of the screen.

![rectangle being resized so that it has half the width and is centered in the original square](/apcsa/ch2usingobjects/Java Resize Rect2.jpg)

## P2.5

In this exercise, you will explore a simple way of visualizing a Rectangle object. The setBounds method of the JFrame class moves a frame window to a given rectangle. Complete the following program to visually show the translate method of the Rectangle class:

<pre>
import java.awt.Rectangle;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class TranslateDemo
{
   public static void main(String[] args)
   {
      // Construct a frame and show it
      JFrame frame = new JFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);

      // Your work goes here: Construct a rectangle and set the frame bounds

      JOptionPane.showMessageDialog(frame, "Click OK to continue");

      // Your work goes here: Move the rectangle and set the frame bounds again
   }
}
</pre>
