---
layout: project
category: console
title: Console Temps
---
In this project you will use #comments, if, elif, else, input, string(), int(), while, break

Let's discuss loops.
```
Pre-conditional loops include while loop, for loop, and for each loop. The most common post-conditional loop is the "do while" loop. Let's look at some pseudocode for using a while loop (a pre-conditional loop) for a number guessing game:
1. Declare variables for the number to guess and the user's guess
2. Generate a random number between 1 and 10
3. Print message asking user to enter their guess
4. Get user input guess
5. Start while loop that will continue as long as the guess is wrong // Condition at top of loop
   - Print message saying guess is wrong
   - Get another guess from the user
6. Print message saying the guess is right

Notice that in the while loop version of the program, it is necessary to read in the user's first guess BEFORE the loop so there would be a value for comparison in the loop condition. The body of the while loop will NOT happen if this condition is false.
```

For THIS project you will use a *pre-conditional loop*. In an upcoming project you will use a *post-conditional loop*.

First, create a function called ftempToCtemp. Requires one argument: ftemp. Fahrenheit - 32 * 5 / 9 = Celsius. Return the temperature in Celsius.

Second, create a function called ctempToFtemp. Requires one argument: ctemp. Celsius * 9 / 5 + 32 = Fahrenheit. Return the temperature in Fahrenheit.

Next, copy/paste this pseudocode to guide your thinking for the main program:

```python
# Ask "Enter 1 to convert Fahrenheit to Celsius, 2 to convert Celsius to Fahrenheit, or  Q to Quit: "
# collect input
# While the answer does not equal "Q"
  # if choice = 1
    # "What Fahrenheit temperature would you like to convert? "
    # call ftempToCtemp, pass the userinput, save what it returns
    # "That temperature in Celsius is ____"
  # elif choice = 2
    # "What Celsius temperature would you like to convert? "
    # call ctempToFtemp, pass the userinput, save what it returns
    # "That temperature in Fahrenheit is ____"
  # else
    # "PLEASE ENTER EITHER 1, 2, OR Q"
  # Ask "Enter 1 to convert Fahrenheit to Celsius, 2 to convert Celsius to Fahrenheit, or  Q to Quit: "
  # collect input
```


Sample Run (user input is in ** asterisk ** and should not be coded into your program)
```
Enter 1 to convert Fahrenheit to Celsius, 2 to convert Celsius to Fahrenheit, or Q to quit:  **1**
What Fahrenheit temperature would you like to convert?: **32**
That temperature in Celsius is 0.0
Enter 1 to convert Fahrenheit to Celsius, 2 to convert Celsius to Fahrenheit, or Q to quit:  **2**
What Celsius temperature would you like to convert?:  **0**
That temperature in Fahrenheit is 32.0
Enter 1 to convert Fahrenheit to Celsius, 2 to convert Celsius to Fahrenheit, or Q to quit:  **Q**
>>>
```
