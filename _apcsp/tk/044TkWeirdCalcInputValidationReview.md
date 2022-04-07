---
layout: project
category: tk
title: Tk Weird Calc Input Validation Review
---

Watch these [Tkinter tutorial videos](https://drive.google.com/open?id=1gb9k1pepJA0bC8QmTcXv03PY7UyIBypb)

Follow the directions in the [Tk lesson 4 Grid, Entry, and Messagebox video](https://drive.google.com/file/d/18mbOExKqetH_uKfzx0EoMf6QpucpWVGk/view?usp=sharing) and your finished Tkinter app should look something [like this](https://drive.google.com/file/d/1E0xU9b5N5_I6BCC73QEDc8hZNQA_W_WT/view)

NOTE: In order to create a messagebox you will need an extra import…
```
from tkinter import *
from tkinter import messagebox # this is required!!!!
```

[Click here](https://www.javatpoint.com/python-tkinter-messagebox) to learn how to create a messagebox

## Project Details:

1. Create a validInput function that takes one argument userInput. Returns True or False. Use try-except so that the app doesn't crash. Try converting the input to an int.

2. Create an Entry widget (you may NOT use Spinboxes for this project) for number 1 and another Entry widget for number 2
3. Create a Button widget
4. When the Button is pressed:
   1. if NOT valid input, create a messagebox that will show an error.
   1. Otherwise, if input is valid create messageboxes that will show info:
      - Give the sum of the two numbers
      - Give the difference between the two numbers
      - Give the product of the two numbers (the result of multiplication)
      - If the second number is not zero, give the quotient (the result of division).


### Remember:
  - Your Tkinter app will NOT use input() at all. You will use Tkinter text entry boxes to collect input.
  - Your Tkinter app will NOT use print() at all. All output messages should appear as messageboxes.
  - Because everything in Tkinter occurs based on button clicks, you will NOT have any while loops at all.


Your final line of code MUST be mainloop(). This allows someone to simply click on your file and run your app. **mainloop** works kind of like a game loop that keeps the app running.
```python
mainloop() #include me as last line!!!
```
