---
layout: project
category: objects
title: Chatbots
permalink: /apcsp/objects/chatbots/
---
# Chatbots

Read this w3schools tutorial about [Python dictionaries](https://www.w3schools.com/python/python_dictionaries.asp). Notice that dictionary items are presented in key/value pairs. Here is also a [realpython.com tutorial](https://realpython.com/python-dicts/)

For this assignment you will create two or more chatbots that respond to keywords. Each chatbot will be a separate dictionary. Each keyword is a key in the dictionary. Each value is the chatbot's response to the keyword.

For example, you might add the keyword "game" by creating the follow key/value pair:
```
'game':'My favorite game is Foobar The Bazbarian.',
```

The starter template has been provided. Type `talkTo(dan)` in the console to see the demo.


REQUIREMENTS:
  - Create 2 dictionary-based chatbots with 8 key/value pairs each (if you are working with a partner then create 4 chatbots)
  - Create a main() function that will...
    - Ask the player who they want to chat with. For example, "Who would you like to chat with? 0 = amandaBot, 1 = Thomas Edison, 2 = Pac-Man, 3 = Pirate Ghost"
    - Collect the player input and check if it is a valid integer. Use try-except so that it doesn't crash.
    - Based on the player input, call the talkTo() function and pass the variable name of the dictionary as an argument. For example, talkTo(amandaBot) or maybe talkTo(myArray[userinput])



Copy/paste the starter code from the [starter template](https://repl.it/@JustinRiley1/Chatbot-starter-template). Type talkTo(dan) in the console to see the demo.
