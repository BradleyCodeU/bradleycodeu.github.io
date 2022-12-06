---
layout: project
category: scrum
title: Scrum Sprint 2
---
This project is to be completed with your assigned group of 3 or more.

Do NOT delete the old tasks from the Done section of your Scrum Board.


![Scenes](/apcsp/scrum/ArtScene.PNG)

TLDR: There are 5 new tasks that your group must add to your To Do list. These 5 tasks are required for the group to complete during this sprint. Details for these tasks are in the directions.

- isValidNumber 2pts
- cityScene 5pts
- countryScene 5pts
- underwaterScene 5pts
- Main 3pts


With last week's points and this week's points combined, each person should have completed a total of 60 story points or more (30 from last sprint plus 30 from THIS sprint) by the end of this sprint.

Once you have complete your additional 30 story points for this sprint...

Turn in a SCREENSHOT after your Main function has run (I already know the URL of your group project).
Leave a comment with your group name.

## Directions

Hold a Sprint Planning Meeting with your group. Start by creating post-its the following 5 Required Tasks, then pick a dozen other drawing tasks from the [Product Backlog below](#product-backlog).

5 REQUIRED TASKS:
  1. Create an isValidNumber function that returns true if the number is 1, 2, or 3 and otherwise returns false = *2pts*
  1. Create a cityScene function that calls every function that you want drawn in the city. For example, groundWithOcean, several MountainsInTheDistance, several skyscrapers, several cars, bridge, several clouds, boat, helicopter, etc. = *5pts*
  1. Create a countryScene function that calls every function that you want drawn in the country. For example, groundWithRiver, boat, MountainsInTheDistance, several trees, barn, car, bridge, several clouds, several birds, helicopter, etc. = *5pts*
  1. Create a underwaterScene function that calls every function that you want drawn underwater. For example, waves, boat, several clouds, several seaweed, helicopter, several fish, several starfish, etc. = *5pts*
  1. Create a Main function that asks the user "Which scene would you like? Type either 1 for city, 2 for country, or 3 for underwater: " then collects the user input. If the user input is invalid, print "Not a valid number 1-3". If it is valid then call either cityScene, countryScene, or underwaterScene. = *3pts*


Each day will begin with [The Daily Standup (aka The Daily Scrum)](https://www.mountaingoatsoftware.com/agile/scrum/meetings/daily-scrum) a standing (not sitting) meeting of 15 minutes or less. Taking turns, each member says:
  - What did you do yesterday?
  - What will you do today?
  - Are there any "blockers" in your way? Any things on which you are currently stuck?
  - Update the [Scrum Board](https://www.mountaingoatsoftware.com/agile/scrum/scrum-tools/task-boards), if necessary

![Example Scrum Board](/apcsp\scrum\scrum-board.jpg)


## Product Backlog


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
