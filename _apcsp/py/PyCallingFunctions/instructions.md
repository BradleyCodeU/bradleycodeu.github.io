# Calling Functions

[Read this tutorial first](/apcsp\py\pythonfunctions)

In this project you are given 3 completed function definitions:
  1.  findFirstVowel
  1.  getVowelName
  1.  playNameGame

Your job is to "call" the functions and pass in arguments. Your exact directions are written as comments in the starter code. I recommend writing your code on the line below each comment. Like this...
```python
# Create a variable called areaCode and assign the value 614
areaCode = 614
```

<u>Fill in all 16 blanks below with the correct code. Blanks look like this: ???</u>

STARTER CODE:
```python
# Your work begins on line 23 !!!
# Do NOT edit these first 20 lines of code!

def findFirstVowel(mystring):
    for index, char in enumerate(mystring):
        if char in "aeiou":
            return index
    return 0

def getVowelName(fullName):
    if fullName[0] not in "aeiou":
        return fullName[findFirstVowel(fullName):].lower()
    return fullName.lower()

def playNameGame(fullName):
    vowelName = getVowelName(fullName)
    output = fullName + ", " + fullName + ", bo-B"
    output += vowelName + ". Bonana-fanna fo-F"
    output += vowelName + ". Fee fi mo-M"
    return output + vowelName + ". " + fullName + "!"

# -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
# Fill in all 18 blanks below with the correct code.
# Blanks look like this: ???

def test_1_findFirstVowel():
    # call findFirstVowel function, pass argument "Steve",
    # save what it returns in steveText
    steveText = findFirstVowel("Steve")
    # print that variable
    print(steveText)
    # return the variable steveText
    return ???

def test_2_findFirstVowel():
    # call findFirstVowel function, pass in "Hilliard" as
    # an argument & save what it returns in hillText
    hillText = ???
    # print the variable hillText
    print( ??? )
    # return variable hillText
    return ???

def test_3_getVowelName():
    # call getVowelName function, pass argument "Christine" &
    # save what it returns in christineText
    christineText = ???
    # print the variable christineText
    print( ??? )
    # return variable christineText
    return ???

def test_4_getVowelName():
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

def test_5_playNameGame():
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
print("Test 1 findFirstVowel\nExpected 'Steve' -> 2")
test_1_findFirstVowel()
print("Test 2 findFirstVowel\nExpected 'Hilliard' -> 1")
test_2_findFirstVowel()
print("Test 3 getVowelName\nExpected 'Christine' -> 'istine'")
test_3_getVowelName()
print("Test 4 getVowelName\nExpected 'Name' -> 'ame'\nExpected 'Brynn' -> 'brynn'")
test_4_getVowelName()
print("Test 5 playNameGame")
test_5_playNameGame()
```
