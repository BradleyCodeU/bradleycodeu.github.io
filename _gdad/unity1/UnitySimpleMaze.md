---
layout: project
category: unity1
title: Unity Simple Maze
---
In this project you will create a simple maze or obstacle course that the player's avatar must navigate. Keep it simple. It should take about 10 to 20 seconds to complete the maze.

WATCH: Simple character controller video (the code from the video is posted below)

Tutorial: [https://drive.google.com/file/d/1VMy_oWS0ofdMvdRhexe3Q0PTkTw35jmh/view?usp=sharing](https://drive.google.com/file/d/1VMy_oWS0ofdMvdRhexe3Q0PTkTw35jmh/view?usp=sharing)

```
using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Character : MonoBehaviour
{
    private CharacterController characterController;
    public float speed = 1f;
    // Start is called before the first frame update
    void Start()
    {
        characterController = GetComponent<CharacterController>();
    }

    // Update is called once per frame
    void Update()
    {
        Vector3 move = new Vector3(Input.GetAxis("Horizontal"), 0, Input.GetAxis("Horizontal"));
        characterController.Move(move * Time.deltaTime * speed);
    }
}
```

## Requirements:

1. Create a player avatar (could be a simple red sphere, a Minecraft-style tall cube with arms, or an Amongus-style capsule with a visor).
1. Click "Add Component" and give the player a Character Controller component
1. Go to Edit > Preferences > External Tools then set "Visual Studio Code" to be the External Script Editor
1. Add a New Script to the player. Name the script Character. Use the code above. This moves the player on the x-axis and z-axis. Mr. Riley made two simple mistakes in the code above, can you find and fix the mistakes?
1. Make the Main Camera a "child" of the player. The camera will now automatically follow the player around.
1. Create a rectangle ground/platform that stretches into the distance. The player starts on one side and ends at the other. NOTE: KEEP IT SIMPLE. IT SHOULD TAKE ABOUT 10 TO 20 SECONDS TO COMPLETE THE MAZE.
1. MUST add a black and white checkered flag material to the finish line. 
1. All game objects MUST have a material (either a color or an image)
1. MUST add 5 or more obstacles that the player must walk around (walls, bouncing balls, rolling boulders or rolling barrels, etc). Things that the player will NOT need to jump over.
1. MUST download and import the school logo 3D model (posted on Canvas) into your game 
1. Try adding a Rigidbody to the player avatar. What happens when you hit a wall or obstacle? Try selecting isKinematic for the player avatar's Rigidbody.
1. Turn in a screen recording in FULLSCREEN