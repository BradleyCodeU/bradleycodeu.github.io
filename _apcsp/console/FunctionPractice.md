---
layout: project
category: console
title: Function Practice
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
  return



# Part 2
# firstAndLast returns the first and last letters of str. Assume that str is always a length of 2 or more.
# Examples...
# firstAndLast("Apple") -> "Ae"
# firstAndLast("alaska") -> "aa"
# firstAndLast("Ohio") -> "Oo"

def firstAndLast(str):
  return



# Part 3
# middleLetter returns the letter at the middle of str. You will divide the length of str by two, then use the int() function to convert from a decimal to a whole number. Assume that str is always a length of 2 or more.
# Examples...
# middleLetter("Apple") -> "p"
# middleLetter("alaska") -> "s"
# middleLetter("Ohio") -> "i"

def middleLetter(str):
  return
```


Tests
```
self.assertEqual(startsWithA("Apple"), True)
self.assertEqual(startsWithA("alaska"),True)
self.assertEqual(startsWithA("Ohio"), False)
self.assertEqual(startsWithA("aaa"), True)
self.assertEqual(startsWithA("AAA"), True)
self.assertEqual(startsWithA("lkjasdf"), False)


self.assertEqual(middleLetter("Apple"), "p")
self.assertEqual(middleLetter("alaska"), "s")
self.assertEqual(middleLetter("Ohio"), "i")
self.assertEqual(middleLetter("qwerty"), "r")
self.assertEqual(middleLetter("qwert"), "e")
self.assertEqual(middleLetter("qw"), "w")
self.assertEqual(middleLetter("123456789"), "5")


self.assertEqual(firstAndLast("Apple"), "Ae")
self.assertEqual(firstAndLast("alaska"), "aa")
self.assertEqual(firstAndLast("Ohio"), "Oo")
self.assertEqual(firstAndLast("lkjasdf"), "lf")
self.assertEqual(firstAndLast("lf"), "lf")
self.assertEqual(firstAndLast("qkjsdfkjsdq"), "qq")

```
