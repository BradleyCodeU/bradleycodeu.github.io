---
layout: project
category: forms
title: Yes Or No
---
Download one of these:
  - [Alice Sound Library 1](https://www.alice.org/wp-content/uploads/2017/05/AliceSoundLibrary.zip)
  - [Alice Sound Library 2](https://www.alice.org/wp-content/uploads/2017/08/AliceSoundLibraryExpansionPackOne.zip)
  - [Essential Retro Video Game Sound Effects Collection](https://opengameart.org/sites/default/files/The%20Essential%20Retro%20Video%20Game%20Sound%20Effects%20Collection%20%5B512%20sounds%5D.zip)

Upload a few of your favorite sounds to this Replit project.

[Here is a demo](https://drive.google.com/file/d/1vw5GDnkJAvt61_dFyai6K1EcWJNqBFt4/view)

Create two huge buttons using the [HTML div tag](https://www.w3schools.com/tags/tag_div.asp), Yes and No buttons

When you hover over them, they change color

When you click Yes it plays a happy sound and when you click No it play a sad sound

For Javascript audio, you will do something similar to this:
```
var bubblePopSound = new Audio("pop.mp3");
bubblePopSound.play();
```



### If you have already completed 1 or more Computer Science classes...

1. Under the two big Yes and No buttons, create a Change Button Text section.

    - Add an input type text that is labelled Yes Button Text. Give the input an oninput= attribute that will change the innerHTML of the Yes button to be this.value
    - Add an input type text that is labelled No Button Text. Give the input an oninput= attribute that will change the innerHTML of the No button to be this.value

1. Make it randomly select one of a few sounds OR make it cycle through several sounds so that they are played in order.
  
