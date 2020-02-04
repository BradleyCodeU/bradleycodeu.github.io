---
layout: project
category: scrum
title: Foobar v1
---
Working as team, create your own text game based on Foobar The Bazbarian

Start by figuring out a story/theme/setting and title for your game

Plan a map on a grid. It might be a maze-like dungeon or a large open island or a house with rooms and hallways.

You will be graded on the following requirements:

  * Plan 15 blocks of the grid. We will call these blocks "rooms." Each of these rooms must have a unique description, NOT just "you're in a room"
  * Plan 6 items. An item is something that the player can pick up like a new weapon, a health pack, coins, a potion, some food, a fidget-spinner, etc.
  * Create an array that stores the block descriptions AND a different array that stores items that you can pick up. In this version, the player does NOT need to be able to pick up the item.
  * Must be able to change locations and give a message like "You can't go there" when necessary.
  * An item is something that the player can pick up like a new weapon, a health pack, coins, a potion, some food, a fidget-spinner, etc.
  * Create an array named roomArray that will store room descriptions
  * Create a different array named itemArray that will store items that you can pick up
  * Add descriptions for your 15 rooms to your roomArray
  * Add 6 items to your itemArray
  * In v1, the player does NOT need to be able to pick up any items, but when visiting a room the game MUST tell you that an item is there IF the room contains an item.
  * Must be able to change locations and give a message like "You can't go there" when necessary.

  Define a function called doesRoomExist that requires one argument: roomNumber. If roomArray index roomNumber is false then say "You can't go there" and return false. Otherwise return true. Use try except when you check the room because you could get an "index out of range error." If you get an error, then say "You can't go there" and return false.

  Define a function called move that requires one argument: direction.
    - If the direction was "n" and doesRoomExist at the location - 1
      - location = location - 1
    - Otherwise if the direction was "s" and doesRoomExist at the location + 1
      - location = location + 1
    - Otherwise if the direction was "e" and figure this part out yourself
      - figure this part out yourself
    - Otherwise if the direction was "w" and figure this part out yourself
      - figure this part out yourself
    - return location
