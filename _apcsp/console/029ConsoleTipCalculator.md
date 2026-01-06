---
layout: project
category: console
title: Console Tip Calculator
---

You ```MUST validate the input using Try/Except``` or the program will crash.

You can learn how to validate user input [here](https://www.101computing.net/number-only/) and [here](https://www.w3schools.com/python/python_try_except.asp){:target="_blank"}


Create a valid number function named validNumber with one argument: stringInput. This function safely checks (using try/except) if the user has typed a number >= 0 and returns true or false. For example, validNumber("banana") would return False, but validNumber("0") would return True.

Create a calculate tip function named calculateTip that will take two arguments: bill and percent. This function returns the given percent of the bill. For example, with a bill of 50.00 and a tip percentage of 15, the tip amount is 7.50.

In the main function...

  - Ask the user how much the bill is (for example, 19.99 or 173.52). *MUST BE ABLE TO CALCULATE DECIMAL NUMBERS*

  - Collect the user's input, validate that it is a number using the valid number function, and store it in a variable.

  - Ask what percent they want to tip (for example, 15 or 20).

  - Collect the user's input, validate that it is a number using the valid number function, and store it in a variable.

  - Calculate that percent of the bill using the calculate tip function and say "__ percent of __ bill is __" For example... 15 percent of 5.00 bill is 0.75

  - Ask the user if they have a coupon, yes or no.

  - If yes, ask the user how much the coupon will subtract from the bill (for example, 5.50 or 0.99).

  - Collect the user's input, validate that it is a number, and store it in a variable.
    
  - Calculate the bill plus tip minus coupon and say "__ bill plus __ tip and minus coupon is __" For example... 5.00 bill plus 0.75 tip and minus 1 coupon is 4.75

  - *QUESTION 4*: Make up your own question. Make it fun. For example... How much would you like to donate to my college fund? or How much money do you want to steal from the restaurant? or Would you like to sign up for a Target Red Card? or What grade did you get in math class? or Are you paying in cash or credit card? or How much wood could a woodchuck chuck? Collect the user's input and then use an if/then conditional to reply one way or another.

  - Tell the user how much money they should tip.

  - Tell the user what the total will be with the tip added and the coupon subtracted.

Sample Output (user input is in ** asterisk ** and should not be coded into your program)
```
How much is your bill? $_____
**lkjsdf**
Please type a number
How much is your bill? $_____
**kjsdfl**
Please type a number
How much is your bill? $_____
**5.00**
How much would you like to tip? ____ %
**15**
15 percent of 5.00 bill is 0.75
Do you have a coupon? yes or no?
**yes**
How much will your coupon take off the bill? $_____
**1**
5.00 bill plus 0.75 tip and minus 1 coupon is 4.75
Did you pay your taxes? yes or no?
**no**
You have been fined $50,000 by the IRS. Please pay your taxes in the future.
Your total plus tip and coupon is $50004.75
```
