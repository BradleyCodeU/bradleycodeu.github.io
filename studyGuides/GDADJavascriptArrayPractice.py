from random import *
print("Javascript Array Practice Generator")
while True:
    indexOne = 0
    indexTwo = 0
    indexThree = 0
    result="\nWhat "
    result+=choice(["will","does","would","might","number will","number does"])+" "
    result+=choice(["this code","the following","the following code","the following program","this","this program","this algorithm"])+" "
    result+=choice(["print","display","output","produce","end up showing"])
    result+="?\n\n"
    varA = choice(["nums","myList","myArr","myNums","nmbrs","numLst","numbList","NmbrLst","ListA","List"+str(randint(1,9))])
    varB = choice(["index","item","idNum","position","val","location","loc","pos","counter","address","foo"])

    ml=[randint(0,2)+randint(0,2)]
    for i in range(randint(4,7)):
        ml.append(randint(0,len(ml)+2))
    shuffle(ml)
    #print line 01 the array
    result+="let "+varA+" = "+str(ml)+";\n"
    #print line 02 the final index
    result+="let "+varB+" = "
    indexOne = randint(0,len(ml)-1)
    indexTwo = randint(0,len(ml)-1)
    if randint(0,2):
        if randint(0,1):
            while ml[indexOne] + ml[indexTwo] > len(ml):
              indexOne = randint(0,len(ml)-1)
              indexTwo = randint(0,len(ml)-1)
            result+=varA+"["+str(indexOne)+"] "
            result+="+"
            indexThree = ml[indexOne] + ml[indexTwo]
        else:
            while indexOne == indexTwo:
              indexOne = randint(0,len(ml)-1)
              indexTwo = randint(0,len(ml)-1)
            result+=varA+"["+str(indexOne)+"] "
            result+="-"
            indexThree = ml[indexOne] - ml[indexTwo]
        result+=" "+varA+"["+str(indexTwo)+"];"
    else:
        result+=""+varA+".length -"
        result+=" "+varA+"["+str(indexTwo)+"];"
        indexThree = len(ml) - ml[indexTwo]
    #print line 03 the print statement
    result+="\nalert("+varA+"["+varB+"]);"
    print(result)
    input("\nPress enter to reveal the answer...")
    if indexThree >= 0:
      try:
        print(ml[indexThree])
      except:
        print("undefined")
    else:
      print("undefined")
    if input("Enter=continue, q=quit:") == "q":
        break
