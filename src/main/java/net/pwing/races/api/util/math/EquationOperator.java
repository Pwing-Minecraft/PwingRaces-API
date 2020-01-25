package net.pwing.races.api.util.math;

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

    public static EquationOperator getOperator(char operatorChar) {
        for (EquationOperator operator : values()) {
            if (operator.operator == operatorChar)
                return operator;
        }

        return EquationOperator.EQUAL;
    }
}
