# Mob Riding Mob

In the `src` folder, you will write your code in the `MobRidingMob.java` file.

## Entity class API

Check the Spigot API for the [Entity class](https://hub.spigotmc.org/javadocs/spigot/org/bukkit/entity/Entity.html) and look for the method that will allow you to add a passenger to an entity. Notice that the method requires an Entity object as an argument. Because of polymorphism, we can use ANY subclass of the Entity class as a passenger.

You should also notice that some of the methods are DEPRECATED and should NOT be used. 

## What combinations are possible?

Look at the list of "All Known Subinterfaces" in the Entity class API. In your MobRidingMob.java code, leave comments that list 3 different WEIRD combinations (not Villager riding Horse) of MobRidingMob that you *could* create.
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

## Can you spawn two Entity objects and make one ride the other?

Complete the public static spawnMobPair method. Spawns two objects that are from sub-classes of Entity, then adds one object as the passenger of the other. Some riders will only work if they are babies, not adults. If you want, you can use the setBaby() method. NOTE: you can NOT do villager riding horse because that's boring.

## Can you use a loop to spawn multiple pairs?

Create a public static method named spawnRiders that returns the number of riders as an int. Two parameters are required: Location and World. Uses a loop to spawn a random number of riders (maybe 5-10?). You MUST use the Math.random() method to generate a random number.


In the onCommand method

- Call the spawnRiders method
- Log a message for the player that says how many where spawns and what mobs were spawned. For example, "spawned 7 villagers riding horses" however you can NOT do villagers riding horses because that's boring.



