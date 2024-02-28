---
layout: project
category: py
title: Three Args
---

Pick 2:
- [triangleType](#triangleType)
- [convertTime](#convertTime)
- [isValidDate](#isValidDate)
- [giveTicket](#giveticket)
- [netPay](#netpay)
- [salesBonus](#salesbonus)
- [parrotNoise](#parrotnoise)

## triangleType
Write a Python function triangleType(side1, side2, side3) that takes in three arguments: side1, side2, and side3 (the lengths of the sides of a triangle). The function should determine and return the type of the triangle based on its sides: If all three sides are equal, return "equilateral". If only two sides are equal, return "isosceles". If no sides are equal, return "scalene". If any of the sides are zero or less then return "error"

#### Input -> Output
```
triangleType(5, 5, 5) -> "equilateral"

triangleType(5, 5, 6) -> "isosceles"

triangleType(3, 4, 5) -> "scalene"

triangleType(7, 8, -9) -> "error"
```

## convertTime
Write a Python function convert_time(hours, minutes, return_unit) that takes in three arguments: hours, minutes, and return_unit.

- hours (an integer representing the number of hours).
- minutes (an integer representing the number of minutes).
- return_unit (a string representing the unit of time to which the duration should be converted, either "hours", "minutes", or "seconds").

First calculate the total number of minutes by multiplying the number of hours by 60 and adding the number of minutes. If return_unit is "hours", then divide total_minutes by 60 to convert it to hours. If return_unit is "seconds", then multiply total_minutes by 60 to convert it to seconds. If the return_unit is not "hours", "minutes", or "seconds" then always return 0.

#### Input -> Output
```
convertTime(2, 30, "hours") -> 2.5

convertTime(2, 30, "minutes") -> 150

convertTime(2, 30, "seconds") -> 9000

convertTime(1, 2, "banana") -> 0
```
## isValidDate
Write a Python function isValidDate(month, day, is_leap_year) that takes in three arguments: month, day, and is_leap_year.

- month (an integer representing the month of the year with January as 1).
- day (an integer representing the day of the month).
- is_leap_year (a boolean indicating whether the year is a leap year).

The function should determine and return True if the given date is valid for the specified month and year (taking into account leap years if is_leap_year is True), otherwise return False. Remember: 30 days has September, April, June, and November, All the rest have 31, Save February at 28, But leap year coming once in four, February then has one day more.

#### Input -> Output
```
isValidDate(12, 31, False) -> True

isValidDate(4, 30, False) -> True

April only has 30 days

isValidDate(4, 31, False) -> False

isValidDate(12, 32, False) -> False

isValidDate(13, 31, False) -> False

isValidDate(0, -1, False) -> False

Feb 29th only exists if it's a leap year

isValidDate(2, 29, True) -> True

isValidDate(2, 29, False) -> False
```
## giveTicket
Create a function called giveTicket that requires three arguments: currentSpeed, speedLimit, isSchoolZone.
The function returns either True or False. It returns True if isSchoolZone is true and the currentSpeed is above the speedLimit.
It also returns True if isSchoolZone is false and the currentSpeed is more than 10% above the speedLimit. Otherwise it returns False.

#### Input -> Output
```
in school zone

giveTicket(21, 20, True) -> True

giveTicket(19, 20, True) -> False

not in school zone

giveTicket(999, 55, False) -> True

above the speed limit but not 10% above

giveTicket(59, 55, False) -> False  
```
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

#### Input -> Output
```
netPay(10, 10, 0.05) -> 95

($400 reg pay + $150 time-and-a-half pay) - 5%

netPay(10, 50, 0.05)  -> 522.5

($400 reg pay + $300 time-and-a-half pay) - 5%

netPay(10, 60, 0.05)  -> 665
```
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

#### Input -> Output
```
salesBonus(10, 30, 500) -> 350

($400 reg pay + $150 time-and-a-half pay) + $50

salesBonus(10, 50, 500) -> 600

($400 reg pay + $300 time-and-a-half pay) + $50

salesBonus(10, 60, 500) -> 750
```
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


#### Input -> Output
```
parrotNoise("55","200",False) -> "Good bird. Polly want a cracker?"

parrotNoise("99","1200","False") -> "Quiet down! You are much too loud!"

parrotNoise("45","2300",True) -> "Good bird. Polly want a cracker?"

parrotNoise("60","2300","False") -> "Good bird. Polly want a cracker?"

parrotNoise("61","2300",True) -> "Shhhhh! Children have school in the morning!"

parrotNoise("61","2300","False") -> "Shhhhh! I'm trying to sleep!"
```
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
