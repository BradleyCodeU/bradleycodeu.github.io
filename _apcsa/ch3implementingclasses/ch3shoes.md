---
layout: project
category: ch3implementingclasses
title: Ch3 Shoes
---
Create a Shoes class and add a 2nd test to its tester file, ShoesTester.

1.	Write the Shoes class that is being accessed by the ShoesTester class. NO PRINTING INSIDE OF THIS OBJECT CLASS.
2.	Create the ShoesTester class. No user input, so no scanner.
3.  Within the Shoes class (either in toString method OR in a getModelNumber method), generate the model number using the lowercase first letter of the brand, the lowercase first letter of the type, the lowercase color, and the size.
4.	Run ShoesTester and debug if necessary.

### Expected Output

The expected output for the code in the screenshot above is...
```
Color: Blue, Brand: Nike, Type: Golf, Size: 9.5, Model Number: ngblue9.5
```
A 2nd test of the Shoes class *could* result in the following output...
```
Color: Red, Brand: Puma, Type: Sneakers, Size: 8, Model Number: psred8
```

STARTER CODE:
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
