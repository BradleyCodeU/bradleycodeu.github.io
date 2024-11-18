---
layout: project
category: u03a-boolean-expressions
title: U03a Error Traps
---
Conditional statements are often used to catch input values that are inaccurate.

Write a program that does TWO THINGS...

Part 1 of 2, prompt the user to provide a single character from the alphabet. Depending on the user input, print either:
  -   VOWEL
  -   CONSONANT
  -   ERROR

Part 2 of 2, prompt the user for a word. According to Trinity College, the "average length of English words is 4.5 letters". Depending on the user input, print either:
  -   LONG WORD THAT STARTS WITH A VOWEL
  -   LONG WORD THAT STARTS WITH A CONSONANT
  -   SHORT WORD THAT STARTS WITH A VOWEL
  -   SHORT WORD THAT STARTS WITH A CONSONANT
  -   ERROR 

Print an error message if the user input...
  - doesn't start with a letter (between a and z or A and Z)
  - is an empty line (the user only pressed Enter/Return)
  - (for part 1) is a string longer than one character

Try to make your program as efficient as possible. You should probably define one or more static methods for tasks you perform multiple times.

Hints:
  - You can compare chars with numbers, like this... myChar >= 65
  - You can use the toLowerCase String method to make the process 50% easier
  - You can use [this ASCII table](http://www.asciitable.com/) to find the number values for each char
  - You can use the charAt String method to return the char at a specified index


### SAMPLE RUN 1:
```
Part 1 Enter a letter: {
ERROR
Part 2 Enter a word: Apple
LONG WORD THAT STARTS WITH A VOWEL
```
### SAMPLE RUN 2:
```
Part 1 Enter a letter:  E
VOWEL
Part 2 Enter a word: *o*o*p*s*
ERROR
```
### SAMPLE RUN 3:
```
Part 1 Enter a letter:  y
CONSONANT
Part 2 Enter a word: app
SHORT WORD THAT STARTS WITH A VOWEL
```
### SAMPLE RUN 4:
```
Part 1 Enter a letter:  just one letter
ERROR
Part 2 Enter a word: just one letter
LONG WORD THAT STARTS WITH A CONSONANT
```
