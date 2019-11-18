---
layout: project
category: multiplayer
title: P5 Multiplayer v1
---
Click here to remix the starter project: [https://glitch.com/edit/#!/remix/p5multiplayer](https://glitch.com/edit/#!/remix/p5multiplayer)

Create an Agario-style multiplayer game in which players score points for eating "food"
<ul>
  <li>Complete the UDLR controls in client.js (around line 24) and in server.js (around line 121)
  </li>
  <li>In p5script.js, create a camera object ([https://www.w3schools.com/js/js_objects.asp](https://www.w3schools.com/js/js_objects.asp)) with x, y, newX, and newY
  </li>
  <li>Set the camera.newX to be me.x - width/2 and do the same for y and the height. Do this in client.js, whenever the "me" object is received from the server.
  </li>
  <li>Slowly increase/decrease camera x until it equals newX and do the same for y and newY. I recommend creating a moveCamera function that does this, then call the function inside of the draw loop.
  </li>
  <li>You will adjust the locations of the food and players so that it simulates camera motion. Inside the draw loop, do this...
    <ul>
    <li>translate(-camera.x,-camera.y)</li>
    <li>showFood()</li>
    <li>showPlayers()</li>
    <li>translate(camera.x,camera.y)</li>
    <li>showUI()</li>
    </ul>
  </li>
</ul>
