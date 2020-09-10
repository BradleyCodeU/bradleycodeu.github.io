---
layout: project
category: py
title: Buy Phones
---

Read this [Python Functions tutorial](/apcsp/py/pythonfunctions/) and this page about the [Python float function](https://www.w3schools.com/python/ref_func_float.asp)

Define a function called buyPhones that requires twos argument: myDollars and phonePrice. The function will return the amountOfPhones as a whole number.

Inputs → Output
```
'399', '399'→ 1
398.99, 399 → 0
600, 199.99 → 3
799, 199.99 → 3
```

Starter Code:
```python
# replace ALL SIX ??? blanks with the correct code

# define a function called buyPhones
# requires two argument: myDollars, phonePrice
def buyPhones( ??? , ??? ):
  #convert myDollars to a float
  ???
  #convert phonePrice to a float
  ???
  #create a new variable amountOfPhones
  #myDollars divided by phonePrice equals amountOfPhones
  ???
  #convert amountOfPhones to an int
  ???
  return amountOfPhones

# do not edit the following code
amountOfPhones = buyPhones('399','399')
print("\nExpected :'399','399' → 1 \nYour code:'399','399' → " + str(amountOfPhones))
amountOfPhones = buyPhones(398.99,399)
print("\nExpected : 398.99,399 → 0 \nYour code: 398.99,399 → " + str(amountOfPhones))
amountOfPhones = buyPhones(600,199.99)
print("\nExpected : 600,199.99 → 3 \nYour code: 600,199.99 → " + str(amountOfPhones))
amountOfPhones = buyPhones(799,199.99)
print("\nExpected : 799,199.99 → 3 \nYour code: 799,199.99 → " + str(amountOfPhones))
```
