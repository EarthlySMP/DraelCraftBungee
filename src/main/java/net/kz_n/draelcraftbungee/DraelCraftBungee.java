package net.kz_n.draelcraftbungee;

import net.kz_n.draelcraftbungee.command.DiscordCommand;
import net.kz_n.draelcraftbungee.command.DonateCommand;
import net.kz_n.draelcraftbungee.command.RulesCommand;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Plugin;

public final class DraelCraftBungee extends Plugin {

    @Override
    public void onEnable() {
        ProxyServer.getInstance().getPluginManager().registerCommand(this, new DiscordCommand());
        ProxyServer.getInstance().getPluginManager().registerCommand(this, new DonateCommand());
        ProxyServer.getInstance().getPluginManager().registerCommand(this, new RulesCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
