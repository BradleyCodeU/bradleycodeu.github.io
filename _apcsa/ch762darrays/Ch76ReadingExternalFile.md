---
layout: project
category: ch762darrays
title: Reading External File
---

Read this tutorial about [reading files with Scanner](/apcsa\ch762darrays\readingWithScanner/)

You will use data stored in a text file to fill a 2D array. First, create a file called testData.txt that contains the following integers:

2 6 24 31 14 41 18 11 14 20 17 7 45 33

The dimensions of the 2D array are the first two integers, so the array that will be created and filled is a 2 x 6 (2 rows x 6 columns). Print an error message if ANY of the values is invalid. For example, if you change testData.txt to be "2rows 6columns" then it would print an error message and not crash.

Here is a table to help you visualize the 2D array (notice that 2 and 6 are NOT in the 2D array, but describe the number of columns and rows):

|24	|31	|14	|41	|18	|11 |
|14	|20	|17	|7	|45	|33 |

Print "Average of row 0:" calculate and display the average of the first row. Repeat for the second row.

***IMPORTANT*** I should be able to change the first values to 4 3 and the program will create a 4x3 array and calculate the averages of 3 rows. Here are some other possible first values:

  - 1 12 (1 row, 12 cols)
  - 2 6 (2 rows, 6 cols)
  - 3 4 (3 rows, 4 cols)
  - 4 3 (4 rows, 3 cols)
  - 12 1 (12 rows, 1 cols)


Test Run #1 testData.txt contains: 6 2 24 31 14 41 18 11 14 20 17 7 45 33
```
Average of row 0: 27.5
Average of row 1: 27.5
Average of row 2: 14.5
Average of row 3: 17.0
Average of row 4: 12.0
Average of row 5: 39.0
```
Test Run #2 testData.txt contains: 4 3 24 31 14 41 18 11 14 20 17 7 45 33
```
Average of row 0: 23.0
Average of row 1: 23.333333333333332
Average of row 2: 17.0
Average of row 3: 28.333333333333332
```
Test Run #3 testData.txt contains: 4kjdfkj 3 24 31 14 41 18 11 14 20 17 7 45 33
```
oops that's not an integer
```
Test Run #4 testData.txt contains: 6 2 24 31 14 41 18 11 14 20 17 7 45 33kjdflkj
```
oops that's not an integer
```
