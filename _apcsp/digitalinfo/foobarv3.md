---
layout: project
category: digitalinfo
title: Text Games Foobar v3
---
In this version we are adding NPCs (non-player characters) that you can talk to and trade items with.

- Add MORE rooms (group of 3 = 27 total rooms, group of 4 = 36 total rooms). Each of these rooms must have a unique description. NOT just "you're in a room".

[Download or copy/paste](/apcsp\digitalinfo\npc.py) this code into a new file, npc.py

This file must be in the same location (same folder) as your project. Add `from npc import *` at the top of your game

- Notice that the first function tradeItem is incomplete. You MUST complete it.

- Create characters (group of 3 = 2 characters, group of 4 = 3 characters). Characters could be humans, robots, phone calls, talking animals, ghosts/mythical creatures, etc. Whatever makes sense for your story.

- Each character is a dictionary that MUST HAVE 12 or more key/value pairs. All characters MUST have the keys name, want, trade, hello, bye, default or it will crash. The OTHER SIX keywords are up to you, but they should make sense for the story/place/character. Notice that the spelling/capitalization of the items that the character wants and trades is important.
```
dan = {
    'name': 'Cowboy Dan',
    'want': '25 cents',
    'trade': 'gold key',
    'hello': 'Howdy there',
    'bye': 'See ya later',
    'default': 'Hot enough for ya?',
}
```
In this example, the keys are keywords and the values are responses. Say the word 'name' (or text that contains the word 'name') and the character will respond with 'Cowboy Dan'

- Create an array called npcArray and fill it with False 999 times. Then put your characters in the correct rooms like this, `npcArray[103] = dan`

- In the main loop after you print the room description and "Please type: n, s, e, w, or quit"... if npcArray[location] is not false, print "There is someone here. Type hello to talk:"

- If the userInput equals hello and npcArray[location] is not false
   * Call the talkTo function. Pass npcArray[location] and your inventory as arguments.
-  Otherwise
   * (You should already have this code) Call the move function and pass the arguments userInput, location and save what it returns in location


Test your NPCs like this:
```
>>> talkTo(dan,[])
  Cowboy Dan: "Howdy there"
  Type a question, give item, or bye:
give me the key
  "me the key?! That's not what I want!"
  "You don't have 25 cents"
  "Give me 25 cents & I'll give you gold key"
  "Hot enough for ya?"
  Type a question, give item, or bye:
bye-bye cowboy dan
  "See ya later"
>>>
```

You should also test giving the NPC what they want:
```
>>> testInv = ["zebra","25 cents","banana"]
>>> talkTo(dan,testInv)
  Cowboy Dan: "Howdy there"
  Type a question, give item, or bye:
give 25 cents
You give Cowboy Dan 25 cents and get gold key
  "Thanks"
  Type a question, give item, or bye:
good-bye
  "See ya later"
>>> testInv
["zebra","banana","gold key"]
```
