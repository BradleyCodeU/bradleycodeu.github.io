# String Formatting & Loops

Concepts: printf-style formatting, While loops, input, multiplication

Double your investment!

How many years would it take to double money you have saved if you earn simple interest annually?
Plan and write a program that will ask the user for the amount of money to invest and the annual interest rate.
Using a while loop, calculate and display the total money accumulated each year.
Output should be formatted properly and arranged as seen below.

## String Formatting
[https://realpython.com/python-string-formatting/#1-old-style-string-formatting-operator](https://realpython.com/python-string-formatting/#1-old-style-string-formatting-operator)

## Format Specifiers
- %s display a string
- %f display a floating-point decimal number
- %d display a decimal-system integer number
- %5s add a number after the % symbol to reserve that much space. For example, "    5"
- %.2f limit a float to two decimal places. For example, 0.99
- %03d add a zero (0) after the % symbol to zero-fill your printf integer output. For example, 001

Sample Output (user input is in * * asterisk * * and should not be coded into your program.)
```Investment Calculator
Calculate how many years would it take to double
your savings if you earn simple interest annually

How much money are you investing: **4500**
Enter the interest rate as a decimal: **0.115**

Growth of your Investment
Year        Balance
00          $4500.00
01          $5017.50
02          $5594.51
03          $6237.88
04          $6955.24
05          $7755.09
06          $8646.93
07          $9641.32

It will take 7 years at 11.5% interest.
```
