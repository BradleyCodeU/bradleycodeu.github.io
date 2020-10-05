---
layout: project
category: ch3implementingclasses
title: Ch3 Balloon
---
Page 125, P3.3

Implement a class Balloon. A balloon starts out with a radius of 0. Supply a method
```
public void inflate(double amount)
```
that increases the radius by the given amount. Also supply a method
```
public double getVolume()
```
that returns the current volume of the balloon. Use Math.PI for the value of 𝛑.

Create both the Balloon class and BalloonTester class. The tester class should test all methods with at least two balloon objects.

Print your expected results and then the actual results.


Show them to Mr. Riley when complete.

<!--
Test cases

@Test
public void inflate1() {
// Failure message:
// Failed inflate1
Balloon temp = new Balloon();
temp.inflate(1.0);
assertEquals(temp.getVolume(),4.1887902047863905,0.0000000001);
}
@Test
public void inflate3() {
// Failure message:
// Failed inflate3
Balloon temp = new Balloon();
temp.inflate(3.0);
assertEquals(temp.getVolume(),113.09733552923255,0.0000000001);
}
@Test
public void inflate10point3() {
// Failure message:
// Failed inflate10point3
Balloon temp = new Balloon();
temp.inflate(10.3);
assertEquals(temp.getVolume(),4577.20415410562,0.0000000001);
}





-->
