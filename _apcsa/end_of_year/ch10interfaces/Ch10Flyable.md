---
layout: project
category: ch10interfaces
title: Flyable
---
Inheritance vs Interface

_Roses are red, violets are blue,_<br>
_Extend only one, but implement two._

How do you know whether to make a class, a subclass, an abstract class, or an interface?

- Make a class that doesn’t extend anything (other than Object) when your new class doesn’t pass the IS-A test for any other type.
- Make a subclass (in other words, extend a class) only when you need to make a more specific version of a class and need to override or add new behaviors.
- Use an abstract class when you want to define a template for a group of subclasses, and you have at least some implementation code that all subclasses should use. Make the class abstract when you want to guarantee that nobody can make objects of that type.
- Use an interface when you want to define a role that other classes can play, regardless of where those classes are in the inheritance tree.

_Source: -- Head First Java by O’Reilly Media --_

# Project details

Many different kinds of UNRELATED objects can "fly"

- Kites
- Witches
- Drones
- Comets
- Helicopters
- Balloons
- Pterodactyls
- Rockets
- Footballs
- Paper airplanes

Create two (very simple) classes that implement the Flyable interface and test the constructors and methods.

Flyable interface has two methods:

- getAltitude
- getVelocity

Each class should have:

- a few instance variables (include things that make sense for that class like brand, name, inflation psi, cargo, material, number of seats, color, number of magic spells, payload, number of passengers, paper size, string length, flight speed, distance above sea level, etc)
- at least 1 constructor
- appropriate interface methods

Tester class should:

- create an array of type Flyable and fill it with 4 objects (2 for each class)
- use a for each loop... for(Flyable i : myArray)
- get the altitude and velocity for all 4 objects

You will turn in:

- Tester class
- Flyable interface
- First class (for example, Kite class)
- Second class (for example, Witch class)

SAMPLE OUTPUT
```
Velocity:  10.5  Altitiude: 20.4
Velocity:  30.7  Altitiude: 30.0
Velocity:   1.2  Altitiude: 70.2
Velocity:   3.7  Altitiude: 33.0
```
