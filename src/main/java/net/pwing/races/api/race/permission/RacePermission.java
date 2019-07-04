package net.pwing.races.api.race.permission;

/**
 * RacePermission API implementation
 *
 * @author Redned
 */
public interface RacePermission {

    /**
     * Returns the permission node
     *
     * @return the permission node
     */
    String getNode();

    /**
     * Sets the permission node
     *
     * @param node the permission node
     */
    void setNode(String node);

    /**
     * Returns the requirement for the permission
     * (e.g. none, level requirement or skillpoint requirement)
     *
     * @return the requirement for the ability
     */
    String getRequirement();
}
