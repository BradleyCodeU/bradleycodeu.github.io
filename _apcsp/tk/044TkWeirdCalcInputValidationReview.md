---
layout: project
category: tk
title: Tk Weird Calc Input Validation Review
---

Resources:
- [effbot.org/tkinterbook/](https://effbot.org/tkinterbook/)
- [effbot.org/tkinterbook/tkinter-classes.htm](https://effbot.org/tkinterbook/tkinter-classes.htm)
- [datacamp.com/community/tutorials/gui-tkinter-python](https://www.datacamp.com/community/tutorials/gui-tkinter-python)
- [python-course.eu/python_tkinter.php](https://www.python-course.eu/python_tkinter.php)

Watch these [Tkinter tutorial videos](https://drive.google.com/open?id=1gb9k1pepJA0bC8QmTcXv03PY7UyIBypb)

Project Details:

Using Mu or repl.it...

1. Create an Entry widget (you may NOT use Spinbox for this project) for number 1 and another Entry widget for number 2
2. Create a Button widget
3. When the Button is pressed:
   1. if NOT Validate input, create a messagebox that will show an error. Check that user has input numbers and that number 2 is not zero.
   1. Otherwise, if input is valid create messageboxes that will show info:
      - Give the sum of the two numbers
      - Give the difference between the two numbers
      - Give the product of the two numbers (the result of multiplication)
      - Give the quotient (the result of division)

Your final line of code MUST be mainloop(). This allows someone to simply click on your file and run your app. **mainloop** works kind of like a game loop that keeps the app running.
```python
mainloop() #include me as last line!!!
```
