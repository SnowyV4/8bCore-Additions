package modding.untitled1;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class DeathMessages implements Listener {
    private final Main plugin;
    public DeathMessages(Main plugin) {this.plugin = plugin;}
    @EventHandler
    public void OnPlayerDeath(PlayerDeathEvent Event) {
        String Name = Event.getPlayer().getDisplayName();
        Event.setDeathMessage(Name + "This player died to the causes of");
    }

}