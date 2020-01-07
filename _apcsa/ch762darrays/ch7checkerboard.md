---
layout: project
category: ch762darrays
title: Checkerboard
permalink: /apcsa/ch762darrays/Ch76Checkerboard/
---
Read pages 336-341

Write a program that prompt the user for a size (an integer > 1) and then draws a checkerboard of that size. For example, if the user enters 3, draw a 3 x 3 checkerboard.

For the example below, consider an 8 x 8 array for a board game:
```
int[][] board = new int[8][8];
```
USING TWO NESTED LOOPS, initialize the board so that zeros and ones alternate, as on a checkerboard:
```
0  1  0  1  0  1  0  1
1  0  1  0  1  0  1  0
0  1  0  1  0  1  0  1
1  0  1  0  1  0  1  0
0  1  0  1  0  1  0  1
1  0  1  0  1  0  1  0
0  1  0  1  0  1  0  1
1  0  1  0  1  0  1  0
```
<small>Hint: Check whether i + j is even.</small>
