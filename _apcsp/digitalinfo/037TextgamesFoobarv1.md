---
layout: project
category: digitalinfo
title: Text Games Foobar v1
---

# Foobar Game

Working as team, create your own text game based on Foobar The Bazbarian [https://foobargame.glitch.me/](https://foobargame.glitch.me/)

Start by figuring out a story/theme/setting and title for your game

Plan a map on a grid. It might be a maze-like dungeon or a large open island or a house with rooms and hallways. You will plan a dozen blocks of the grid. We will call these blocks "rooms." Each of these rooms must have a unique description, NOT just "you're in a room"

|     |   |   |   |
|---  |---|---|---|
| 0   | 1 | 2 | 3 |
| 100 |101|102|103|
| 200 |201|202|203|
| 300 |301|302|303|

REQUIREMENTS:

  * Group of 3 = 12 rooms, at least 6 items
  * Group of 4 = 16 rooms, at least 8 items
  * An item is something that the player can pick up like a new weapon, a health pack, coins, a potion, some food, a fidget-spinner, etc.
  * Define a function called __makeRoom__ that returns a dictionary. Each room dictionary has:
    - a name
    - a description
    - an item (but the item might be set to ```None``` if there is no item in this room)
    - 3 or 4 other attributes (based on how many members in your group)
  * Create an array named roomArray that stores your room objects
  * Use a for loop to add `None` to the array 1000 times
  * Add descriptions for your 15 rooms to your roomArray
  * In version 1, the player does NOT need to be able to pick up any items, but when visiting a room the game MUST tell you that an item is there IF the room contains an item.
  * Create a variable named mylocation that stores the current room number.
  * Must be able to change rooms and give a message like "You can't go there" when necessary.


Define a function named __doesRoomExist__ that requires 2 arguments: roomArray, roomNumber. If roomArray index roomNumber is None then say "You can't go there" and return False. Otherwise return True.

Define a function named __doesItemExist__ that requires 2 arguments: roomArray, roomNumber. If doesRoomExist(roomArray,roomNumber) is False then return False. Otherwise if `roomArray[roomNumber]['item']` does not equal None then return True. Otherwise return False.


Define a function named __move__ that requires 3 argument: roomArray, mylocation, direction. Returns an int, mylocation.

    - If the direction was "n" and doesRoomExist at the mylocation - 100
        - mylocation = mylocation - 100
    - Otherwise if the direction was "s" and doesRoomExist at the mylocation + 100
        - mylocation = mylocation + figure this part out yourself
    - Otherwise if the direction was "e" and doesRoomExist at the mylocation + 1
        - figure this part out yourself
    - Otherwise if the direction was "w" and figure this part out yourself
        - figure this part out yourself
    - return mylocation


Define a function named main.

- Create a variable named mylocation and set it to the starting room number
- Say the title of your game
- Say "Created By: " and then your names
- Sleep for 1 sec
- Create a forever loop
  - Say the room description for mylocation
  - If doesItemExist equals true, then say "Item here: " and the item name
  - Say "Please type: n, s, e, w, or quit"
  - Save the input in a variable named userInput
  - Call the move function and pass 3 arguments: roomArray, userInput, and mylocation. Save what it returns in mylocation


## Tests

|Input|Expected Output|
|---|---|
|x = makeRoom()<br>type(x) is dict|True|
|roomArray1 = [{'name':'Kitchen'}, None, None]<br>doesRoomExist(roomArray1, 0)|True|
|roomArray1 = [{'name':'Kitchen'}, None, None]<br>doesRoomExist(roomArray1, 2)|False|
|roomArray1 = [{'name':'Kitchen'}, None, None]<br>doesRoomExist(roomArray1, 9999)|False|
|roomArray1 = [{'name':'Basement', 'item':'Key'}, None]<br>doesItemExist(roomArray1, 0)|True|
|roomArray2 = [{'name':'Basement', 'item':None}, None]<br>doesItemExist(roomArray2, 0)|False|
|roomArray2 = [{'name':'Kitchen'}, {'name':'Hallway'}, None]<br>move(roomArray2, mylocation=1, direction="n")|1|
|roomArray2 = [{'name':'Kitchen'}, {'name':'Hallway'}, None]<br>move(roomArray2, mylocation=0, direction="s")|0|
|roomArray2 = [{'name':'Kitchen'}, {'name':'Hallway'}, None]<br>move(roomArray2, mylocation=0, direction="e")|1|
|roomArray2 = [{'name':'Kitchen'}, {'name':'Hallway'}, None]<br>move(roomArray2, mylocation=1, direction="w")|0|


## Starter Template

```

# Define a function called makeRoom that returns a dictionary. Each room dictionary has:
# a name
# a description
# an item (but the item might be set to None if there is no item in this room)
# 3 or 4 other attributes (based on how many members in your group)


# Define a function named doesRoomExist that requires 2 arguments: roomArray, roomNumber. If roomArray index roomNumber is None then say "You can't go there" and return False. Otherwise return True.


# Define a function named doesItemExist that requires 2 arguments: roomArray, roomNumber. If doesRoomExist(roomArray,roomNumber) is False then return False. Otherwise if roomArray[roomNumber] does not equal None then return True. Otherwise return False.


# Define a function named move that requires 3 argument: roomArray, mylocation, direction. Returns an int, mylocation.


# Define a function named main.
# Create a variable named mylocation and set it to the starting room number
# Say the title of your game
# Say "Created By: " and then your names
# Sleep for 1 sec
# Create a forever loop
# # Say the room description for mylocation
# # If doesItemExist equals true, then say "Item here: " and the item name
# # Say "Please type: n, s, e, w, or quit"
# # Save the input in a variable named userInput
# # Call the move function and pass 3 arguments: roomArray, userInput, and mylocation. Save what it returns in mylocation
```
  
