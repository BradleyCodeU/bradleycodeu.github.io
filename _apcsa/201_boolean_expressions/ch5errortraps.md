---
layout: project
category: ch5decisions
title: Error Traps
---
Conditional statements are often used to catch input values that are inaccurate.

Write a program that prompts the user to provide a single character from the alphabet. Print Vowel or Consonant, depending on the user input.

Print an error message if the user input...
  - is not a letter (between a and z or A and Z)
  - is an empty line (the user only pressed Enter/Return)
  - is a string longer than one character

Try to make your program as efficient as possible.

Hints:
  - You can compare chars with numbers, like this... myChar >= 65
  - You can use the toLowerCase String method to make the process 50% easier
  - You can use [this ASCII table](http://www.asciitable.com/) to find the number values for each char
  - You can use the charAt String method to return the char at a specified index


SAMPLE RUN 1:
```
Enter a letter:  {
ERROR
```
SAMPLE RUN 2:
```
Enter a letter:  E
VOWEL
```
SAMPLE RUN 3:
```
Enter a letter:  y
CONSONANT
```
