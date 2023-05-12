---
layout: project
category: unity3d
title: Terrain v2
---
In addition to the mountains, grass, hills, shrubs, and first/third person camera from Terrain proj 1, you will add the following:

1. adjust the Directional Light so that Shadows have a Strength somewhere between 0.5 and 0.75. The default setting (1) is too extreme.

1. enable fog by going to Window > Rendering > Lighting, then Environment and checking the Fog checkbox

1. Water. 
  - Download and import the StandardAssetsEnvironment-1.unitypackage posted on Canvas
  - [Watch the tutorial](https://drive.google.com/open?id=1o_n-_BgOu_1RtUqavS9ubGz63pca5R0V)


1. 3 or more collectibles (review the [Roll A Ball project's Counting Points video](https://drive.google.com/drive/u/0/folders/1Ty6SYENccamq1nSBsfRZE4daQkKmZIZr) if you don't remember how)
    - Make your collectibles glow by adding a child Point Light or Area Light
    - UI Text that tells the player how many collectables they've collected (for example, "0 of 5 collected" OR "0/5 collected")
    - UI Text that tells the player "You Win" if all collectibles are collected


1. A reset script, just in case the player falls off of the world. Reset script reminder... you only need these 3 lines of code. You should know where to put these by now.
```
private Vector3 startpos;
startpos = transform.position;
if (transform.position.y < -10) transform.position = startpos;
```

1. Add a second player, second camera, and a split screen
