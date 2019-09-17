---
layout: project
category: py
title: Modulo Fun
---
The % operator returns the remainder of two numbers. It is useful for detecting even/odd numbers (like to make striped patterns) and for restricting a value to a range (like to wrapping an animated ball around the screen).

Two forward slashes // is the floor division operator. It returns the result of division rounded down. It is useful for conversions. In other programming languages, this is known as integer division.

I will demonstrate how to convert square feet to acres. 43560 sq ft = 1 acre. Let's first calculate how many COMPLETE acres we have...
```python
acres = number // 43560 #floor division gives the number of whole acres
```
Next, how many REMAINING sq ft are left...
```python
remainder = number % 43560 #modulus gives the remaining sq ft
```
Return a string...
```python
  return str(acres) + " acres and " + str(remainder) + " sq ft"
```
<table>
<tr>
<td>
Input &rarr; Output
</td>
</tr>
<tr>
<td>
sqftToAcres(43561) &rarr; "1 acres and 1 sq ft"
</td>
</tr>
<tr>
<td>
sqftToAcres(99999) &rarr; "2 acres and 12879 sq ft"
</td>
</tr>
<tr>
<td>
sqftToAcres(123) &rarr; "0 acres and 123 sq ft"
</td>
</tr>
</table>

## Assignment Details:

Copy/paste this starter code: [https://repl.it/@JustinRiley1/modulofun-starter-code](https://repl.it/@JustinRiley1/modulofun-starter-code)

For Your Project You Will Pick *ANY TWO* Of The Following:
- [peopleToBuses](#peopletobuses)
- [peopleToPizzas](#peopletopizzas)
- [peopleToBasketballTeams](#peopletobasketballteams)
- [peopleToPicnicTables](#peopletopicnictables)
- [peopleToDonuts](#peopletodonuts)
- [inchesToFeet](#inchestofeet)
- feetToYards
- yardsToMiles
- ouncesToPounds
- poundsToTons
- teaspoonsToTablespoons
- tablespoonsToCups
- cupsToGallons
- [isDivisible](#isdivisible)
- [isEven](#iseven)





## peopleToBuses
- Assume that 90 people fit on a school bus. Define a function called peopleToBuses that requires one argument: people. It returns a string with the number of full school buses and the remaining number of people that get to ride in the last bus.

| Input &rarr; Output |
| peopleToBuses(321) &rarr; "3 full school buses and 51 people on the last bus" |
| peopleToBuses(47) &rarr; "0 full school buses and 47 people on the last bus" |

## peopleToPizzas
- Assume that 1 person can only eat 2 XL slices of pizza and that 1 XL pizza comes in 10 slices. Define a function called peopleToPizzas that requires one argument: people. It returns the number of full pizzas and remaining slices that those people would eat.

| Input &rarr; Output |
| peopleToPizzas(321) &rarr; "321 people would eat 65 full XL pizzas and 4 XL slices" |
| peopleToPizzas(45) &rarr; "45 people would eat 9 full XL pizzas and 0 XL slices" |

## peopleToBasketballTeams
- Assume 5 people per team. Define a function called peopleToBasketballTeams that requires one argument: people. It returns a string with the number of full basketball teams and the remaining number of benchwarmers.

| Input &rarr; Output |
| peopleToBasketballTeams(321) &rarr; "64 full basketball teams and 1 benchwarmers" |
| peopleToBasketballTeams(47) &rarr; "9 full basketball teams and 2 benchwarmers" |

## peopleToPicnicTables
- Assume 6 people per picnic table. Define a function called peopleToPicnicTables that requires one argument: people. It returns a string with the number of full picnic tables and the remaining number of people that sit on the ground.

| Input &rarr; Output|
| peopleToPicnicTables(321) &rarr; "53 full picnic tables and 3 people sit on the ground"|
| peopleToPicnicTables(43) &rarr; "7 full picnic tables and 1 people sit on the ground"|

## peopleToDonuts
- Assume that a box of doughnuts contains 13 doughnuts (aka a baker's dozen) and you are only getting 1 doughnut per person. Define a function called peopleToDonuts that requires one argument: people. It returns a string with the number of full boxes of doughnuts and the remaining number of single doughnuts you would need.

| Input &rarr; Output|
| peopleToDonuts(321) &rarr; "321 people would need 24 boxes of doughnuts and 9 single doughnuts"|
| peopleToDonuts(45) &rarr; "45 people would need 3 boxes of doughnuts and 6 single doughnuts"|

## inchesToFeet
- Define a function called inchesToFeet that requires one argument: number. It returns a string.

| Input &rarr; Output |
| inchesToFeet(13) &rarr; "1 ft 1 in" |
| inchesToFeet(43) &rarr; "3 ft 7 in" |
| inchesToFeet(0) &rarr; "0 ft 0 in" |

## isDivisible
- Define a function called isDivisible that requires two arguments: number and divisor. It returns True if number is evenly divisible by the divisor (aka, has no remainder).

## isEven
- Define a function called isEven that requires one argument: number. It returns True if number is divisible by two.
