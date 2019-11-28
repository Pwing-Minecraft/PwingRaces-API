package net.pwing.races.api.race;

import net.pwing.races.api.race.ability.RaceAbilityManager;
import net.pwing.races.api.race.attribute.RaceAttributeManager;
import net.pwing.races.api.race.level.RaceLevelManager;
import net.pwing.races.api.race.menu.RaceMenu;
import net.pwing.races.api.race.permission.RacePermissionManager;
import net.pwing.races.api.race.skilltree.RaceSkilltreeManager;
import net.pwing.races.api.race.trigger.RaceTriggerManager;

import org.bukkit.OfflinePlayer;
import org.bukkit.World;
import org.bukkit.entity.Player;

import java.util.Map;
import java.util.Optional;
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
    default Optional<Race> getRaceFromName(String name) {
        for (Race race : getRaces()) {
            if (race.getName().equalsIgnoreCase(name))
                return Optional.of(race);
        }

        return Optional.empty();
    }

    /**
     * Returns the RacePlayer for the given player
     *
     * @param player the offline player you want to get the RacePlayer for
     * @return the RacePlayer for the given player
     */
    default RacePlayer getRacePlayer(OfflinePlayer player) {
        return getRacePlayerMap().get(player.getUniqueId());
    }

    /**
     * Returns the player's race data for the specified race
     *
     * @param player the player you want to get data from
     * @param race the race you want to get data from
     * @return the player's race data for the specified race
     */
    default RaceData getPlayerData(OfflinePlayer player, Race race) {
        return getRacePlayer(player).getRaceData(race);
    }

    /**
     * Registers a player's configs
     *
     * @param player the player whose config you want to create
     */
    default void registerPlayer(Player player) {
        registerPlayer(player, false);
    }

    /**
     * Registers a player's configs
     *
     * @param player the player whose config you want to create
     * @param override if you want to override what's already there
     */
    void registerPlayer(Player player, boolean override);

    /**
     * Returns the ability manager
     *
     * @return the ability manager
     */
    RaceAbilityManager getAbilityManager();

    /**
     * Returns the attribute manager
     *
     * @return the attribute manager
     */
    RaceAttributeManager getAttributeManager();

    /**
     * Returns the level manager
     *
     * @return the level manager
     */
    RaceLevelManager getLevelManager();

    /**
     * Returns the permission manager
     *
     * @return the permission manager
     */
    RacePermissionManager getPermissionManager();

    /**
     * Returns the skilltree manager
     *
     * @return the skilltree manager
     */
    RaceSkilltreeManager getSkilltreeManager();

    /**
     * Returns the trigger manager
     *
     * @return the trigger manager
     */
    RaceTriggerManager getTriggerManager();

    /**
     * Returns the race menu object
     *
     * @return the race menu object
     */
    RaceMenu getRaceMenu();

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
