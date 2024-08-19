---
layout: project
category: u01b-modulo-operator
title: U01a Mod Clock
---


*You should already have completed the U1CoinConverter assignment. If not, Mr Riley gave these assignments in the wrong order.*


Create a program that uses integer division and modulus division to calculate the [MILITARY TIME](https://en.wikipedia.org/wiki/24-hour_clock) after a specified number of hours and minutes.

Integer division returns the result of division rounded down. It is useful for conversions.

The % operator returns the remainder of division. It is useful for detecting even/odd numbers (like to make striped patterns), for restricting a value to a range (like to wrapping an animated ball around the screen), or for converting one unit to another.

Here is an example about converting pennies to dollars using / and % in Java. Let's say you have 1357 pennies. To convert this amount to dollars, you first perform integer division by 100, which gives you the whole number of dollars. Then, you use the modulus operator to find the remaining pennies.

```java
int totalPennies = 1357;

int dollars = totalPennies / 100; // totalPennies / 100 is 13, the whole number of dollars with no remainder

int remainingPennies = totalPennies % 100; // totalPennies % 100 is 57, the remaining pennies after converting to dollars
```
After converting 1357 pennies to dollars, you have $13 with 57 pennies remaining.


NOTE: This example used a MAGIC NUMBER that should've been declared as a constant!!!

## Let's Time Some Militaries

You will create a program that uses integer division and modulus to calculate the [MILITARY TIME](https://en.wikipedia.org/wiki/24-hour_clock) after a specified number of hours and minutes.


1. DO NOT worry about am or pm because this is a 24-hour clock, [Military Time](https://en.wikipedia.org/wiki/24-hour_clock), in which the first minute of the day is 0:00 and the last minute of the day is 23:59

2. DO NOT use any [magic numbers](https://en.wikipedia.org/wiki/Magic_number_(programming)#Unnamed_numerical_constants). Use CONSTANTS

3. ! ! ! DO NOT USE ANY IF STATEMENTS ! ! !


DIRECTIONS:
- Fill in the ??? blanks for the method formatMinutes(int minutes). This adds a leading zero only when necessary. formatMinutes(9) -> "09" and formatMinutes(10) -> "10"
- Complete the method calculateFutureTime(int currentHour, int currentMinute, int hoursLater, int minutesLater) and return a String. Don't forget to use formatMinutes() so that the minutes are displayed correctly.
- In the main method...
  1.  Prompt the user for the hour of the start time.
  1.  Prompt for the minutes of the start time.
  1.  Prompt for the number of hours later
  1.  Prompt for the number of minutes later.
  1.  Calculate the future time.
  1.  Display the current time and the future time will be after that many hours and minutes.


### Example 1
```
Please input current hour: 11
Please input current minute: 9
Please input number of hours later: 2
Please input number of minutes later: 60
Current time = 11:09
Future time = 14:09
```
### Example 2
```
Please input current hour: 23
Please input current minute: 59
Please input number of hours later: 48
Please input number of minutes later: 1
Current time = 23:59
Future time = 0:00
```
