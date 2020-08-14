---
layout: project
category: py
title: Buy Phones
---

Read this [tutorial](/apcsp/py/pythonfunctions/)

Define a function called buyPhones that requires one argument: myDollars. The function will return the amountOfPhones as a whole number. Assume that 1 phone = 399 dollars

Input → Output
```
'399'→ 1
398  → 0
600  → 1
800.5→ 2
```

Starter Code:
```python
#define a function called buyPhones that requires one argument: myDollars.
def buyPhones( myDollars ):
    #convert myDollars to a float

    #assume that 1 phone = 399 dollars
    #myDollars divided by 399 equals amountOfPhones

    #convert amountOfPhones to an int

    #The function will return the amountOfPhones as a whole number
    return

amountOfPhones = buyPhones('399')
print("Expected:'399'→ 1 Your code:'399'→ " + str(amountOfPhones))
amountOfPhones = buyPhones(398)
print("Expected: 398 → 0 Your code: 398 → " + str(amountOfPhones))
amountOfPhones = buyPhones(600)
print("Expected: 600 → 1 Your code: 600 → " + str(amountOfPhones))
amountOfPhones = buyPhones(800.5)
print("Expected:800.5→ 2 Your code:800.5→ " + str(amountOfPhones))
```
