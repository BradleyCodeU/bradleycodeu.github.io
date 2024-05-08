#logicOperatorGenerator
from random import *

while True:
    outputString = "("

    if random() >= 0.5:
        outputString += "True "
    else:
        outputString += "False "

    if random() >= 0.5:
        outputString += "and "
    else:
        outputString += "or "

    if random() >= 0.5:
        outputString += "not "
    else:
        outputString += ""

    if random() >= 0.5:
        outputString += "True"
    else:
        outputString += "False"

    outputString += ") "

    if random() >= 0.5:
        outputString += "and "
    else:
        outputString += "or "

    if random() >= 0.5:
        outputString += "not "
    else:
        outputString += ""

    if random() >= 0.5:
        outputString += "True "
    else:
        outputString += "False"

    print(outputString)
    input("Press enter to reveal the answer...")
    print("Answer: "+str(eval(outputString)))
    if random() >= 0.5:
        answer = input("Press enter to continue with another Truth Table question OR type q to quit: ")
    else:
        answer = input("Ready for the next Truth Table question? Enter to continue OR type q to quit: ")
    print(" ")
    if answer == "q":
        break
