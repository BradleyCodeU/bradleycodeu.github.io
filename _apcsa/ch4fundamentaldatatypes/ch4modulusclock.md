---
layout: project
category: ch4-fundamental-data-types
title: Ch4 Modulus Clock
---
Create a program that uses integer division and modulus division to calculate the [MILITARY TIME](https://en.wikipedia.org/wiki/24-hour_clock) after a specified number of hours and minutes.

Review the example on Big Java pg 138 about converting pennies to dollars using / and %. The % operator returns the remainder of two numbers. It is useful for detecting even/odd numbers (like to make striped patterns), for restricting a value to a range (like to wrapping an animated ball around the screen), or for converting one unit to another.

Integer division returns the result of division rounded down. It is useful for conversions.

I will demonstrate how to convert square feet to acres. 43560 sq ft = 1 acre. Let's first calculate how many COMPLETE acres we have...
```java
int totalSqFt = 99999;

int acres = totalSqFt / 43560; // integer division gives the number of whole acres
```
Next, how many REMAINING sq ft are left...
```java
int remainingSqFt = totalSqFt % 43560; // modulus gives the remaining sq ft

System.out.printf("%-10s%10d", "Acres:", acres);
System.out.println();
System.out.printf("%-10s%10d", "Sq Ft:", remainingSqFt);
System.out.println();
```

You will create a program that uses integer division and modulus to calculate the [MILITARY TIME](https://en.wikipedia.org/wiki/24-hour_clock) after a specified number of hours and minutes.

  - DO NOT worry about am or pm because this is a 24-hour clock, [Military Time](https://en.wikipedia.org/wiki/24-hour_clock), in which the first minute of the day is 0:00 and the last minute of the day is 23:59

  - DO NOT use any [magic numbers]

  - DO NOT use any conditionals (if statements). You will use integer division and modulus instead.

  - You MUST start by writing your pseudocode as comments.

1.  Prompt the user for the hour of the start time.
1.  Prompt for the minutes of the start time.
1.  Prompt for the number of hours later
1.  Prompt for the number of minutes later.
1.  Calculate the future time.
1.  USE PRINTF to display the current time and the future time will be after that many hours and minutes. For example...
```
Please input current hour: 11
Please input current minute: 9
Please input number of hours later: 2
Please input number of minutes later: 60
Current time:     11:09
Future time:      14:09
```
Another example...
```
Please input current hour: 23
Please input current minute: 59
Please input number of hours later: 48
Please input number of minutes later: 1
Current time:     23:59
Future time:       0:00
```

[magic numbers]: https://en.wikipedia.org/wiki/Magic_number_(programming)#Unnamed_numerical_constants
