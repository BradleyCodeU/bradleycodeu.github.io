import time
import sys

dan = {
    'name': 'Cowboy Dan',
    'want': '25 cents',
    'trade': 'gold key',
    'hello': 'Howdy there',
    'bye': 'See ya later',
    'default': 'Hot enough for ya?',
}

def tradeItems(thisNpc,userInventory):
    # create a temporary variable and put what thisNpc wants in the variable
    # remove what thisNpc wants from userInventory
    # add thisNpc's trade to userInventory
    # print You give thisNpc name thisNpc wants and got thisNpc trade
    return

def talkTo(thisNpc,userInventory):
    output = '  ' + thisNpc['name'] + ': \"' + thisNpc['hello'] + '\"'
    while True:
        typewriter(output)
        print('\n  Type a question, give item, or bye:')
        userInput = input()
        if canTrade(thisNpc,userInput,userInventory):
            tradeItems(thisNpc,userInventory)
            output = '  \"Thanks\"'
            continue
        output = talkSearch(thisNpc, userInput)
        if 'bye' in userInput.lower():
            typewriter(output)
            return

def talkSearch(thisNpc,userInput):
    found,output = False,""
    for key in thisNpc:
        if key in userInput.lower():
            output += '  \"' + thisNpc[key] + '\"'
            found = True
    if not found:
        output = '  \"' + thisNpc['default'] + '\"'
    return output

def typewriter(text):
    for char in text:
        time.sleep(0.04)
        sys.stdout.write(char)
        sys.stdout.flush()

def canTrade(thisNpc,userInput,userInventory):
    if 'give ' in userInput.lower() and thisNpc['want'] in userInput.lower() and thisNpc['want'] in userInventory:
        return True
    if 'give ' in userInput.lower() and thisNpc['want'] not in userInput.lower():
        typewriter('  \"'+userInput[userInput.find('give ')+5:]+'?! ')
        typewriter('That\'s not what I want!\"\n')
    if 'give ' in userInput.lower() and thisNpc['want'] not in userInventory:
        typewriter('  \"You don\'t have '+thisNpc['want']+'\"\n')
    if 'give ' in userInput.lower():
        typewriter('  \"Give me '+thisNpc['want']+' & ')
        typewriter('I\'ll give you '+thisNpc['trade']+'\"\n')
    return False

