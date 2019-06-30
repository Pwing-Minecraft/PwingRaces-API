package net.pwing.races.api.race;

import org.bukkit.OfflinePlayer;

import java.util.Map;

/**
 * RacePlayer API implementation
 *
 * @author Redned
 */
public interface RacePlayer {

    /**
     * Returns the offline player
     *
     * @return the offline player
     */
    OfflinePlayer getPlayer();

    /**
     * Returns the player's active race
     *
     * @return the player's active race
     */
    Race getActiveRace();

    /**
     * Returns the player's active race
     *
     * @param race the player's active race
     */
    void setActiveRace(Race race);

    /**
     * Returns the race data for the specified race
     *
     * @param race the race you want to get data for
     * @return the race data for the specified race
     */
    RaceData getRaceData(Race race);

    /**
     * Returns the race data for the player's active race
     *
     * @return the race data for the player's active race
     */
    RaceData getActiveRaceData();

    /**
     * Returns the data map for the player's races.
     *
     * Key: the name of the race
     * Value: the race data
     *
     * @return the data map for the player's races
     */
    Map<String, RaceData> getRaceDataMap();
}
