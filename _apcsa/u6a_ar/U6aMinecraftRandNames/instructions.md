# PetWolf Random Names

In the `src` folder, you will write your code in the `PetWolf.java` file.

## Can you randomize the collar color?

Create a public static method named getRandomDyeColor that returns a DyeColor. No parameters are required.

Check the Spigot API for the [DyeColor class](https://hub.spigotmc.org/javadocs/spigot/org/bukkit/DyeColor.html) for a list of the class constants (for example DyeColor.PINK), create an array of type DyeColor that contains a few colors, and randomly select a DyeColor from the list.

## Can you give the wolf a random name?

Create a public static method named getRandomName that returns a String. No parameters are required.

Inside of getRandomName you will write code for Mr. Riley's random name algorithm: 
- Create an array of dog names
- randomly select a name and use substring to get only the first half
- randomly select a name and use substring to get only the second half
- return the first half concatenated with the second half.
- This should generate "interesting" names like Coodo (Cooper + Fido), Root (Rover + Spot), Fiper (Fido + Cooper), Coover (Cooper + Rover), Fiot (Fido + Spot), Fiver (Fido + Rover) and Rodo (Rover + Fido).

## A better random name algorithm?

Below the getRandomName method...

Create a public static method named betterNamingAlgorithm

Using the 1st half + 2nd half method doesn't always create traditional names (for example, Stu + Tank = Snk). Describe a different or better way to take a list of 10 names and generate more than 10 random names. First, describe the process (aka the algorithm) and then write it as code.

## Tame and Name

Check the Spigot [Wolf class](https://hub.spigotmc.org/javadocs/spigot/org/bukkit/entity/Wolf.html) which lists the methods that can change a wolf’s collar color and custom name (look at the Nameable methods). 

In the onCommand method

- set the wolf object to be tame
- set the player as the owner
- set the collar color to a random choice from array
- set its name using the get random name method. 
- log a message for the player with the name and color



