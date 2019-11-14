---
layout: project
category: ch6-loops
title: Palindrome Checker
---
A palindrome is a string that reads the same forwards as well as backwards. There can be numerical palindromes like "1331" or words that are palindromes like "racecar".

In this exercise you will write a program that can test for simple palindromes. Your code should prompt the user for a string and then use a loop to test whether the string is character­-by-­character the same forwards as it is backwards and report the result to the user. Your code should keep asking for strings to test until the user responds with an empty string.

You MUST use 2 nested loops for this assignment (there are other solutions, but I want you to demonstrate your understanding of nested loops). The outer loop repeats the entire algorithm and the inner loop iterates ```half-way (or less)``` through the string.

Sample run #1
```
Enter a string: 1331
1331 is a palindrome.
Enter a string: racecar
racecar is a palindrome.
Enter a string: blue
blue is NOT a palindrome.
Enter a string:
Empty line read - Goodbye!
```
Sample run #2
```
Enter a string: Racecar
Racecar is NOT a palindrome
Enter a string: RACECAR
RACECAR is a palindrome.
Enter a string: A man, a plan, a canal, Panama.
A man, a plan, a canal, Panama. is NOT a palindrome.
Enter a string: y123321y
y123321y is a palindrome.
Enter a string:
Empty line read - Goodbye!
```
