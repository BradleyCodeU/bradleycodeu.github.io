# Fill in ALL 15 blanks with the correct code.
# Blanks look like this: ???

def double(number):
    # Function to double the input number
    number = ???
    return number

def plusTen(number):
    # Function to add 10 to the input number
    number = ???
    return number

def halve(number):
    # Function to halve the input number
    number = ???
    return number

def magicTrick():
    # REMINDER: All your code MUST be indented by 4 spaces
    # Use the print function to say "Hello World"
    print( ??? )
    # Create variable named magicNumber & set it to ANY number you like
    ???
    # Print the variable magicNumber. I will do this step for you
    print(magicNumber)
    # Create variable named stepOne & set it to double(magicNumber)
    ??? = double(magicNumber)
    # Print the variable stepOne
    ???
    # Create variable named stepTwo & set it to plusTen(stepOne)
    stepTwo = ???
    # Print the variable stepTwo
    ???
    # Create variable named stepThree & set it to halve(stepTwo)
    ???
    # Print the variable stepThree
    ???
    # Create variable named stepFour & set it to stepThree minus magicNumber
    ???
    # Print "The next number should be 5.0"
    ???
    # Print the variable stepFour
    ???
    # use the str() function to convert the stepFour variable to a String
    stepFour = ???(stepFour)
    # YOU SHOULD BE DONE! Press the Run button. If no errors, then Submit
    return stepFour

result = magicTrick()
print("\nExpected : 5.0 \nYour code: " + result)
