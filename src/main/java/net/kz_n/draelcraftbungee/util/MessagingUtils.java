package net.kz_n.draelcraftbungee.util;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.w3c.dom.Text;

import javax.annotation.Nullable;

public class MessagingUtils {
    private static TextComponent prefix = null;

    public static TextComponent getPrefix() {
        if(prefix == null) {
            // [
            prefix = new TextComponent("[");
            prefix.setColor(ChatColor.WHITE);
            // [Draelcraft
            TextComponent draelcraftComponent = new TextComponent("Draelcraft");
            draelcraftComponent.setColor(ChatColor.RED);
            prefix.addExtra(draelcraftComponent);
            // [Draelcraft]
            TextComponent endComponent = new TextComponent("]");
            endComponent.setColor(ChatColor.WHITE);
            prefix.addExtra(endComponent);
        }
        return prefix;
    }

    public static TextComponent getPrefixedMessage(String message, int severity, @Nullable String clickUrl, @Nullable String hoverString) {
        TextComponent resultComponent = new TextComponent();

        TextComponent spaceComponent = new TextComponent(" ");
        spaceComponent.setColor(ChatColor.RESET);

        TextComponent messageComponent = new TextComponent(message);
        switch(severity) {
            // info
            case 0:
                messageComponent.setColor(ChatColor.GRAY);
                break;
            // success
            case 1:
                messageComponent.setColor(ChatColor.GOLD);
                break;
            // warn
            case 2:
                messageComponent.setColor(ChatColor.YELLOW);
                messageComponent.setBold(true);
                break;
            // error
            case 3:
                messageComponent.setColor(ChatColor.RED);
                break;
        }

        if(clickUrl != null) messageComponent.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL,clickUrl));
        if(hoverString != null) messageComponent.setHoverEvent(
                new HoverEvent(HoverEvent.Action.SHOW_TEXT,
                        new ComponentBuilder(hoverString).color(messageComponent.getColor()).create()));

        resultComponent.addExtra(getPrefix());
        resultComponent.addExtra(spaceComponent);
        resultComponent.addExtra(messageComponent);
        return resultComponent;
    }

    public static TextComponent getPrefixedMessage(String message) {
        return getPrefixedMessage(message,0, null, null);
    }
}
