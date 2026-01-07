---
layout: project
category: u05a_writing_classes
title: Shoes
---
Create a Shoes class and add a 2nd test to its tester file, ShoesTester.

1.	Write the Shoes class that is being accessed by the ShoesTester class. NO PRINTING INSIDE OF THIS OBJECT CLASS.
2.  Within the Shoes class (either in toString method OR in a getModelNumber method), generate the model number using the lowercase first letter of the brand, the lowercase first letter of the type, the lowercase color, and the size.
3.	Run ShoesTester, add a 2nd test, and debug if necessary.

### Expected Output

The expected output for the code in the screenshot above is...
```
Color: Blue, Brand: Nike, Type: Golf, Size: 9.5, Model Number: ngblue9.5
```
A 2nd test of the Shoes class *could* result in the following output...
```
Color: Red, Brand: Puma, Type: Sneakers, Size: 8, Model Number: psred8
```

Starter Code for ShoesTester.java:
```
class ShoesTester {
  public static void main(String[] args) {
    Shoes fav = new Shoes();
    fav.setColor("Blue");
    fav.setBrand("Nike");
    fav.setType("Golf");
    fav.setSize(9.5);
    System.out.println(fav.toString());
    
    /* Create a 2nd unique test of Shoes here */

  }
}
```

Starter Code for Shoes.java:
```
public class Shoes {
  // instance variables go here
  // create private instance vars for brand, type, and size
  private String color;

  // methods go here
  // create public methods setBrand, setType, setSize, getModelNumber
  public void setColor(String _color){
    color = _color;
  }

  // update the toString method to return expected output
  public String toString(){
    return "Shoes that are color=" + color;
  }

}
```