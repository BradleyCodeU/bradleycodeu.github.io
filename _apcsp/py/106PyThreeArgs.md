---
layout: project
category: py
title: Three Args
---
Pick 2:
- [giveSpeedingTicket](#giveSpeedingTicket)
- [netPay](#netPay)
- [employeeSalesBonus](#employeeSalesBonus)


## giveSpeedingTicket
Create a function called giveSpeedingTicket that requires three arguments: currentSpeed, speedLimit, isSchoolZone.
The function returns either True or False. It returns True if isSchoolZone is true and the currentSpeed is above the speedLimit.
It also returns True if isSchoolZone is false and the currentSpeed is more than 10% above the speedLimit. Otherwise it returns False.

Input &rarr; Output

giveSpeedingTicket(21, 20, True) &rarr; True

giveSpeedingTicket(19, 20, True) &rarr; False

giveSpeedingTicket(999, 55, False) &rarr; True

giveSpeedingTicket(59, 55, False) <small><em>#above the speed limit but not 10% above</em></small> &rarr; False

## netPay
Create a function called weeklyPay that requires three arguments: hourlyPay, totalHours, incomeTax.
The function returns the employee's take-home pay (aka net pay). According to FLSA regulation, an employee "must receive overtime pay for hours worked over 40 in a workweek at a rate not less than time and one-half their regular rates of pay." If the totalHours is over 40, then calculate both the amount earned at regular pay (the first 40 hours) and the amount earned at time and one-half (overtime hours), then subtract the incomeTax (a percentage of their entire paycheck).

Input &rarr; Output

weeklyPay(10, 10, 0.05) &rarr; 95

weeklyPay(10, 50, 0.05) <small><em>#($400 reg pay + $150 time-and-a-half pay) - 5%</em></small> &rarr; 522.5

weeklyPay(10, 60, 0.05) <small><em>#($400 reg pay + $300 time-and-a-half pay) - 5%</em></small> &rarr; 665

## employeeSalesBonus
Create a function called employeeSalesBonus that requires three arguments: hourlyPay, totalHours, totalSales.
The function returns the employee's gross pay (aka pay before taxes). At this business, employees earn their hourlyPay x totalHours PLUS 10% of their totalSales. According to FLSA regulation, an employee "must receive overtime pay for hours worked over 40 in a workweek at a rate not less than time and one-half their regular rates of pay." If the the totalHours is over 40, then calculate both the amount earned at regular pay (the first 40 hours) and the amount earned at time and one-half (overtime hours), then add 10% of their totalSales.

Input &rarr; Output

employeeSalesBonus(10, 30, 500) &rarr; 350



employeeSalesBonus(10, 50, 500) <small><em>#($400 reg pay + $150 time-and-a-half pay) + $50</em></small> &rarr; 600



employeeSalesBonus(10, 60, 500) <small><em>#($400 reg pay + $300 time-and-a-half pay) + $50</em></small> &rarr; 750
