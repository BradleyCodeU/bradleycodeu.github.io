---
layout: project
category: tk
title: Menu Calculator 1
---
Watch these [Tkinter tutorial videos](https://drive.google.com/open?id=1gb9k1pepJA0bC8QmTcXv03PY7UyIBypb)

Copy/paste this starter code: [https://repl.it/@JustinRiley1/Menu-Calc](https://repl.it/@JustinRiley1/Menu-Calc)

Display a menu with prices for THREE items (for example, burger $4.99, chicken sandwich $3.99, and one other item). Your app is collecting how many of item 1, how many item 2, and how many item 3.

You MUST include...
- Labels for item names and prices
- an Entry widget for each item so that the user can say how many they want (you may NOT use Spinboxes)
- a Button

Create a function called isValidNumber that requires one argument: userinput. It returns true if the number can be converted to a number without crashing, otherwise it returns false.

When the customer clicks the SUBMIT button
  - you MUST validate the numbers
  - calculate the total price
  - create a messagebox that tells the customer the total price
  - if invalid numbers, display an error message

### Remember:
    - Your Tkinter app will NOT use input() at all. You will use Tkinter text entry boxes to collect input.
    - Your Tkinter app will NOT use print() at all. All output messages should appear as messageboxes.
    - Because everything in Tkinter occurs based on button clicks, you will NOT have any while loops at all.


Your final line of code MUST be mainloop(). This allows someone to simply click on your file and run your app. **mainloop** works kind of like a game loop that keeps the app running.
```python
mainloop() #include me as last line!!!
```
