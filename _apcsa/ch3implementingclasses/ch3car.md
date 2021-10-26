---
layout: project
category: ch3implementingclasses
title: Ch3 Car
---
[Fork this starter template](https://replit.com/@JustinRiley1/Graphics-Car-Starter#README.md)

Directions:

- copy/paste the starter code for Car, CarTester, and CarViewer
- Car class: Complete the two constructors and the setPosition method. In the constructors, you will also set carColor to one of the [java.awt.Color constants](https://docs.oracle.com/javase/7/docs/api/java/awt/Color.html). For example, Color.BLUE
- CarTester class: ADD TWO MORE CARS near the middle of the window using the no-argument constructor and the setPosition method. Your final project will have 4 visible car objects.


Car class:
```
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
/**
   A car shape that can be positioned anywhere on the screen.
*/
public class Car
{
   private int xLeft;
   private int yTop;
   private Color carColor;

   /**
      public Car()
      Constructs a car at location (0, 0).
   */
   public Car()
   {
      // TO DO

   }

   /**
      public Car(int x, int y)
      Constructs a car with a given top left corner.
      @param x the x-coordinate of the top-left corner
      @param y the y-coordinate of the top-left corner
   */
   public Car(int x, int y)
   {
      // TO DO

   }

   /**
      public void setPosition(int x, int y)
      Assigns new x and y coordinates for the top left corner.
      @param x the x-coordinate of the top-left corner
      @param y the y-coordinate of the top-left corner
   */
   public void setPosition(int x, int y)
   {
      // TO DO

   }

   /**
      Draws the car.
      @param g2 the graphics context
   */
   public void draw(Graphics2D g2)
   {
      Rectangle body = new Rectangle(xLeft, yTop + 10, 60, 10);
      Ellipse2D.Double frontTire
            = new Ellipse2D.Double(xLeft + 10, yTop + 20, 10, 10);
      Ellipse2D.Double rearTire
            = new Ellipse2D.Double(xLeft + 40, yTop + 20, 10, 10);
      // The bottom of the front windshield
      Point2D.Double r1 = new Point2D.Double(xLeft + 10, yTop + 10);
      // The front of the roof
      Point2D.Double r2 = new Point2D.Double(xLeft + 20, yTop);
      // The rear of the roof
      Point2D.Double r3 = new Point2D.Double(xLeft + 40, yTop);
      // The bottom of the rear windshield
      Point2D.Double r4 = new Point2D.Double(xLeft + 50, yTop + 10);

      Line2D.Double frontWindshield = new Line2D.Double(r1, r2);
      Line2D.Double roofTop = new Line2D.Double(r2, r3);
      Line2D.Double rearWindshield = new Line2D.Double(r3, r4);
      g2.setColor(carColor);
      g2.draw(body);
      g2.draw(frontTire);
      g2.draw(rearTire);
      g2.draw(frontWindshield);      
      g2.draw(roofTop);      
      g2.draw(rearWindshield);      
   }
}
```

CarTester:
```
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
/**
   This component draws two car shapes.
*/
public class CarTester extends JComponent
{  
   public void paintComponent(Graphics g)
   {  
      Graphics2D g2 = (Graphics2D) g;

      Car car1 = new Car(0, 0);
      car1.draw(g2);

      int x = getWidth() - 60;
      int y = getHeight() - 30;
      Car car2 = new Car(x, y);
      car2.draw(g2);

      // add car3 and car4
   }
}
```

CarViewer:
```
import javax.swing.JFrame;
public class CarViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.setSize(300, 400);
      frame.setTitle("My Awesome Cars");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      CarTester component = new CarTester();
      frame.add(component);
      frame.setVisible(true);
   }
}
```
