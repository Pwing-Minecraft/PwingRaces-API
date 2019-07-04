package net.pwing.races.api.race.level;

import net.pwing.races.api.race.Race;

import org.bukkit.entity.Player;

/**
 * RaceLevelManager API implementation
 *
 * @author Redned
 */
public interface RaceLevelManager {

    /**
     * Sets the amount of experience for a player's race
     *
     * @param player the player to set experience for
     * @param race the player's race to set the experience for
     * @param experience the amount of experience
     */
    void setExperience(Player player, Race race, int experience);

    /**
     * Sets the level of the player's race
     *
     * @param player the player to set the level for
     * @param race the player's race to set the level for
     * @param level the level
     */
    void setLevel(Player player, Race race, int level);

    /**
     * Returns if the player's race is able to level up
     *
     * @param player the player to check
     * @param race the player's race to check
     * @return if the player's race is able to level up
     */
    boolean canLevelUp(Player player, Race race);
}