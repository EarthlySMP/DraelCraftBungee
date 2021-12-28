package net.kz_n.draelcraftbungee.command;

import net.kz_n.draelcraftbungee.util.MessagingUtils;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class DiscordCommand extends Command {

    public DiscordCommand() {
        super("discord");
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        if(!(sender instanceof ProxiedPlayer)) return;
        TextComponent messageComponent = MessagingUtils.getPrefixedMessage(
                "Click to join our discord!",
                0,
                "https://www.draelcraft.net/discord",
                "Opens the link to our discord in your web browser.");
        sender.sendMessage(messageComponent);
    }
}
