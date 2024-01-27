package modding.coreadditions.Listeners;

import io.papermc.paper.event.player.PlayerItemFrameChangeEvent;
import modding.coreadditions.Main;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class ItemFramelistener implements Listener {
    private final Main plugin;
    public ItemFramelistener(Main plugin) {this.plugin = plugin;}
    @EventHandler
    public void Item(PlayerItemFrameChangeEvent event) {
        Material glass = event.getItemStack().getType();
        if (glass == Material.GLASS) {
            event.getItemFrame().setVisible(false);
            event.getItemStack().setType(Material.AIR);
        }
    }
}
