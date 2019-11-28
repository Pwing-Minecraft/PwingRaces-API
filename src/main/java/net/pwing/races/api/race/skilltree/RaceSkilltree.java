package net.pwing.races.api.race.skilltree;

import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.Optional;

/**
 * RaceSkilltree API implementation
 *
 * @author Redned
 */
public interface RaceSkilltree {

    /**
     * Returns the internal name of the skilltree
     *
     * @return the internal name of the skilltree
     */
    String getInternalName();

    /**
     * Sets the internal name of the skilltree
     *
     * @param internalName the internal name of the skilltree
     */
    void setInternalName(String internalName);

    /**
     * Returns the name of the skilltree
     *
     * @return the name of the skilltree
     */
    String getName();

    /**
     * Sets the name of the skilltree
     *
     * @param name the name of the skilltree
     */
    void setName(String name);

    /**
     * Returns the icon for the skilltree
     *
     * @return the icon for the skilltree
     */
    ItemStack getIcon();

    /**
     * Sets the icon for the skilltree
     *
     * @param icon the icon for the skilltree
     */
    void setIcon(ItemStack icon);

    /**
     * Returns the menu icon of the skilltree
     *
     * @return the menu icon of the skilltree
     */
    ItemStack getMenuIcon();

    /**
     * Sets the menu icon of the skilltree
     *
     * @param menuIcon the menu icon of the skilltree
     */
    void setMenuIcon(ItemStack menuIcon);

    /**
     * Returns the menu slot of the icon
     *
     * @return the menu slot of the icon
     */
    int getMenuSlot();

    /**
     * Sets the menu slot of the icon
     *
     * @param menuSlot the menu slot of the icon
     */
    void setMenuSlot(int menuSlot);

    /**
     * Returns the menu size of the skilltree
     *
     * @return the menu size of the skilltree
     */
    int getMenuSize();

    /**
     * Sets the menu size of the skilltree
     *
     * @param menuSize the menu size of the skilltree
     */
    void setMenuSize(int menuSize);

    /**
     * Returns the list of skilltree elements for this skilltree
     *
     * @return the list of skilltree elements
     */
    List<RaceSkilltreeElement> getElements();

    /**
     * Sets the list of skilltree elements for this skilltree
     *
     * @param elements the list of skilltree elements
     */
    void setElements(List<RaceSkilltreeElement> elements);

    /**
     * Returns the skilltree element from the specified name
     *
     * @param name the name of the skilltree element
     * @return the skilltree element from the specified name
     */
    default Optional<RaceSkilltreeElement> getElementFromName(String name) {
        for (RaceSkilltreeElement element : getElements()) {
            if (element.getInternalName().equals(name))
                return Optional.of(element);

            if (element.getTitle() != null && element.getTitle().isEmpty()) {
                if (element.getTitle().equals(name))
                    return Optional.of(element);
            }
        }

        return Optional.empty();
    }
}
