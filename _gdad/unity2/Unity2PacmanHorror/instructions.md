---
layout: project
category: unity2
title: Unity 2 Pacman Horror
---

Create a dark, 3D Pacman horror game.

Import this file [PacmanPrefabs230323b.unitypackage](https://drive.google.com/file/d/1QXQZ7rPFPOxjQNn-q4dy5Z6I6Tn9OO3h/view?usp=sharing) which contains the following:

  -  Maze prefab
  -  Player prefab
  -  Ramp prefab
  -  Coin prefab
  -  Ghost prefab
  -  CollectableCoin script
  -  GhostMove script
  -  PlayerControls script
  -  Spinner script
  -  CameraMove script

Your finished project MUST have:

  -  Ramps to allow access to all 4 sections of the map.
  -  4 or more ghosts in various colors that automatically chase the player.
  -  10 or more collectable coins that spin and disappear when hit by the player.

Things to fix:

  -  Ghosts don't follow the player. In the Ghost's inspector, you will need to set Player as the target in the Ghost Move script.
  -  Camera doesn't follow the player. Drag the CameraMove script onto the Main Camera. In the Main Camera's inspector, you will need to set Player as the target. Your Main Camera MUST NOT be a child of the Player.
  -  Coins spin too slowly.
  -  Player moves too slowly.
  -  It's too bright...
      -  Click the Directional Light game object and set the intensity to 0.2 or less.
      -  Turn off the Directional Light then go to Windows>Rendering>Lighting. Click the Environment tab. Switch the Environment Lighting Source to Color and make the color black.
      -  In the Environment tab, add Fog. Increase the Density of the fog. You also might want to change the color of the fog.
      -  Replace the skybox with a dark color. Go to the Main Camera and change the Clear Flags setting from Skybox to Solid Color. Set the color to black.

Turn in a demo video when finished

### If you have completed 1 or more Computer Science classes...

CHALLENGES:

  -  Display the player's score. Add one to the score each time they collect a coin.
  -  Play a sound when the player scores a point.
  -  Destroy the player if they are hit by an enemy.

  <p><iframe title="YouTube video player" src="https://www.youtube.com/embed/D0lx90n0s-4" width="560" height="315" allowfullscreen="allowfullscreen" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" data-mce-fragment="1"></iframe></p>
  [https://www.youtube.com/embed/D0lx90n0s-4](https://www.youtube.com/embed/D0lx90n0s-4)
  <p><iframe title="YouTube video player" src="https://www.youtube.com/embed/SYKdRnG1a5w" width="560" height="315" allowfullscreen="allowfullscreen" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" data-mce-fragment="1"></iframe></p>
  [https://www.youtube.com/embed/SYKdRnG1a5w](https://www.youtube.com/embed/SYKdRnG1a5w)
