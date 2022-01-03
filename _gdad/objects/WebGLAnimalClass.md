---
layout: project
category: objects
title: WebGL Animal Class
---

Turn your single animal statue into a class. Don't name it "AnimalClass". Name the class Pig or Rabbit or Mouse or whatever it is. In the head section of index.html, add a link to the new js file.

In the setup function of script.js, add MULTIPLE instances of your animal class to your project.

In the draw function of script.js, move your instances and then show your instances. For example...
```
myPig1.move();
myPig1.show();
```

### Constructor

In the constructor create instance variable for x location, y location, z location, direction, speed, and anything else that might unique about each instance.

### Show Method

The code that draws the animal statue (the mesh) should go inside of the show() method. The statue should be centered on 0,0 and facing the X axis.

### Move Method

The code that move the animal forward should go inside of the move() method. Use the cosine function to update the object's x location (example shown below). Do the same for the object's z location, but use the sine function instead.
```
this.x = this.x + cos(this.direction) * this.speed;
```

Check if the object is out of bounds. If they are, move them back in bounds and change the rotation.

### Use the Sine Function for Animation

Finally, go to the show() method. Use the sin() function to add motion to the legs

NOTE: In the video below he is using Processing NOT P5. There are a few small differences such as creating variables with keywords like float and int. The languages are 99.9% the same.

[Coding Train 3.3 Simple Harmonic Motion](https://drive.google.com/file/d/1Cc4iTNeGmQ_2dZKdGQ4qTMlDgnnGMx0W/view?usp=sharing)


![3d avatar example with moving arms and legs](/wd\objects\3dAvatarExample.gif)
