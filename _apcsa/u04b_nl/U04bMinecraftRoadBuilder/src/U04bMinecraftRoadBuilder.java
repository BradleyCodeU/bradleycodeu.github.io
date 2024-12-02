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
 
public class U04bMinecraftRoadBuilder extends JavaPlugin {

    public static final Logger LOG = Logger.getLogger("Minecraft");


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



    
}

