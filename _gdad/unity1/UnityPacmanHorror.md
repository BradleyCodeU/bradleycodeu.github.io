---
layout: project
category: unity1
title: Unity Pacman Horror
---

Create a dark, 3D Pacman horror game.

Import the prefabs file which contains the following:

-   Maze prefab
-   Player prefab
-   Ramp prefab
-   Coin prefab
-   Ghost prefab
-   CollectableCoin script
-   GhostMove script
-   PlayerControls script
-   Spinner script
-   FollowPlayer script

Your finished project MUST have:

-   Ramps to allow access to all 4 sections of the map.
-   4 or more ghosts in various colors that automatically chase the player.
-   10 or more collectable coins that spin and disappear when hit by the player.

Things to fix:

-   It's too bright...
    -   Click the Directional Light game object and set the intensity to 0.2 or less.
    -   Turn off the Directional Light then go to Windows>Rendering>Lighting. Click the Environment tab. Switch the Environment Lighting Source to Color and make the color black.
    -   In the Environment tab, add Fog. Increase the Density of the fog. You also might want to change the color of the fog.
    -   Go to the Main Camera and change the Clear Flags setting from Skybox to Solid Color. Set the color to black.
-   Ghosts don't follow the player. In the Ghost's inspector, you will need to set Player as the target in the Ghost Move script. DO NOT add the FollowPlayer script to the Ghost.
-   Camera doesn't follow the player. Drag the FollowPlayer script onto the Main Camera. In the Main Camera's inspector, you will need to set Player as the target. Your Main Camera MUST NOT be a child of the Player.
-   Coins spin too slowly.
-   Player moves too slowly.

Turn in a demo video when finished

<hr>

CHALLENGES:

-   Display the player's score. Add one to the score each time they collect a coin.
-   Play a sound when the player scores a point.
-   Destroy the player if they are hit by an enemy.

Tutorial videos:

[Mini Unity Tutorial - How To Make A Collectable And Scoring System In C#](https://www.youtube.com/watch?v=D0lx90n0s-4)

[How to Destroy player on Collision || Fast and Furious Unity 3D Ball Game Tutorial Full Course 2021](https://www.youtube.com/watch?v=SYKdRnG1a5w)

