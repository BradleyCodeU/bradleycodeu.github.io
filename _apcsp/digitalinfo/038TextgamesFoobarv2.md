---
layout: project
category: digitalinfo
title: Text Games Foobar v2
---
SETUP FOR V2 - ONE PERSON IN EACH GROUP SHOULD:
1. Create a NEW Tkinter project on Repl.it [https://repl.it/new/tkinter](https://repl.it/new/tkinter)
1. COPY/PASTE your Foobar V1 code into the NEW project
1. SHARE the JOIN CODE for the Repl project with your group AND MR. RILEY
1. Update the "To Do" section of your group Scrum board

## The Map Class

[Copy/Paste this map class](https://raw.githubusercontent.com/ohiofi/Python-map/master/map.py) into a new file, map.py

The map.py file must be in the same location (same folder) as your project.

## ASCII Art

Visit [this site](http://patorjk.com/software/taag/#p=display&f=ANSI%20Shadow&t=Game%20Title) to get an ASCII art version of your game title. Notice that you can change the "font" to something else like Bulbhead, Doom, or Ogre. Some of the fonts might make the text too big, so pick one that fits.

## More Rooms

Add more rooms! If you are a group of 3 complete 21 total rooms. If you are a group of 4 complete 28 total rooms. Each of these rooms must have a unique description, NOT just "you're in a room". Have 2 or more items for each person in your group.

## Take Item

Create an array to store the player's inventory.

Create a function named takeItem() that requires one argument: roomNumber. This function appends the itemArray[roomNumber] to the player's inventory. Next, it sets the itemArray[roomNumber] equal to False.

Update the main() function in 3 places...

  - After printing the room description, print the player's inventory.

  - Add to the line that says "Type n,s,e,w or quit" so that it includes "take"

  - If the userInput equals take, then call the takeItem() function with location as an argument.

## Special Rooms

In this version you will add "special rooms" which can be locked/unlocked, have battles, or other mini-games.

Add 2 special rooms. Could be:
  - a battle with an enemy
  - a high-low number guessing game (to open a combination lock, for example)
  - a fill-in-the-blank quiz game (to figure out a computer password, for example)
  - a locked room that is unlocked if the player has the key. Locked rooms are set to false at first, but if you are standing next to them and have a key, then the room gets a description. Look at the example below.

I recommend creating a function called checkIfSpecialRoom that redirects the player if they are in one of these locations:
```
def checkIfSpecialRoom(location, roomArray, inventory, isQuizCompleted, isBossDead):

  # NOTICE you unlock room 403 FROM room 303
  if location == 303:
    if "gold key" in inventory:
      print("You use a gold key to unlock a door") # NOTICE it works automatically
      roomArray[403] = "The unlocked door leads into a small, dark hallway"
    if "gold key" not in inventory:
      print("The room to the east is locked. You need a key.")
      roomArray[403] = False

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

1. Must use the [Map class](https://raw.githubusercontent.com/ohiofi/Python-map/master/map.py) to draw a map for your game (hide or show the items is up to you).
1. Visit [this site](http://patorjk.com/software/taag/#p=display&f=ANSI%20Shadow&t=Game%20Title) to get an ASCII art version of your game title. Notice that you can change the "font" to something else like Bulbhead, Doom, or Ogre. Some of the fonts might make the text too big, so pick one that fits.
1. MORE rooms (group of 3 = 21 total rooms, group of 4 = 28 total rooms). Each of these rooms must have a unique description. NOT just "you're in a room". Have 2 or more items for each person in your group.
1. Print the room description, any item in the room, any items in the player's inventory/backpack, and the possible commands that the player can type such as "take" (if there is an item in this room).
1. Must be able to collect an item (using "take"), place the item in the player's inventory/backpack, ```AND remove the item from the room```.
1. Must have 3 or 4 mini-games (1 per person in your group) which could be locked room, boss battle, quiz game, etc.
1. Must be able to change locations and give a message like "You can't go there" when necessary.
1. Must have a break in your while loop so that game ends if the user types "quit", loses the game, or wins the game.

``` Turn in the URL for your finished game. ```
