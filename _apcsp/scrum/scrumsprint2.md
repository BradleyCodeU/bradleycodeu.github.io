---
layout: project
category: scrum
title: Scrum Sprint 2
---
This project is to be completed with your assigned group of 3 or more.

![Scenes](/apcsp/turtleart/ArtScene.PNG)

Hold a Sprint Planning Meeting with your group. Start by creating post-its the following 5 Required Tasks, then pick a dozen other drawing tasks from the [Product Backlog below](#product-backlog).

5 REQUIRED TASKS:
  - Create an isValidNumber function that returns true if the number is 1, 2, or 3 and otherwise returns false = *2pts*
  - Create a cityScene function that calls every function that you want drawn in the city. For example, groundWithOcean, several MountainsInTheDistance, several skyscrapers, several cars, bridge, several clouds, boat, helicopter, etc. = *8pts*
  - Create a countryScene function that calls every function that you want drawn in the country. For example, groundWithRiver, boat, MountainsInTheDistance, several trees, barn, car, bridge, several clouds, several birds, helicopter, etc. = *8pts*
  - Create a underwaterScene function that calls every function that you want drawn underwater. For example, waves, boat, several clouds, several seaweed, helicopter, several fish, several starfish, etc. = *8pts*
  - Create a Main function that asks the user "Which scene would you like? Type either 1 for city, 2 for country, or 3 for underwater: " then collects the user input. If the user input is invalid, print "Not a valid number 1-3". If it is valid then call either cityScene, countryScene, or underwaterScene. = *5pts*


Each day will begin with [The Daily Standup (aka The Daily Scrum)](https://www.mountaingoatsoftware.com/agile/scrum/meetings/daily-scrum) a standing (not sitting) meeting of 15 minutes or less. Taking turns, each member says:
  - What did you do yesterday?
  - What will you do today?
  - Are there any "blockers" in your way? Any things on which you are currently stuck?
  - Update the [Scrum Board](https://www.mountaingoatsoftware.com/agile/scrum/scrum-tools/task-boards), if necessary

![Example Scrum Board](/apcsp\scrum\scrum-board.jpg)


## Product Backlog


- Create a WriteText function that requires 4 arguments: centerX, centerY, text, color. The function will pick up the pen, go to point (centerX,centerY), set the color, and write the text center aligned. = *8pts*
- Create the following six random color functions: a randomRed function that requires no arguments and returns an RGB tuple, a randomBlue function that requires no arguments and returns an RGB tuple, a randomGreen function that requires no arguments and returns an RGB tuple, a randomYellow function that requires no arguments and returns an RGB tuple, a randomOrange function that requires no arguments and returns an RGB tuple, randomPurple function that requires no arguments and returns an RGB tuple = *13pts*
- Create a GotoRandom function that requires four arguments: topLeftX, topLeftY, width, height. The function will pick up the pen, calculate a randomX between topLeftX and (topLeftX + width), calculate a randomY between topLeftY and (topLeftY - height), and then go to the new random location. = *8pts*
- Create a DrawRect function that requires 5 arguments: topLeftX, topLeftY, width, height, color. The function will pick up the pen, go to point (topLeftX,topLeftY), set the heading to east, set the fill color, begin fill, put the pen down, move forward width, turn 90 degrees, etc. = *13pts*
- Create a DrawCircle function that requires 4 arguments: centerX, centerY, radius, color. The function will pick up the pen, go to point (centerX,centerY), set the heading to east, move forward radius, turn 90 degrees, set the fill color, begin fill, put the pen down, repeat 36 times, move forward 2 x pi x radius / 36, etc. = *13pts*
- Create a DrawArc function that requires 6 arguments: centerX, centerY, radius, smallerHeading, largerHeading, color. The function will pick up the pen, go to point (centerX,centerY), set the fill color, begin fill, set the heading to smallerHeading, move forward radius, turn 90 degrees, put the pen down, repeat (largerHeading - smallerHeading) times, move forward 2 x pi x radius / 36, etc. = *13pts*
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
