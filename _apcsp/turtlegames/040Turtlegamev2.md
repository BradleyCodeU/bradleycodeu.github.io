---
layout: project
category: turtlegames
title: Turtle Game v2
---
This is NOT a group project

Once you're finished with Turtle game v1.0... **DUPLICATE/COPY YOUR GAME**, rename it v2, and add the following features...

  - Add a player2 turtle. The two players can either be competing against each other or working cooperatively. Make the player controls WASD or IJKL

  - Add a turtle named writer. Hide it and put its pen up. Have it write "Press space to begin"

  - Add a function called writeScore(). In this function, have writer clear previous writing ( writer.clear() ), go to one corner, write the score for player 1, go to a different corner, write the score for player 2.

  - Add one or more enemies that will follow player 2. In other words... you'll have enemies that chase p1 and different enemies that chase p2.

  - Update your previous code so that:
      - ALL colors are hexcode colors. No color names.
      - Move the game loop (the forever loop) into a main function. Create an event listener so that the main function will only run once the space bar has been pressed.
      - If player 1 touches a coin player 1 gets a point, but if player 2 touches a coin player 2 gets a point. Make the same sort of update so that either player can die if touched by an enemy.

*** The first player to get 3 points wins. Have writer say "Player 1 wins" or "Player 2 wins" ***
