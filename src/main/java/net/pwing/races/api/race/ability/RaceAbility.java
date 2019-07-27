package net.pwing.races.api.race.ability;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

/**
 * RaceAbility API implementation
 *
 * @author Redned
 */
public abstract class RaceAbility implements Listener {

    protected String requirement;
    protected String internalName;

    protected double cooldown;

    protected ItemStack[] abilityItems;
    protected ItemStack[] leftClickAbilityItems;
    protected ItemStack[] consumeAbilityItems;

    protected String requiredPermission;
    protected String cooldownMessage;

    protected boolean cancelDefaultAction;
    protected boolean overrideDefaultAction;

    protected List<String> allowedWorlds = new ArrayList<String>();
    protected List<String> passives = new ArrayList<String>();

    public RaceAbility(String internalName, String configPath, FileConfiguration config, String requirement) {
        this.internalName = internalName;
        this.requirement = requirement;

        loadDataFromConfig(configPath, config);
    }

    /**
     * Constructs a new RaceAbility object
     *
     * @param configPath the path to load the ability from
     * @param config the config to load the trigger from
     */
    public void loadDataFromConfig(String configPath, FileConfiguration config) {
        this.cooldown = config.getDouble(configPath + ".cooldown", 0);

        if (config.contains(configPath + ".ability-item")) {
            String[] abilityItemStr = config.getString(configPath + ".ability-item").split(",");
            this.abilityItems = new ItemStack[abilityItemStr.length];

            for (int i = 0; i < abilityItemStr.length; i++) {
                ItemStack stack = getItemFromString(abilityItemStr[i]);
                if (stack != null)
                    this.abilityItems[i] = stack;
            }
        } else {
            this.abilityItems = new ItemStack[0];
        }

        if (config.contains(configPath + ".left-click-ability-item")) {
            String[] leftClickAbilityItemStr = config.getString(configPath + ".left-click-ability-item").split(",");
            this.leftClickAbilityItems = new ItemStack[leftClickAbilityItemStr.length];

            for (int i = 0; i < leftClickAbilityItemStr.length; i++) {
                ItemStack stack = getItemFromString(leftClickAbilityItemStr[i]);
                if (stack != null)
                    this.leftClickAbilityItems[i] = stack;
            }
        } else {
            this.leftClickAbilityItems = new ItemStack[0];
        }

        if (config.contains(configPath + ".consume-ability-item")) {
            String[] consumeAbilityItemStr = config.getString(configPath + ".consume-ability-item").split(",");
            this.consumeAbilityItems = new ItemStack[consumeAbilityItemStr.length];

            for (int i = 0; i < consumeAbilityItemStr.length; i++) {
                ItemStack stack = getItemFromString(consumeAbilityItemStr[i]);
                if (stack != null)
                    this.consumeAbilityItems[i] = stack;
            }
        } else {
            this.consumeAbilityItems = new ItemStack[0];
        }

        this.requiredPermission = config.getString(configPath + ".required-permission", "none");
        this.cooldownMessage = config.getString(configPath + ".cooldown-message");
        this.cancelDefaultAction = config.getBoolean(configPath + ".cancel-default-action", true);
        this.overrideDefaultAction = config.getBoolean(configPath + ".override-default-action", false);

        this.allowedWorlds = config.getStringList(configPath + ".allowed-worlds");
        this.passives = config.getStringList(configPath + ".run-passives");
    }

    /**
     * Runs the ability
     *
     * @param player the player that runs the ability
     * @return if the ability ran
     */
    public abstract boolean runAbility(Player player);

    /**
     * Returns the requirement for the ability
     * (e.g. none, level requirement or skillpoint requirement)
     *
     * @return the requirement for the ability
     */
    public String getRequirement() {
        return requirement;
    }

    /**
     * Sets the requirement for the ability
     * (e.g. none, level requirement or skillpoint requirement)
     *
     * @param requirement
     */
    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    /**
     * Returns the cooldown for the ability
     *
     * @return the cooldown for the ability
     */
    public double getCooldown() {
        return cooldown;
    }

    /**
     * Sets the cooldown for the ability
     *
     * @param cooldown the cooldown you want to set
     */
    public void setCooldown(double cooldown) {
        this.cooldown = cooldown;
    }

    /**
     * Returns an array of the ability items
     *
     * @return an array of the ability items
     */
    public ItemStack[] getAbilityItems() {
        return abilityItems;
    }

    /**
     * Sets the ability items to the specified array
     *
     * @param abilityItems an array of the ability items
     */
    public void setAbilityItems(ItemStack[] abilityItems) {
        this.abilityItems = abilityItems;
    }

    /**
     * Returns an array of the left-click ability items
     *
     * @return an array of the left-click ability items
     */
    public ItemStack[] getLeftClickAbilityItems() {
        return leftClickAbilityItems;
    }

    /**
     * Sets the left-click ability items to the specified array
     *
     * @param leftClickAbilityItems an array of the left-click ability items
     */
    public void setLeftClickAbilityItems(ItemStack[] leftClickAbilityItems) {
        this.leftClickAbilityItems = leftClickAbilityItems;
    }

