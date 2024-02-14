#  Function Practice
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
```


Tests
```
self.assertEquals(True, startsWithA("Apple"))
self.assertEquals(True, startsWithA("alaska"))
self.assertEquals(False, startsWithA("Ohio"))
self.assertEquals(True, startsWithA("aaa"))
self.assertEquals(True, startsWithA("AAA"))
self.assertEquals(False, startsWithA("lkjasdf"))


self.assertEquals(middleLetter("Apple"), "p")
self.assertEquals(middleLetter("alaska"), "s")
self.assertEquals(middleLetter("Ohio"), "i")
self.assertEquals(middleLetter("qwerty"), "r")
self.assertEquals(middleLetter("qwert"), "e")
self.assertEquals(middleLetter("qw"), "w")
self.assertEquals(middleLetter("123456789"), "5")


self.assertEquals(firstAndLast("Apple"), "Ae")
self.assertEquals(firstAndLast("alaska"), "aa")
self.assertEquals(firstAndLast("Ohio"), "Oo")
self.assertEquals(firstAndLast("lkjasdf"), "lf")
self.assertEquals(firstAndLast("lf"), "lf")
self.assertEquals(firstAndLast("qkjsdfkjsdq"), "qq")
```

  