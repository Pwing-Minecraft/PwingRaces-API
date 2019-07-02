package net.pwing.races.api.events;

import net.pwing.races.api.race.Race;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

public class RaceReclaimSkillpointsEvent extends PlayerEvent implements Cancellable {

    protected static final HandlerList handlers = new HandlerList();

    private Race race;
    private int oldSkillpointCount;
    private int newSkillpointCount;

    private boolean cancelled;

    public RaceReclaimSkillpointsEvent(Player player, Race race, int oldSkillpointCount, int newSkillpointCount) {
        super(player);

        this.race = race;
        this.oldSkillpointCount = oldSkillpointCount;
        this.newSkillpointCount = newSkillpointCount;
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
     * Returns the race in which the player reclaimed their skillpoints
     *
     * @return the race in which the player reclaimed their skillpoints
     */
    public Race getRace() {
        return race;
    }

    /**
     * Returns the player's skillpoint count before this event is called
     *
     * @return the player's skillpoint count before this event is called
     */
    public int getOldSkillpointCount() {
        return oldSkillpointCount;
    }

    /**
     * Returns the new skillpoint count that is set
     *
     * @return the new skillpoint count that is set
     */
    public int getNewSkillpointCount() {
        return newSkillpointCount;
    }

    /**
     * Sets the new skillpoint count for this event
     *
     * @param newSkillpointCount the new skillpoint count that is set
     */
    public void setNewSkillpointCount(int newSkillpointCount) {
        this.newSkillpointCount = newSkillpointCount;
    }

    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}