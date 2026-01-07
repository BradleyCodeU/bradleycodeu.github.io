---
layout: project
category: ch8designingclasses
title: Geometry Class
---
Create a class called Geometry that only contains static methods:

- public static double cubeVolume(double h)
- public static double cubeSurface(double h)
- public static double cylinderVolume(double r, double h)
- public static double cylinderSurface(double r, double h)

that compute the volume and surface area of a cube with height h, and a cylinder with radius r and height h.

In a separate GeometryTester file, write a program that will:

1. create a variable named radius and initialize it to 3.5
2. create a variable named height and initialize it to 2.5
3. call all four methods
4. print the results formatted with printf and rounded to the nearest hundredth

Sample output (formatted with printf and rounded to the nearest hundredth)
```
Cube volume:             15.63
Cube surface area:       37.50
Cylinder volume:         96.21
Cylinder surface area:  131.95
```
