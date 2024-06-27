package ru.sscorpionn.tutorial;

import org.bukkit.plugin.java.JavaPlugin;

public final class Tutorial extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("гдея").setExecutor(new Commands());
        this.getCommand("лох").setExecutor(new Commands());

        getServer().getPluginManager().registerEvents(new Listeners(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
