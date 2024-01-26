package modding.untitled1;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new DeathMessages(this), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
