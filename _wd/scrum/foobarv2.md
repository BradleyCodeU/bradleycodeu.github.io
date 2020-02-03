---
layout: project
category: scrum
title: Foobar v2
---
In this project, your team will finish your text-based game

You will be graded on the following requirements:

- Have 30 rooms. Each of these rooms must have a unique description. NOT just "you're in a room". Have 10 or more items that the player can pick up.
- Have 1 final enemy that you must defeat. You can either base this battle on the Boss Battle project OR the JS Form Game project (the one that had 4 trivia questions to answer).
- Must use [the Map class](https://gist.githubusercontent.com/ohiofi/fbcd79b5a2ec11f8bd4bfe3e4aa7693c/raw/71fd85a1d75ac358c9b89fdd2d53cc3101b7a1e5/map.js) to draw a map for your game (hide or show the items is up to you). The Map class requires that you import p5js.
- Print the room description, any item in the room, any items in the player's inventory/backpack
- Must be able to change locations and give a message like "You can't go there" when necessary.
- Must be able to collect an item (using "take" button), place the item in the player's inventory/backpack, and remove the item from the room.
- Use localStorage to save the game after each move
- The game ends if the user loses the game, or wins the game.
    * Create an alert
    * Change the background color to either red (lose) or green (win)
    * Hide all of the buttons
