---
layout: project
category: objects
title: Chatbots
permalink: /apcsp/objects/chatbots/
---
Read this w3schools tutorial about [Python dictionaries](https://www.w3schools.com/python/python_dictionaries.asp). Notice that dictionary items are presented in key/value pairs. Here is also a [realpython.com tutorial](https://realpython.com/python-dicts/)

For this assignment you will create two or more chatbots that respond to keywords. Each chatbot will be a separate dictionary. Each keyword is a key in the dictionary. Each value is the chatbot's response to the keyword.

For example, you might add the keyword "game" by creating the follow key/value pair:
```
'game':'My favorite game is Foobar The Bazbarian.',
```

REQUIREMENTS:
  - Either...
    - Create two dictionary-based chatbots with 12 key/value pairs each
    - Create three dictionary-based chatbots with 8 key/value pairs each
  - Create a main() function that will...
    - Ask the player who they want to chat with. For example, "Who would you like to chat with? 1 = amandaBot 2 = Thomas Edison 3 = Pac-Man"
    - Collect the player input
    - Based on the player input, call the talkTo() function and pass the variable name of the chatbot as an argument. For example, talkTo(amandaBot)

Copy/paste the starter code from the [starter template](https://repl.it/@JustinRiley1/Chatbot-starter-template). Type talkTo(dan) in the console to see the demo.
