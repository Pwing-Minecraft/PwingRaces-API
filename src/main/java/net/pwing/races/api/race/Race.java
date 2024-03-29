package net.pwing.races.api.race;

import net.pwing.races.api.race.ability.RaceAbility;
import net.pwing.races.api.race.attribute.RaceAttribute;
import net.pwing.races.api.race.menu.RaceIconData;
import net.pwing.races.api.race.permission.RacePermission;
import net.pwing.races.api.race.trigger.RaceTrigger;

import org.bukkit.Location;
import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Race API implementation
 *
 * @author Redned
 */
public interface Race {

    /**
     * Returns the name of the race
     *
     * @return the name of the race
     */
    String getName();

    /**
     * Sets the name of the race.
     *
     * @param name the name of the race
     */
    void setName(String name);

    /**
     * Returns the display name of the race
     *
     * @return the display name of the race
     */
    String getDisplayName();

    /**
     * Sets the display name of the race
     *
     * @param displayName the display name of the race
     */
    void setDisplayName(String displayName);

    /**
     * Returns if the race needs to be unlocked
     *
     * @return if the race needs to be unlocked
     */
    boolean doesRequireUnlock();

    /**
     * Sets if the race needs to be unlocked
     *
     * @param requireUnlock if the race needs to be unlocked
     */
    void setRequiresUnlock(boolean requireUnlock);

    /**
     * Returns the max level of the race
     *
     * @return the max level of the race
     */
    int getMaxLevel();

    /**
     * Sets the max level of the race
     *
     * @param maxLevel the max level of the race
     */
    void setMaxLevel(int maxLevel);

    /**
     * Returns if the race has a spawn location
     *
     * @return if the race has a spawn location
     */
    default boolean hasSpawnLocation() {
        return getSpawnLocation().isPresent();
    }

    /**
     * Returns the spawn location of the race
     *
     * @return the spawn location of the race
     */
    Optional<Location> getSpawnLocation();

    /**
     * Sets the spawn location of the race
     *
     * @param location the spawn location of the race
     */
    void setSpawnLocation(Location location);

    /**
     * Returns the skilltree map of the race
     *
     * @return the skilltree map of the race
     */
    Map<Integer, String> getSkilltreeMap();

    /**
     * Sets the skilltree map of the race
     *
     * @param skilltreeMap the skilltree map of the race
     */
    void setSkilltreeMap(Map<Integer, String> skilltreeMap);

    /**
     * Returns the race items of the race
     *
     * @return the race items of the race
     */
    Map<String, ItemStack> getRaceItems();

    /**
     * Sets the race items of the race
     *
     * @param raceItems the race items of the race
     */
    void setRaceItems(Map<String, ItemStack> raceItems);

    /**
     * Returns the item definitions within the race.
     *
     * @return the item definitions within the race
     */
    Map<String, RaceItemDefinition> getItemDefinitions();

    /**
     * Sets the item definitions of the race.
     *
     * @param itemDefinitions sets the item definitions of the race
     */
    void setItemDefinitions(Map<String, RaceItemDefinition> itemDefinitions);

    /**
     * Returns the data for the race's icon
     *
     * @return the data for the race's icons
     */
    RaceIconData getIconData();

    /**
     * Sets the icon data for the race
     *
     * @param iconData the data for the race's icon
     */
    void setIconData(RaceIconData iconData);

    /**
     * Returns if the level is the max level of the race
     *
     * @param level the level you want to check
     * @return if the selected level is the max level of the race
     */
    boolean isMaxLevel(int level);

    /**
     * Returns the required experience to level up for a certain level
     *
     * @param level the level you want to check
     * @return the required experience to level up for a certain level
     */
    int getRequiredExperience(int level);

    /**
     * Returns the amount of skillpoints received for the level
     *
     * @param level the level you want to check
     * @return the amount of skillpoints received for the level
     */
    int getSkillpointsForLevel(int level);

    /**
     * Returns the level map for race experience per level
     *
     * Key: the level
     * Value: experience for the level
     *
     * @return the level map for race experience per level
     */
    Map<Integer, Integer> getRaceLevelMap();

    /**
     * Sets the level map for race experience per level
     *
     * @param raceLevelMap the race level map you want to set
     */
    void setRaceLevelMap(Map<Integer, Integer> raceLevelMap);

    /**
     * Returns the skillpoint map for skillpoints per level
     *
     * Key: the level
     * Value: skillpoints for the level
     *
     * @return tthe skillpoint map for skillpoints per level
     */
    Map<Integer, Integer> getRaceSkillpointsMap();

    /**
     * Sets the skillpoints map for skillpoints per level
     *
     * @param raceSkillpointsMap the skillpoints map you want to set
     */
    void setRaceSkillpointsMap(Map<Integer, Integer> raceSkillpointsMap);

    /**
     * Returns a map of the race abilities with their requirement as the key
     *
     * Key: the race requirement (none, level or skilltree element)
     * Value: the list of abilities for the specified requirement
     *
     * @return a map of the race abilities
     */
    Map<String, List<RaceAbility>> getRaceAbilitiesMap();

    /**
     * Sets the race abilities map with their requirement as the key
     *
     * @param raceAbilitiesMap a map of the race abilities
     */
    void setRaceAbilitiesMap(Map<String, List<RaceAbility>> raceAbilitiesMap);

    /**
     * Returns a map of the race attributes with their requirement as the key
     *
     * Key: the race requirement (none, level or skilltree element)
     * Value: the list of attributes for the specified requirement
     *
     * @return a map of the race attributes
     */
    Map<String, List<RaceAttribute>> getRaceAttributesMap();

    /**
     * Sets the race attributes map with the requirement as the key
     *
     * @param raceAttributesMap a map of the race triggers
     */
    void setRaceAttributesMap(Map<String, List<RaceAttribute>> raceAttributesMap);

    /**
     * Returns a map of the race triggers with their requirement as the key
     *
     * Key: the race requirement (none, level or skilltree element)
     * Value: the list of triggers for the specified requirement
     *
     * @return a map of the race triggers
     */
    Map<String, List<RaceTrigger>> getRaceTriggersMap();

    /**
     * Sets the race triggers map with the requirement as the key
     *
     * @param raceTriggersMap a map of the race triggers
     */
    void setRaceTriggersMap(Map<String, List<RaceTrigger>> raceTriggersMap);

    /**
     * Returns a map of the permissions with their requirement as the key
     *
     * Key: the race requirement (none, level or skilltree element)
     * Value: the list of permissions for the specified requirement
     *
     * @return a map of the race permissions
     */
    Map<String, List<RacePermission>> getRacePermissionsMap();

    /**
     * Sets the race permissions map with the requirement as the key
     *
     * @param racePermissionsMap a map of the race permissions
     */
    void setRacePermissionsMap(Map<String, List<RacePermission>> racePermissionsMap);

    /**
     * Saves the race to disk.
     */
    void save();
}
