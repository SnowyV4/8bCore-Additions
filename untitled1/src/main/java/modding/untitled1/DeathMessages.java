package modding.untitled1;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

import static org.bukkit.Bukkit.getServer;

public class DeathMessages implements Listener {
    private final Main plugin;
    public DeathMessages(Main plugin) {this.plugin = plugin;}
    @EventHandler
    public void onDeath(EntityDamageByEntityEvent event) {
        var victim = event.getEntity();
        if(victim instanceof Player) {
            if(event.getDamage() >= ((Player) victim).getHealth()) {
                if (event.getDamager() instanceof Player){getServer().broadcastMessage("§1[8b8t] "+((Player) victim).getDisplayName() + " has died to " + event.getDamager().getName());
                }else {
                getServer().broadcastMessage("§1[8b8t] "+((Player) victim).getDisplayName() + " has died to a " + event.getDamager().getName()); }
            }
        }
    }
}
