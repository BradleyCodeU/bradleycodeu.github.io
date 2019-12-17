---
layout: project
category: csharp
title: Roll A Ball v2
---
Follow the Roll A Ball tutorials. You have the following from v1:

  - Download a grass image and set the ground to be grass material
  - Download a brick image and set the walls to be brick material
  - Download any image that will allow you to see that the sphere is rotating (for example, a soccer ball pattern) and set the sphere to that material
  - Make the PlayerController script so that you can roll the ball

You must ADD the following features:

  1. Download any image and set your pickups to be this material
  1. Add the ability to jump when "isGrounded" and Space bar pressed
  1. Add the ability to reset the player when they fall
  1. Make the camera follow the player with the CameraController script
  1. Make the pickups with the Rotator script AND be able to pick them up
  1. Add the ability for pickups to automatically move back and forth on whichever axis you like
  1. Add the OBJ file maze (and/or add your own OBJ maze) and give it a mesh collider
  1. Make a scoreboard and Win text
  1. Make the pickups *glow* (see directions below)

How to make pickups glow:

![Glowing cube in Unity](/gd\csharp\pickupGlow.PNG)

Create a Point Light in the hierarchy and set it as a child of the Pickup object. Reset the Transform of the Point Light and it should be centered within the Pickup object. In the Point Light's inspector, change the Light component by checking the Draw Halo box, adjusting the Range, changing the Color, and adjusting the Intensity. You should now have glowing halo of light around the pickup, but your pickup doesn't look like it's being lit from within yet.

Look at the Pickup object's inspector. If your Pickup is currently using the Default-Material, then add a material to the Pickup object. Change the Shader component so that Emission is checked and change the Emission Color.
