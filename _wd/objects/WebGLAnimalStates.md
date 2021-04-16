---
layout: project
category: objects
title: WebGL Animal States
---

Go to your animal class.

### Instance Variables

We are going to adjust some instance variables. First of all, not all of your animals should be exactly the same size. Randomize the x scale, y scale, and z scale for each instance. For example... ```this.transform.scale.x = random(0.5, 0.9);```

Let's create some color variation (you can skip this if your animal is completely covered in textures). Add a new instance variable called color. Like this... ```this.skinColor = color(255, 0, 0); // remember that color is rgb```

That code could would still keep the color constant, so you will use random numbers to create slight variations. For example... ```this.skinColor = color( random(200, 255), 0, random(0, 50)); // random red 200-255 and random blue 0-50```

Next create an instance variable called state and set it to "walking".

### Walk Method

Select all of the code that you have inside the update() method and copy (or cut) it. This code makes the animal walk, so let's create a walk() method and paste the code here. Now go back to the update method and (if you copied it before) delete the old code.

### Changing States in update()

- If the state equals "walking"
  - call the walk method
  - if a random number is less than a small number (should be about a 1% chance)
    - set the state to standing
- else if the state equals "standing"
  - if a random number is less than a small number (should be about a 1% chance)
    - set the state to walking

### Sine Function

Finally, go to the getMesh() function. Use the sin() function to add motion to the legs IF the state is walking.

NOTE: In the video below he is using Processing NOT P5. There are a few small differences such as creating variables with keywords like float and int. The languages are 99.9% the same.

[Coding Train 3.3 Simple Harmonic Motion](https://drive.google.com/file/d/1Cc4iTNeGmQ_2dZKdGQ4qTMlDgnnGMx0W/view?usp=sharing)


![3d avatar example with moving arms and legs](/wd\objects\3dAvatarExample.gif)
