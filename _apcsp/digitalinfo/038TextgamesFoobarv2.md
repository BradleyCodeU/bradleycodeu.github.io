---
layout: project
category: digitalinfo
title: Text Games Foobar v2
---

[Copy/Paste this map class](https://raw.githubusercontent.com/ohiofi/Python-map/master/map.py) into a new file, map.py
This file must be in the same location (same folder) as your project.

You will be graded on the following requirements:

1. Visit [this site](http://patorjk.com/software/taag/#p=display&f=ANSI%20Shadow&t=Game%20Title) to get an ASCII art version of your title. Notice that you can change the "font" to something else like Bulbhead, Doom, or Ogre. Some of the fonts will make the text too big.
1. More rooms (group of 3 = 21 total rooms, group of 4 = 28 total rooms). Each of these rooms must have a unique description. NOT just "you're in a room". Have 2 or more items for each person in your group.
1. Have 1 or more locked doors. They are unlocked if the player has the key in their inventory/backpack and types "use key". Locked doors are just rooms that are set to false at first, but if you are standing next to them a type "use key" then the room gets a description.
1. Have 1 *special room* for each person in your group. A special room could be:
  - a battle with an enemy
  - a high-low number guessing game (to open a combination lock, for example)
  - a fill-in-the-blank quiz game (to figure out a computer password, for example)
1. Must use the Map class to draw a map for your game (hide or show the items is up to you).
1. Print the room description, any item in the room, any items in the player's inventory/backpack, and the possible commands that the player can type such as "take" (if there is an item in this room) or "use key" (if the player has a key).
1. Must be able to change locations and give a message like "You can't go there" when necessary.
1. Must be able to collect an item (using "take"), place the item in the player's inventory/backpack, and remove the item from the room.
1. Must have a break in your while loop so that game ends if the user types "quit", loses the game, or wins the game.

``` Put your finished game on Trinket.io along with the map.py class. Turn in the URL for your finished game. ```
