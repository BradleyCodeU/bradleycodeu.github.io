In this project you will use #comments, if, elif, else, input, string(), int(), while, break,

Copy/paste this pseudocode to guide your thinking:

```python
# Repeat forever
# Ask "Enter 1 to convert Fahrenheit to Celsius, 2 to convert Celsius to Fahrenheit, or  Q to Quit: "
# if choice = 1
# "What Fahrenheit temperature would you like to convert? "
# fahrenheitTemp - 32 * 5 / 9
# "That temperature in Celsius is ____"
# elif choice = 2
# "What Celsius temperature would you like to convert? "
# celsiusTemp * 9 / 5 + 32
# "That temperature in Fahrenheit is ____"
# else
# "PLEASE ENTER EITHER 1, 2, OR Q"
```
Also... you will notice that there is no way to quit. Add another elif that checks if the person typed "Q" and then break the loop.

Here is a Sample Run. User input is in bold and should not be printed by your program.

```python 
Enter 1 to convert Fahrenheit to Celsius, 2 to convert Celsius to Fahrenheit, or Q to quit:  1
What Fahrenheit temperature would you like to convert?:  32
That temperature in Celsius is 0.0
Enter 1 to convert Fahrenheit to Celsius, 2 to convert Celsius to Fahrenheit, or Q to quit:  2
What Celsius temperature would you like to convert?:  0
That temperature in Fahrenheit is 32.0
Enter 1 to convert Fahrenheit to Celsius, 2 to convert Celsius to Fahrenheit, or Q to quit:  Q
>>> 
```