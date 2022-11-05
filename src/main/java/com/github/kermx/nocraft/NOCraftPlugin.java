package com.github.kermx.nocraft;

import com.willfp.eco.core.EcoPlugin;
import org.bukkit.event.Listener;

import java.util.List;

public final class NOCraftPlugin extends EcoPlugin {
    @Override
    protected List<Listener> loadListeners() {
        return List.of(
                new InteractHandler()
        );
    }
}
