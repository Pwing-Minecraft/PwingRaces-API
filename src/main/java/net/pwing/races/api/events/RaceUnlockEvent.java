package net.pwing.races.api.events;

import net.pwing.races.api.race.Race;

import org.bukkit.OfflinePlayer;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class RaceUnlockEvent extends Event implements Cancellable {

    protected static final HandlerList handlers = new HandlerList();

    private OfflinePlayer player;
    private Race race;

    private boolean cancelled;

    public RaceUnlockEvent(OfflinePlayer player, Race race) {
        this.player = player;
        this.race = race;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public OfflinePlayer getPlayer() {
        return player;
    }

    /**
     * Returns the race that is unlocked
     *
     * @return the race that is unlocked
     */
    public Race getRace() {
        return race;
    }

    /**
     * Sets the unlocked race for this event
     *
     * @param race the race that is unlocked
     */
    public void setRace(Race race) {
        this.race = race;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
