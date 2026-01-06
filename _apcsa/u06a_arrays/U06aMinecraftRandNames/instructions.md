---
layout: project
category: u06a_arrays
title: Minecraft Random Names
---

In the `src` folder, you will write your code in the `PetWolf.java` file.

## STEP 1: Can you randomize the collar color?

Create a public static method named getRandomDyeColor that returns a DyeColor. No parameters are required.

Check the Spigot API for the [DyeColor class](https://hub.spigotmc.org/javadocs/spigot/org/bukkit/DyeColor.html) for a list of the class constants (for example DyeColor.PINK), create an array of type DyeColor that contains a few colors, and randomly select a DyeColor from the list.

## STEP 2: Recreate Mr. Riley's Random Name Algorithm

Create a public static method named getRandomName that returns a String. No parameters are required.

Inside of getRandomName you will write code for Mr. Riley's random name algorithm: 
- Create an array of dog names
- randomly select a name and use substring to get only the first half
- randomly select a name and use substring to get only the second half
- return the first half concatenated with the second half.
- This should generate "interesting" names like Coodo (Cooper + Fido), Root (Rover + Spot), Fiper (Fido + Cooper), Coover (Cooper + Rover), Fiot (Fido + Spot), Fiver (Fido + Rover) and Rodo (Rover + Fido).

## STEP 3: Make a "better" random name algorithm!

Below the getRandomName method...

Create a public static method named betterNamingAlgorithm

Using the 1st half + 2nd half method doesn't always create traditional names (for example, Stu + Tank = Snk). Describe a different or better way to take a list of 10 names and generate more than 10 random names. First, describe the process (aka the algorithm) and then write it as code.

## STEP 4: Tame and Name

Check the Spigot [Wolf class](https://hub.spigotmc.org/javadocs/spigot/org/bukkit/entity/Wolf.html) which lists the methods that can change a wolf’s collar color and custom name (look at the Nameable methods). 

In the onCommand method

- set the wolf object to be tame
- set the player as the owner
- set the collar color to a random choice from array
- set its name using the get random name method. 
- log a message for the player with the name and color



## STEP 5: Rainbow Road

Create an Array of several Materials (for example, red wool, green wool, and blue wool). Name the array myPattern. Check the Spigot API entry for [Material](https://hub.spigotmc.org/javadocs/spigot/org/bukkit/Material.html)

Create one loop that will always repeat 25 times. On iteration 0, use the material at myPattern index location 0. 
On iteration 1, use the material at myPattern index location 1. And so on. 

🟥🟩🟦🟥🟩🟦🟥🟩🟦🟥🟩🟦🟥🟩🟦

Don't forget to add i to the x location so that each block is placed in a line.

Use the modulus operator to ensure that the pattern repeats automatically and you never get an Index Of Of Bounds error.

### How to change a block in your Minecraft world
```Java
Location spot = me.getLocation();
World world = me.getWorld();
Block block = world.getBlockAt(spot.getBlockX(),spot.getBlockY(),spot.getBlockZ());
block.setType(Material.WOOD);
```

Oh no! There is a red line and it says "WOOD cannot be resolved or is not a field" See the Spigot API reference for the Material class here: [https://hub.spigotmc.org/javadocs/bukkit/org/bukkit/Material.html](https://hub.spigotmc.org/javadocs/bukkit/org/bukkit/Material.html)

```Java
public void executeRainbowRoadCommand(Player me){

}
```