package net.pwing.races.api.race.menu;

import org.bukkit.inventory.ItemStack;

/**
 * RaceIconData API implementation
 *
 * @author Redned
 */
public interface RaceIconData {

    /**
     * Returns the locked icon for the race
     *
     * @return the locked icon for the race
     */
    ItemStack getLockedIcon();

    /**
     * Sets the locked icon for the race
     *
     * @param lockedIcon the locked icon for the race
     */
    void setLockedIcon(ItemStack lockedIcon);

    /**
     * Returns the unlocked icon for the race
     *
     * @return the unlocked icon for the race
     */
    ItemStack getUnlockedIcon();

    /**
     * Sets the unlocked icon for the race
     *
     * @param unlockedIcon the unlocked icon for the race
     */
    void setUnlockedIcon(ItemStack unlockedIcon);

    /**
     * Returns the selected icon for the race
     *
     * @return the selected icon for the race
     */
    ItemStack getSelectedIcon();

    /**
     * Sets the selected icon for the race
     *
     * @param selectedIcon the selected icon for the race
     */
    void setSelectedIcon(ItemStack selectedIcon);

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
}
