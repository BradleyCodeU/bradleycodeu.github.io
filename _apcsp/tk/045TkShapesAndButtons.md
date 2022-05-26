---
layout: project
category: tk
title: Tk Shapes and Buttons
---
Watch these [Tkinter tutorial videos](https://drive.google.com/open?id=1gb9k1pepJA0bC8QmTcXv03PY7UyIBypb)

Directions:

- Pick one color and give all shapes that fill color.
- Pick a different color and give all shapes that outline color.
- Create a Triangle that is controlled by w,a,s,d
- Create a "Circle" button that draws a circle when pressed. (Hint: make a function called drawCircle and tell the button command=drawCircle)
- Create a "Rectangle" button that draws a rect when pressed.
- Create a "Square" button that draws a square when pressed.
- Create a "Quit" button with command=tk.destroy


When the project loads, you should only see the Triangle and the four buttons. Shapes appear only when their button is pressed.

### Remember:
  - Your Tkinter app will NOT use input() at all. You will use Tkinter text entry boxes to collect input.
  - Your Tkinter app will NOT use print() at all. All output messages should appear as messageboxes.
  - Because everything in Tkinter occurs based on button clicks, you will NOT have any while loops at all.


Your final line of code MUST be mainloop(). This allows someone to simply click on your file and run your app. **mainloop** works kind of like a game loop that keeps the app running.
```python
mainloop() #include me as last line!!!
```
