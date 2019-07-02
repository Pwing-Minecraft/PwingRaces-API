package net.pwing.races.api.events;

import net.pwing.races.api.race.Race;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Collection;

/**
 * Runs when a player's reclaims their race items
 *
 * @author Redned
 */
public class RaceReclaimItemsEvent extends PlayerEvent implements Cancellable {

    protected static final HandlerList handlers = new HandlerList();

    private Race race;
    private Collection<ItemStack> raceItems;

    private boolean cancelled;

    public RaceReclaimItemsEvent(Player player, Race race, Collection<ItemStack> raceItems) {
        super(player);

        this.race = race;
        this.raceItems = raceItems;
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
     * Returns the race in which the player reclaimed their items
     *
     * @return the race in which the player reclaimed their items
     */
    public Race getRace() {
        return race;
    }

    /**
     * Returns a collection of the race items
     *
     * @return a collection of the race items
     */
    public Collection<ItemStack> getRaceItems() {
        return raceItems;
    }

    /**
     * Sets the race items collection
     *
     * @param raceItems a collection of the race items
     */
    public void setRaceItems(Collection<ItemStack> raceItems) {
        this.raceItems = raceItems;
    }

    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}