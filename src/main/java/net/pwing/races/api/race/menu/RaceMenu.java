package net.pwing.races.api.race.menu;

import net.pwing.races.api.race.Race;
import org.bukkit.entity.Player;

/**
 * Race API implementation
 *
 * @author Redned
 */
public interface RaceMenu {

    /**
     * Opens the races menu for the specified player
     *
     * @param player the player to open the menu for
     */
    void openMenu(Player player);

    /**
     * Opens the menu for the specified race
     *
     * @param player the player to open the menu for
     * @param race the race you want to open the menu for
     */
    void openRaceMenu(Player player, Race race);
}
