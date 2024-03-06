# Geometry Class

Create a static class named Geometry that only contains static methods:

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
Radius is 3.5
Height is 2.5
Cube volume:             15.63
Cube surface area:       37.50
Cylinder volume:         96.21
Cylinder surface area:  131.95
```

## Starter Code
```
class Main {
  public static void main(String[] args) {
    
    // create variables for height and radius here
    
    System.out.printf("%-30s%4.2f\n", "Cube volume: ", Geometry.cubeVolume(height));
    System.out.printf("%-30s%4.2f\n", "Cube surface area: ", Geometry.cubeSurface(height));
    System.out.printf("%-30s%4.2f\n", "Cylinder volume: ", Geometry.cylinderVolume(radius, height));
    System.out.printf("%-30s%4.2f\n", "Cylinder surface area: ", Geometry.cylinderSurface(radius, height));
  }
}
```


## Tests

||Expected|
|--|--|
|Geometry.cubeVolume(2.5)|15.625|
|Geometry.cubeVolume(0.5)|0.125|
|Geometry.cubeSurface(2.5)|37.5|
|Geometry.cubeSurface(0.5)|1.5|
|Geometry.cylinderVolume(3.5,2.5)|96.21127501618741|
|Geometry.cylinderVolume(1.5,0.5)|3.5342917352885173|
|Geometry.cylinderSurface(3.5,2.5)|131.94689145077132|
|Geometry.cylinderSurface(1.5,0.5)|18.84955592153876|
  