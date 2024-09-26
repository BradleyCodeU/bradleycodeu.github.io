---
layout: project
category: u02a-using-objects
title: U02a Rectangles And Points
---


Check out the Rectangle class in the Java API:
  - [Java Rectangle class API](https://docs.oracle.com/javase/7/docs/api/index.html?java/awt/Rectangle.html)


You will create ONE class with one public static void main() that contains code for the following 3 exercises.

## Part 1 of 3

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

## Part 2 of 3

Look into the API documentation of the Rectangle class and locate the method
```
boolean contains(int x, int y)
```

Directions:
- Construct a new Rectangle named mysteryBox at any x,y location (your choice!) with a width of 20 and a height of 30.
- Prompt the user for an x location
- Prompt the user for a y location
- Print mysteryBox.contains(x,y)
- Finally, print mysteryBox to reveal the x, y, width, and height
    
Sample Output  (your mysteryBox should be at a different location)
```
Part 2 of 3
Please type x location: 15
Please type y location: 17
true
java.awt.Rectangle[x=9,y=10,width=20,height=30]
```

## Part 3 of 3

[Java Point class API](https://docs.oracle.com/javase/7/docs/api/java/awt/Point.html)

Look at the API of the Point class and find out how to construct a Point object. In a PointTester program, construct two points with coordinates (3, 4) and (–3, –4). Find the distance between them, using the distance method (which is available because it is *inherited* from a different class). Print your prediction and then the calculated distance.