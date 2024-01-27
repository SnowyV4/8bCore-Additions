package modding.coreadditions.Listeners;

import io.papermc.paper.event.packet.PlayerChunkLoadEvent;
import modding.coreadditions.Main;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class ChunkListener implements Listener {
    private final Main plugin;
    FileConfiguration config;
    public ChunkListener(Main plugin) {this.plugin = plugin;}
    @EventHandler
    public void Chunkchecking(PlayerChunkLoadEvent event) {
    }
}
