/**
 * A calculator class to perform mathematical operations
 *
 * @author Adam McCarthy
 * @version 1.0
 */
public class Calculator {
    
    /**
     * Adds two values
     *
     * @param firstValue        the first value in the sum
     * @param secondValue       the second value in the sum
     *
     * @return                  the sum of the two values
     */
    public double add(double firstValue, double secondValue) {
        return firstValue + secondValue;
    }
    
    /**
     * Subtracts two values
     *
     * @param firstValue        the first value in the difference
     * @param secondValue       the second value in the difference
     *
     * @return                  the difference of the two values
     */
    public double subtract(double firstValue, double secondValue) {
        return firstValue - secondValue;
    }
    
    /**
     * The product of two values
     *
     * @param firstValue        the first value in the product
     * @param secondValue       the second value in the product
     *
     * @return                  the product of the two values
     */
    public double multiply(double firstValue, double secondValue) {
        return firstValue * secondValue;
    }
    
    /**
     * The quotient of two values
     *
     * <p>Returns the quotient of two numbers unless the user tries to divide by 0. In this case
     * the method returns Double.NaN</p>
     *
     * @param firstValue        the dividend of the quotient
     * @param secondValue       the divisor of the quotient
     *
     * @return                  the quotient the two values
     */
    public double divide(double dividend, double divisor) {
        if (divisor == 0) {
            return Double.NaN;
        }
        return dividend / divisor;
    }
}
