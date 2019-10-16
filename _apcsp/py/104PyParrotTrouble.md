---
layout: project
category: py
title: Parrot Trouble
---
In this project you will use integer conversion, if and else, and logical operators

We own a loud squawking parrot. A new noise ordinance prohibits noise louder than 55 decibels from 10 p.m. to 7:30 a.m. AND noise louder than 75 decibels during all hours of the day.

Create a function called isVolumeAboveLimit. It requires two arguments: volume and limit. It returns either True if the volume is above the limit, otherwise it returns False.

Create a function called isNight. It requires one argument: militarytime. It returns True if the time (in military time, 1300 means 1 p.m.) is after 10pm or the time is before 7:30am, otherwise it returns False.

Create a function called parrotTrouble that requires two arguments: volume and militarytime
- convert the volume to a number
- convert the militarytime to a number
- if isVolumeAboveLimit with a limit of 75 then return "Quiet down! You are much too loud!"
- if isNight and isVolumeAboveLimit with a limit of 55 then return "Shhhhh! People are trying to sleep"
- otherwise return "Good bird. Polly want a cracker?"


### Input &rarr; Output

parrotTrouble("55","200") &rarr; "Good bird. Polly want a cracker?"

parrotTrouble("99","1200") &rarr; "Quiet down! You are much too loud!"

parrotTrouble("75","1200") &rarr; "Good bird. Polly want a cracker?"

parrotTrouble("57","2300") &rarr; "Shhhhh! People are trying to sleep"

Starter code:
```python
from tkinter import *

# define your function here

popup = Tk()
output = parrotTrouble("55","200")
Label(popup, text=output).pack()
output = parrotTrouble("99","1200")
Label(popup, text=output).pack()
output = parrotTrouble("75","1200")
Label(popup, text=output).pack()
output = parrotTrouble("57","2300")
Label(popup, text=output).pack()
mainloop()
```
