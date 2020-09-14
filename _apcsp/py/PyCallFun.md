---
layout: project
category: py
title: Calling Functions
---
[Read this tutorial first](/apcsp\py\pythonfunctions)

In this project you are given 3 completed function definitions:
  1.  getFirstVowel
  1.  getVowelName
  1.  playNameGame

Your job is to "call" the functions and pass in arguments. Your exact directions are written as comments in the starter code. I recommend writing your code on the line below each comment. Like this...
```python
# Create a variable called areaCode and assign the value 614
areaCode = 614
```

<u>Fill in all 14 blanks below with the correct code. Blanks look like this: ???</u>

STARTER CODE:
```python
# Your work begins on line 23 !!!
# Do NOT edit these first 20 lines of code!

def getFirstVowel(mystring):
    for index, char in enumerate(mystring):
        if char in "aeiou":
            return index
    return 0

def getVowelName(fullName):
    if fullName[0] not in "aeiou":
        return fullName[getFirstVowel(fullName):].lower()
    return fullName.lower()

def playNameGame(fullName):
    vowelName = getVowelName(fullName)
    output = fullName + ", " + fullName + ", bo-B"
    output += vowelName + ". Bonana-fanna fo-F"
    output += vowelName + ". Fee fi mo-M"
    return output + vowelName + ". " + fullName + "!"

# -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
# Fill in all 14 blanks below with the correct code.
# Blanks look like this: ???

def test_1_getFirstVowel():
    # call getFirstVowel function, pass argument "Steve",
    # save what it returns in steveText
    steveText = getFirstVowel("Steve")
    # print that variable
    print(steveText)
    # call getFirstVowel function, pass in "Hilliard" as
    # an argument & save what it returns in hillText
    hillText = ???
    # print the variable hillText
    print( ??? )
    # return variable hillText
    return ???

def test_2_getVowelName():
    # call getVowelName function, pass in YOUR LAST NAME as
    # an argument & save what it returns in a variable
    ??? = ???
    # print your variable
    print( ??? )
    # call getVowelName function, pass argument "Brynn" &
    # save what it returns in brynnText
    brynnText = ???
    # print the variable brynnText
    print( ??? )
    # return variable brynnText
    return ???

def test_3_playNameGame():
    # call playNameGame function, pass argument "Shirley",
    # saves what it returns in variable shirleyText
    shirleyText = playNameGame( ??? )  
    # print that variable
    print(shirleyText)
    # call playNameGame function, pass in YOUR FIRST NAME as
    # an argument, & save what it returns in a new variable
    ??? = ???
    # print that variable
    print( ??? )
    # return your variable
    return ???


# -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
# You are done!
# Do not edit the code below this line!
test_1_getFirstVowel()
test_2_getVowelName()
test_3_playNameGame()
```
