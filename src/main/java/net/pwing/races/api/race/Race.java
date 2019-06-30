package net.pwing.races.api.race;

import org.bukkit.Location;
import org.bukkit.inventory.ItemStack;

import java.util.Map;

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
    boolean hasSpawnLocation();

    /**
     * Returns the spawn location of the race
     *
     * @return the spawn location of the race
     */
    Location getSpawnLocation();

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
     * Returns the unlocked race icon
     *
     * @return the unlocked race icon
     */
    ItemStack getUnlockedIcon();

    /**
     * Sets the unlocked icon of the race
     *
     * @param unlockedIcon the unlocked icon of the race
     */
    void setUnlockedIcon(ItemStack unlockedIcon);

    /**
     * Returns the selected icon of the race
     *
     * @return the selected icon of the race
     */
    ItemStack getSelectedIcon();

    /**
     * Sets the selected icon of the race
     *
     * @param selectedIcon the selected icon of the race
     */
    void setSelectedIcon(ItemStack selectedIcon);

    /**
     * Returns the locked icon of the race
     *
     * @return the locked icon of the race
     */
    ItemStack getLockedIcon();

    /**
     * Sets the locked icon of the race
     *
     * @param lockedIcon the locked icon of the race
     */
    void setLockedIcon(ItemStack lockedIcon);

    /**
     * Returns the icon slot of the race
     *
     * @return the icon slot of the race
     */
    int getIconSlot();

    /**
     * Sets the icon slot of the race
     *
     * @param iconSlot the icon slot of the race
     */
    void setIconSlot(int iconSlot);

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
}
