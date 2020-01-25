package net.pwing.races.api.util.math;

/**
 * EquationResult API class
 *
 * Represents the result of a math equation.
 *
 * @author Redned
 */
public class EquationResult {

    private EquationOperator operator;
    private double result;

    public EquationResult(EquationOperator operator, double result) {
        this.operator = operator;
        this.result = result;
    }

    public EquationOperator getOperator() {
        return operator;
    }

    public double getResult() {
        return result;
    }
}
