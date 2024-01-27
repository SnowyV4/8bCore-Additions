package modding.coreadditions;

import modding.coreadditions.Listeners.ChunkListener;
import modding.coreadditions.Listeners.DeathListener;
import modding.coreadditions.Listeners.ItemFramelistener;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin implements Listener {
    FileConfiguration config = getConfig();
    @Override
    public void onEnable() {
        config.options().copyDefaults(true);
        saveDefaultConfig();
        // Plugin startup logic
        PluginManager p = getServer().getPluginManager();
        if (config.getBoolean("Core-Additions.ChunkCheck")) {p.registerEvents(new ChunkListener(this), this);} if (config.getBoolean("Core-Additions.CustomDeathMessages")) {p.registerEvents(new DeathListener(this), this);} if (config.getBoolean("Core-Additions.InvisibleItemFrames")){p.registerEvents(new ItemFramelistener(this), this);}
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

