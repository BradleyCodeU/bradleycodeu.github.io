---
layout: project
category: digitalinfo
title: Text Games Foobar v1
---

Create your own text game based on Foobar The Bazbarian

Working as a group, figure out a story/theme/setting and title for your game

You will be graded on the following requirements:
* Group of 3 = 12 rooms, 6 items
* Group of 4 = 16 rooms, 8 items
* Each of these rooms must have a unique description. NOT just "you're in a room"
* An item is something that the player can pick up like a new weapon, a health pack, coins, a potion, some food, a fidget-spinner, etc.
* Create an array named roomArray that will store room descriptions
* Create another array named itemArray that will store items that you can pick up
* Create a for loop that repeats 999 times and appends false to both arrays 999 times
* Add descriptions for your 12 or 16 rooms to your roomArray. For example, if room 107 is the kitchen the you would write ``` roomArray[107] = "You are in the kitchen. There are a bunch of dirty dishes in the sink." ```
* Add 6 or 8 items to your itemArray. For example, if there is a knife in the kitchen the you would write ``` itemArray[107] = "Knife" ``` Notice that you should NOT mention the item in the room description, because later the knife might not be in the room.
* In v1, the player does NOT need to be able to pick up any items, but when visiting a room the game MUST tell you that an item is there IF the room contains an item.
* In v1, you must be able to change locations and give a message like "You can't go there" when necessary.

Define a function named doesRoomExist that requires one argument: roomNumber. If roomArray index roomNumber is false then say "You can't go there" and return false. Otherwise return true. Use try except when you check the room because you could get an "index out of range error." If you get an error, then say "You can't go there" and return false.

Define a function named doesItemExist that requires one argument: roomNumber. Use try except to avoid getting an "index out of range error." Returns True if there is an item in the room or False if not.

Define a function named move that requires two arguments: userInput, location.
  - If the userInput was "n" and call doesRoomExist with the argument location - 1
    - location = location - 1
  - Otherwise if the userInput was "s" and doesRoomExist at the location + 1
    - location = location + 1
  - Otherwise if the userInput was "e" and figure this part out yourself
    - figure this part out yourself
  - Otherwise if the userInput was "w" and figure this part out yourself
    - figure this part out yourself
  - return location

Define a function named main.
  - Create a variable named location and set it to the starting room number
  - Say the title of your game
  - Say "Created By: " and then your names
  - Sleep for 1 sec
  - Create a forever loop
    - Say the room description for the location
    - If doesItemExist equals true, then say "Item here: " and the item name
    - Say "Please type: n, s, e, w, or quit"
    - Save the input in a variable named userInput
    - Call the move function and pass two arguments userInput and location, then save what it returns in location
