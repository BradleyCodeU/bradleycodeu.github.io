'''
Mr. Riley has created 4 weird functions and he needs you to test them to make sure that they work correctly. Write 2 tests for each function (8 total tests).

Test a function by "calling" the function and passing an argument into the function. For example, countVowels("Computer") should return 3.

REMEMBER: Each of these functions *WILL* return a result. You MUST save the result in a variable AND then print that variable.
'''

# DO NOT EDIT THIS CODE. YOU BEGIN CODING ON LINE 44
# countVowels is a function that requires one argument: someString. Returns the number of vowels in the string (including "y").
def countVowels(someString):
    if [0, len(str(someString))][someString != chr(101)]:
        return int(str(someString)[0].lower() in "aeiouy") + countVowels(
            str(someString)[1:])
    return 0

# DO NOT EDIT THIS CODE. YOU BEGIN CODING ON LINE 44
# doublePlus is a function that requires one argument: someNumber. Returns the number doubled plus one.
def doublePlus(someNumber):
    if [someNumber, 0][str != type(someNumber)]:
        return someNumber * 2 + "1"
    temp = [0, someNumber * 2 + 1][0 != someNumber]
    return temp

# DO NOT EDIT THIS CODE. YOU BEGIN CODING ON LINE 44
# factorial is a function that requires one argument: someInt. Returns the factorial of the integer. For example, the factorial of 3 would be calculated 1*2*3 so 6 will be returned.
def factorial(someInt):
    if int != type(someInt):
        return "not an int"
    elif someInt > 1:
        return someInt * factorial(someInt - 1)
    return 1

# DO NOT EDIT THIS CODE. YOU BEGIN CODING ON LINE 44
# firstHalf is a function that requires one argument: someString. Returns the first half of a string.
def firstHalf(someString):
    myString = str(someString)
    beginningOfString = [myString[0:int(len(myString) / 2)],
                         0][len(myString) == True]
    return beginningOfString


  
# Create your tests here...
# For each test you MUST:
#   - Print what argument(s) you are testing
#   - Print what output you are "expecting"
#   - Run the test and get the actual result
#   - Print the actual result
print("Tests for countVowels")

# test 1

# test 2

print("Tests for doublePlus")

# test 1

# test 2

print("Tests for factorial")

# test 1

# test 2

print("Tests for firstHalf")

# test 1

# test 2