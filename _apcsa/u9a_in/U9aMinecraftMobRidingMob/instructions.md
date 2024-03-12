# Mob Riding Mob

In the `src` folder, you will write your code in the `MobRidingMob.java` file.

## Entity class API

You may have heard about Chicken jockeys in Minecraft? Well in the Spigot API, a Chicken is NOT a Vehicle. It is just an Entity that can add a passenger.

Check the Spigot API for the [Entity class](https://hub.spigotmc.org/javadocs/spigot/org/bukkit/entity/Entity.html) and look for the method that will allow you to add a passenger to an entity. Notice that the method requires an Entity object as an argument. Because of polymorphism, we can use ANY subclass of the Entity class as a passenger. 

You should also notice that some of the methods are DEPRECATED and should NOT be used. 


## What combinations are possible?

Look at the list of "All Known Subinterfaces" in the Entity class API. In your MobRidingMob.java code, leave comments that list 3 different WEIRD combinations (do NOT include Horse or Chicken) of MobRidingMob that you *technically could* create.
```
    // 1.
    // 2.
    // 3.
```

## How many passengers?

The API does not say if there is a limit to the number of passengers that an entity can have. In your MobRidingMob.java code, leave a comment to answer the question...
```
// Q: Is there a limit to the number of passengers or can you add an infinite amount? If yes, what might be the limit? Explain your thinking.
// A: 
```

## Can you generate a sheep jockey?

Complete the public static sheepJockey method.

Update this code `Chicken clucky = world.spawn(chickenSpot, Chicken.class);` so that it will spawn an instance of the [Sheep class](https://hub.spigotmc.org/javadocs/spigot/org/bukkit/entity/Sheep.html) and save it a variable type Chicken. Update this code `Zombie rob = world.spawn(chickenSpot, Zombie.class);` so that it is spawning a [Villager](https://hub.spigotmc.org/javadocs/spigot/org/bukkit/entity/Villager.html) instead of a Zombie. Add the Villager as the passenger of the sheep. Give the sheep a random [DyeColor](https://hub.spigotmc.org/javadocs/spigot/org/bukkit/DyeColor.html).


## Can you spawn two Entity objects and make one ride the other?

Complete the public static spawnMobPair method. Spawns two objects that are from sub-classes of Entity, then adds one object as the passenger of the other. Some riders will only work if they are babies, not adults. If you want, you can use the setBaby() method. 

NOTE: you can NOT do the following because they're boring...

- villager riding horse
- zombie riding chicken
- village riding sheep (because we already did that)

## Can you use a loop to spawn a "normal distribution" of sheep jockeys?

Instead of just making 1 sheep jockey, let's make a lot. 

Create a public static method named spawnMany that returns the number of riders as an int. Two parameters are required: Location and World. Uses a loop to spawn a random number of riders. You MUST use the Math.random() method to generate a random numbers in a normal distribution.

A normal distribution (also known as a bell curve) will expect that median values are more likely and extreme values are less likely. Consider rolling two dice. You have about a 44% change of rolling a 6, 7, or 8, but you only have about a 3% chance of rolling a 12. We would simulate rolling two dice in Java like this `(int) (Math.random() * 6 + 1) + (int) (Math.random() * 6 + 1)` and we would get a bell curve of values ranging from 2 to 12. How can you change that code to generate a bell curve of values ranging from 8 to 16?

In the onCommand method

- Call the spawnMany method
- Log a message for the player that says how many sheep jockeys were just generated.



