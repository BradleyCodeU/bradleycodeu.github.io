---
layout: project
category: html
title: MC Maze Game
---
NOTE: You may use built-in backgrounds/tiles, but you must DRAW YOUR OWN SPRITES.

First go to arcade.makecode.com and sign in with your Microsoft account.


You must:

  - Follow this tutorial: [https://arcade.makecode.com/#tutorial:/tutorials/maze](https://arcade.makecode.com/#tutorial:/tutorials/maze)
  - After you press the Finish button, complete the following FINAL STEPS...
    - Add enemies. Player loses health if they overlap with an enemy. See the tutorial below if you need help
    - Add some kind of projectiles (like fireballs or arrows) that the player can shoot. See the tutorial below if you need help
    - Add projectiles effects when the fireball/arrow overlaps an enemy. See the tutorial below if you need help
    - It MUST be possible to win and possible to lose. You can change the countdown timer in order to balance the game.

Make sure that your player cannot walk through walls! Check out [this tutorial](https://medium.com/kikis-corner/tilemaps-857f47b539be) if you need help with how to add walls to the tilemap.

![How to add walls to MakeCode Arcade tilemap](/gdad\css\makeCodeWalls.gif)

Show Mr Riley your finished project including how you win and how you lose.

## Additional Tutorials

Below are the additional tutorials

## Create Enemies

- Add a purple "on game update every" block to the workspace
- Inside the purple "on game update every" event, place a red "set mySprite to" from the blue "sprite" menu. Rename the variable to "enemySprite" and change the Player kind to Enemy. Click on the grey square to open the sprite editor and draw an image for the enemy.
- Place a blue "set position to" block right below the "set enemySprite to" sprite block. Change the variable to enemySprite in the dropdown list.
- For x value in the "set position to" change it to 150 (just a little less than the width of the screen).
- Get a purple "pick random 0 to 10" block and put it inside the y value of "set position to". This time change the second number to 120 (the height of the screen)
- Drag a blue "on overlaps" block into the workspace. Change the second sprite kind to Enemy.
- Inside the "on overlaps" block
    - Place a blue "destroy sprite" block. Drag the otherSprite variable from the "on overlaps" block and place it inside the "destroy sprite"
    - Place a purple "change lives by -1" block.

## Adding Projectiles (like fireballs or arrows)

- From the Controller menu, get "on A button pressed"
- Inside the "on A button pressed" block, place a red "set projectile from mySprite with vx vy" from the blue Sprite menu.

## Projectile Effects

- From Sprites menu, drag the blue "on sprite overlaps otherSprite" block into your workspace. Click the first dropdown and select Projectile, then click the second dropdown and select Enemy.
- From Sprites, drag the blue "destroy" block into your "on sprite overlaps" blocks. Drag the otherSprite variable into the destroy sprite.
- From the Info menu, drag the pink "change score" block into "on sprite overlaps" to give yourself a point each time you hit an enemy.
- From Sprites, drag the blue "mySprite start effect" block into "on sprite overlaps". Then drag the sprite variable into the "start effect" block. Click the dropdown to select your favorite effect.


## Moving Enemies

- Drag a blue "on created" block into the workspace. Change the kind dropdown to Enemy
- Inside the "on created" block, place a blue "set velocity" block. Drag the sprite variable from the "on created" block and use it as the sprite inside of "set velocity"
- Change the values in the "set velocity" block to set the speed and direction of your enemy sprite. For example, you could set vx to -50 and vy to a random number -5 to 5.
- Place a blue "set auto destroy" block below the "set velocity" block. Just like before, drag the sprite variable from the "on created" block and use it as the sprite for "set auto destroy"
- In the "set auto destroy" block, switch the setting for that from OFF to ON. This will cause all of the enemies to get automatically destroyed when they travel outside of the screen.
