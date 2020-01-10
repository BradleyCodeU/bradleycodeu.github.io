---
layout: project
category: digitalinfo
title: Text Games Foobar v1
---

Create your own text game based on Foobar The Bazbarian

You will be graded on the following requirements:

* Figure out a story and title for your game
* Group of 3 = 12 rooms, 6 items
* Group of 4 = 16 rooms, 8 items
* Each of these rooms must have a unique description. NOT just "you're in a room"
* An item is something that the player can pick up like a new weapon, a health pack, coins, a potion, some food, a fidget-spinner, etc.
* Create an array named roomArray will store room descriptions
* Create a different array named itemArray that will store items that you can pick up
* Create a for loop that repeats 999 times and appends false to these arrays 999 times
* Add descriptions for your 12 or 16 rooms to your roomArray
* Add 6 or 8 items to your itemArray
* In v1, the player does NOT need to be able to pick up the item, but when visiting a room the game should tell you that the item is there.
* Must be able to change locations and give a message like "You can't go there" when necessary.

Define a function called doesRoomExist that requires one argument: roomNumber. If roomArray index roomNumber is false then say "You can't go there" and then return false. Otherwise return true.

Define a function called move that requires two arguments: userInput, location.
  - If the userInput was "n" and doesRoomExist at the location - 1
    - location = location - 1
  - Otherwise if the userInput was "s" and doesRoomExist at the location + 1
    - location = location + 1
  - Otherwise if the userInput was "e" and figure this part out yourself
    - figure this part out yourself
  - Otherwise if the userInput was "w" and figure this part out yourself
    - figure this part out yourself
  - return location

Define a function called main.
  - Create a variable called location and set it to the starting room number
  - Say the title of your game
  - Say by your names
  - Sleep for 1 sec
  - Create a forever loop
    - Say the room description for the location
    - Say "Please type: n, s, e, w, or quit"
    - Save the input in a variable called userInput
    - Call the move function and pass the arguments userInput, location and save what it returns in location
