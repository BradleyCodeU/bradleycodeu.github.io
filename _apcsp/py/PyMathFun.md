---
layout: project
category: py
title: Math Functions
---

In this project you will define two functions.

Pick 2:
- [absoluteValue](#absolutevalue)
- [slope](#slope)
- [anyNegative](#anyNegative)
- [minimumValue](#minimumvalue)
- [maximumValue](#maximumvalue)
- [distance](#distance)
- [normalize](#normalize)



## absoluteValue
Given one number as an argument, return the absolute value

Input → Output
```
absoluteValue(-55) → 55
absoluteValue("42") → 42
```

## slope
Given four arguments: x1, y1, x2, y2, return the slope between the two points as a float OR if it is a vertical line, return the string "undefined"

Input → Output
```
slope(0, 0, 0, 10) → "undefined"
slope("-7", "-5", "7", "5") → 0.7142857142857143
```

## anyNegative
Given four arguments: n1, n2, n3, n4. Return True if any of the arguments is a negative number OR return False if none are negative numbers

Input → Output
```
anyNegative(0, 5, 99, 10) → False
anyNegative("-7", "-5", "7", "5") → True
```

## minimumValue
Given three numbers as arguments, return the smallest number

Input → Output
```
minimumValue(1, 3, -5) → -5
minimumValue("-7", "-9", "-2") → -9
```

## maximumValue
Given three numbers as arguments, return the largest number

Input → Output
```
maximumValue(1, 3, -5) → 3
maximumValue("7", "2", "9") → 9
```

## distance
Given four arguments: x1, y1, x2, y2, return the distance between the two points as a float

Input → Output
```
distance(-7, -5, 7, 5) → 17.204650534085253
distance("0", "0", "0", "10") → 10.0
```

## normalize
Given three arguments: currentNumber, lowerBoundary, upperBoundary, return the currentNumber scaled to between 0 and 1

Input → Output
```
normalize(20, 20, "25") → 0
normalize(25, "20", 25) → 1
normalize("21", 20, 25) → 0.2
```

--------------

STARTER
```python
# In this project you will complete TWO functions.
# Pick 2 of the following 5


def absoluteValue(myNumber):
  # convert the argument variable myNumber to an int

  # if myNumber is less than zero:

    # then multiply myNumber by -1 and save back in myNumber

  # return myNumber
  return


def minimumValue(num1, num2, num3):
  # convert all three argument variables to int
  # your code goes here. Must use if-then statements
  return


def maximumValue(numA, numB, numC):
  # convert all three argument variables to int
  # your code goes here. Must use if-then statements
  return


def slope(x1, y1, x2, y2):
  # convert all four argument variables to float
  # your code goes here. MUST use an if-then statement
  return


def distance(x1, y1, x2, y2):
  # convert all four argument variables to float
  # your code goes here
  return


# do not edit the following code
absTest1 = absoluteValue(-55)
print("\nExpected : absoluteValue(-55) → 55 \nYour code: absoluteValue(-55) → " + str(absTest1))
absTest2 = absoluteValue("42")
print("Expected : absoluteValue(\"42\") → 42 \nYour code: absoluteValue(\"42\") → " + str(absTest2))
minTest1 = minimumValue(1, 3, -5)
print("\nExpected : minimumValue(1, 3, -5) → -5 \nYour code: minimumValue(1, 3, -5) → " + str(minTest1))
minTest2 = minimumValue("-7", "-9", "-2")
print("Expected : minimumValue(\"-7\", \"-9\", \"-2\") → -9 \nYour code: minimumValue(\"-7\", \"-9\", \"-2\") → " + str(minTest2))
maxTest1 = maximumValue(1, 3, -5)
print("\nExpected : maximumValue(1, 3, -5) → 3 \nYour code: maximumValue(1, 3, -5) → " + str(maxTest1))
maxTest2 = maximumValue("7", "2", "9")
print("Expected : maximumValue(\"7\", \"2\", \"9\") → 9 \nYour code: maximumValue(\"7\", \"2\", \"9\") → " + str(maxTest2))
slopeTest1 = slope(0, 0, 0, 10)
print("\nExpected : slope(0, 0, 0, 10) → \"undefined\" \nYour code: slope(0, 0, 0, 10) → " + str(slopeTest1))
slopeTest2 = slope("-7", "-5", "7", "5")
print("Expected : slope(\"-7\", \"-5\", \"7\", \"5\") → 0.7142857142857143 \nYour code: slope(\"-7\", \"-5\", \"7\", \"5\") → " + str(slopeTest2))
distTest1 = distance(-7, -5, 7, 5)
print("\nExpected : distance(-7, -5, 7, 5) → 17.204650534085253 \nYour code: distance(-7, -5, 7, 5) → " + str(distTest1))
distTest2 = distance("0", "0", "0", "10")
print("Expected : distance(\"0\", \"0\", \"0\", \"10\") → 10.0 \nYour code: distance(\"0\", \"0\", \"0\", \"10\") → " + str(distTest2))
```
<!--
UNITTESTS

self.assertEquals(int(absoluteValue(-55) == 55 ) + int(minimumValue(1, 3, -5) == -5) + int(maximumValue(1, 3, -5) == 3) + int(distance(-7, -5, 7, 5) == 17.204650534085253) + int(slope(0, 0, 0, 10) == "undefined") >= 2,True)

self.assertEquals(int(absoluteValue("42") == 42) + int(minimumValue("-7", "-9", "-2") == -9) + int(maximumValue("7", "2", "9") == 9) + int(distance("0", "0", "0", "10") == 10.0) + int(slope("-7", "-5", "7", "5") == 0.7142857142857143) >= 2,True)
-->
[comment]: <> (This is a comment, it will not be included)
