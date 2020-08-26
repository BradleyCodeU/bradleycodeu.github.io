---
layout: project
category: py
title: Sell Phones
---

Read this [tutorial](/apcsp/py/pythonfunctions/)

Define a function called sellPhones that requires one argument: myPhones. The function will return the myMoney as a whole number. Assume that 1 phone = 399 dollars

Input → Output
```
'1'→ 399
0  → 0
2  → 1
2.5→ 2
```

Starter Code:
```python
#define a function called sellPhones that requires one argument: myPhones.

def sellPhones(myPhones):
    #convert myPhones to an int and save it back in myPhones

    #assume that 1 phone = 399 dollars
    #myPhones multiplied by 399 equals myMoney

    #return myMoney
    return

myMoney = sellPhones('1')
print("Expected:'1'→ 399 Your code:'1'→ " + str(myMoney))
myMoney = sellPhones(0)
print("Expected: 0 → 0   Your code: 0 → " + str(myMoney))
myMoney = sellPhones(2)
print("Expected: 2 → 798 Your code: 2 → " + str(myMoney))
myMoney = sellPhones(2.5)
print("Expected:2.5→ 798 Your code:2.5→ " + str(myMoney))
```
