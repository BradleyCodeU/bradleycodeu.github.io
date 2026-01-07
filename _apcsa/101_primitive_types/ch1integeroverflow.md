---
layout: project
category: u01a_primitive_types
title: Ch1 Integer Overflow Practice
---

Java primitive data types (with ones we will use in APCSA <mark>highlighted</mark>):

  - byte: Byte data type is an 8-bit signed two's complement integer.

  - Short: Short data type is a 16-bit signed two's complement integer.

  - <mark>int: Int data type is a 32-bit signed two's complement integer.</mark>

  - long: Long data type is a 64-bit signed two's complement integer.

  - float: Float data type is a single-precision 32-bit IEEE 754 floating point.

  - <mark>double: double data type is a double-precision 64-bit IEEE 754 floating point.</mark>

  - <mark>boolean: boolean data type represents one bit of information.</mark>

  - char: char data type is a single 16-bit Unicode character.

What is a 32-bit signed two's complement integer? The value of the left-most binary column (aka the most significant bit or MSB) is flipped to negative.

## How does Unsigned compare to Two's Complement?

Imagine a 3-bit data type. You're probably thinking about 3 columns of binary code. For example, 101. If the data type is Unsigned then 101 will have a different value (value 5) than if 101 is a Two's Complement data type (value -3).

```
3-bit unsigned columns = 4 2 1 (min value 0 to max value 7) NO NEGATIVE NUMBERS?!

3-bit signed two's complement columns = -4 2 1 (min -4 to max 3)

NOTICE: Java uses signed two's complement so it can store NEGATIVE NUMBERS.

```


|Binary value|Two's complement|Unsigned|
|--- |--- |--- |
| 101 | -3 | 5 |
| 110 | -2 | 6 |
| 111 | -1 | 7 |

Here are some more examples of two's complement columns:

```
3-bit signed two's complement columns = -4 2 1 (min -4 to max 3)

4-bit signed two's complement = -8 4 2 1 (min -8 to max 7)

6-bit signed two's complement = -32 16 8 4 2 1 (min -32 to max 31)

8-bit signed two's complement = -128 64 32 16 8 4 2 1 (min -128 to max 127)
```

8-bit values in two's complement versus unsigned:

|Binary value|Two's complement|Unsigned|
|--- |--- |--- |
|00000000|0|0|
|00000001|1|1|
|01111110|126|126|
|01111111|127|127|
|10000000|−128|128|
|10000001|−127|129|
|10000010|−126|130|
|11111110|−2|254|
|11111111|−1|255|


## What is Overflow/Underflow

In Java, an int can be negative or positive and we can assign values between -2,147,483,648 (-2^31^) and 2,147,483,647 (2^31^-1).

The wrapper class Integer defines two constants that hold these values: Integer.MIN_VALUE and Integer.MAX_VALUE.

What happens if we add one to the max value?
```
int value = Integer.MAX_VALUE;
System.out.println(value);
value = value + 1;
System.out.println(value);
value = value + 1;
System.out.println(value);
```
This code would create the following output. Notice that if we go OVER the maximum value, we get overflow.
```
2147483647
-2147483648
-2147483647
```

What if we subtract one from the minimum value?
```
int value = Integer.MIN_VALUE;
System.out.println(value);
value = value - 1;
System.out.println(value);
value = value - 1;
System.out.println(value);
```
This code would create the following output. Notice that if we go OVER the maximum value, we get overflow.
```
-2147483648
2147483647
2147483646
```


## Directions

  Run the U01aIntegerOverflowApp, then copy and paste the Console Output into a text document. 

  Solve the problems in your text document.

  Turn in your text document as a PDF.


