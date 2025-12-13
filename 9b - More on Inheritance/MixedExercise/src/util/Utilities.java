package util;

/**
 * A class of utility methods to use with the shape classes
 *
 * @Author Adam McCarthy
 * @Version 1.0 (13-Dec-25)
 */
public class Utilities {

    /**
     * Rounds a double to two decimal places
     *
     * @param value     a double value to be rounded
     * @return          the double value rounded to two decimal places
     */
    public static double roundDouble(double value) {
        // rounds the double value by rounding it as a long then dividing it to get back to
        // required precision
        return Math.round(value * 100) / 100;
    }
}
