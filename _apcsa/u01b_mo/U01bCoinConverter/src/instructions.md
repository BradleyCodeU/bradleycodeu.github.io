---
layout: project
category: u01b-modulo-operator
title: U01b Coin Converter
---

Integer division returns the result of division rounded down. It is useful for conversions.

The % operator returns the remainder of division. It is useful for detecting even/odd numbers (like to make striped patterns), for restricting a value to a range (like to wrapping an animated ball around the screen), or for converting one unit to another.

For example let's convert square feet to acres. 43560 sq ft = 1 acre. Let's first calculate how many COMPLETE acres we have...

```java
int totalSqFt = 99999;

int acres = totalSqFt / 43560; // integer division gives the number of whole acres

int remainingSqFt = totalSqFt % 43560; // modulus gives the remaining sq ft

```

## Let's Convert Some Coins

Given an amount of dollars and cents (entered as a decimal number such as 2.44), convert that amount of money into denominations of dollars, quarters, dimes, nickels, and pennies.

I recommend first converting the decimal amount into a integer amount of cents. Then use integer division and modulus for the unit conversions. 

- Write your code in the method convertCoins(double amount) and return a String. Your return statement should be `return dollars + "dollars, " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, " + pennies + " pennies";`
- Complete the main method using Scanner to collect keyboard input

### Sample Run 1
```
Enter the amount to convert to coins in dollars and cents (for example, 3.41): 2.44
2 dollars, 1 quarters, 1 dimes, 1 nickels, 4 pennies
```

### Sample Run 2
```
Enter the amount to convert to coins in dollars and cents (for example, 3.41): 5.55
5 dollars, 2 quarters, 0 dimes, 1 nickels, 0 pennies
```

### Sample Run 3
```
Enter the amount to convert to coins in dollars and cents (for example, 3.41): 9.99
9 dollars, 3 quarters, 2 dimes, 0 nickels, 4 pennies
```

  

  