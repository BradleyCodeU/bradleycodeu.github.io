import random

print("Python Tracing Loop Practice Generator")
while True:

    result = "\nWhat "
    result += random.choice(
        ["will", "does", "would", "might", "number will", "number does"]) + " "
    result += random.choice([
        "this code", "the following", "the following code",
        "the following program", "this", "this program", "this algorithm"
    ]) + " "
    result += random.choice(
        ["print", "display", "output", "produce", "end up showing"])
    result += "?\n\n"
    varUpStr = random.choice([
        'ant', 'bat', 'cat', 'dog', 'act', 'bed', 'cab', 'dad', 'add', 'bad',
        'bag', 'cap', 'car', 'cut', 'day', 'aid', 'bid', 'big', 'cad', 'cod',
        'dab', 'boo'
    ])
    varDownStr = random.choice([
        'fan', 'gap', 'hot', 'jam', 'fit', 'goo', 'hat', 'jaw', 'fig', 'hog',
        'jog', 'fun', 'gym', 'hay', 'job', 'foo', 'mom', 'nom'
    ])

    #print line 01 assignment
    varUpValue = random.randint(-2, 5)
    result += varUpStr + " = " + str(varUpValue) + "\n"
    #print line 02 assignment
    varDownValue = random.randint(5, 13)
    result += varDownStr + " = " + str(varDownValue) + "\n"

    #pick the mid-loop modifiers
    varUpModifier = random.randint(1, 3)
    varDownModifier = random.randint(1, 3)

    #pick a loop type
    loopType = random.randint(1, 3)
    if loopType == 1:
        for i in range(5):
            varUpValue += varUpModifier
            varDownValue -= varDownModifier
        result += "for i in range(5):\n"
    elif loopType == 2:
        while varUpValue < 5:
            varUpValue += varUpModifier
            varDownValue -= varDownModifier
        result += "while " + varUpStr + " < 5:\n"
    elif loopType == 3:
        while varDownValue > 5:
            varUpValue += varUpModifier
            varDownValue -= varDownModifier
        result += "while " + varDownStr + " > 5:\n"
    result += "    " + varUpStr + " += " + str(varUpModifier) + "\n"
    result += "    " + varDownStr + " -= " + str(varDownModifier) + "\n"

    #pick the final result modifier
    resultModifier = random.randint(1, 4)

    #do the result modifier
    if resultModifier == 1:
        resultValue = str(varUpValue) + str(varDownValue)
        result += "result = str(" + varUpStr + ") + str(" + varDownStr + ")\n"
    elif resultModifier == 2:
        resultValue = varUpValue + varDownValue * 2
        result += "result = " + varUpStr + " + " + varDownStr + " * 2\n"
    elif resultModifier == 3:
        resultValue = varDownValue + varUpValue * 2
        result += "result = " + varDownStr + " + " + varUpStr + " * 2\n"
    elif resultModifier == 4:
        resultValue = 2 + varUpValue * varDownValue
        result += "result = 2 + " + varUpStr + " * " + varDownStr + "\n"

    #print the print statement
    result += "print(result)"
    print(result)
    input("\nPress enter to reveal the answer...")
    print(resultValue)
    if input("Enter=continue, q=quit:") == "q":
        break
