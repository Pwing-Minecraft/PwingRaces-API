package net.pwing.races.api.events;

import net.pwing.races.api.race.Race;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

/**
 * Runs when a player's race exp changes
 *
 * @author Redned
 */
public class RaceExpChangeEvent extends PlayerEvent implements Cancellable {

    protected static final HandlerList handlers = new HandlerList();

    private Race race;

    private int oldExp;
    private int newExp;

    private boolean cancelled;

    public RaceExpChangeEvent(Player player, Race race, int oldExp, int newExp) {
        super(player);

        this.race = race;
        this.oldExp = oldExp;
        this.newExp = newExp;
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
     * Returns the race where the exp is changed
     *
     * @return the race where the exp is changed
     */
    public Race getRace() {
        return race;
    }

    /**
     * Returns the exp before this event is called
     *
     * @return the exp before this event is called
     */
    public int getOldExp() {
        return oldExp;
    }

    /**
     * Returns the new race exp that is set
     *
     * @return the new race exp that is set
     */
    public int getNewExp() {
        return newExp;
    }

    /**
     * Sets the new race exp for this event
     *
     * @param newExp the new race exp that is set
     */
    public void setNewExp(int newExp) {
        this.newExp = newExp;
    }

    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
