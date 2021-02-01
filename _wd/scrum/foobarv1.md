---
layout: project
category: scrum
title: Foobar v1
---


* TOC
{:toc}

## Daily Standup

Each day will begin with [The Daily Standup (aka The Daily Scrum)](https://www.mountaingoatsoftware.com/agile/scrum/meetings/daily-scrum) a standing (not sitting) meeting of 15 minutes or less. Taking turns, each member says:
  - What did you do yesterday?
  - What will you do today?
  - Are there any "blockers" in your way? Any things on which you are currently stuck?
  - Update the [Scrum Board](https://www.mountaingoatsoftware.com/agile/scrum/scrum-tools/task-boards), if necessary

![Example Scrum Board](/apcsp\scrum\scrum-board.jpg)

Your first meeting is also a [Sprint Planning meeting](https://www.mountaingoatsoftware.com/agile/scrum/meetings/sprint-planning-meeting) in which the team members select tasks from the Product Backlog (the To Do list) that they plan on completing during the upcoming sprint. Pick 10-15 tasks. Write the name and number of points on post-it notes. Place these tasks in the To Do column of your Scrum Board.


## Project Details

Working as team, create your own text game based on Foobar The Bazbarian

Start by figuring out a story/theme/setting and title for your game

Plan a map on a grid. It might be a maze-like dungeon or a large open island or a house with rooms and hallways.

You will be graded on the following requirements:

  * Plan 15 blocks of the grid. We will call these blocks "rooms." Each of these rooms must have a unique description, NOT just "you're in a room"
  * Plan 6 items. An item is something that the player can pick up like a new weapon, a health pack, coins, a potion, some food, a fidget-spinner, etc.
  * Create an array named roomArray that stores the block descriptions AND a different array named itemArray that stores items that you can pick up. In this version, the player does NOT need to be able to pick up the item.
  * Add descriptions for your 15 rooms to your roomArray
  * Add 6 items to your itemArray
  * In v1, the player does NOT need to be able to pick up any items, but when visiting a room the game MUST tell you that an item is there IF the room contains an item.
  * Create a variable named mylocation that stores the current room number. NOTE that "location" is not a good variable name because [it will re-direct the page](https://www.w3schools.com/jsref/obj_location.asp)
  * Must be able to change rooms and give a message like "You can't go there" when necessary.


Define a function named doesRoomExist that requires one argument: roomNumber. If roomArray index roomNumber is undefined then say "You can't go there" and return false. Otherwise return true.


Define a function named move that requires one argument: direction.

    - If the direction was "n" and doesRoomExist at the mylocation - 1
        - mylocation = mylocation - 1
    - Otherwise if the direction was "s" and doesRoomExist at the mylocation + 1
        - mylocation = mylocation + 1
    - Otherwise if the direction was "e" and figure this part out yourself
        - figure this part out yourself
    - Otherwise if the direction was "w" and figure this part out yourself
        - figure this part out yourself
    - return mylocation


Create 4 buttons that say North, South, East, and West. When clicked, these buttons call the move function.
