---
layout: project
category: 301_writing_classes
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

Create the Balloon class and complete the missing code in the BalloonApp class. The BalloonApp class should test all methods with at least two balloon objects. Print your expected results and then the actual results.

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
class BalloonApp {
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



  