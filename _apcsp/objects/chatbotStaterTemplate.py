import time
import sys

# Type talkTo(dan) in the console to see the demo.

dan = {
  'name': 'Cowboy Dan',
  'want': 'I want to find my missing hat',
  'trade': 'I\'ll trade you a pair of boots',
  'hello': 'Howdy there',
  'bye': 'See ya later',
  'default': 'Hot enough for ya?',
}

def typewriter(text):
    for char in text:
        time.sleep(0.05)
        sys.stdout.write(char)
        sys.stdout.flush()

def talkSearch(someChatbot,userInput):
    found = False
    output = '\n   \"'
    if 'name' in someChatbot:
      output = '\n   ' + someChatbot['name'] + ': \"'
    for key in someChatbot:
        if key in userInput.lower():
            if found:
                output += ', '
            output += someChatbot[key]
            found = True
    if not found and 'default' in someChatbot:
        output += someChatbot['default']
    return output + '\"\n'

def talkTo(someChatbot):
    output = talkSearch(someChatbot, "hello")
    while True:
        typewriter(output)
        print('\nType a question or bye:')
        userInput = input('>>> ')
        output = talkSearch(someChatbot, userInput)
        if 'bye' in userInput.lower():
            typewriter(output)
            break
