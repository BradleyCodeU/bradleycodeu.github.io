---
layout: project
category: py
title: Three Args
---
Pick 2:
- [giveTicket](#giveticket)
- [netPay](#netpay)
- [salesBonus](#salesbonus)
- [parrotNoise](#parrotnoise)


## giveTicket
Create a function called giveTicket that requires three arguments: currentSpeed, speedLimit, isSchoolZone.
The function returns either True or False. It returns True if isSchoolZone is true and the currentSpeed is above the speedLimit.
It also returns True if isSchoolZone is false and the currentSpeed is more than 10% above the speedLimit. Otherwise it returns False.

### Input &rarr; Output

giveTicket(21, 20, True) &rarr; True

giveTicket(19, 20, True) &rarr; False

giveTicket(999, 55, False) &rarr; True

giveTicket(59, 55, False) <small><em>#above the speed limit but not 10% above</em></small> &rarr; False

Starter code:
```python
from tkinter import *

# define your function here

popup = Tk()
output = giveTicket(21, "20", True)
Label(popup, text=str(output)).pack()
output = giveTicket(19, 20, "True")
Label(popup, text=str(output)).pack()
output = giveTicket(999, "55", False)
Label(popup, text=str(output)).pack()
output = giveTicket("59", 55, False)
Label(popup, text=str(output)).pack()
mainloop()
```

## netPay
Create a function called netPay that requires three arguments: hourlyPay, totalHours, incomeTax.
The function returns the employee's take-home pay (aka net pay). According to FLSA regulation, an employee "must receive overtime pay for hours worked over 40 in a workweek at a rate not less than time and one-half their regular rates of pay." If the totalHours is over 40, then calculate both the amount earned at regular pay (the first 40 hours) and the amount earned at time and one-half (overtime hours), then subtract the incomeTax (a percentage of their entire paycheck).

### Input &rarr; Output

netPay(10, 10, 0.05) &rarr; 95

netPay(10, 50, 0.05) <small><em>#($400 reg pay + $150 time-and-a-half pay) - 5%</em></small> &rarr; 522.5

netPay(10, 60, 0.05) <small><em>#($400 reg pay + $300 time-and-a-half pay) - 5%</em></small> &rarr; 665

Starter code:
```python
from tkinter import *

# define your function here

popup = Tk()
output = netPay("10", 10, 0.05)
Label(popup, text=output).pack()
output = netPay(10, "50", 0.05)
Label(popup, text=output).pack()
output = netPay(10, 60, "0.05")
Label(popup, text=output).pack()
mainloop()
```

## salesBonus
Create a function called salesBonus that requires three arguments: hourlyPay, totalHours, totalSales.
The function returns the employee's gross pay (aka pay before taxes). At this business, employees earn their hourlyPay x totalHours PLUS 10% of their totalSales. According to FLSA regulation, an employee "must receive overtime pay for hours worked over 40 in a workweek at a rate not less than time and one-half their regular rates of pay." If the the totalHours is over 40, then calculate both the amount earned at regular pay (the first 40 hours) and the amount earned at time and one-half (overtime hours), then add 10% of their totalSales.

### Input &rarr; Output

salesBonus(10, 30, 500) &rarr; 350

salesBonus(10, 50, 500) <small><em>#($400 reg pay + $150 time-and-a-half pay) + $50</em></small> &rarr; 600

salesBonus(10, 60, 500) <small><em>#($400 reg pay + $300 time-and-a-half pay) + $50</em></small> &rarr; 750

Starter code:
```python
from tkinter import *

# define your function here

popup = Tk()
output = salesBonus(10, 30, "500")
Label(popup, text=output).pack()
output = salesBonus(10, "50", 500)
Label(popup, text=output).pack()
output = salesBonus("10", 60, 500)
Label(popup, text=output).pack()
mainloop()
```

### parrotNoise

We own a loud squawking parrot. A noise ordinance prohibits noise louder than 45 decibels from 10 p.m. to 7:30 a.m. on school nights, prohibits noise louder than 60 decibels 10pm-7:30am on non-school nights, AND no noise louder than 75 decibels at ANY time.

Create a function called isVolumeAboveLimit. It requires two arguments: volume and limit. It returns either True if the volume is above the limit, otherwise it returns False.

Create a function called isNight. It requires one argument: militaryTime. It returns True if the time (in military time, 1300 means 1 p.m.) is after 10pm or the time is before 7:30am, otherwise it returns False.

Create a function called parrotNoise that requires three arguments: volume, militaryTime, and schoolTomorrow
- convert the volume to a number
- convert the militaryTime to a number
- convert schoolTomorrow to a boolean
- if isVolumeAboveLimit with a limit of 75 then return "Quiet down! You are much too loud!"
- if isNight and schoolTomorrow and isVolumeAboveLimit with a limit of 45 then return "Shhhhh! Children have school in the morning!"
- if isNight and schoolTomorrow is False and isVolumeAboveLimit with a limit of 60 then return "Shhhhh! I'm trying to sleep!"
- otherwise return "Good bird. Polly want a cracker?"


### Input &rarr; Output

parrotNoise("55","200",False) &rarr; "Good bird. Polly want a cracker?"

parrotNoise("99","1200","False") &rarr; "Quiet down! You are much too loud!"

parrotNoise("45","2300",True) &rarr; "Good bird. Polly want a cracker?"

parrotNoise("60","2300","False") &rarr; "Good bird. Polly want a cracker?"

parrotNoise("61","2300",True) &rarr; "Shhhhh! Children have school in the morning!"

parrotNoise("61","2300","False") &rarr; "Shhhhh! I'm trying to sleep!"

Starter code:
```python
from tkinter import *

# define your functions here

popup = Tk()
output = parrotNoise("55","200",False)
Label(popup, text=output).pack()
output = parrotNoise("99","1200","False")
Label(popup, text=output).pack()
output = parrotNoise("45","2300",True)
Label(popup, text=output).pack()
output = parrotNoise("60","2300","False")
Label(popup, text=output).pack()
output = parrotNoise("61","2300",True)
Label(popup, text=output).pack()
output = parrotNoise("61","2300","False")
Label(popup, text=output).pack()
mainloop()
```
