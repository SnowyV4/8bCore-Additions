import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.net.http.WebSocket;

public final class DeathMessagePlugin extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }
    @EventHandler
    public void onDeath(PlayerDeathEvent event) {
        String name = event.getPlayer().getDisplayName();
        event.getPlayer().sendMessage(name + " has died!");
    }
    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
