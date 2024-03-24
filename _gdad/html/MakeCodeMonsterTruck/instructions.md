---
layout: project
category: html
title: MC Monster Truck
---

REMEMBER: You may use built-in backgrounds/tiles, but you must DRAW YOUR OWN SPRITES.

Go to: https://arcade.makecode.com/--skillmap#racer

Links to an external site. and follow the directions. After the site gives you a "reward" you will still need to complete the final "Going Forward" step (which has tutorials about animating the player sprite and rearranging the tilemap).

When you are finished following the tutorials, click the Save To My Projects button.

! ! ! One additional requirement ! ! !

- Edit the tilemap and ADD EXTRA lava pits or spikes to the floor that the player must jump over.

 

 
REMEMBER: You may use built-in backgrounds/tiles, but you must DRAW YOUR OWN SPRITES.

Show Mr Riley when finished.

 

## If You Have Already Completed 1 Or More Computer Science Classes…

- Add some kind of flying enemy...
    - From the GAME menu, add the "on game update every 500 ms" block and change 500 to 1 second.
        - From the SPRITES menu, add the "set projectile to projectile ___ from side with vx 50 vy 50" and put it inside of the "on game update every 1000 ms". Change the vx to be negative number.
        - Below that block, add the "set mySprite x to 0" block from the SPRITES menu. Switch "mySprite" to "projectile" and switch "x" to "y". Next, change the y to be 25.
        - Draw a sprite for this enemy/projectile
    - From the SPRITES menu, add the "on sprite of kind Player overlaps otherSprite of kind Player" block. Switch the kind from "Player" to "Projectile".
        - Put a "game over lose" block inside. The "game over lose" block can be found in the GAME menu.
- Animate both the player sprite and the enemy/projectile sprite.
- Use random numbers to randomize the enemy/projectile.


REMEMBER: You may use built-in backgrounds/tiles, but you must DRAW YOUR OWN SPRITES.

Show Mr Riley when finished.