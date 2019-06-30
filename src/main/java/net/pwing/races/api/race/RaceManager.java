package net.pwing.races.api.race;

import org.bukkit.OfflinePlayer;
import org.bukkit.World;
import org.bukkit.entity.Player;

import java.util.Map;
import java.util.Set;
import java.util.UUID;

/**
 * RaceManager API implementation
 *
 * @author Redned
 */
public interface RaceManager {

    /**
     * Registers a player into memory
     *
     * @param player the player you want to add into memory
     * @return if the player was added properly
     */
    boolean setupPlayer(OfflinePlayer player);

    /**
     * Saves all of the player's race data to config
     *
     * @param player the player who's data you want to save
     */
    void savePlayer(Player player);

    /**
     * Returns the race from the name
     *
     * @param name the name of the race you want to find
     * @return the race from the name
     */
    Race getRaceFromName(String name);

    /**
     * Gets the player's race data for the specified race
     *
     * @param player the player you want to get data from
     * @param race the race you want to get data from
     * @return the player's race data for the specified race
     */
    RaceData getPlayerData(OfflinePlayer player, Race race);

    /**
     * Registers a player's configs
     *
     * @param player the player whose config you want to create
     */
    void registerPlayer(Player player);

    /**
     * Registers a player's configs
     *
     * @param player the player whose config you want to create
     * @param override if you want to override what's already there
     */
    void registerPlayer(Player player, boolean override);

    /**
     * Returns if races is enabled in the specified world
     *
     * @param world the world you want to check if races is enabled in
     * @return if races is enabled in the specified world
     */
    boolean isRacesEnabledInWorld(World world);

    /**
     * Returns the registered races
     *
     * @return the registered races
     */
    Set<Race> getRaces();

    /**
     * Returns a map of all the players registered into memory
     *
     * Key: the player's UUID
     * Value: the RacePlayer object of the player
     *
     * @return a map of all the players registered into memory
     */

    Map<UUID, RacePlayer> getRacePlayerMap();
}
