package net.pwing.races.api.events;

import net.pwing.races.api.race.Race;
import net.pwing.races.api.race.skilltree.RaceSkilltreeElement;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

/**
 * Runs when a player purchases an element in a skilltree
 *
 * @author Redned
 */
public class RaceElementPurchaseEvent extends PlayerEvent implements Cancellable {

    protected static final HandlerList handlers = new HandlerList();

    private Race race;
    private RaceSkilltreeElement element;

    private boolean cancelled;

    public RaceElementPurchaseEvent(Player player, Race race, RaceSkilltreeElement element) {
        super(player);

        this.race = race;
        this.element = element;
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
     * Returns the race that the element is being purchased in
     *
     * @return the race that the element is being purchased in
     */
    public Race getRace() {
        return race;
    }

    /**
     * Returns the purchased skilltree element
     *
     * @return the purchased skilltree element
     */
    public RaceSkilltreeElement getPurchasedElement() {
        return element;
    }

    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
