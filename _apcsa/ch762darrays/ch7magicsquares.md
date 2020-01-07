---
layout: project
category: ch762darrays
title: MagicSquares
permalink: /apcsa/ch762darrays/Ch76MagicSquares/
---


A magic square is a square array in which the sum of each row, each column, and both major diagonals is the same. You are going to write a program to determine if a square is magic.

In your program, declare a two dimensional array named numArray and initialize it using an initializer list.
```
int[][] square = {{2,7,6},{9,5,1},{4,3,8}};
```
When we want to check a different square, we can just replace one or more values in this array.  This will make your code easier to test.

Display the square (using nested for-each loops)

Determine the sum for each row, each column and each diagonal. Display each sum with an appropriate label (see sample output). These are the sums that you will need to compare to determine if the square is magic. See explanation  of two methods to compare the sums at the end of this document.

Display whether the square is magic or not magic.

Sample output:
```
The square:
2	7	6
9	5	1
4	3	8

Row 0: 15
Row 1: 15
Row 2: 15
Col 0: 15
Col 1: 15
Col 2: 15
NW-SE: 15
SW-NE: 15

Square is magic
```
Two of the possible methods for comparing the sums of the rows, column and diagonals:

*Method 1:* Store the sum of each row, column and diagonal in a 1-dimensional array

After all the sums have been calculated, iterate through the array, comparing the current value to the value in index 0. If you ever find a sum that doesn’t match the value in index 0, the square is not magic.

You will be able to determine the size of the 1-dimensional array that will be needed. If the array of numbers is 3x3, you will have 3 row sums, 3 column sums and 2 diagonals. There are 3+3+2=8 sums so you will need an array of length 8.

If the array is 4x4, you will need an array of size 10 because 4 row sums + 4 column sums + 2 diagonals = 10 sums.


*Method 2:* Store the first sum calculated into a variable (might name it masterSum). It really doesn’t matter which sum is your first sum calculated (could be a row, a column, or a diagonal).

As you calculate each sum, compare the current sum to the masterSum. If the sums don’t match, the square isn’t magic.


*For both methods:* You could declare a boolean variable that will hold true if the square is magic and false if it is not. Initialize the variable to true. If a sum is found that does not equal, set the boolean variable to false. If the sums are equal, the boolean variable will remain unchanged.

OR

Count the number of sums that are equal. Each time the sums are equal, add one onto the counter variable. After all sums have been compared, if the counter has the correct value, the square is magic.
