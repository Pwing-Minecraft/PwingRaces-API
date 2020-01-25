package net.pwing.races.api.race.attribute;

import net.pwing.races.api.util.math.EquationResult;

/**
 * RaceAttribute API implementation
 *
 * @author Redned
 */
public interface RaceAttribute {

    /**
     * Returns the attribute name
     *
     * @return the attribute name
     */
    String getAttribute();

    /**
     * Sets the attribute name
     *
     * @param attribute the attribute name
     */
    void setAttribute(String attribute);

    /**
     * Returns the attribute data
     *
     * @return the attribute data
     */
    String getAttributeData();

    /**
     * Sets the attribute data
     *
     * @param attributeData the attribute data
     */
    void setAttributeData(String attributeData);

    /**
     * Returns the value of the attribute
     *
     * @return the value of the attribute
     */
    default double getValue() {
        return getEquationResult().getResult();
    }

    /**
     * Returns the result of the equation processed
     * for this attribute
     *
     * @return the result of the equation processed
     */
    EquationResult getEquationResult();

    /**
     * Returns the requirement for the attribute
     * (e.g. none, level requirement or skillpoint requirement)
     *
     * @return the requirement for the attribute
     */
    String getRequirement();
}
