---
layout: project
category: ch4fundamentaldatatypes
title: Ch4 Printf
---

Here is a [Java printf Quick Reference](https://www.cs.colostate.edu/~cs160/.Summer16/resources/Java_printf_method_quick_reference.pdf)

```
double foo = 27.5, bar = 33.7999999999987349873459873565;
System.out.printf("x = %10.2f and y = %10.2f", foo, bar);
```
will output...
```
x =      27.50 and y =      33.80
```
To display aligned in columns, it would be *annoying* to guess number of spaces to align the rows properly. The length of the area reserved for the data is known as the ```FIELD WIDTH```. Specify the field width by inserting a number between the % sign and the type character (f, d, s, etc). The appropriate number of spaces are reserved for the data and the data is right justified. To left justify the data, place a negative sign before the number. Field width can be specified for any data type.
```
String name1 = "Adam";
String name2 = "Barbara";
int grade1 = 100;
int grade2 = 99;
System.out.printf("%-10s=%4d\n", name1, grade1);
System.out.printf("%-10s=%4d\n", name2, grade2);
System.out.printf("%-10s=%4f\n", "Carol", 90.5); // use type character f for double/float
System.out.printf("%-10s %4s\n", "└┄┄┄┄┄┬┄┄┘", "└┄┬┘");
System.out.printf("%-10s %4s\n", "width 10", "and4");
```
will output...
```
Adam      = 100
Barbara   =  99
Carol     =90.5
└┄┄┄┄┄┬┄┄┘ └┄┬┘
width 10   and4
```


Write a program that produces the following output. All display lines MUST use printf()!!!

![printf example](/apcsa\ch4fundamentaldatatypes\printfexample.png)

  - Assign values to variables for number of items purchased, subtotal, and tax. Do NOT use Scanner or collect user input.
  - Calculate the total including tax.
  - Calculate the fuel points earned. Customers earn 1 fuel point for every $3 dollars spent (use the subtotal). Fuel points are in whole numbers only.
  - Display values of all variables as seen in the image above.
