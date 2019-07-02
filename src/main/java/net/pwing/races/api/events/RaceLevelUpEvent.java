package net.pwing.races.api.events;

import net.pwing.races.api.race.Race;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

/**
 * Runs when a player's race levels up
 *
 * @author Redned
 */
public class RaceLevelUpEvent extends PlayerEvent {

    protected static final HandlerList handlers = new HandlerList();

    private Race race;

    private int oldLevel;
    private int newLevel;

    private boolean cancelled;

    public RaceLevelUpEvent(Player player, Race race, int oldLevel, int newLevel) {
        super(player);

        this.race = race;
        this.oldLevel = oldLevel;
        this.newLevel = newLevel;
    }

    /**
     * Returns the race that levelled up
     *
     * @return the race that levelled up
     */
    public Race getRace() {
        return race;
    }

    /**
     * Returns the level before this event is called
     *
     * @return the level before this event is called
     */
    public int getOldLevel() {
        return oldLevel;
    }

    /**
     * Returns the new level that is set
     *
     * @return the new level that is set
     */
    public int getNewLevel() {
        return newLevel;
    }

    /**
     * Sets the new level for this event
     *
     * @param newLevel the new level that is set
     */
    public void setNewLevel(int newLevel) {
        this.newLevel = newLevel;
    }

    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
