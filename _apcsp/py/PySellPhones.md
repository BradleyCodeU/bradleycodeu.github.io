---
layout: project
category: py
title: Sell Phones
---
In this project you will work with an argument, convert to int, and return a value

Read this [tutorial about Python functions](/apcsp/py/pythonfunctions/) and how to [convert string to int](https://www.w3schools.com/python/python_casting.asp){:target="_blank"}

Define a function called sellPhones that requires one argument: myPhones. The function will return the myMoney as a whole number. Assume that 1 phone = 399 dollars

Input → Output
```
'1' → 399
0   → 0
2   → 798
2.5 → 798
```

Starter Code:
```python
# Fill in ALL 3 blanks with the correct code.
# Blanks look like this: ???
# define a function called sellPhones that requires one argument: myPhones.

def sellPhones(myPhones):
  # Convert myPhones to an int & save it back in myPhones
  ???
  # Let's assume that 1 phone = 399 dollars
  # Create variable myMoney & set it to myPhones multiplied by 399
  ???
  # Return the variable myMoney
  return ???

# do not edit the following code
myMoney = sellPhones('1')
print("Expected :'1'→ 399 \nYour code:'1'→ " + str(myMoney))
myMoney = sellPhones(0)
print("Expected : 0 → 0   \nYour code: 0 → " + str(myMoney))
myMoney = sellPhones(2)
print("Expected : 2 → 798 \nYour code: 2 → " + str(myMoney))
myMoney = sellPhones(2.5)
print("Expected :2.5→ 798 \nYour code:2.5→ " + str(myMoney))
```
