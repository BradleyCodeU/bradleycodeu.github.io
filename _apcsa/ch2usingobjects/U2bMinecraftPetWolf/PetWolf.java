import java.util.logging.*;
import org.bukkit.*;
import org.bukkit.command.*;
import org.bukkit.entity.*;
import org.bukkit.plugin.java.*;


class PetWolf extends JavaPlugin {
    public static final Logger LOG = Logger.getLogger("Minecraft");

    public boolean onCommand(CommandSender sender, Command command,
        String label, String[] arguments) {

        if (label.equalsIgnoreCase("petwolf")) {
            if (sender instanceof Player) {
                Player me = (Player) sender;// get the player
                Location spot = me.getLocation();// get the player's current location
                World world = me.getWorld();// get the game world
                Wolf myWolf = world.spawn(spot, Wolf.class); // spawn one wolf
                // set it to be tame
              
                // set the player as the owner
              
                // set the color of its collar

                // set its name

                // log a message for the player
                LOG.info(" ");
                return true;
            }
        }
        if (label.equalsIgnoreCase("petllama")) {
            if (sender instanceof Player) {
                Player me = (Player) sender;// get the player
                Location spot = me.getLocation();// get the player's current location
                World world = me.getWorld();// get the game world
                // spawn a llama
              
                // set it to be tame
              
                // set the player as the owner
              
                // set its color
              
                // log a message for the player
                LOG.info(" ");
                return true;
            }
        }
        // create a command to generate and tame a different pet
        if (label.equalsIgnoreCase("???")) {
            if (sender instanceof Player) {
                // your code goes here
                return true;
            }
        }
        return false;
    }
}
// Q1: By looking at the API you should have noticed some patterns in the method names. Imagine that Mojang adds the ability for Wolves to wear hats. If they follow the pattern in the API, what should they name the two methods that will allow you to:
//  - retrieve information about this wolf's current hat status
//  - change this wolf's hat status
// A1:

// Q2: Imagine that Minecraft has added a new Alien mob. What NEW ability (NOT an ability that is already present in the API and NOT wear hats) might an alien have? Following the pattern in the API, what would you name the methods that allow you to:
//  - retrieve information about this alien's current ability status
//  - change this alien's ability status
// A2: