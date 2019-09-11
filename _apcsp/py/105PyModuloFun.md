---
layout: project
category: py
title: Modulo Fun
---
The % operator returns the remainder of two numbers. It is useful for detecting even/odd numbers (like to make stripes) and for restricting a value to a range (like to wrapping an animated ball around).

Two forward slashes // is the floor division operator. It returns the result of division rounded down. It is useful for conversions. In other programming languages, this is known as integer division.

I will demonstrate how to convert square feet to acres. 43560 sq ft = 1 acre. Let's first calculate how many COMPLETE acres we have...
```python
acres = number // 43560
```
Next, how many REMAINING sq ft are left...
```python
remainder = number % 43560
```
Return a string...
```python
  return str(acres) + " acres and " + str(remainder) + " sq ft"
```
Input &rarr; Output

sqftToAcres(43561) &rarr; "1 acres and 1 sq ft"

sqftToAcres(99999) &rarr; "2 acres and 12879 sq ft"

sqftToAcres(123) &rarr; "0 acres and 123 sq ft"

Copy/paste this starter code: [https://repl.it/@JustinRiley1/dollar-convert-starter-code](https://repl.it/@JustinRiley1/dollar-convert-starter-code)

For Your Project You Will Pick *ANY TWO* Of The Following:
- [isDivisible](#isDivisible)
- [isEven](#isEven)
- [inchesToFeet](#inchesToFeet)
- feetToYards
- yardsToMiles
- ouncesToPounds
- poundsToTons
- teaspoonsToTablespoons
- tablespoonsToCups
- cupsToGallons
- peoplePerBus
- pizzasPerPerson

## isDivisible
- A function called isDivisible that requires two arguments: number and divisor. It returns True if number is evenly divisible by the divisor (aka, has no remainder).

## isEven
- A function called isEven that requires one argument: number. It returns True if number is divisible by two.

## inchesToFeet
- A function called inchesToFeet that requires one argument: number. It returns a string.

Input &rarr; Output

inchesToFeet(13) &rarr; "1 ft 1 in"

inchesToFeet(43) &rarr; "3 ft 7 in"

inchesToFeet(0) &rarr; "0 ft 0 in"
