package com.itdognorights.screwingupminecraft;

import com.itdognorights.screwingupminecraft.handlers.StoneCutterHandler;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class ScrewingUpMinecraft extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getLogger().info("ScrewingUpMinecraft is enabled");
        getServer().getPluginManager().registerEvents(new StoneCutterHandler(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getLogger().info("ScrewingUpMinecraft is disabled");
    }
}
