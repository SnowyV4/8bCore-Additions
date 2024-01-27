package modding.untitled1;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class DeathMessages implements Listener {
    private final Main plugin;
    public DeathMessages(Main plugin) {this.plugin = plugin;}
    @EventHandler
    public void OnPlayerDeath(PlayerDeathEvent Event) {
        String Cause = Event.getPlayer().getKiller().getDisplayName();
        String Name = Event.getPlayer().getDisplayName();
        if (Cause != null) {
            Event.setDeathMessage(Name + "This player died to the causes of" + Cause);
        } else { Event.setDeathMessage(Name + "This player died."); }

    }

}
