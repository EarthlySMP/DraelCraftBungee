package net.kz_n.draelcraftbungee.command;

import net.kz_n.draelcraftbungee.util.MessagingUtils;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class RulesCommand extends Command {

    public RulesCommand() {
        super("rules");
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        if(!(sender instanceof ProxiedPlayer)) return;
        TextComponent messageComponent = MessagingUtils.getPrefixedMessage(
                "Click to view our rules.",
                0,
                "https://www.draelcraft.net/rules",
                "Opens the link to our rules in your web browser.");
        sender.sendMessage(messageComponent);
    }
}