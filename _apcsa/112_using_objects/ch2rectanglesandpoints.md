---
layout: project
category: u02a_using_objects
title: Ch2 Rectangles and Points
---


Check out the Rectangle class in the Java API:
  - [Java Rectangle class API](https://docs.oracle.com/javase/7/docs/api/index.html?java/awt/Rectangle.html)


You will create ONE class with one public static void main() that contains code for the following 3 exercises.

## E2.1

Write a program that:
  1.  Constructs a Rectangle object.
  1.  Prompt the user for a width and height.
  1.  Use the setSize method to adjust the width and height of your Rectangle object.
  1.  Use the grow method to grow the width by 10 and grow the height by 10. For example...
  boxOne.grow(10,10); 
  1.  Print the new width using the getWidth method.
  1.  Print the new height using the getHeight method.
  1.  Finally, compute and print its new area using the getWidth and getHeight methods.

Sample Output
```
Please enter the width and height of the rectangle as whole numbers
Width: 5
Height: 6
After growing the width by 10 and the height by 10...
New width is 25.0
New height is 26.0
New area is 650.0
```

## E2.5

Look into the API documentation of the Rectangle class and locate the method
```
void add(int newx, int newy)
```
Read through the method documentation. Then estimate the result of the following statements:
```
Rectangle box = new Rectangle(5, 10, 20, 30);
box.add(0, 0);
```
Print your *predicted* new X location, new Y location, new width, and new height. *NOTE: Your prediction CAN be inaccurate.*

Write a program that will...

  1.  Print your predicted X location for the final box
  1.  Print your predicted Y location for the final box
  1.  Print your predicted width for the final box
  1.  Print your predicted height for the final box
  1.  Instantiate a rectangle at 5, 10 that is 20 wide and 30 tall
  1.  Add the point 0, 0 to the rectangle
  1.  Print the actual X location (using the getX method) of the final box
  1.  Print the actual Y location (using the getY method) of the final box
  1.  Print the actual width (using getWidth method) of the final box
  1.  Print the actual height (using getHeight method) of the final box

Sample Output
```
Estimated X location = 0
Estimated Y location = 0
Estimated width = 20
Estimated height = 30
Actual X location of the rectangle =       0.0
Actual Y location of the rectangle =       0.0
Actual width of the rectangle =           25.0
Actual height of the rectangle =          40.0
```

## E2.14

[Java Point class API](https://docs.oracle.com/javase/7/docs/api/java/awt/Point.html)

Look at the API of the Point class and find out how to construct a Point object. In a PointTester program, construct two points with coordinates (3, 4) and (–3, –4). Find the distance between them, using the distance method (which is available because it is *inherited* from a different class). Print your prediction and then the calculated distance.

## Starter Template

```
class Main {
  public static void main(String[] args) {
    // Check out the Rectangle class in the Java API:

    // https://docs.oracle.com/javase/7/docs/api/index.html?java/awt/Rectangle.html
    
    // You will create ONE class with one public static void main() that contains code for the following 3 exercises.

    // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
    
    // Part 1 of 3
    
    // Write a program that:

    // Constructs a Rectangle object.
    // Prompt the user for a width and height.
    // Use the setSize method to adjust the width and height of your Rectangle object.
    // Use the grow method to grow the width by 10 and grow the height by 10. For example... boxOne.grow(10,10);
    // Print the new width using the getWidth method.
    // Print the new height using the getHeight method.
    // Finally, compute and print its new area using the getWidth and getHeight methods.

    
    // Sample Output
    
    // Please enter the width and height of the rectangle as whole numbers
    // Width: 5
    // Height: 6
    // After growing the width by 10 and the height by 10...
    // New width is 25.0
    // New height is 26.0
    // New area is 650.0

    // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-

    // Part 2 of 3

    // Look into the API documentation of the Rectangle class and locate the method
    
    // void add(int newx, int newy)
    
    // Read through the method documentation. Then estimate the result of the following statements:
    
    // Rectangle box = new Rectangle(5, 10, 20, 30);
    // box.add(0, 0);
    
    // Print your predicted new X location, new Y location, new width, and new height. NOTE: Your prediction CAN be inaccurate.
    
    // Write a program that will...
    
    // Print your predicted X location for the final box
    // Print your predicted Y location for the final box
    // Print your predicted width for the final box
    // Print your predicted height for the final box
    // Instantiate a rectangle at 5, 10 that is 20 wide and 30 tall
    // Add the point 0, 0 to the rectangle
    // Print the actual X location (using the getX method) of the final box
    // Print the actual Y location (using the getY method) of the final box
    // Print the actual width (using getWidth method) of the final box
    // Print the actual height (using getHeight method) of the final box
    
    
    // Sample Output
    
    // Estimated X location = 0
    // Estimated Y location = 0
    // Estimated width = 20
    // Estimated height = 30
    // Actual X location of the rectangle =       0.0
    // Actual Y location of the rectangle =       0.0
    // Actual width of the rectangle =           25.0
    // Actual height of the rectangle =          40.0

    // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-

    // Part 3 of 3

    // https://docs.oracle.com/javase/7/docs/api/java/awt/Point.html

    // Look at the API of the Point class and find out how to construct a Point object. In a PointTester program, construct two points with coordinates (3, 4) and (–3, –4). Find the distance between them, using the distance method (which is available because it is inherited from a different class). Print your prediction and then the calculated distance.

    
  }
}
```
