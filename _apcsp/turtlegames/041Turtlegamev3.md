---
layout: project
category: turtlegames
title: Turtle Game v3
---
This is NOT a group project

Once you're finished with Turtle game v2.0... **DUPLICATE YOUR GAME**, rename it v3.

The new features added in this version are:
  - images
  - multiple levels

You have much more freedom with this game. You can change the controls so that (instead of rotating) left makes the player move West, up makes the player move North, etc. You can go back to a 1 player game or keep it 2 players (co-operative or competitive), get rid of the following enemies or keep them, and get rid of the coins or change how coins work. The only requirements are the ones listed below.

Here are the required features...

1.  ALL turtles must have an image file as their shape. [Read this tutorial](https://blog.trinket.io/using-images-in-turtle-programs/). For the best result, find small (for example, 32px by 32px) PNG files with transparent backgrounds. [Include "imagesize:32x32"](https://www.google.com/search?surl=1&q=mario+imagesize:32x32&source=lnms&tbm=isch&sa=X&safe=active&ssui=on) in a Google Image search to specify an exact size. You could also try using [https://www.remove.bg/](https://www.remove.bg/) which claims that it can *automatically* remove image backgrounds.
1.  Must give your Screen object a background pic. [Read this tutorial](https://blog.trinket.io/using-images-in-turtle-programs/)
1.  Create a function called reset() and use it reset the game for each level. Each level you will add MORE enemies, reset enemy locations, reset the player location, reset coins, etc. Do NOT reset scores.
1.  MUST increase the speed of the game with each level. Players and enemies will move forward slightly faster each round. You should probably make players rotate slightly faster too.
1.  Create a function called checkBounds(). Players can ```NOT``` go out of bounds in this version. If they are out of bounds, they either wrap around the screen, change their heading, or reset the level. Your choice. You can use either:
   -  [.position()](https://docs.python.org/3.3/library/turtle.html?highlight=turtle#turtle.position). to get both the xy coordinates as a tuple
   -  [.xcor() and .ycor()](https://docs.python.org/3.3/library/turtle.html?highlight=turtle#turtle.xcor). to get each separate coordinate.
1.  Create one or more "guards." A guard is an enemy that follows a set route (for example, walking back and forth next to the goal) and will kill EITHER player if it touches them.
1.  Have a writer Turtle that writes the current Level on the screen. For example, "Level 1"
