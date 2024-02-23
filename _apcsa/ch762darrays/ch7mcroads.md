---
layout: project
category: ch762darrays
title: MC Roads
permalink: /apcsa/ch762darrays/ch7mcpetrandomnames/
---


Concepts covered in this project include arrays, nested loops.


Starter code:
```Java
package com.javaminecraft;
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
 
@SuppressWarnings("deprecation")
public class House extends JavaPlugin {
    public static final Logger LOG = Logger.getLogger("Minecraft");

}
```


Let's learn about how arguments work with Minecraft commands. Notice that agruments is a String array so that users can supply many or none. In this case, the user must supply 2 or more. For example, "road 6 1"

Below is the basic onCommand method that will read "road" as the label and will read "6" and "1" as a String array of arguments: ["6", "1"]

```Java
@Override
public boolean onCommand(CommandSender sender, Command command, 
    String label, String[] arguments) {
        
    if (label.equalsIgnoreCase("road") && arguments.length > 1) {
        if (sender instanceof Player) {
            executeRoadCommand(sender,arguments);
        }
        return true;
    }
    return false;
}
```

### How to change a block in your Minecraft world
```Java
Player me = (Player) sender;
Location spot = me.getLocation();
World world = me.getWorld();
Block block = world.getBlockAt(spot.getBlockX(),spot.getBlockY(),spot.getBlockZ());
block.setType(Material.WOOD);
```

See the Spigot API reference for the Material class here: [https://hub.spigotmc.org/javadocs/bukkit/org/bukkit/Material.html](https://hub.spigotmc.org/javadocs/bukkit/org/bukkit/Material.html)


### How to place a Minecart
```Java
Minecart cart = world.spawn(block.getLocation(), Minecart.class);
cart.setVelocity(new Vector(0.0,0.0,0.0));
```

### Add a method named executeRoadCommand
```Java
\*
Parameters: sender (who issued the command), arguments (additional details for the command)
Purpose: Creates a road with rails and a minecart in a Minecraft world.
*\
public void executeRoadCommand(CommandSender sender,String[] arguments) 
```

### Retrieve Player/World Information
Get the player who sent the command and their current location in the world. The code for this is above in the "How to change a block in your Minecraft world" section

### Extract Road Dimensions
Get the width and depth of the road from the command arguments.
```Java
int xWidth = Integer.parseInt(arguments[0]);
int yHeight = 4;
int zDepth = Integer.parseInt(arguments[1]);
```

### Check Road Orientation
Either the xWidth or the zDepth *should* be set to 1. Decide how you want to fix the problem if the user forgets that one should be 1. What if the user types "road 0 -5"??? What if the user types "road 99 88"??? What if the user types "road 99 99"??? Either log a message and don't build a road OR automatically adjust the numbers for the user. Your choice.


### Construct the Road
```Java
//    #    Outer Loop: Iterate through the width of the road while xLoc < xWidth
//    #    #    Middle Loop: Iterate through the height of the road while yLoc < yHeight
//    #    #    #    Inner Loop: Iterate through the depth of the road while zLoc < zDepth
//    #    #    #    #    Calculate Block Position: Determine the coordinates of the current block to be modified within the road's dimensions. The code for this is above in the "How to change a block in your Minecraft world" section
//    #    #    #    #    Set the block to be air in order to remove anything already there.
//    #    #    #    #    If yLoc is 0 (ground level):
//    #    #    #    #    #    Place blocks for the base of the road.
//    #    #    #    #    #    Place a redstone block every 10th block for power.
//    #    #    #    #    If yLoc is 1 (rail level):
//    #    #    #    #    #    Place powered rails.
//    #    #    #    #    #    Place a minecart at start of the road. Can be placed with rail.
```