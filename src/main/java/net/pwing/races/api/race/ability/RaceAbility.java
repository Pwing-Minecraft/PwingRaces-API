package net.pwing.races.api.race.ability;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.List;

/**
 * RaceAbility API implementation
 *
 * @author Redned
 */
public interface RaceAbility {

    /**
     * Runs the ability
     *
     * @param player the player that runs the ability
     * @return if the ability ran
     */
    boolean runAbility(Player player);

    /**
     * Returns the internal (config) name of the ability
     *
     * @return the internal (config) name of the ability
     */
    String getInternalName();

    /**
     * Returns the requirement for the ability
     * (e.g. none, level requirement or skillpoint requirement)
     *
     * @return the requirement for the ability
     */
    String getRequirement();

    /**
     * Returns the cooldown for the ability
     *
     * @return the cooldown for the ability
     */
    double getCooldown();

    /**
     * Sets the cooldown for the ability
     *
     * @param cooldown the cooldown you want to set
     */
    void setCooldown(double cooldown);

    /**
     * Returns an array of the ability items
     *
     * @return an array of the ability items
     */
    ItemStack[] getAbilityItems();

    /**
     * Sets the ability items to the specified array
     *
     * @param abilityItems an array of the ability items
     */
    void setAbilityItems(ItemStack[] abilityItems);

    /**
     * Returns an array of the left-click ability items
     *
     * @return an array of the left-click ability items
     */
    ItemStack[] getLeftClickAbilityItems();

    /**
     * Sets the left-click ability items to the specified array
     *
     * @param leftClickAbilityItems an array of the left-click ability items
     */
    void setLeftClickAbilityItems(ItemStack[] leftClickAbilityItems);

    /**
     * Returns an array of the consumable ability items
     *
     * @return an array of the consumable ability items
     */
    ItemStack[] getConsumeAbilityItems();

    /**
     * Sets the consumable ability items to the specified array
     *
     * @param consumeAbilityItems an array of the consume ability items
     */
    void setConsumeAbilityItems(ItemStack[] consumeAbilityItems);

    /**
     * Returns the required permission to run this ability
     *
     * @return the required permission to run this ability
     */
    String getRequiredPermission();

    /**
     * Sets the required permission to run this ability
     *
     * @param requiredPermission the required permission to run this ability
     */
    void setRequiredPermission(String requiredPermission);

    /**
     * Returns the cooldown message
     *
     * @return the cooldown message
     */
    String getCooldownMessage();

    /**
     * Sets the cooldown message
     *
     * @param cooldownMessage the cooldown message
     */
    void setCooldownMessage(String cooldownMessage);

    /**
     * Returns if the default action is overriden (e.g. overriding
     * other abilities from running with the same ability item)
     *
     * @return if the default action is overriden
     */
    boolean isDefaultActionOverriden();

    /**
     * Sets if the default action should be overridden when the ability is ran
     * (e.g. overriding other abilities from running with the same ability item)
     *
     * @param overrideDefaultAction if the default action should be overriden
     */
    void setOverrideDefaultAction(boolean overrideDefaultAction);

    /**
     * Returns if the default action is cancelled (e.g. cancelling a bow shot,
     * cancelling snowball throw, etc.)
     *
     * @return if the default action is cancelled
     */
    boolean isDefaultActionCancelled();

    /**
     * Sets if the default action should be cancelled (e.g. cancelling a bow shot,
     * cancelling snowball throw, etc.)
     *
     * @param cancelDefaultAction if the default action should be cancelled
     */
    void setCancelDefaultAction(boolean cancelDefaultAction);

    /**
     * Returns a string list of the allowed worlds this ability can be ran in
     *
     * @return a string list of the allowed worlds this ability can be ran in
     */
    List<String> getAllowedWorlds();

    /**
     * Sets the allowed worlds this ability can be ran in
     *
     * @param worlds a string list of the allowed worlds
     */
    void setAllowedWorlds(List<String> worlds);

    /**
     * Returns a string list of the passives that run when this ability is ran
     *
     * @return a string list of the passives that run when this ability is ran
     */
    List<String> getPassives();

    /**
     * Sets the passives for the ability when it's ran
     *
     * @param passives a string list of passives that run when when this ability is ran
     */
    void setPassives(List<String> passives);

    /**
     * Returns if the ability can run with the specified item
     *
     * @param player the player you want to run the ability for
     * @param stack the item you want to check
     * @return if the ability can run with the specified item
     */
    boolean canRun(Player player, ItemStack stack);
}
