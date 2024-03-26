---
layout: project
category: css
title: Css Makecode Shark Attack
---

NOTE: You may use built-in backgrounds/tiles, but you must DRAW YOUR OWN SPRITES.

Go to [https://arcade.makecode.com/--skillmap#shark](https://arcade.makecode.com/--skillmap#shark) and sign in with your Microsoft account.

You MUST draw your own sprites for this project. Do NOT use any of the built-in Gallery sprites. You can use built-in backgrounds.

When you finish the tutorial, click the "SAVE TO MY PROJECTS" button.

FINAL STEPS...

1.  YOU CAN ONLY WIN IF YOU SCORE 20 POINTS. Just below your "change score" block, add a blue "if true then" block from the Logic menu. From Game menu drag a purple "game over lose" block inside the "if true then" block. Switch LOSE to WIN. Replace "true" with a blue "0 < 0" block from the Logic menu. Drag in the pink "score" variable from the Info menu. Change 0 to 20.
2.  Switch the On Countdown End, Game Over Win to be Game Over LOSE.
3.  Speed up the food. Generate food more frequently because every 2100 ms is TOO SLOW!
4.  Set the food's vy to a random number.
5.  Add Lazers! First, switch the "on sprite of kind Player overlaps Food" to say "on sprite of kind Projectile overlaps Food". Next add the following blocks...
    - On B button pressed
      - set projectile from mySprite with vx vy


Show Mr Riley your finished project including how you win and how you lose.

<hr>

Below are the transcribed tutorials (just in case you need them)

## Create Enemies

- Add a purple "on game update every" block to the workspace
- Inside the purple "on game update every" event, place a red "set mySprite to" from the blue "sprite" menu. Rename the variable to "enemySprite" and change the Player kind to Enemy. Click on the grey square to open the sprite editor and draw an image for the enemy.
- Place a blue "set position to" block right below the "set enemySprite to" sprite block. Change the variable to enemySprite in the dropdown list.
- For x value in the "set position to" change it to 150 (just a little less than the width of the screen).
- Get a purple "pick random 0 to 10" block and put it inside the y value of "set position to". This time change the second number to 120 (the height of the screen)
- Drag a blue "on overlaps" block into the workspace. Change the second sprite kind to Enemy.
- Inside the "on overlaps" block, place a blue "destroy sprite" block. Drage the otherSprite variable from the "on overlaps" block and place it inside the "destroy sprite"

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

## Design A Background

- From the Scene menu, drag the dark blue "set background image" block into "on start"
- Next, let's add some sprites to decorate the background. From the Loops menu, drag the green "for index from" block into "on start" and set the index range to 10.
- From the Sprites menu, drag the "set mySprite to" block into "for index from 0 to 10". Click on the grey box and paint a background object like a tree, a rock, a shrub, some tall grass, a flower, or some seaweed.
- From Sprites, drag the blue "set mySprite position" block into "for index from 0 to 10" loop. Change the y value to 96.
- From the Math menu, drag the purple "0 x 0" block in as the x value of "set mySprite position". Change the first number to 16 and drag the index block for the second number. Continue adding decorations until you are satisfied with your scene.
