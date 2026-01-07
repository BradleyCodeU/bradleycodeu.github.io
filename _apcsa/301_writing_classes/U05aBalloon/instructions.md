---
layout: project
category: u05a_writing_classes
title: Balloon
---


Implement a class Balloon. A balloon starts out with a radius of 0. Supply a method
```
public void inflate(double amount)
```
that increases the radius by the given amount. Also supply a method
```
public double getVolume()
```
that returns the current volume of the balloon. Use the volume formula for sphere AND use Math.PI for the value of 𝛑.

Create the Balloon class and complete the missing code in the BalloonTester class. The tester class should test all methods with at least two balloon objects. Print your expected results and then the actual results.

## Sample Output
```
Inflated by 5
Expected volume for radius 5: 523.6
Actual volume: 523.5987755982989
Inflated by 5 MORE
Expected volume for radius 10: 4188.79
Actual volume: 4188.790204786391
```

STARTER CODE:
```
class BalloonTester {
  public static void main(String[] args) {
    System.out.println("Expected volume for radius 5 is 523.6");
    /* Construct Balloon */
    /* Inflate Balloon */
    /* getVolume of Balloon */
    System.out.println("Actual volume: " + balloon1.getVolume());
    /* print the volume that you got */
    System.out.println("Expected volume for radius 10 is 4188.79");
    /* Inflate Balloon MORE */
    /* getVolume of Balloon */
    System.out.println("Actual volume: " + balloon1.getVolume());
    /* print the volume that you got */
  }
}
```


<!--
Test case

@Test
public void inflate_and_getVolume() {
  Balloon temp = new Balloon();
  temp.inflate(1.0);
  assertEquals(4.1887902047863905, temp.getVolume(), 0.0000000001);
  temp = new Balloon();
  temp.inflate(3.0);
  assertEquals(113.09733552923255, temp.getVolume(), 0.0000000001);
  temp = new Balloon();
  temp.inflate(10.3);
  assertEquals(4577.20415410562, temp.getVolume(), 0.0000000001);
}

-->

  