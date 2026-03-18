---
layout: project
category: 207_iteration
title: U04a For Loop Fun
---
Objective

Practice implementing static methods that use for loops to perform mathematical analysis. This project focuses on exclusive ranges, meaning the boundary numbers provided as arguments are not included in the calculation.

Requirements

Write four static methods that contain for loops. Each method should be designed to handle the parameters specified and return the calculated result. You MUST use a for loop in each static method.

1. sumEvensExclusive(int a) - Must use a for loop. Returns the sum of all even integers between 2 and a (exclusive of a). Example: sumEvensExclusive(10) returns 14 (4 + 6 + 8).

2. sumSquaresExclusive(int a) - Must use a for loop. Returns the sum of all perfect squares between 1 and a (exclusive of a). Example: sumSquaresExclusive(20) returns 13 (4 + 9). Note: You must include 1 in the sum, because it is a perfect square.

3. sumOddsInRangeExclusive(int a, int b) - Must use a for loop. Returns the sum of all odd integers between a and b (exclusive of b). Example: sumOddsInRangeExclusive(10, 16) returns 39 (11 + 13 + 15). Note: If  b is odd, it must not be included in the sum.

4. sumOddFourDigits(int a) - MUST use a for loop. You are guaranteed that the parameter will be a four-digit number, so create a for loop that repeats 4 times. Analyzes the individual digits of the integer a and returns the sum of only the digits that are odd. Example: sumOddDigits(1635) returns 9 (1 + 3 + 5). PRECONDITION: int a will always be a 4-digit number.

Main method
```
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // --- First Input Section ---
        System.out.print("Gimme a positive integer: ");
        int a = input.nextInt();

        // Calling the first two methods and the digit method
        int evenSum = sumEvensExclusive(a);
        int squareSum = sumSquaresExclusive(a);
        

        System.out.println("The sum of all even numbers between 2 and " + a + " (exclusive) = " + evenSum);
        System.out.println("The sum of all squares between 1 and " + a + " (exclusive) = " + squareSum);

        // --- Second Input Section ---
        System.out.print("Gimme a positive integer larger than " + a + ": ");
        int b = input.nextInt();

        // Calling the range method
        int rangeSum = sumOddsInRangeExclusive(a, b);

        System.out.println("The sum of all odd numbers between " + a + " and " + b + " (exclusive) = " + rangeSum);

        // --- Third Input Section ---
        System.out.print("Gimme a 4-digit number: ");
        int c = input.nextInt();
        int digitSum = sumOddFourDigits(c);

        System.out.println("The sum of all odd digits of " + c + " = " + digitSum);
        
        input.close();
    }
```

Sample output 1
```
Gimme a positive integer: 135
The sum of all even numbers between 2 and 135 = 4556
The sum of all squares between 1 and 135 = 506
Gimme a positive integer larger than 135: 138
The sum of all odd numbers between 135 and 138 = 272
Gimme a 4-digit number: 1356
The sum of all odd digits of 1356 = 9
```

Sample output 2
```
Gimme a positive integer: 123
The sum of all even numbers between 2 and 123 = 3782
The sum of all squares between 1 and 123 = 506
Gimme a positive integer larger than 123: 124
The sum of all odd numbers between 123 and 124 = 123
Gimme a 4-digit number: 8123
The sum of all odd digits of 8123 = 4
```
