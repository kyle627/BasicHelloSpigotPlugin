package com.kyleevangelisto.firstplugin.spigot;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class Spigot extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("Hello").setExecutor(new Spigot());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (label.equalsIgnoreCase("Hello")){
            if (sender instanceof Player){
                Player steve = (Player) sender;
                steve.sendMessage("HELLO??? ");
            }else{
                sender.sendMessage("BOOOOOOOO");
            }
            return true;
        }

        return false;

    }
}
