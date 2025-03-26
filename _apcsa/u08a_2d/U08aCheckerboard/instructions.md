# Checkerboard



Write a program that creates a checkerboard and allows the user to place numbers in the checkerboard.

In addition to creating a main method. You must create the following static methods:
  - public static boolean isValid(int userInput, int size) // returns true if userInput is in the range of [0...size) exclusive of size
  - public static void displayCheckerboard(int[][] arr) // prints the checkboard
  - public static int[][] fill2DArray(int rows, int cols) // Returns a 2d array fill with alternating 0s and 1s. 
    - //         USING TWO NESTED LOOPS, initialize the board so that zeros and ones alternate, as on a checkerboard. <small>Hint: Check whether i + j is even.</small>
    - //         For example...
    - //          0  1  0
    - //          1  0  1
    - //          0  1  0

Directions for the main method:
 - prompt the user for a size (an integer > 1)
 - declare the 2d array and set it to be fill2DArray(size)
 - loop width * height times
 - - print the checkerboard using the displayCheckerboard() method
 - - prompt the user for the value that they want to place
 - - prompt the user for the row number
 - - prompt the user for the col number
 - - if the row number and col number are valid
 - - - set that row and col in the 2d array to be the value
 - - else
 - - - print invalid


Sample Run 1:
```
Gimme a width >1: 3
Gimme a height >1: 3
0  1  0
1  0  1
0  1  0
Gimme a value: 3
Gimme a row: 1
Gimme a col: 1
0  1  0
1  3  1
0  1  0
```

Sample Run 2:
```
Gimme a width >1: 3
Gimme a height >1: -1
Oops! Gimme a height >1: 2
0  1  0  1  
1  0  1  0
0  1  0  1
Gimme a value: 9
Gimme a row: 2
Gimme a col: -1
Invalid
0  1  0  1  
1  0  1  0
0  1  0  1
Gimme a value: 9
Gimme a row: 2
Gimme a col: 2
0  1  0  1  
1  0  1  0
0  1  9  1
```