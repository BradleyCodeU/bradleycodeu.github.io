---
layout: project
category: ch9inheritance
title: Clock Class
---

Implement a class Clock with getHours and getMinutes methods that return the current time using java.time.LocalTime ([demo here](https://repl.it/@JustinRiley1/clock)) Also provide a getTime method that returns a string with the hours and minutes by calling the getHours and getMinutes methods.

The Clock class should have ONE instance variable:

- private LocalTime time

Clock class methods include:

- int getHours
- int getMinutes
- String getTime

Provide a subclass WorldClock whose constructor accepts a time offset. For example, if you live in Ohio, a new WorldClock(-3) should show the time in California, three hours behind.

The WorldClock class should ONLY have 1 instance variable:

- private int offset

You should NOT recreate the time instance variable because it already exists (a WorldClock IS-A Clock). You MUST override one or more of the Clock methods in the WorldClock class.

Your ClockDemo class MUST test EVERY constructor and EVERY method in both the superclass and the subclass. ClockDemo must also use printf for all output. For example:

```
Testing Clock myClock = new Clock()

myClock.getHours()          13
myClock.getMinutes()        4
myClock.getTime()           13:04

Testing WorldClock myWorldClock = new WorldClock(8)

myWorldClock.getHours()     21
myWorldClock.getMinutes()   4
myWorldClock.getTime()      21:04
```

Turn in ClockDemo, Clock class, and World Clock class
