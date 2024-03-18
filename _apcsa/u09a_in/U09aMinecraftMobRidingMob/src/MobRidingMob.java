import java.util.logging.*;
import org.bukkit.*;
import org.bukkit.command.*;
import org.bukkit.entity.*;
import org.bukkit.plugin.java.*;


class MobRidingMob extends JavaPlugin {
    public static final Logger LOG = Logger.getLogger("Minecraft");

    // Look at the list of "All Known Subinterfaces" in the Entity class API. In your MobRidingMob.java code, leave comments that list 3 different weird combinations (not Villager riding Horse) of MobRidingMob that you could create.
    // 1.
    // 2.
    // 3.

    // Q: Is there a limit to the number of passengers or can you add an infinite amount? If yes, what might be the limit? Explain your thinking.
    // A: 

  
    // Complete the public static spawnMobPair method. Spawns two objects that are from sub-classes of Entity, then adds one object as the passenger of the other. The mobs should NOT spawn at the exact same location as the player. NOTE: you can NOT do villager riding horse because that's boring.
    public static void spawnMobPair(Location playerLocation, World myWorld){
      // The mobs should NOT spawn at the exact same location as the player.
      Location spot = new Location(myWorld, playerLocation.getX(), playerLocation.getY(), playerLocation.getZ()); // make a spawn location
      
      // Spawn first entity
      ClassName variableName = myWorld.spawn(spawnLocation, ClassName.class); // spawn one ClassName object
      
      // Spawn second entity
      ClassName variableName = myWorld.spawn(spawnLocation, ClassName.class); // spawn one ClassName object

      // Some riders will only work if they are babies, not adults. If you want, you can use the setBaby() method

      // Set one entity as the passenger of the other
      
    }


    // Create a public static method named spawnRiders that returns the number of riders as an int. Two parameters are required: Location and World. Uses a loop that repeats a random number of times (maybe 5-10?) and calls the spawnMobPair method. You MUST use the Math.random() method to generate a random number.
    
  
  

    public boolean onCommand(CommandSender sender, Command command,
        String label, String[] arguments) {

        if (label.equalsIgnoreCase("petwolf")) {
            if (sender instanceof Player) {
                Player me = (Player) sender;// get the player
                Location playerLocation = me.getLocation();// get the player's current location
                World myWorld = me.getWorld();// get the game world

                // Call the spawnRiders method. Save the number it returns in a variable so you can put it in the log message.
                

                // Log a message for the player that says how many where spawns and what mobs were spawned. For example, "spawned 7 villagers riding horses" however you can NOT do villagers riding horses because that's boring.
                LOG.info(" ");
                return true;
            }
        }
        return false;
    }
}