    /**
     * Returns an array of the consumable ability items
     *
     * @return an array of the consumable ability items
     */
    public ItemStack[] getConsumeAbilityItems() {
        return consumeAbilityItems;
    }

    /**
     * Sets the consumable ability items to the specified array
     *
     * @param consumeAbilityItems an array of the consume ability items
     */
    public void setConsumeAbilityItems(ItemStack[] consumeAbilityItems) {
        this.consumeAbilityItems = consumeAbilityItems;
    }

    /**
     * Returns the required permission to run this ability
     *
     * @return the required permission to run this ability
     */
    public String getRequiredPermission() {
        return requiredPermission;
    }

    /**
     * Sets the required permission to run this ability
     *
     * @param requiredPermission the required permission to run this ability
     */
    public void setRequiredPermission(String requiredPermission) {
        this.requiredPermission = requiredPermission;
    }

    /**
     * Returns the internal (config) name of the ability
     *
     * @return the internal (config) name of the ability
     */
    public String getInternalName() {
        return internalName;
    }

    /**
     * Returns the cooldown message
     *
     * @return the cooldown message
     */
    public String getCooldownMessage() {
        return cooldownMessage;
    }

    /**
     * Sets the cooldown message
     *
     * @param cooldownMessage the cooldown message
     */
    public void setCooldownMessage(String cooldownMessage) {
        this.cooldownMessage = cooldownMessage;
    }

    /**
     * Returns if the default action is overriden (e.g. overriding
     * other abilities from running with the same ability item)
     *
     * @return if the default action is overriden
     */
    public boolean isDefaultActionOverriden() {
        return overrideDefaultAction;
    }

    /**
     * Sets if the default action should be overridden when the ability is ran
     * (e.g. overriding other abilities from running with the same ability item)
     *
     * @param overrideDefaultAction if the default action should be overriden
     */
    public void setOverrideDefaultAction(boolean overrideDefaultAction) {
        this.overrideDefaultAction = overrideDefaultAction;
    }

    /**
     * Returns if the default action is cancelled (e.g. cancelling a bow shot,
     * cancelling snowball throw, etc.)
     *
     * @return if the default action is cancelled
     */
    public boolean isDefaultActionCancelled() {
        return cancelDefaultAction;
    }

    /**
     * Sets if the default action should be cancelled (e.g. cancelling a bow shot,
     * cancelling snowball throw, etc.)
     *
     * @param cancelDefaultAction if the default action should be cancelled
     */
    public void setCancelDefaultAction(boolean cancelDefaultAction) {
        this.cancelDefaultAction = cancelDefaultAction;
    }

    /**
     * Returns a string list of the allowed worlds this ability can be ran in
     *
     * @return a string list of the allowed worlds this ability can be ran in
     */
    public List<String> getAllowedWorlds() {
        return allowedWorlds;
    }

    /**
     * Sets the allowed worlds this ability can be ran in
     *
     * @param allowedWorlds a string list of the allowed worlds
     */
    public void setAllowedWorlds(List<String> allowedWorlds) {
        this.allowedWorlds = allowedWorlds;
    }

    /**
     * Returns a string list of the passives that run when this ability is ran
     *
     * @return a string list of the passives that run when this ability is ran
     */
    public List<String> getPassives() {
        return passives;
    }

    /**
     * Sets the passives for the ability when it's ran
     *
     * @param passives a string list of passives that run when when this ability is ran
     */
    public void setPassives(List<String> passives) {
        this.passives = passives;
    }

    /**
     * Returns if the ability can run with the specified item
     *
     * @param player the player you want to run the ability for
     * @param stack the item you want to check
     * @return if the ability can run with the specified item
     */
    public boolean canRun(Player player, ItemStack stack) {
        ItemStack hand;
        try {
            hand = player.getInventory().getItemInMainHand();
            // Catch this, since 1.8 versions don't have the method above
        } catch (Throwable ex) {
            hand = player.getInventory().getItemInHand();
        }

        if (hand == null)
            return false;

        if (stack == null)
            return false;

        if (stack.getType() != hand.getType())
            return false;

        if (stack.hasItemMeta() && stack.getItemMeta().hasDisplayName()) {
            if (!hand.hasItemMeta())
                return false;

            if (!hand.getItemMeta().hasDisplayName())
                return false;

            if (!hand.getItemMeta().getDisplayName().equals(stack.getItemMeta().getDisplayName()))
                return false;
        }

        return true;
    }

    /**
     * Returns an item from the given string
     *
     * @param str the string to get the item from
     * @return an item from the given string
     */
    private ItemStack getItemFromString(String str) {
        if (str == null || str.isEmpty())
            return null;

        String string = str;
        Material mat;
        String name = null;

        if (string.contains("|")) {
            String[] temp = string.split("\\|");
            string = temp[0];

            name = ChatColor.translateAlternateColorCodes('&', temp[1]);
        }

        mat = Material.matchMaterial(string.toUpperCase());

        if (mat == null)
            mat = Material.STONE;

        ItemStack item = new ItemStack(mat);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        item.setItemMeta(meta);

        return item;
    }
}
