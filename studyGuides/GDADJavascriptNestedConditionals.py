# nestedConditionalsGenerator v2020.01.16
# by Justin Riley
from random import *

print("Javascript Nested Conditionals Generator")

def logicalOperator():
    b = random()
    if b < 1/6:
        return "> "
    elif b < 2/6:
        return "< "
    elif b < 3/6:
        return "<= "
    elif b < 4/6:
        return ">= "
    elif b < 5/6:
        return "!= "
    else:
        return "== "

while True:
    print(" ")
    variableString = "let value = "
    myvar = str(randint(0,20))
    variableString += str(myvar)
    print(variableString +";")
    outputString = ""
    outputString += "if (value "
    logicOp1 = logicalOperator()
    outputString += logicOp1
    value1 = str(randint(5,15))
    outputString += str(value1) + "){\n"
    outputString += "  if (value "
    logicOp2 = logicalOperator()
    outputString += logicOp2
    value2 = str(randint(5,15))
    outputString += str(value2) + "){\n    alert('apple');\n"
    outputString += "  } else {\n    alert('banana');\n  }\n"
    outputString += "} else {\n"
    outputString += "  if (value "
    logicOp3 = logicalOperator()
    outputString += logicOp3
    value3 = str(randint(5,15))
    outputString += str(value3) + "){\n    alert('coconut');\n"
    outputString += "  } else {\n    alert('dragonfruit');\n  }\n}\n"
    if eval(myvar+" "+logicOp1+value1):
        if eval(myvar+" "+logicOp2+value2):
            result = 'apple'
        else:
            result = 'banana'
    else:
        if eval(myvar+" "+logicOp3+value3):
            result = 'coconut'
        else:
            result = 'dragonfruit'

    print(outputString)
    input("Press enter to reveal the answer...")
    print("Answer: "+str(result))
    if random() >= 0.5:
        answer = input("Press enter to continue OR type q to quit: ")
    else:
        answer = input("Ready for the next question? Enter to continue OR type q to quit: ")
    print(" ")
    if answer == "q":
        break
