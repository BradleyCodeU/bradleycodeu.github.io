---
layout: project
category: 112_using_objects
title: Rectangles And Points
---


Check out the Rectangle class in the Java API:
  - [Java Rectangle class API](https://docs.oracle.com/javase/8/docs/api/index.html?java/awt/Rectangle.html)
Check out the Point class in the Java API:
  - [Java Rectangle class API](https://docs.oracle.com/javase/8/docs/api/index.html?java/awt/Point.html)


You will create ONE class with:

 - 7 methods that work with Rectangles

 - 2 methods that work with Points

 - public static void main() app that contains code for 5 exercises

## calculateArea(Rectangle rec)

Calculates the total area of the given Rectangle.

@param rec The Rectangle object to be measured.

@return The area of the rectangle (width multiplied by height).

       Preconditions: rec is a rectangle object that is not null. 
       Postconditions: rec has not been changed. The method returns the 
       product of the rectangle's width and height.


## jumpRight(Rectangle rec)

![jumpRight example](https://bradleycodeu.github.io/apcsa/112_using_objects/U02aRectanglesPoints/jumpRightExample.png)

Looks at Rectangle rec and returns a new Rectangle that is located
rec's width to the right of rec.

@param rec The original Rectangle to be referenced.

@return A new Rectangle object shifted to the right.

        Preconditions: rec is a rectangle object that is not null. rec has a
        width greater than 0.
        Postconditions: rec has not been changed. The method returns a new
        Rectangle
        object with the same y-location but with an x-location that equals
        rec's x
        plus rec's width.

## jumpDown(Rectangle rec)

![jumpDown example](https://bradleycodeu.github.io/apcsa/112_using_objects/U02aRectanglesPoints/jumpDownExample.png)

Looks at Rectangle rec and returns a new Rectangle that is located
rec's height below rec.

@param rec The original Rectangle to be referenced.

@return A new Rectangle object shifted downward.

        Preconditions: rec is a rectangle object that is not null. rec has a
        height greater than 0.
        Postconditions: rec has not been changed. The method returns a new
        Rectangle
        object with the same x-location but with a y-location that equals
        rec's y
        plus rec's height.

## jumpLeft(Rectangle rec)

Looks at Rectangle rec and returns a new Rectangle that is located
rec's width to the left of rec.

@param rec The original Rectangle to be referenced.

@return A new Rectangle object shifted to the left.

        Preconditions: rec is a rectangle object that is not null. rec has a
        width greater than 0.
        Postconditions: rec has not been changed. The method returns a new
        Rectangle
        object with the same y-location but with an x-location that equals
        rec's x
        minus rec's width.

## jumpUp(Rectangle rec)

Looks at Rectangle rec and returns a new Rectangle that is located
rec's height above rec.

@param rec The original Rectangle to be referenced.

@return A new Rectangle object shifted upward.

        Preconditions: rec is a rectangle object that is not null. rec has a
        height greater than 0.
        Postconditions: rec has not been changed. The method returns a new
        Rectangle
        object with the same x-location but with a y-location that equals
        rec's y
        minus rec's height.

## doubleSize(Rectangle rec)

![doubleSize example](https://bradleycodeu.github.io/apcsa/112_using_objects/U02aRectanglesPoints/doubleSizeExample.png)

Looks at Rectangle rec and returns a new Rectangle that has twice
the width and twice the height of rec.

@param rec The original Rectangle to be referenced.

@return A new Rectangle object with doubled dimensions.

        Preconditions: rec is a rectangle object that is not null.
        Postconditions: rec has not been changed. The method returns a new
        Rectangle
        object with the same x and y coordinates, but with a width equal to
        rec's width * 2 and a height equal to rec's height * 2.

## growFixed(Rectangle rec, int amount)

![growFixed example](https://bradleycodeu.github.io/apcsa/112_using_objects/U02aRectanglesPoints/growFixedExample.png)

Looks at Rectangle rec and returns a new Rectangle that is at the
same x and y location, but with dimensions increased by the specified amount.

@param rec    The original Rectangle to be referenced.

@param amount The integer amount to be added to both width and height.

@return A new Rectangle object with increased dimensions.

        Preconditions: rec is a rectangle object that is not null.
        amount is a non-negative integer.
        Postconditions: rec has not been changed. The method returns a new
        Rectangle
        object with the same (x, y) coordinates, but with a
        width equal to (rec.width + amount) and a
        height equal to (rec.height + amount).


## isTouching(Point p1, Point p2, double minimumDistance)

Determines if two points are close enough to be considered "touching"
based on a specified threshold.

@param p1              The first Point object.

@param p2              The second Point object.

@param minimumDistance The maximum distance allowed for the points to be
                       "touching."

@return true if the distance between p1 and p2 is less than or equal to
        minimumDistance; false otherwise.

        Preconditions: p1 and p2 are not null. minimumDistance is
        non-negative.
        Postconditions: p1 and p2 have not been changed.


## findMidpoint(Point p1, Point p2)

Calculates the coordinates halfway between two points and returns
a new Point2D.Double object at the average x, average y location.
NOTE: use Point2D.Double middle = new Point2D.Double(x, y);

@param p1 The first Point object.

@param p2 The second Point object.

@return A new Point2D.Double object located exactly between p1 and p2.

        Preconditions: p1 and p2 are not null.
        Postconditions: p1 and p2 have not been changed. The method returns
        a new Point with x at p1.x + p2.x / 2 and y at p1.y + p2.y / 2.
        For example, the midpoint of (3,3) and (4,4) is (3.5, 3.5)


## Fill in the TODO's in public static void main

### App Part 1 of 5

Make a big Rectangle

The user guesses the area

Use the Rectangle class setSize method to make box1 width 90,000 and the height 90,000

### App Part 2 of 5

Compare the Rectangle class translate method and setLocation method

Use the Rectangle class translate method to move it by 5 on the x-axis and 5 on the y-axis

Use the Rectangle class getLocation method to get the new x,y coordinates as a Point object named translatePoint

Use the Rectangle class setLocation method to move it to 5 on the x-axis and 5 on the y-axis

### App Part 3 of 5

Compare the Rectangle class grow method and our static growFixed method

Use the Rectangle class grow method to grow it by 1 horizontally and 1 vertically

### App Part 4 of 5

CATCH THE MYSTERY SPOT!

Construct a Point object named mysterySpot with a random x 0-10, and a random y 0-10 use Math.random

Use the Rectangle class setSize method to adjust the width and height of userBox

Use the Rectangle class contains method to see if the mysterySpot is within userBox

### App Part 5 of 5

FIND THE SECRET BOX!

Construct a Rectangle object named secretBox with any x location, any y location, a width of 30, and height of 20

Use the Rectangle class contains method to see if the userGuess is within secretBox
