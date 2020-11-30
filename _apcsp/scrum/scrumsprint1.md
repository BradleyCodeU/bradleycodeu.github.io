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

Your first meeting is also a [Sprint Planning meeting](https://www.mountaingoatsoftware.com/agile/scrum/meetings/sprint-planning-meeting) in which the team members select tasks from the Product Backlog that they plan on completing during the upcoming sprint. Pick 10-15 tasks. Write the name and number of points on post-it notes. Place these tasks in the To Do column of your Scrum Board.

For Sprint 1, your team must simply complete a set number of points.
  - 3 team members = 90 pts or more
  - 4 team members = 120 pts or more

## Product Backlog

  - *Required* Create a Tester function that requires no arguments. The function will test ALL of the functions that your team has created (or will create) this sprint. Example Tester below. = *5 pts (You probably want to save this one for last)*


```
# Here is an example Tester function
def Tester():
  # by Mr. Riley
  # 5 pts
  DrawCircle(0,0,100,"red")
  GotoRandom(-400,400,800,800)
  Balloon()
  GotoRandom(-400,400,800,800)
  Cloud()
  GotoRandom(-400,400,800,800)
  Car()
  WriteText(200,-200,"Team A","pink")
```

  - Create a WriteText function that requires 4 arguments: centerX, centerY, text, color. The function will pick up the pen, go to point (centerX,centerY), set the color, and write the text center aligned. = *8 pts*
  - Create the following six random color functions: a randomRed function that requires no arguments and returns an RGB tuple, a randomBlue function that requires no arguments and returns an RGB tuple, a randomGreen function that requires no arguments and returns an RGB tuple, a randomYellow function that requires no arguments and returns an RGB tuple, a randomOrange function that requires no arguments and returns an RGB tuple, randomPurple function that requires no arguments and returns an RGB tuple = *13 pts*
  - Create a GotoRandom function that requires four arguments: topLeftX, topLeftY, width, height. The function will pick up the pen, calculate a randomX between topLeftX and (topLeftX + width), calculate a randomY between topLeftY and (topLeftY - height), and then go to the new random location. = *8 pts*
  - Create a DrawRect function that requires 5 arguments: topLeftX, topLeftY, width, height, color. The function will pick up the pen, go to point (topLeftX,topLeftY), set the heading to east, set the fill color, begin fill, put the pen down, move forward width, turn 90 degrees, etc. = *13 pts*
  - Create a DrawCircle function that requires 4 arguments: centerX, centerY, radius, color. The function will pick up the pen, go to point (centerX,centerY), set the heading to east, move forward radius, turn 90 degrees, set the fill color, begin fill, put the pen down, repeat 36 times, move forward 2 x pi x radius / 36, etc. = *13 pts*
  - Create a DrawArc function that requires 6 arguments: centerX, centerY, radius, smallerHeading, largerHeading, color. The function will pick up the pen, go to point (centerX,centerY), set the fill color, begin fill, set the heading to smallerHeading, move forward radius, turn 90 degrees, put the pen down, repeat (largerHeading - smallerHeading) times, move forward 2 x pi x radius / 36, etc. = *13 pts*
  - Balloon = *5 pts*
  - Barn = *8 pts*
  - Bird = *8 pts*
  - Bridge = *13 pts*
  - Boat = *13 pts*
  - Bus = *13 pts*
  - Butterfly = *13 pts*
  - Car = *13 pts*
  - Cloud = *5 pts*
  - CloudTree = *5 pts*
  - Clown Fish = *13 pts*
  - Crab = *13 pts*
  - CrescentMoon = *3 pts*
  - DeadTree = *13 pts*
  - Fence = *8 pts*
  - Fish = *3 pts*
  - Flower = *8 pts*
  - GroundWithHills = *8 pts*
  - GroundWithRiver = *8 pts*
  - GroundWithOcean = *8 pts*
  - Helicopter = *13 pts*
  - Hot Air Balloon = *13 pts*
  - Jellyfish = *8 pts*
  - Kite = *5 pts*
  - MountainsInTheDistance = *13 pts*
  - Octopus = *13 pts*
  - PalmTree = *8 pts*
  - PineTree = *8 pts*
  - Pufferfish = *13 pts*
  - Pumpkin = *8 pts*
  - Rainbow = *13 pts*
  - Road = *3 pts*
  - Sandcastle = *13 pts*
  - Seahorse = *13 pts*
  - Seashell = *8 pts*
  - Seaweed = *13 pts*
  - Skyscraper = *8 pts*
  - Starfish = *5 pts*
  - StickPerson = *5 pts*
  - Stingray = *13 pts*
  - Submarine = *13 pts*
  - SunWithRays = *5 pts*
  - SunkenShip = *13 pts*
  - Swordfish = *5 pts*
  - TeardropTree = *8 pts*
  - TreasureChest = *13 pts*
  - Truck = *13 pts*
  - TubeCoral = *5 pts*
  - Turtle = *13 pts*
  - Ufo = *13 pts*
  - Waves = *13 pts*
  - WindTurbine = *13 pts*
