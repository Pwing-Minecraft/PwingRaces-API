package net.pwing.races.api.util.math;

import java.util.Optional;

/**
 * EquationOperator API class
 *
 * Represents an operator used in a math equation.
 *
 * @author Redned
 */
public enum EquationOperator {

    ADD('+'),
    SUBTRACT('-'),
    MULTIPLY('*'),
    DIVIDE('/'),
    EQUAL('=');

    private char operator;

    EquationOperator(char operator) {
        this.operator = operator;
    }

    /**
     * Returns the operator from the given character
     *
     * @param operatorChar the operator character
     * @return the operator from the given character
     */
    public static Optional<EquationOperator> getOperator(char operatorChar) {
        for (EquationOperator operator : values()) {
            if (operator.operator == operatorChar)
                return Optional.of(operator);
        }

        return Optional.empty();
    }

    /**
     * Returns the operator character
     *
     * @return the operator character
     */
    public char getChar() {
        return operator;
    }
}
