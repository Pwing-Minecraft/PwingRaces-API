package net.pwing.races.api.race;

import net.pwing.races.api.util.math.EquationResult;

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
     * @deprecated replaced with {@link #getRace()};
     */
    @Deprecated
    default Race getActiveRace() {
        return getRace().orElse(null);
    }

    /**
     * Returns the player's active race
     *
     * @return the player's active race
     */
    Optional<Race> getRace();

    /**
     * @deprecated replaced with {@link #setRace(Race)};
     */
    @Deprecated
    default void setActiveRace(Race race) {
        setRace(race);
    }

    /**
     * Sets the player's active race
     *
     * @param race the player's active race
     */
    void setRace(Race race);

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

    /**
     * Returns a map of temporary attribute values the player
     * currently has applied. These are non-persistent
     * and in most cases are removed shortly after they
     * are applied
     *
     * Key: the name of the attribute
     * Value: the value of the attribute
     *
     * @return a map of temporary attribute values
     */
    Map<String, EquationResult> getTemporaryAttributes();

}
