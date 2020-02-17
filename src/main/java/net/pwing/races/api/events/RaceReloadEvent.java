package net.pwing.races.api.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * Runs when the PwingRaces plugin is reloaded
 *
 * @author Redned
 */
public class RaceReloadEvent extends Event {

    protected static final HandlerList handlers = new HandlerList();

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
