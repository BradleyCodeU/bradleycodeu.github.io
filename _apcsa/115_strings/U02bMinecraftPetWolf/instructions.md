---
layout: project
category: 115_strings
title: U02b Minecraft Pet Wolf
---
Minecraft Pet Wolf

In the `src` folder, you will write your code in the `PetWolf.java` file.

For this project, you will use the Spigot API: [https://hub.spigotmc.org/javadocs/spigot/](https://hub.spigotmc.org/javadocs/spigot/)

The API documentation for the Wolf class is here: [https://hub.spigotmc.org/javadocs/spigot/org/bukkit/entity/Wolf.html](https://hub.spigotmc.org/javadocs/spigot/org/bukkit/entity/Wolf.html)

## Directions:

  1. spawn one wolf... Wolf myWolf = world.spawn(spot, Wolf.class);
  1. set it to be tame
  1. set the player as the owner
  1. set the color of its collar
  1. set its name
  1. log a message for the player
  1. Next, spawn a llama
  1. set it to be tame
  1. set the player as the owner
  1. set its color
  1. log a message for the player
  1. create a command that will generate and tame a different pet
  1. Finally, answer the following questions as comments at the bottom of the `PetWolf.java` file:

  
```
// Q1: By looking at the API you should have noticed some patterns in the method names. Imagine that Mojang adds the ability for Wolves to wear hats. If they follow the pattern in the API, what should they name the two methods that will allow you to:
//  - retrieve information about this wolf's current hat status
//  - change this wolf's hat status
// A1:

// Q2: Imagine that Minecraft has added a new Alien mob. What NEW ability (NOT an ability that is already present in the API and NOT wear hats) might an alien have? Following the pattern in the API, what would you name the methods that allow you to:
//  - retrieve information about this alien's current ability status
//  - change this alien's ability status
// A2:
```