package net.pwing.races.api.race.skilltree;

import net.pwing.races.api.race.RaceManager;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

/**
 * RaceSkilltreeMenu API implementation
 *
 * @author Redned
 */
public interface RaceSkilltreeMenu {

    /**
     * Opens the race skilltree menu for the specified player
     *
     * @param player the player to open the menu for
     */
    void openMenu(Player player);

    /**
     * Returns the element item (icon, red glass pane [locked],
     * orange glass pane [unlocked] or green glass pane [purchased])
     * for the specified skilltree element and player
     *
     * @param player the player to obtain race data from
     * @param skilltreeElement the skilltree element to obtain data from
     * @return the element item for the specified skilltree element and player
     */
    ItemStack getElementItem(Player player, RaceSkilltreeElement skilltreeElement);
}
