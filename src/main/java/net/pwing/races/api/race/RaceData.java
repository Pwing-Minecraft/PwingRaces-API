package net.pwing.races.api.race;

import java.util.List;
import java.util.Map;

/**
 * RaceData API implementation
 *
 * @author Redned
 */
public interface RaceData {

    /**
     * Returns if the race is unlocked
     *
     * @return if the race is unlocked
     */
    boolean isUnlocked();

    /**
     * Sets if the race is unlocked
     *
     * @param unlocked if the race is unlocked
     */
    void setUnlocked(boolean unlocked);

    /**
     * Returns the amount of experience the player has
     *
     * @return the amount of experience the player has
     */
    int getExperience();

    /**
     * Sets the amount of experience the player has
     *
     * @param experience the amount of experience the player has
     */
    void setExperience(int experience);

    /**
     * Returns the level of the player's race
     *
     * @return the level of the player's race
     */
    int getLevel();

    /**
     * Sets the level of the player's race
     *
     * @param level the level of the player's race
     */
    void setLevel(int level);

    /**
     * Returns the amount of unused skillpoints for the player's race
     *
     * @return the amount of unused skillpoints for the player's race
     */
    int getUnusedSkillpoints();

    /**
     * Sets the amount of unused skillpoints for the player's race
     *
     * @param unusedSkillpoints the amount of unused skillpoints for the player's race
     */
    void setUnusedSkillpoints(int unusedSkillpoints);

    /**
     * Returns the amount of used skillpoints for the player's race
     *
     * @return the amount of used skillpoints for the player's race
     */
    int getUsedSkillpoints();

    /**
     * Sets the amount of used skillpoints for the player's race
     *
     * @param usedSkillpoints the amount of used skillpoints for the player's race
     */
    void setUsedSkillpoints(int usedSkillpoints);

    /**
     * Returns if the player has played this race
     *
     * @return if the player has played this race
     */
    boolean hasPlayed();

    /**
     * Sets if the player has played this race
     *
     * @param played if the player has played this race
     */
    void setHasPlayed(boolean played);

    /**
     * Returns if the player has purchased the specified element for their race
     *
     * @param skilltree the skilltree you want to check for in the player's race
     * @param element the name of the element you want to check for in the player's race
     * @return
     */
    boolean hasPurchasedElement(String skilltree, String element);

    /**
     * Adds a purchased element to a skilltree for the player's race
     *
     * @param skilltree the skilltree you want to purchase the element on
     * @param element the name of the element you want to purchase for the player's race
     */
    void addPurchasedElement(String skilltree, String element);

    /**
     * Removes a purchased element to a skilltree for the player's race
     *
     * @param skilltree the skilltree you want to remove the element on
     * @param element the name of the element you want to remove for the player's race
     */
    void removePurchasedElement(String skilltree, String element);

    /**
     * Returns the purchased elements for the specified skilltree
     *
     * @param skilltree the skilltree you want to get the purchased elements from
     * @return the purchased elements of the player's race
     */
    List<String> getPurchasedElements(String skilltree);

    /**
     * Returns the purchased elements map. This contains all the purchased skilltree
     * elements for every skilltree.
     *
     * Key: the skilltree name
     * Value: a string list of the purchased elements
     *
     * @return the purchased elements map
     */
    Map<String, List<String>> getPurchasedElementsMap();
 }
