---
layout: project
category: py
title: Valid Number 
---

[Read this tutorial on how to define a function](/apcsp/py/pythonfunctions/).

## In this project, you will define a function that requires one argument (myNumber) and returns True or False if the number is valid.

Pick ONE of these:
  - "What year were you born?" will only accept numbers 1900-2019
  - "What is your ZIP code?" will only accept numbers [00501](https://www.google.com/search?q=lowest+zip+code+number)-[99950](https://www.google.com/search?q=highest+zip+code+number)
  - "On a scale of 1-10, how much swag do you have?" will only accept numbers 1-10
  - "How many weeks until summer break?" will only accept numbers 0-52
  - "What year was your fav movie released?" will only accept numbers [1894](https://www.google.com/search?q=first+edison+film+released)-2019
  - "How many days until summer break?" will only accept numbers 0-366
  - "What is your graduation year?" will only accept numbers 1900-2023
  - "How many pets do you have?" will only accept numbers 0-100
  - "What month were you born?" will only accept numbers 1-12
  - "On a scale of 1-5, how would you rate your day so far?" will only accept numbers 1-5
  - "What is your resting heart rate?" will only accept numbers 35-200
  - "How many Infinity Stones do you have?" will only accept numbers 0-6


Directions:

1. You MUST define a function called validNumber that requires one argument: myNumber. For this example, I will only accept numbers 1900-2019.
    - Convert myNumber to an int
    - return True if myNumber is a number between 1900 and 2019, inclusive [1900, 2019].
    - Otherwise, return False.


2. Inside of the launchPopup function, you MUST fill in the code for the two conditional statements:
    - if validNumber(answer) is True, then
      - Set output to be answer "is a valid number. Thanks!"
    - if validNumber(answer) is False, then
      - Set output to be answer "is NOT valid number. OOPS!"


3. You MUST write TWO tests of validNumber function. Print your arguments, expected, and actual


4. Finally, you MUST change the tk.Label on the Python Tkinter app so that it says "What year were you born?" OR whatever question you choose earlier.


STARTER CODE:
```
import tkinter as tk

# define a new function called validNumber that requires one
# argument: myNumber. Returns True or False




def launchPopup():
  popup = tk.Tk()
  answer = numberEntry.get()
  output = "Hello there " + answer
  #if validNumber(answer) is True, then
  #     # Set output to be answer "is a valid number. Thanks!"
  #     output = ???
  #if validNumber(answer) is False, then
  #     # Set output to be answer "is NOT valid number. OOPS!"
  #     output = ???
  tk.Label(popup, text=output).pack()


# Write TWO tests of validNumber function. Print your arguments, expected, and actual

# Test ONE

# Test TWO


# FINALLY, change the tk.Label below so that the text says “What year were you born?” OR whatever question you choose earlier.

root = tk.Tk()
tk.Label(root, text="Welcome to my app! Click the button.").pack()
numberEntry = tk.Entry(root)
numberEntry.pack()
tk.Button(root, text="Click Me", command=launchPopup).pack()
tk.mainloop()
```
