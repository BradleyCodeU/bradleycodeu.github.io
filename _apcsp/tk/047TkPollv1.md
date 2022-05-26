---
layout: project
category: tk
title: Tk Poll v1
---



First watch this video...

[Tk Lesson 4 - Grid Entry and Messagebox](https://drive.google.com/file/d/18mbOExKqetH_uKfzx0EoMf6QpucpWVGk/view?usp=sharing)

You may also want to check out [this article](https://python-commandments.org/tkinter-entry-widget/) that explains how to get the text of the current input box with the get() method and how to erase the current text with the delete() method.

In order to create a messagebox you will need an extra import…
```
from tkinter import *
from tkinter import messagebox # this is required!!!!
```

[Click here](https://www.javatpoint.com/python-tkinter-messagebox) to learn how to create a messagebox

## Directions:

1. Create an empty dictionary that will store names as keys and responses as values.
1. Create a text field for the person's name
1. Create a text field to ask ONLY ONE question that can be answered with a number. For example...
    - How many slices of pizza do you eat per week?
    - How long does it usually take you to travel to school? Answer to the nearest minute.
    - What grade are you in?
    - How many siblings do you have?
    - What month were you born? Answer 1-12.
    - How many pair of shoes do you own?
    - How many hours of sleep per night do you usually get when you have school the next day?
    - How many different states have you visited?
    - How many hours a week you usually spend doing homework/studying?
    - How many pets do you own?
1. Create a Submit button. When submitPressed...
    1. Using [the get() method](https://python-commandments.org/tkinter-entry-widget/), get the name from that text field and get their answer from that text field
    1. Validate that the name is not "". If it is, create a messagebox with an error: messagebox.showerror("Box Title","Error message in middle of box")
    1. Validate that the name is not in the dictionary. If it is, create a messagebox with an error: messagebox.showerror("Box Title","Error message in middle of box")
    1. Validate that the answer is a number. If not, create a messagebox with an error: messagebox.showerror("Box Title","Error message in middle of box")
    1. If both are name and number are valid, add the name to the dictionary as a key and the number as a value. Clear the text entry fields using [the delete() method](https://python-commandments.org/tkinter-entry-widget/).

1. Create an Average button. IF THERE ARE MORE THAN ZERO RESPONSES, calculate the average answer. Display the number of responses and the average in a messagebox: messagebox.showinfo("Box Title","Informative message in middle of box")
1. Create a Quit button


Starter Code
```
import tkinter as tk
from tkinter import messagebox

window = tk.Tk()
window.title("Hello wold")
window.geometry("300x200")

hello = tk.Label(text="Hello world!")
hello.pack()
button = tk.Button(text="Click me!")
button.pack()

messagebox.showinfo("Box Title","Informative message in middle of box")

tk.mainloop()
```
