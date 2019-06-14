Using Mu, create a simple Tkinter app that has two (or more) text boxes for inputting numbers, does input validation, creates popup messageboxes, and performs a calculation.

Your Tkinter app will NOT use input() at all. You will use Tkinter text entry boxes to collect input.
Your Tkinter app will NOT use print() at all. All output messages should appear as messageboxes.
Because everything in Tkinter occurs based on button clicks, you will NOT have any while loops at all.
Follow the directions in the Tk lesson 4 [Grid, Entry, and Messagebox video](https://drive.google.com/file/d/18mbOExKqetH_uKfzx0EoMf6QpucpWVGk/view?usp=sharing) and your finished Tkinter app should look [something like this ](https://drive.google.com/open?id=1E0xU9b5N5_I6BCC73QEDc8hZNQA_W_WT)

NOTE: In order to create a messagebox you will need an extra import...
```python
from tkinter import *
from tkinter import messagebox #this is required!!!!
```
[Click Here](http://interactivepython.org/runestone/static/CS152f17/GUIandEventDrivenProgramming/02_standard_dialog_boxes.html)to learn how to create a messagebox

Some ideas for your app...

A hypotenuse calculator that asks for the length of side A and side B.
A rectangle area calculator that asks for the length and width.
A square footage calculator that asks for the length, width, and height of a room.
A percent calculator that gives the percent increase/decrease from number A and number B.
A tip calculator that asks for original bill and the % that you want to tip and gives the tip amount.
A sale calculator that asks for original price and the % off and gives the new price.
A BMI calculator that asks for your weight and height.
A workout calculator that ask for calories per minute and amount of minutes and gives the total calories burned.
A birth year guesser that asks for the current year and your current age.
A roadtrip calculator that asks for gas price, car's mpg, and distance in miles and gives the cost of the trip.
An average calculator that asks for number A and number B.
CHALLENGE!!! Create an average calculator that works for any amount of figures. For example, can calculate the average of 2 figures or 7 figures or 13 figures.
If the user inputs a string, your input validation **MUST** popup a messagebox error such as "Oops, not a number" and ask for input again.

The app **must NOT** crash from a runtime error if the user inputs a string **OR** a zero.

Your final line of code must be **mainloop()**. This allows someone to simply click on your file and run your app. mainloop works kind of like a game loop that keeps the app running.
```python
mainloop() #include me as last line!!!
```
