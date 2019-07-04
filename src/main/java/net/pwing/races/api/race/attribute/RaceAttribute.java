package net.pwing.races.api.race.attribute;

/**
 * RaceAttribute API implementation
 *
 * @author Redned
 */
public interface RaceAttribute {

    /**
     * Returns the attribute string
     *
     * @return the attribute string
     */
    String getAttribute();

    /**
     * Sets the attribute string
     *
     * @param attribute the attribute string
     */
    void setAttribute(String attribute);

    /**
     * Returns the value of the attribute
     *
     * @return the value of the attribute
     */
    double getValue();

    /**
     * Returns the requirement for the attribute
     * (e.g. none, level requirement or skillpoint requirement)
     *
     * @return the requirement for the attribute
     */
    String getRequirement();
}
