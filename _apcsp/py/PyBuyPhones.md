---
layout: project
category: py
title: Buy Phones
---

Read this [tutorial](/apcsp/py/pythonfunctions/)

Define a function called buyPhones that requires one argument: myDollars. The function will return the amountOfPhones as a whole number. Assume that 1 phone = 399 dollars

Input → Output
```
'399' → 1
398   → 0
600   → 1
800.5 → 2
```

Starter Code:
```python
# define a function called buyPhones that requires one argument: myDollars.

def buyPhones( myDollars ):
    # Convert myDollars to a float

    # Let's assume that 1 phone = 399 dollars
    # Create variable named amountOfPhones & set it to myDollars divided by 399

    # Convert amountOfPhones to an int

    # The function will return the amountOfPhones as a whole number
    return

amountOfPhones = buyPhones('399')
print("Expected :'399'→ 1 \nYour code:'399'→ " + str(amountOfPhones))
amountOfPhones = buyPhones(398)
print("Expected : 398 → 0 \nYour code: 398 → " + str(amountOfPhones))
amountOfPhones = buyPhones(600)
print("Expected : 600 → 1 \nYour code: 600 → " + str(amountOfPhones))
amountOfPhones = buyPhones(800.5)
print("Expected :800.5→ 2 \nYour code:800.5→ " + str(amountOfPhones))
```
