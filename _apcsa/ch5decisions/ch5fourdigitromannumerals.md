---
layout: project
category: ch5-decisions
title: Four Digit Roman Numerals
---
Big Java, pg 229

Roman numbers. Write a program that converts a positive integer into the Roman number system. The Roman number system has digits
```
I     1
V     5
X     10
L     50
C     100
D     500
M     1,000
```
Numbers are formed according to the following rules:

a. Only numbers up to 3,999 are represented.

b. As in the decimal system, the thousands, hundreds, tens, and ones are expressed separately.

c. The numbers 1 to 9 are expressed as
```
I     1
II    2
III   3 
IV    4
V     5
VI    6
VII   7
VIII  8
IX    9
```
As you can see, an I preceding a V or X is subtracted from the value, and you can never have more than three I’s in a row.

d. Tens and hundreds are done the same way, except that the letters X, L, C and C, D, M are used instead of I, V, X, respectively.

Your program should take an input, such as 1978, and convert it to Roman numerals, MCMLXXVIII.
