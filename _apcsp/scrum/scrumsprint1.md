---
layout: project
category: scrum
title: Scrum Sprint 1
---

* TOC
{:toc}

## Daily Standup

Each day will begin with [The Daily Standup (aka The Daily Scrum)](https://www.mountaingoatsoftware.com/agile/scrum/meetings/daily-scrum) a standing (not sitting) meeting of 15 minutes or less. Taking turns, each member says:
  - What did you do yesterday?
  - What will you do today?
  - Are there any "blockers" in your way? Any things on which you are currently stuck?
  - Update your [Scrum Board](https://www.mountaingoatsoftware.com/agile/scrum/scrum-tools/task-boards), if necessary

![Example Scrum Board](/apcsp\scrum\scrum-board.jpg)

Your first meeting is also a [Sprint Planning meeting](https://www.mountaingoatsoftware.com/agile/scrum/meetings/sprint-planning-meeting) in which the team members select tasks from the Product Backlog that they plan on completing during the upcoming sprint. Pick several tasks (total of 30 pts or more). Write the task name and number of points on post-it notes. Place these tasks in the To Do column of your Scrum Board.

For Sprint 1, your team must simply complete a set number of points.
  - 3 team members = 30 pts or more
  - 4 team members = 40 pts or more

When finished...

Turn in a SCREENSHOT after your Tester function has run (I already know the URL of your group project).
Leave a comment with your group name.

![Scenes](/apcsp/scrum/sprint1/scrum1.png)

## Product Backlog

  - *Required* Create a Tester function that requires no arguments. The function will test ALL of the functions that your team has created (or will create) this sprint. Example Tester below. = *5pts (You probably want to save this one for last)*


```
# Here is an example Tester function
def Tester():
  # by Mr. Riley
  # 5pts
  DrawCircle(0,0,100,"red")
  GotoRandom(-400,400,800,800)
  Balloon()
  GotoRandom(-400,400,800,800)
  Cloud()
  GotoRandom(-400,400,800,800)
  Car()
  WriteText(200,-200,"Team A","pink")
```

  - Create a WriteText function that requires 2 arguments: text, color. The function will set the color, and write the text CENTER aligned. Use the [built-in Turtle method that writes text](https://docs.python.org/3/library/turtle.html#turtle.write) = *5pts*
  - Create the following six random color functions: a randomRed function that requires no arguments and returns an RGB tuple, a randomBlue function that requires no arguments and returns an RGB tuple, a randomGreen function that requires no arguments and returns an RGB tuple, a randomYellow function that requires no arguments and returns an RGB tuple, a randomOrange function that requires no arguments and returns an RGB tuple, randomPurple function that requires no arguments and returns an RGB tuple = *13pts*
  - Create a GotoRandom function that requires 4 arguments: centerX, centerY, width, height. This function will allow something to be randomly place WITHIN A PORTION of the canvas. For example, GotoRandom(100,75,200,150) will only generate random locations in the first quadrant around point (100,75). The function will pick up the pen, calculate a randomX between centerX - half the width and centerX + half the width, calculate a randomY between centerY - half the height and centerY + half the height, and then go to the new random location. = *8pts*
  - Create a DrawRect function that requires 3 arguments: width, height, color. The function will put down the pen, set the heading to east, set the fill color, begin fill, move forward width, turn 90 degrees, etc. = *3pts*
  - Create a DrawCircle function that requires 2 arguments: size, color. The function will pick up the pen, set the heading to east, move forward half the size, turn 90 degrees, set the fill color, begin fill, put the pen down, repeat 36 times, move forward 2 x pi x radius / 36, turn, etc. = *3pts*
  - Create a DrawSlice function that requires 4 arguments: radius, smallerHeading, largerHeading, color. This function will allow you to draw a filled-in semi-circle or pizza slice. The function will pick up the pen, set the fill color, begin fill, set the heading to smallerHeading, move forward radius, turn 90 degrees, put the pen down, repeat (largerHeading - smallerHeading) times, move forward, turn, etc. = *5pts*
  - Create a DrawArch function that requires 4 arguments: radius, smallerHeading, largerHeading, color. This function will allow you to draw a NOT filled-in curve or arch. The function will pick up the pen, set the heading to smallerHeading, move forward radius, turn 90 degrees, put the pen down, repeat (largerHeading - smallerHeading) times, move forward, turn, etc. = *5pts*
  - Balloon = *5pts*
  - Barn = *8pts*
  - Bird = *8pts*
  - Bridge = *13pts*
  - Boat = *13pts*
  - Bus = *13pts*
  - Butterfly = *13pts*
  - Car = *13pts*
  - Cloud = *5pts*
  - CloudTree = *5pts*
  - Clown Fish = *13pts*
  - Crab = *13pts*
  - CrescentMoon = *3pts*
  - DeadTree = *13pts*
  - Fence = *8pts*
  - Fish = *3pts*
  - Flower = *8pts*
  - GroundWithHills = *8pts*
  - GroundWithRiver = *8pts*
  - GroundWithOcean = *8pts*
  - Helicopter = *13pts*
  - Hot Air Balloon = *13pts*
  - Jellyfish = *8pts*
  - Kite = *5pts*
  - MountainsInTheDistance = *13pts*
  - Octopus = *13pts*
  - PalmTree = *8pts*
  - PineTree = *8pts*
  - Pufferfish = *13pts*
  - Pumpkin = *8pts*
  - Rainbow = *13pts*
  - Road = *3pts*
  - Sandcastle = *13pts*
  - Seahorse = *13pts*
  - Seashell = *8pts*
  - Seaweed = *13pts*
  - Skyscraper = *8pts*
  - Starfish = *5pts*
  - StickPerson = *5pts*
  - Stingray = *13pts*
  - Submarine = *13pts*
  - SunWithRays = *5pts*
  - SunkenShip = *13pts*
  - Swordfish = *5pts*
  - TeardropTree = *8pts*
  - TreasureChest = *13pts*
  - Truck = *13pts*
  - TubeCoral = *5pts*
  - Turtle = *13pts*
  - Ufo = *13pts*
  - Waves = *13pts*
  - WindTurbine = *13pts*
