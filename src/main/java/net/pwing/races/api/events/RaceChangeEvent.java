package net.pwing.races.api.events;

import net.pwing.races.api.race.Race;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

import java.util.Optional;

/**
 * Runs when a player changes their race
 *
 * @author Redned
 */
public class RaceChangeEvent extends PlayerEvent implements Cancellable {

    protected static final HandlerList handlers = new HandlerList();

    private Race oldRace;
    private Race newRace;

    private boolean cancelled;

    public RaceChangeEvent(Player player, Race oldRace, Race newRace) {
        super(player);
        this.oldRace = oldRace;
        this.newRace = newRace;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    /**
     * Returns the player's race before this event is called
     *
     * @return the player's race before this event is called
     */
    public Optional<Race> getOldRace() {
        return Optional.ofNullable(oldRace);
    }

    /**
     * Returns the new race that is set
     *
     * @return the new race that is set
     */
    public Race getNewRace() {
        return newRace;
    }

    /**
     * Sets the new race for this event
     *
     * @param newRace the new race that is set
     */
    public void setNewRace(Race newRace) {
        this.newRace = newRace;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}