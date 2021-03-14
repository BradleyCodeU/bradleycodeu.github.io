---
layout: project
category: objects
title: WebGL Statue
---

[18.1- Introduction to WebGL in p5.js - WebGL and p5.js Tutorial](https://drive.google.com/file/d/1WOh8psD1gwwdvk2ezslVElMtPy14pS9Q/view)
You can skim through this video

[Here is link](https://p5js.org/reference/#group-Shape) to the p5js reference. According to the reference there are currently seven built-in 3D shapes.

3D Primitives
- [plane() ](https://p5js.org/reference/#/p5/plane)
- [box() ](https://p5js.org/reference/#/p5/box)
- [sphere() ](https://p5js.org/reference/#/p5/sphere)
- [cylinder() ](https://p5js.org/reference/#/p5/cylinder)
- [cone() ](https://p5js.org/reference/#/p5/cone)
- [ellipsoid() ](https://p5js.org/reference/#/p5/ellipsoid)
- [torus() ](https://p5js.org/reference/#/p5/torus)


[18.2- 3D Geometries - WebGL and p5.js Tutorial](https://drive.google.com/file/d/1cAs0quH319dZSLfusYtZy3M8CGJvFaMo/view)
Watch this video more carefully.



## Project Directions

[Click here](https://glitch.com/edit/#!/remix/gameobject) to remix the starter project.

In the starter project, the player is at the origin (0,0,0) and the floor is drawn for the first quadrant. Each floor tile is 100px-by-100px. Don't forget that the y-axis is the vertical axis and it is inverted. It's annoying, but the y-axis is often inverted in computer science.

Your goal is to use the p5js 3D Geometries to create a statue (person, animal, car, etc) using:

- a total of 5 or more shapes
- 3 or more colors

The example below is a good statue because the student used a total of 8 shapes and 4 colors. The student only used 3 different "types" of shapes, but that is fine because they used a total of 8 shapes.

![p5js 3d Statue.gif](/wd/objects/p5js3dStatue.gif)

Note: You will need to use [push and pop](https://p5js.org/reference/#/p5/push). Use push when you want to begin a new shape, translate to the correct position, rotate the shape as needed, set the fill color, draw the shape, then pop. Repeat those steps for the next shape.
