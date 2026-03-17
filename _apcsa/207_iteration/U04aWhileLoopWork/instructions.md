---
layout: project
category: 207_iteration
title: U04a While Loop Work
---

Objective

Practice implementing static methods specifically using while loops. This lab focuses on performing arithmetic on individual digits of a number and generating mathematical sequences as Strings.

Write a class containing the following four static methods. Each method must utilize a while loop for its primary logic.

1. String findSquares(int n) - Must use a while loop. All squares less than n. For example, if n is 100, return "0 1 4 9 16 25 36 49 64 81 ". NOTE: there must be a space after every number including the final number

1. String findDivisibleByTen(int n) - Must use a while loop. All positive numbers that are divisible by 10 and less than n. For example, if n is 100, return "10 20 30 40 50 60 70 80 90 ". NOTE: there must be a space after every number including the final number

1. String findPowersOfTwo(int n) - Must use a while loop. All powers of two less than n. For example, if n is 100, return "1 2 4 8 16 32 64 ". NOTE: there must be a space after every number including the final number

4. int sumOddDigits(int n) - Must use a while loop. Analyzes the individual digits of the integer n and returns the sum of only the digits that are odd. Example: sumOddDigits(816345) returns 9 (1 + 3 + 5). NOTE: int could be any valid integer value.


Sample output 1:
```
Gimme a positive integer: 55
Squares less than 55 = 0 1 4 9 16 25 36 49
Tens less than 55 = 10 20 30 40 50
Powers of two less than 55 = 1 2 4 8 16 32
```
Sample output 2:
```
Gimme a positive integer: 100
Squares less than 100 = 0 1 4 9 16 25 36 49 64 81
Tens less than 100 = 10 20 30 40 50 60 70 80 90
Powers of two less than 100 = 1 2 4 8 16 32 64
```