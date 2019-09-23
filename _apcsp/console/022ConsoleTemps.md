---
layout: project
category: console
title: Console Temps
---
In this project you will use #comments, if, elif, else, input, string(), int(), while, break

First, create a function called ftempToCtemp. Requires one argument: ftemp. Fahrenheit - 32 * 5 / 9 = Celsius. Return the temperature in Celsius.

Second, create a function called ctempToFtemp. Requires one argument: ctemp. Celsius * 9 / 5 + 32 = Fahrenheit. Return the temperature in Fahrenheit.

Next, copy/paste this pseudocode to guide your thinking for the main program:

```python
# Repeat forever
  # Ask "Enter 1 to convert Fahrenheit to Celsius, 2 to convert Celsius to Fahrenheit, or  Q to Quit: "
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
```
Finally, you will notice that there is no way to quit. Add a second elif that checks if the person typed "Q" and then break the loop.

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
