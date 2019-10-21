---
layout: project
category: ch4-fundamental-data-types
title: Ch4 Modulus Clock
---
Create a program that uses integer division and modulus division to calculate the [MILITARY TIME](https://en.wikipedia.org/wiki/24-hour_clock) after a specified number of hours and minutes.

Review the example on Big Java pg 138 about converting pennies to dollars using / and %.

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
