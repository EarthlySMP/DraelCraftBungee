package net.kz_n.draelcraftbungee.command;

import net.kz_n.draelcraftbungee.util.MessagingUtils;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class DonateCommand extends Command {

    public DonateCommand() {
        super("donate");
    }
    @Override
    public void execute(CommandSender sender, String[] args) {
        if(!(sender instanceof ProxiedPlayer)) return;
        TextComponent messageComponent = MessagingUtils.getPrefixedMessage(
                "Click to view our webstore!",
                0,
                "http://store.draelcraft.net/",
                "Opens the link to our webstore in your web browser, Thanks for your support!");
        sender.sendMessage(messageComponent);
    }
}
