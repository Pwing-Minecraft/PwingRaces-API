package net.pwing.races.api.race.skilltree;

import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.Optional;

/**
 * RaceSkilltreeElement API implementation
 *
 * @author Redned
 */
public interface RaceSkilltreeElement {

    /**
     * Returns the internal name of the skilltree element
     *
     * @return the internal name of the skilltree element
     */
    String getInternalName();

    /**
     * Sets the internal name of the skilltree element
     *
     * @param internalName the internal name of the skilltree element
     */
    void setInternalName(String internalName);

    /**
     * Returns the title of the skilltree element
     *
     * @return the title of the skilltree element
     */
    String getTitle();

    /**
     * Sets the title of the skilltree element
     *
     * @param title the title of the skilltree element
     */
    void setTitle(String title);

    /**
     * Returns the desciription of the skilltree element
     *
     * @return the descirption of the skilltree element
     */
    List<String> getDescription();

    /**
     * Sets the description of the skilltree element
     *
     * @param description the description of the skilltree element
     */
    void setDescription(List<String> description);

    /**
     * Returns the slot of the skilltree element
     *
     * @return the slot of the skilltree element
     */
    int getSlot();

    /**
     * Sets the slot of the skilltree element
     *
     * @param slot the slot of the skilltree element
     */
    void setSlot(int slot);

    /**
     * Returns the icon for the skilltree element
     *
     * @return the icon for the skilltree element
     */
    ItemStack getIcon();

    /**
     * Sets the icon for the skilltree element
     *
     * @param icon the icon for the skilltree element
     */
    void setIcon(ItemStack icon);

    /**
     * Returns the purchased icon for the skilltree element
     *
     * @return the purchased icon for the skilltree element
     */
    Optional<ItemStack> getPurchasedIcon();

    /**
     * Sets the purchased icon for the skilltree element
     *
     * @param purchasedIcon the purchased icon for the skilltree element
     */
    void setPurchasedIcon(ItemStack purchasedIcon);

    /**
     * Returns the locked icon for the skilltree element
     *
     * @return the locked icon for the skilltree element
     */
    Optional<ItemStack> getLockedIcon();

    /**
     * Sets the locked icon for the skilltree element
     *
     * @param lockedIcon the locked icon for the skilltree element
     */
    void setLockedIcon(ItemStack lockedIcon);

    /**
     * Returns the required amount of purchased parents that must
     * be owned in this skilltree before the element is unlocked
     *
     * @return the required amount of purchased parent elements
     */
    int getRequiredParentAmount();

    /**
     * Sets the required amount of purchased parents that must
     * be owned in this skilltree before the element is unlocked
     *
     * @param requiredParentAmount the required amount of purchased parent elements
     */
    void setRequiredParentAmount(int requiredParentAmount);

    /**
     * Returns a string list of the parent elements
     *
     * @return a string list of the parent elements
     */
    List<String> getParentElements();

    /**
     * Sets the string list of parent elements
     *
     * @param parentElements a string list of the parent elements
     */
    void setParentElements(List<String> parentElements);

    /**
     * Returns the skillpoint cost for the skilltree element
     *
     * @return the skillpoint cost for the skilltree element
     */
    int getCost();

    /**
     * Sets the skillpoint cost for for the skilltree element
     *
     * @param cost the skillpoint cost for the skilltree element
     */
    void setCost(int cost);
}
