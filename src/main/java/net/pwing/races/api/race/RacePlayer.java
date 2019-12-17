package net.pwing.races.api.race;

import org.bukkit.OfflinePlayer;

import java.util.Map;
import java.util.Optional;

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
     * Returns if the player has a race active
     *
     * @return if the player has a race active
     */
    default boolean hasRace() {
        return getRace().isPresent();
    }

    /**
     * Returns the player's active race
     *
     * @return the player's active race
     */
    Optional<Race> getRace();

    /**
     * @deprecated replaced with {@link #getRace()};
     */
    default Race getActiveRace() {
        return getRace().orElse(null);
    }

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
    default RaceData getRaceData(Race race) {
        return getRaceDataMap().get(race.getName());
    }

    /**
     * Returns the race data for the player's active race
     *
     * @return the race data for the player's active race
     */
    default Optional<RaceData> getActiveRaceData() {
        return getRace().map(this::getRaceData);
    }

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
