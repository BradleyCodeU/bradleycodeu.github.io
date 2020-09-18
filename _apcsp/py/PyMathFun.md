---
layout: project
category: py
title: Math Functions
---

In this project you will define two functions.

Pick 2:
- [absoluteValue](#absolutevalue)
- [maximumValue](#maximumvalue)
- [minimumValue](#minimumvalue)
- [distance](#distance)
- [normalize](#normalize)



## absoluteValue
Given one number as an argument, return the absolute value

Input → Output
```
absoluteValue(-55) → 55
absoluteValue("42") → 42
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


STARTER
```

```
<!---
UNITTESTS

self.assertEquals(int(absoluteValue(-55) == 55 ) + int(minimumValue(1, 3, -5) == -5) + int(maximumValue(1, 3, -5) == 3) + int(distance(-7, -5, 7, 5) == 17.204650534085253) >= 2,True)

self.assertEquals(int(absoluteValue("42") == 42) + int(minimumValue("-7", "-9", "-2") == -9) + int(maximumValue("7", "2", "9") == 9) + int(distance("0", "0", "0", "10") == 10.0) >= 2,True)
--->
[comment]: <> (This is a comment, it will not be included)
