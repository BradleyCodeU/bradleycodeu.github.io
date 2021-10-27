---
layout: project
category: js
title: JS Clicker Game
---
Create a clicker game that tracks how many times you have clicked a button and uses innerHTML to update/display that number with each click. Have three rewards that unlock after a certain number of clicks (for example... 5 clicks, 10 clicks, 20 clicks). If the number of clicks equals one of these levels, then alert the player and display a previously hidden reward image.

Define a function named addClick() and inside of that function:

  - add one to your variable that keeps track of the number of clicks
  - call the checkRewards() function

Define a function named checkRewards() and inside of that function:

  - check if the number of clicks equals 5, then
      - display a reward
      - alert the player
  - check if the number of clicks equals 10, then
      - display a reward
      - alert the player
  - check if the number of clicks equals 20, then
      - display a reward
      - alert the player

### If you have already completed 1 or more Computer Science classes...

Create a function called randomBackgroundColor() that uses random numbers to set the background color.

Call randomBackgroundColor() inside of the addClick function.

Create a button that says "Buy Extra Clicker for $5"  When clicked, check to make sure that the player has 5 clicks or more. Subtract 5 from their clicks. Now when the player clicks, they earn +1 clicks.

GOLD LEVEL CHALLENGE:

Create a function called clickingRobot(). Inside that function, use setInterval() to automatically call the addClick function every 5 seconds.

Create a button that says "Buy Click Robot for $50"  When clicked, check to make sure that the player has 50 or more. Subtract 50 from their score. Call the clickingRobot() function.

Increase your reward levels to something like 100, 200, and 400.
