---
layout: project
category: objects
title: Objects Foobar Game
---


Working as team, create your own text game based on Foobar The Bazbarian [https://foobargame.glitch.me/](https://foobargame.glitch.me/)

Start by figuring out a story/theme/setting and title for your game

Plan a map on a grid. It might be a maze-like dungeon or a large open island or a house with rooms and hallways. You will plan a dozen blocks of the grid. We will call these blocks "rooms." Each of these rooms must have a unique description, NOT just "you're in a room"

|    |    |    |    |
|----|----|----|----|
|   0|   1|   2|   3|
| 100| 101| 102| 103|
| 200| 201| 202| 203|
| 300| 301| 302| 303|

REQUIREMENTS:

  * Group of 2 = 8 rooms, at least 4 items
  * Group of 3 = 12 rooms, at least 6 items
  * Group of 4 = 16 rooms, at least 8 items
  * An item is something that the player can pick up like a new weapon, a health pack, coins, a potion, some food, a fidget-spinner, etc.
  * Create a Room class. Each Room object has:
    - a name
    - a description
    - an item (but the item might be set to ```undefined``` if there is no item in this room)
    - 3 or 4 other attributes (based on how many members in your group)
  * Create an array named roomArray that stores the room objects
  * Add descriptions for your 8-16 rooms to your roomArray
  * In v1, the player does NOT need to be able to pick up any items, but when visiting a room the game MUST tell you that an item is there IF the room contains an item.
  * Create a variable named mylocation that stores the current room number. NOTE that "location" is NOT a good variable name because [it will re-direct the page](https://www.w3schools.com/jsref/obj_location.asp)
  * Must be able to change rooms and give a message like "You can't go there" when necessary.


Define a function named doesRoomExist that requires one argument: roomNumber. If roomArray index roomNumber is undefined then say "You can't go there" and return false. Otherwise return true.


Define a function named move that requires one argument: direction.

    - If the direction was "n" and doesRoomExist at mylocation - 100
        - mylocation = mylocation - 100
    - Otherwise if the direction was "s" and doesRoomExist at  mylocation + 100
        - mylocation = mylocation + figure this part out yourself
    - Otherwise if the direction was "e" and doesRoomExist at  mylocation + 1
        - figure this part out yourself
    - Otherwise if the direction was "w" and figure this part out yourself
        - figure this part out yourself
    - use Document.getElementById() to display the description for mylocation


Create 4 buttons that say North, South, East, and West. When clicked, these buttons call the move function.

  