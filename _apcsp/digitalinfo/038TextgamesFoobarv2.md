---
layout: project
category: digitalinfo
title: Text Games Foobar v2
---

[Copy/Paste this map class](https://raw.githubusercontent.com/ohiofi/Python-map/master/map.py) into a new file, map.py

The map.py file must be in the same location (same folder) as your project.

In this version you will add "special rooms" which can be locked/unlocked, have battles, or other mini-games.

Add 1 or more locked rooms. They are unlocked if the player has the key. Locked rooms are set to false at first, but if you are standing next to them and have a key, then the room gets a description.

Add 3 or 4 mini-games (1 per person in your group). A mini-game could be:
  - a battle with an enemy
  - a high-low number guessing game (to open a combination lock, for example)
  - a fill-in-the-blank quiz game (to figure out a computer password, for example)

I recommend creating a function called checkIfSpecialRoom that redirects the player if they are in one of these locations:
```
def checkIfSpecialRoom(location, roomArray, inventory, isQuizCompleted, isBossDead):
  if location == 6 and isQuizCompleted == False:
    susansQuizGame()
  if location == 105 and isBossDead == False:
    adamsBossBattle()
  # NOTICE you unlock room 303 FROM room 304
  if location == 304:
    if "gold key" in inventory:
      print("You use the gold key to unlock the door.")
      roomArray[303] = "The unlocked door leads into a small, dark hallway"
    if "gold key" not in inventory:
      print("The room to the north is locked. You need a key.")
      roomArray[303] = False



```
Call the checkIfSpecialRoom function in the main function right after move. This way, as soon as you step into a special room it puts you into a mini-game.

You will be graded on the following requirements:

1. Visit [this site](http://patorjk.com/software/taag/#p=display&f=ANSI%20Shadow&t=Game%20Title) to get an ASCII art version of your title. Notice that you can change the "font" to something else like Bulbhead, Doom, or Ogre. Some of the fonts might make the text too big, so pick one that fits.
1. MORE rooms (group of 3 = 21 total rooms, group of 4 = 28 total rooms). Each of these rooms must have a unique description. NOT just "you're in a room". Have 2 or more items for each person in your group.
1. Must have 1 or more locked rooms.
1. Must have 3 or 4 mini-games (1 per person in your group).
1. Must use the [Map class](https://raw.githubusercontent.com/ohiofi/Python-map/master/map.py) to draw a map for your game (hide or show the items is up to you).
1. Print the room description, any item in the room, any items in the player's inventory/backpack, and the possible commands that the player can type such as "take" (if there is an item in this room) or "use key" (if the player has a key).
1. Must be able to change locations and give a message like "You can't go there" when necessary.
1. Must be able to collect an item (using "take"), place the item in the player's inventory/backpack, ```AND remove the item from the room```.
1. Must have a break in your while loop so that game ends if the user types "quit", loses the game, or wins the game.

``` Put your finished game on Trinket.io along with the map.py class. Turn in the URL for your finished game. ```
