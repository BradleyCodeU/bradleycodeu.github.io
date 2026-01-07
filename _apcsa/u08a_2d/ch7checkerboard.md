---
layout: project
category: ch762darrays
title: Checkerboard
permalink: /apcsa/ch762darrays/Ch76Checkerboard/
---


Write a program that prompt the user for a size (an integer > 1) and then fill a 2D of that size with a checkboard of 0s and 1s. For example, if the user enters 3, fill a 2D array with a 3 x 3 checkerboard. Finally, replace a middle square with 5 (with a 3 x 3 board using size/2 would replace row 1 column 1).

In addition to creating a main method. You must create (and use) a displayCheckerboard method with the follow header:
  - public static void displayCheckerboard(int[][] arr)

For example 1 below, the user inputs 3. Create a 3 x 3 array:
```
int[][] board = new int[3][3];
```
USING TWO NESTED LOOPS, initialize the board so that zeros and ones alternate, as on a checkerboard. <small>Hint: Check whether i + j is even.</small> Use the displayCheckerboard method to print it. Replace a middle square with size (using size/2) and use displayCheckerboard to print it.

Sample Run 1:
```
Gimme an integer >1: ***3***
0  1  0
1  0  1
0  1  0
Replacing middle square with size
0  1  0
1  3  1
0  1  0
```
Sample Run 2 (NOTICE that size/2 will result in row 2 column 2 being set to size):
```
Gimme an integer >1: ***4***
0  1  0  1  
1  0  1  0
0  1  0  1
1  0  1  0  
Replacing middle square with size
0  1  0  1  
1  0  1  0
0  1  4  1
1  0  1  0
```
