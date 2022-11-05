package nocraft.nocraft;

import nocraft.nocraft.handlers.InteractHandler;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class NOcraft extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info("NOcraft has started");

        new InteractHandler(this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getLogger().info("NOcraft has stopped");
    }
}
