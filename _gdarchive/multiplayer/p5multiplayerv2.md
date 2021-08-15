---
layout: project
category: multiplayer
title: P5 Multiplayer v2
---
In p5script.js, change the user sprites to images. [https://p5js.org/reference/#/p5/image](https://p5js.org/reference/#/p5/image) All users could have the same image OR images could be randomly assigned to players.

In p5script.js, add this code to draw a background grid. You could also add an image below the rect() so that you have a tiled background.
<pre>
let cellSize = 100
for(let i = 0; i < Math.floor(width / cellSize) + 3; i++){
  for(let j = 0; j < Math.floor(height / cellSize) + 3; j++){
    rect(i * cellSize + (-camera.x % cellSize - cellSize), j * cellSize + (-camera.y % cellSize - cellSize), cellSize, cellSize)
  }
}
</pre>
In server.js, replace the points function (around line 152) with this:
<pre>
function addPoints(amount, currentPlayer){
  currentPlayer.score += amount
  updatescoreboard();
}
</pre>
In server.js, replace the updatescoreboard function (around line 160) with this:
<pre>
function updatescoreboard(){
  playersArray.sort((a, b) => b.points - a.points);
  let top5players = playersArray.slice(0,5);
  io.sockets.emit('scoreboard', top5players);
}
</pre>
After a player moves, check for collisions with food. This can be done inside of server.js (around line 121). Loop through foodArray and check the distance between the food and currentPlayer. If the distance is small, call the addPoints function (already provided within server.js). Also move that piece of food to a new random location.

In p5script.js, use the p5 text function [https://p5js.org/reference/#/p5/text](https://p5js.org/reference/#/p5/text) to create a scoreboard with player usernames and points. Each player a scoreboard array (named "scoreboard") with info for the top 5 players. 

In client.js (around line 25), add four if statements above the switch(e.keyCode). Here is one of the four, you can write the rest yourself:
<pre>
if (keyIsDown(LEFT_ARROW) && keyIsDown(UP_ARROW)) {
    socket.emit("move","up");
    socket.emit("move","left");
    return
}
</pre>
