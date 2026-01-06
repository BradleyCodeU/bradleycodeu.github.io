---
layout: project
category: u05b_static_variables
title: Robot
---

Concepts: static variables, static methods, ArrayList

Runestone: [https://runestone.academy/ns/books/published/bradley-java-24-25/Unit5-Writing-Classes/topic-5-7-static-vars-methods.html](https://runestone.academy/ns/books/published/bradley-java-24-25/Unit5-Writing-Classes/topic-5-7-static-vars-methods.html)

### Static Variable

When a variable is declared "static" in Java programming, it means that the variable belongs to the class itself rather than to any specific instance of the class. This means that there is only one copy of the variable in memory.

Imagine a class as a "car factory" and an instance as one individual car. Each car should remember the basic facts about itself. Each car does NOT need to remember things like... every possible car color, the id numbers of all cars, how many cars have been created.

A typical use-case for a static variable is a counter variable that increases every time an object is constructed. In order to keep this counter variable safe, we will want to declare it private.

### Static Methods

Getter and setter methods are used to work with an individual instance. Those are non-static methods. A "static" method is a method that is part of a class rather than an instance. Static methods can do basic math, generate random stuff, and access static variables.

Think about the kind of tasks that the Honda "car factory" might do: pick a new random ID number, lookup the part numbers for any Honda car/truck, get the average price of Honda vehicle given the year and model, check the availability of a specific car model at nearby dealerships. These are not tasks that an individual car should need to perform.

A typical use-case for a static method is a helper method. For example, a Car class could have a static method to calculate the driving time between two cities. We don't need to know anything about an individual car to make that calculation.



### Directions

Implement a class Robot (in the Robot.java file) that simulates a robot wandering on an infinite plane. The robot is located at a point with integer coordinates and faces north, east, south, or west. Supply methods:

- public Robot(Point startingLocation, int startingDirection) //Note: 0 = North, 1 = East, 2 = South, 3 = West
- public void turnLeft()
- public void turnRight()
- public void move()
- public Point getLocation()
- public String getDirection()

The turnLeft and turnRight methods change the direction but not the location. The move method moves the robot by one unit in the direction it is facing. The getDirection method returns a string "N", "E", "S", or "W".
  
Finally, create the following static variable/methods:
- a static variable to track the amount of robots that have been constructed
- a static list of used license plate numbers that have already been generated
- a static method named getRobotCount() that will return the amount of robots that have been constructed
- a static method String getLicensePlates() that returns the toString version of the license plate numbers ArrayList
- a static method String generateLicensePlateNumber() that will generate a String length 7 of random uppercase-letters and numbers, add it to the ArrayList of used license plate numbers, and return the String