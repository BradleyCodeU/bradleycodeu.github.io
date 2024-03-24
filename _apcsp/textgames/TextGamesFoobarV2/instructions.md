---
layout: project
category: digitalinfo
title: Text Games Foobar v2
---

Copy/paste your code from Foobar v1.

## Does Item Exist

Define a function named doesItemExist that requires 2 arguments: roomArray, roomNumber. If doesRoomExist(roomArray,roomNumber) is False then return False. Otherwise if roomArray[roomNumber]['item'] does not equal None then return True. Otherwise return False.

Update the main function so that it only say "Item here: " and the item's name if an item exists in this room.

| Input | Expected Output |
|-------|-----------------|
|roomArray1 = [{'name':'Basement', 'item':'Key'}, None]<br>doesItemExist(roomArray1, 0) | True|
|roomArray2 = [{'name':'Basement', 'item':None}, None]<br>doesItemExist(roomArray2, 0) | False|



## Take Item

Create an array named backpack to store the player's inventory.

Define a function named takeItem() that requires 3 arguments: roomArray, roomNumber, backpackArray. If the roomArray[roomNumber][item] is equal to None, then just return the backpackArray. Otherwise, append the roomArray[roomNumber][item] to the player's backpackArray. Next, set the roomArray[roomNumber][item] equal to None. Returns the backpackArray.

Update the main() function in 3 places...

  - After printing the room description, print the player's inventory.

  - Update the line that says "Type n,s,e,w or quit" so that it includes "take"

  - If the userInput equals "take", then call the takeItem() function with all the required arguments.


| Input | Expected Output |
|-------|-----------------|
| # test picking up item with empty backpack<br>roomArray = [{'item': 'staff'}, {'item': 'sword'}, {'item': 'arrows'}]<br>roomNumber = 1<br>backpackArray = [ ]<br>takeItem(roomArray,roomNumber,backpackArray) | ['sword'] |
| # test picking up item with non-empty pack<br>roomArray = [{'item': 'staff'}, {'item': 'dagger'}, {'item': 'arrows'}]<br>roomNumber = 0<br>backpackArray = ['sword']<br>takeItem(roomArray,roomNumber,backpackArray) | ['sword','staff'] |
| # test that item is removed from room<br>roomArray = [{'item': 'staff'}, {'item': 'sword'}, {'item': 'arrows'}]<br>roomNumber = 1<br>backpackArray = [ ]<br>takeItem(roomArray,roomNumber,backpackArray) | roomArray[1]['item'] is None |
| # test pick up nothing with empty backpack<br>roomArray = [{'item': None}, {'item': None}, {'item': None}]<br>roomNumber = 2<br>backpackArray = [ ]<br>takeItem(roomArray,roomNumber,backpackArray) | [ ] |
| # test pick up nothing with non-empty pack<br>roomArray = [{'item': None}, {'item': None}, {'item': None}]<br>roomNumber = 2<br>backpackArray = ['map', 'compass']<br>takeItem(roomArray,roomNumber,backpackArray) | ['map', 'compass'] |

## ASCII Art

Visit [this site](http://patorjk.com/software/taag/#p=display&f=ANSI%20Shadow&t=Game%20Title) to get an ASCII art version of your game title. Notice that you can change the "font" to something else like Bulbhead, Doom, or Ogre. Some of the fonts might make the text too big, so pick one that fits.

## More Rooms

Add more rooms! If you are a group of 3, complete 18 total rooms. If you are a group of 4, complete 24 total rooms. Each of these rooms must have a unique description, NOT just "you're in a room". Have 2 or more items for each person in your group.



## The Map Class

[Copy/Paste this map class](https://raw.githubusercontent.com/ohiofi/Python-map/master/map.py) into a new file, map.py

The map.py file must be in the same location (same folder) as your project.

Follow the directions at the top of the map.py file in order to add a map to your game.



## Special Rooms

Create a function called checkIfSpecialRoom. Requires no arguments. Returns nothing.

In this version you will add "special rooms" which can be locked/unlocked, have battles, or other mini-games.

Add 3 or more special rooms. Could be:
  - a battle with an enemy
  - a high-low number guessing game (to open a combination lock, for example)
  - a fill-in-the-blank quiz game (to figure out a computer password, for example)
  - a locked room that is unlocked if the player has the key. Locked rooms are set to None at first, but if you are standing next to them and have a key, then the room gets a description. Look at the example below.

Create a function called checkIfSpecialRoom that redirects the player if they are in one of these locations:
```
def checkIfSpecialRoom(location, roomArray, backpackArray, isQuizCompleted, isBossDead):

  # NOTICE you unlock room 403 FROM room 303
  if location == 303:
    if "gold key" in backpackArray:
      print("You use a gold key to unlock a door")
      # NOTICE key works automatically
      roomArray[403] = makeRoom("Secret Hallway")
      roomArray[403]['description'] = "The unlocked door leads into a small, dark hallway"
    if "gold key" not in backpackArray:
      print("The room to the east is locked. You need a key.")
      roomArray[403] = None

  if location == 406 and isQuizCompleted == False:
    susansQuizGame()
    isQuizCompleted = True

  if location == 505 and isBossDead == False:
    adamsBossBattle()
    isBossDead = True



```
Call the checkIfSpecialRoom function in the main function right after move. This way, as soon as you step into a special room it puts you into a mini-game.

## Full List of Requirements

You will be graded on the following requirements:

1. Must have doesItemExist function that returns true or false.
1. Must only say "Item here: " and the item's name if an item exists in this room.
1. Must be able to collect an item (using "take"), place the item in the player's inventory/backpack, ```AND remove the item from the room```.
1. Must use the [Map class](https://raw.githubusercontent.com/ohiofi/Python-map/master/map.py) to draw a map for your game (hide or show the items is up to you).
1. Visit [this site](http://patorjk.com/software/taag/#p=display&f=ANSI%20Shadow&t=Game%20Title) to get an ASCII art version of your game title. Notice that you can change the "font" to something else like Bulbhead, Doom, or Ogre. Some of the fonts might make the text too big, so pick one that fits.
1. MORE rooms (group of 3 = 18 total rooms, group of 4 = 24 total rooms). Each of these rooms must have a unique description. NOT just "you're in a room". Have 2 or more items for each person in your group.
1. Print the room description, any item in the room, any items in the player's inventory/backpack, and the possible commands that the player can type such as "take" (if there is an item in this room).

1. Must have 3 or 4 mini-games (1 per person in your group) which could be locked room, boss battle, quiz game, etc.
1. Must be able to change locations and give a message like "You can't go there" when necessary.
1. Must have a break in your while loop so that game ends if the user types "quit", loses the game, or wins the game.

``` Turn in the URL for your finished game. ```
