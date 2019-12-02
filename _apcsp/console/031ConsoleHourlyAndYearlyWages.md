---
layout: project
category: console
title: Console Hourly and Yearly Wages
---
*MUST USE INPUT VALIDATION*

You can learn how to validate user input [here](https://www.101computing.net/number-only/) and [here](https://www.w3schools.com/python/python_try_except.asp)
- Tell the user "I can calculate your 1) Hourly Wage given a Yearly Wage OR 2) Yearly Wage given a Hourly Wage"
- Collect the user input and validate that they pressed 1 or 2
- (I will give steps for 1 and you can do 2 on your own)
- Prompt for the Yearly Wage
- Validate that they entered a number >0
- Prompt for how many days per week they work on average
- Validate that they entered a number >0
- Prompt for how many hours per day they work on average
- Validate that they entered a number >0
- Divide the Yearly Wage by the total number of weeks in a year, then divide that by Days Per Week they work, then divide that by the Hours Per Day they work.
- Tell them "The Hourly Wage is roughly $x.xx per hour"

Sample Output 1 (user input is in ** asterisk ** and should not be coded into your program)
```
I can calculate your 1) Hourly Wage given a Yearly Wage OR 2) Yearly Wage given a Hourly Wage: **1**
What is your yearly wage? **30000.00**
How many days per week do you work on average? **5**
How many hours per day do you work on average? **8**
Your hourly wage is $14.42
```

Sample Output 2 (user input is in ** asterisk ** and should not be coded into your program)
```
I can calculate your 1) Hourly Wage given a Yearly Wage OR 2) Yearly Wage given a Hourly Wage: **2**
What is your hourly wage? **14.42**
How many days per week do you work on average? **5**
How many hours per day do you work on average? **8**
Your yearly wage is $29993.6
```
