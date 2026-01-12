---
layout: project
category: py
title: Math Fun
---


# Read this tutorial:
- [Python Conditionals](https://www.w3schools.com/python/python_conditions.asp){:target="_blank"}


In this project you will define 3 of the following 5 functions.

Pick 3:
- [absoluteValue](#absolutevalue)
- [slope](#slope)
- [smallest](#smallest)
- [anyNegative](#anyNegative)
- [maximumValue](#maximumvalue)




## absoluteValue
Given one number as an argument, return the absolute value

Input -> Output
```
absoluteValue(-55) -> 55
absoluteValue("42") -> 42
```

## slope
Given four arguments: x1, y1, x2, y2, return the slope between the two points as a float OR if it is a vertical line, return the string "undefined"

Input -> Output
```
slope(0, 0, 0, 10) -> "undefined"
slope("-7", "-5", "7", "5") -> 0.7142857142857143
```


## smallest
Given three numbers as arguments, return the smallest number

Input -> Output
```
smallest(3, -5) -> -5
smallest("-9", "-2") -> -9
```


## anyNegative
Given four arguments: n1, n2, n3, n4. Return True if any of the arguments is a negative number OR return False if none are negative numbers

Input -> Output
```
anyNegative(0, 5, 99, 10) -> False
anyNegative("-7", "-5", "7", "5") -> True
```


## maximumValue
Given three numbers as arguments, return the largest number

Input -> Output
```
maximumValue(1, 3, -5) -> 3
maximumValue("7", "2", "9") -> 9
```
<!--
## distance
Given four arguments: x1, y1, x2, y2, return the distance between the two points as a float

Input -> Output
```
distance(-7, -5, 7, 5) -> 17.204650534085253
distance("0", "0", "0", "10") -> 10.0
```

## normalize
Given three arguments: currentNumber, lowerBoundary, upperBoundary, return the currentNumber scaled to between 0 and 1

Input -> Output
```
normalize(20, 20, "25") -> 0
normalize(25, "20", 25) -> 1
normalize("21", 20, 25) -> 0.2
```
-->

--------------

STARTER CODE
```python
# In this project you will complete TWO functions.
# Pick 2 of the following 5


# Given one number as an argument, return the absolute value
def absoluteValue(myNumber):
  # convert the argument variable myNumber to an int

  # if myNumber is less than zero:

    # then multiply myNumber by -1 and save back in myNumber

  # return myNumber
  return


# Given four arguments: x1, y1, x2, y2, return the slope
# between the two points as a float OR if it is a vertical
# line, return the string "undefined"
def slope(x1, y1, x2, y2):
  # convert all four argument variables to float

  # calculate rise and save it in a variable named rise

  # calculate run and save it in a variable named run

  # if run equals zero, then return the string "undefined"

  # if run does not equal zero, then return rise divided by run
  return


# Given two numbers as arguments, return the smallest number
def smallest(num1, num2):
    # convert both argument variables to int
    # your code goes here. Must use an if-then statement
    return


# Given four numbers as arguments. Return True if any
# of the arguments is a negative number OR return False if
# none are negative numbers
def anyNegative(num1, num2, num3, num4):
  # convert all four argument variables to float
  # your code goes here. MUST use an if-then statement
  return


# Given three numbers as arguments, return the largest number
def maximumValue(numA, numB, numC):
  # convert all three argument variables to int
  # your code goes here. Must use if-then statements
  return



# --------------------------------------------------------
# do not edit the following code
absTest1 = absoluteValue(-55)
print("\nExpected : absoluteValue(-55) -> 55 \nYour code: absoluteValue(-55) -> " + str(absTest1))
absTest2 = absoluteValue("42")
print("Expected : absoluteValue(\"42\") -> 42 \nYour code: absoluteValue(\"42\") -> " + str(absTest2))
slopeTest1 = slope(0, 0, 0, 10)
print("\nExpected : slope(0, 0, 0, 10) -> \"undefined\" \nYour code: slope(0, 0, 0, 10) -> " + str(slopeTest1))
slopeTest2 = slope("-7", "-5", "7", "5")
print("Expected : slope(\"-7\", \"-5\", \"7\", \"5\") -> 0.7142857142857143 \nYour code: slope(\"-7\", \"-5\", \"7\", \"5\") -> " + str(slopeTest2))
minTest1 = smallest(3, -5)
print("\nExpected : smallest(3, -5) -> -5 \nYour code: smallest(3, -5) -> " + str(minTest1))
minTest2 = smallest("-9", "-2")
print("Expected : smallest(\"-9\", \"-2\") -> -9 \nYour code: smallest(\"-9\", \"-2\") -> " + str(minTest2))
negativeTest1 = anyNegative(0, 5, 99, 10)
print("\nExpected : anyNegative(0, 5, 99, 10) -> False \nYour code: anyNegative(0, 5, 99, 10) -> " + str(negativeTest1))
negativeTest2 = anyNegative("-7", "-5", "7", "5")
print("Expected : anyNegative(\"-7\", \"-5\", \"7\", \"5\") -> True \nYour code: anyNegative(\"-7\", \"-5\", \"7\", \"5\") -> " + str(negativeTest2))
maxTest1 = maximumValue(1, 3, -5)
print("\nExpected : maximumValue(1, 3, -5) -> 3 \nYour code: maximumValue(1, 3, -5) -> " + str(maxTest1))
maxTest2 = maximumValue("7", "2", "9")
print("Expected : maximumValue(\"7\", \"2\", \"9\") -> 9 \nYour code: maximumValue(\"7\", \"2\", \"9\") -> " + str(maxTest2))


```
