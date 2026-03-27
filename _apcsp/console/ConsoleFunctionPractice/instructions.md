---
layout: project
category: console
title: Console Function Practice
---
## Directions  

### Part 1
startsWithA returns true if str begins with an "A" or begins with an "a". Otherwise it returns false.
```
Examples...
startsWithA("Apple") -> True
startsWithA("alaska") -> True
startsWithA("Ohio") -> False
```



### Part 2
firstAndLast returns the first and last letters of str. Assume that str is always a length of 2 or more.
```
Examples...
firstAndLast("Apple") -> "Ae"
firstAndLast("alaska") -> "aa"
firstAndLast("Ohio") -> "Oo"
```



### Part 3
middleLetter returns the letter at the middle of str. You will divide the length of str by two, then use the int() function to convert from a decimal to a whole number. Assume that str is always a length of 2 or more.
```
Examples...
middleLetter("Apple") -> "p"
middleLetter("alaska") -> "s"
middleLetter("Ohio") -> "i"
```

### Part 4
Create your own function that will count how many times a specific letter appears. You choose the letter. Everyone in class might do a different letter. Write 5 tests to test your letter counting function.

main.py

```
# Function Practice
# Part 1
# startsWithA returns true if str begins with an "A" or begins with an "a". Otherwise it returns false.
# Examples...
# startsWithA("Apple") -> True
# startsWithA("alaska") -> True
# startsWithA("Ohio") -> False

def startsWithA(str):
  # your code goes here
  return



# Part 2
# firstAndLast returns the first and last letters of str. Assume that str is always a length of 2 or more.
# Examples...
# firstAndLast("Apple") -> "Ae"
# firstAndLast("alaska") -> "aa"
# firstAndLast("Ohio") -> "Oo"

def firstAndLast(str):
  # your code goes here
  return



# Part 3
# middleLetter returns the letter at the middle of str. You will divide the length of str by two, then use the int() function to convert from a decimal to a whole number. Assume that str is always a length of 2 or more.
# Examples...
# middleLetter("Apple") -> "p"
# middleLetter("alaska") -> "s"
# middleLetter("Ohio") -> "i"

def middleLetter(str):
  # your code goes here
  return


# Part 4
# Create your own function that will count how many times a specific letter appears. You choose the letter. Everyone in class might do a different letter. Write 5 tests to test your letter counting function.

```


Tests
```
print("Testing part 1 startsWithA")
print("expect True actual " + startsWithA("Apple"))
print("expect True, startsWithA("alaska"))
print("expect False, startsWithA("Ohio"))
print("expect True, startsWithA("aaa"))
print("expect True, startsWithA("AAA"))
print("expect False, startsWithA("lkjasdf"))

print("Testing part 2 middleLetter")
print("expect p actual " +  middleLetter("Apple"))
print("expect s actual " +  middleLetter("alaska"))
print("expect i actual " +  middleLetter("Ohio"))
print("expect r actual " +  middleLetter("qwerty"))
print("expect e actual " +  middleLetter("qwert"))
print("expect w actual " +  middleLetter("qw"))
print("expect 5 actual " +  middleLetter("123456789"))

print("Testing part 3 firstAndLast")
print("expect Ae actual " +  firstAndLast("Apple"))
print("expect aa actual " +  firstAndLast("alaska"))
print("expect Oo actual " +  firstAndLast("Ohio"))
print("expect lf actual " +  firstAndLast("lkjasdf"))
print("expect jk actual " +  firstAndLast("jk"))
print("expect qq actual " +  firstAndLast("qkjsdfkjsdq"))

print("Testing part 4 ???")
# Write 5 tests to test your letter counting function.
```

  