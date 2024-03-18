---
layout: project
category: u4b_nl
title: Minecraft Road Builder
---


Concepts covered in this project include arrays, nested loops.


Starter code:
```Java
import java.util.logging.Logger;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.BlockState;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Minecart;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.util.Vector;
 
public class U06aMinecraftRoadBuilder extends JavaPlugin {
    public static final Logger LOG = Logger.getLogger("Minecraft");


```


Let's learn about how arguments work with Minecraft commands. Notice in the code below that the parameter arguments is a String array so that users can supply many or none. In this case, the user must supply 2 or more. For example, "road 6 1"

Below is the basic onCommand method that will read "road" as the label and will read "6" and "1" as a String array of arguments: ["6", "1"]

```Java
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] arguments) {
        if (label.equalsIgnoreCase("road") && arguments.length > 1) {
            if (sender instanceof Player) {
                executeRoadCommand(sender, arguments);
            }
            return true;
        }
        return false;
    }
```

Next step? Add a method named executeRoadCommand

### How to change a block in your Minecraft world
```Java
Player me = (Player) sender;
Location spot = me.getLocation();
World world = me.getWorld();
Block block = world.getBlockAt(spot.getBlockX(),spot.getBlockY(),spot.getBlockZ());
block.setType(Material.WOOD);
```

Oh no! There is a red line and it says "WOOD cannot be resolved or is not a field" See the Spigot API reference for the Material class here: [https://hub.spigotmc.org/javadocs/bukkit/org/bukkit/Material.html](https://hub.spigotmc.org/javadocs/bukkit/org/bukkit/Material.html)


### How to place a Minecart
A Minecart is not a Material. It's an entity like a wolf, horse, or llama. In this project you will change the Material at a specific point and then ALSO put a Minecart at that same point. Here is the Spigot API reference: [https://hub.spigotmc.org/javadocs/spigot/org/bukkit/entity/Minecart.html](https://hub.spigotmc.org/javadocs/spigot/org/bukkit/entity/Minecart.html)
```Java
Minecart cart = world.spawn(block.getLocation(), Minecart.class);
cart.setVelocity(new Vector(0.0,0.0,0.0)); // sets the speed of the Minecart
```



### Add a method named executeRoadCommand
```Java
\*
Parameters: sender (who issued the command), arguments (additional details for the command)
Purpose: Creates a road with rails and a minecart in a Minecraft world.
*\
public void executeRoadCommand(CommandSender sender, String[] arguments) 
```

### Retrieve Player/World Information
Get the player who sent the command and their current location in the world. The code for this is above in the "How to change a block in your Minecraft world" section

### Extract Road Dimensions
Get the width and depth of the road from the command arguments.
```Java
int xWidth = Integer.parseInt(arguments[0]);
int yHeight = 4; // this makes sure that we allow enough vertical space for tunnels
int zDepth = Integer.parseInt(arguments[1]);
```

### Check Road Orientation
Either the xWidth or the zDepth *should* be set to 1. Decide how you want to fix the problem if the user forgets that one should be 1. What if the user types "road 0 -5"??? What if the user types "road 99 88"??? What if the user types "road 99 99"??? Either log a message and don't build a road OR automatically adjust the numbers for the user. Your choice.


### Construct the Road
```Java
//    #    Outer Loop: Iterate through the width of the road while xLoc < xWidth
//    #    #    Middle Loop: Iterate through the height of the road while yLoc < yHeight
//    #    #    #    Inner Loop: Iterate through the depth of the road while zLoc < zDepth
//    #    #    #    #    Calculate Block Position: Determine the coordinates of the current block to be modified within the road's dimensions. The code for this is above in the "How to change a block in your Minecraft world" section. NOTE: Don't forget to add xLoc to spot.getBlockX(), add yLoc to spot.getBlockY(), etc.
//    #    #    #    #    Set the block to be air in order to remove anything already there.
//    #    #    #    #    If yLoc is 0 (ground level):
//    #    #    #    #    #    Place blocks for the base of the road.
//    #    #    #    #    #    Place a redstone block every 10th block for power.
//    #    #    #    #    If yLoc is 1 (rail level):
//    #    #    #    #    #    Place powered rails.
//    #    #    #    #    #    Place a minecart at start of the road. Can be placed with rail.
```

### PART 2: Checkerboard

Make a wool "rug" with a checkboard pattern like this...
```
█░█░█░█░█░█░█░█░█░
░█░█░█░█░█░█░█░█░█
█░█░█░█░█░█░█░█░█░
░█░█░█░█░█░█░█░█░█
█░█░█░█░█░█░█░█░█░
░█░█░█░█░█░█░█░█░█
█░█░█░█░█░█░█░█░█░
░█░█░█░█░█░█░█░█░█
```

You will use 2 nested loops to increase the x location and z location. The y location will always stay the same.

```Java
public void executeCheckerboardCommand(CommandSender sender, String[] arguments) 
```




### PART 3: Create your own custom 'road' and vehicle

Use the Spigot API for Vehicle: [https://hub.spigotmc.org/javadocs/spigot/org/bukkit/entity/Vehicle.html](https://hub.spigotmc.org/javadocs/spigot/org/bukkit/entity/Vehicle.html)
Use the Spigot API for Material: [https://hub.spigotmc.org/javadocs/bukkit/org/bukkit/Material.html](https://hub.spigotmc.org/javadocs/bukkit/org/bukkit/Material.html)

Create another method that will build a different kind of road and a different vehicle. Your choice! Maybe make a "road" of water and place a ChestBoat? Maybe make a dirt path road and a Horse? Maybe make a lava road and a Strider?

Enough nested loops! Add your vehicle and use one loop that will always repeat 25 times to place your "road".

```Java
public void executeCustomRoadCommand(CommandSender sender, String[] arguments) 
```
