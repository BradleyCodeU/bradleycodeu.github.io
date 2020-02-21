---
layout: project
category: unity3d
title: Terrain v2
---
In addition to the mountains, grass, hills, shrubs, and first/third person camera from Terrain proj 1, you will add the following:

- adjust the Directional Light so that Shadows have a Strength somewhere between 0.5 and 0.75. The default setting (1) is too extreme.
- water
- Download the Unity Post-Processing Stack [from Github](https://github.com/Unity-Technologies/PostProcessing), unzip it and move the unzipped folder into your Assets folder
- Go to Assets > Create > Post Processing Profile and name it "Underwater"
- Click on the First Person Character and in the hierarchy and add the following components: Post Processing Volume and Post Processing Layer. In the Post Processing Volume, place a check next to Is Global and drag the "Underwater" profile into the Profile slot. In the Post Processing Layer, drag the First Person Character Camera into the Trigger slot and set the Layer drop-down to Everything.
- an underwater Post-Processing Profile that gives the camera a blue haze when underwater. Watch the [How To Create Underwater FX tutorial video](https://drive.google.com/open?id=1lsFiEbqzo0u6EuoXLDo_E9q0xRFRL0j5)
- give the Post-Processing Profile bloom, vignette, and some color grading.
- enable fog by going to Window > Lighting > Settings and checking the Fog checkbox
- SketchUp house (with brick, wood, glass, etc textures, with cut-out doors the player can walk through, and with mesh collider walls so the player can't walk through them). Once your SketchUp house is built, click File > Export > 3D Model. Select your Unity project assets folder, then click Options. Check the Export Two-sided Faces checkbox. Then click OK and Export.
- 3 or more collectibles (review the Roll A Ball videos if you don't remember how)
- Make your collectibles glow by adding a child Point Light or Area Light
- UI Text that tells the player how many collectables they've collected (for example, "0 of 5 collected" OR "0/5 collected")
- UI Text that tells the player "You Win" if all collectibles are collected
- A reset script, just in case the player falls off of the world. Reset script reminder... you only need these 3 lines of code. You should know where to put these by now.
```
private Vector3 startpos;
startpos = transform.position;
if (transform.position.y < -10) transform.position = startpos;
```
