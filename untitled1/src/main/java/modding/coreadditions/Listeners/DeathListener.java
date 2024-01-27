package modding.coreadditions.Listeners;

import modding.coreadditions.Main;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

import static org.bukkit.Bukkit.getServer;

public class DeathListener implements Listener {
    private final Main plugin;

    public DeathListener(Main plugin) {this.plugin = plugin;}
    @EventHandler
    public void onDeath(EntityDamageByEntityEvent event) {
        FileConfiguration config = plugin.getConfig();

        var killer = event.getDamager();
        var victim = event.getEntity();
        if(victim instanceof Player) {
            if(event.getDamage() >= ((Player) victim).getHealth()) {

                if (event.getDamager() instanceof Player) {
                    String msg = config.getString("Core-Additions.Death-message-player");
                    msg = msg.replace("<killer>", ((Player) killer).getDisplayName());
                    msg = msg.replace("<victim>", ((Player) victim).getDisplayName());
                    getServer().broadcastMessage(msg);
                }else {
                    String msg = config.getString("Core-Additions.Death-message-mob");
                    msg = msg.replace("<killer>", event.getDamager().getName());
                    msg = msg.replace("<victim>", ((Player) victim).getDisplayName());
                    getServer().broadcastMessage(msg); }
            }
        }
    }
}
