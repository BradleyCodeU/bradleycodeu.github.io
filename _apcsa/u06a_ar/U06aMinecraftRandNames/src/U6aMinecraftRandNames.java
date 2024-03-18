import java.util.logging.Logger;
import org.bukkit.*;
import org.bukkit.command.*;
import org.bukkit.entity.*;
import org.bukkit.plugin.java.*;
import org.bukkit.DyeColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.BlockState;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.util.Vector;


class PetWolf extends JavaPlugin {
    public static final Logger LOG = Logger.getLogger("Minecraft");

    // STEP 1
    // Create a public static method named getRandomDyeColor that returns a DyeColor. No parameters are required.

  
    // STEP 2
    // Create a public static method named getRandomName that returns a String. No parameters are required. 
    // Inside of getRandomName you will write code for Mr. Riley's random name algorithm: 
    // - Create an array of dog names
    // - randomly select a name and use substring to get only the first half
    // - randomly select a name and use substring to get only the second half
    // - return the first half concatenated with the second half.
    // - This should generate "interesting" names like Coodo (Cooper + Fido), Root (Rover + Spot), Fiper (Fido + Cooper), 
    //   Coover (Cooper + Rover), Fiot (Fido + Spot), Fiver (Fido + Rover) and Rodo (Rover + Fido).

  
    // STEP 3
    // Create a public static method named betterNamingAlgorithm
    // Using the 1st half + 2nd half method doesn't always create traditional names 
    // (for example, Stu + Tank = Snk). Describe a different or better way to take a 
    // list of 10 names and generate more than 10 random names. First, describe the 
    // process (aka the algorithm) and then write it as code:
    //
    //
    //
    //
    //
    //
    // 
    // (your answer goes here. describe the process (aka the algorithm) and then write it as code.)
    //
    //
    //
    //
    //


    // STEP 4
    // executePetWolfCommand(Player me)
        // Location spot = me.getLocation();// get the player's current location
        // World world = me.getWorld();// get the game world
        // Wolf myWolf = world.spawn(spot, Wolf.class); // spawn one wolf
        // // set the wolf object to be tame
        
        // // set the player as the owner
        
        // // set the collar color to a random choice from array
        
        // // set its name using the get random name method

        // // log a message for the player with the name and color
        // LOG.info(" ");


    // STEP 5
    // executeRainbowRoadCommand(Player me)

  
    public boolean onCommand(CommandSender sender, Command command,
        String label, String[] arguments) {

        if (label.equalsIgnoreCase("petwolf")) {
            if (sender instanceof Player) {
                Player me = (Player) sender;// get the player
                executePetWolfCommand(me);
                return true;
            }
        }
        return false;
    }
}