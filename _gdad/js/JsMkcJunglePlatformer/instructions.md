---
layout: project
category: js
title: Js Makecode Jungle Platformer
---


First, go to [https://arcade.makecode.com/](https://arcade.makecode.com/) and sign in with your account.

https://arcade.makecode.com/--skillmap#jungle

Complete the first 4 steps of the Jungle Monkey Jump Platformer skillmap.

You may use the built-in backgrounds and built-in tiles/platforms, but you will draw your own sprites for the hero and projectiles.

You MUST:

- Draw your own sprite for the hero character (could be a person/animal/robot/etc)
- Draw your own "fireball" explosion animation when you get to step 4 "Blown Away." 
- Your fireballs MUST fly forward so that the hero is throwing the fireballs.



After you finish step 4, click step 4 again then click "Save To My Projects"

![Click Level 4 again and then click Save To My Projects](https://bradleycodeu.github.io\gdad\js\JsMkcJunglePlatformer\junglePlat.png)


## Add LEVEL 2

1. Look for your "game over WIN" block inside of the "Player overlaps chest1" container. Click the image of chest1 and change it to chest2.
1. When we get to the first chest, we want to take the player to a new level. From the SCENE menu, drag "on [sprite] of kind [Player] overlaps at [location]" into an empty area of the workspace. Click the empty square and choose chest1.
1. Let's show the player that the level has changed. From the SCENE menu, drag "set background image to []" into the empty "Player overlaps chest1" container. Click the grey square and choose background2.
1. Change the level tilemap. From the SCENE menu, drag "set tilemap to [ ]" to the end of the "Player overlaps chest1" container. Click the grey square and toggle to My Assets to choose level2.
1. Next, carry your character back to the beginning of the level. From the ADVANCED > ANIMATION menu, drag the "animate [mySprite] with [fly to center]" block into the end of the Player overlaps chest1 container.
1. From the SPRITE menu, drag "[mySprite] say [": )"]" into the end of the "Player overlaps chest1" container. Change the text to say "Level 2!" and click the white plus (+) to the right of the block so that the text disappears after 500 ms.




## IF YOU HAVE COMPLETED ONE OR MORE CODING CLASSES...

Add Enemies

On game update every 5000 ms

- set mySprite2 to sprite [ ] of kind Enemy
- (from the SCENE menu) place mySprite2 on top of random [ poison pit ]
- set mySprite2 to follow hero with speed pick random 20 to 30

When the hero overlaps an enemy, destroy the enemy sprite and life -1

When a fireball projectile overlaps an enemy, destroy the enemy sprite
