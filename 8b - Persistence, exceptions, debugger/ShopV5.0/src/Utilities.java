/**
 * This is a class of utility method which are reusable in different projects
 *
 * @author Adam McCarthy
 * @version 1.0 (07-Dec-25)
 */
public class Utilities {

    /**
     * Truncates a double to two decimal places
     *
     * @param number    a double value to be truncated
     * @return          a double value trucated to two decimal places
     */
    public static double toTwoDecimalPlaces(double number) {
        return (int) (number * 100) / 100.0;
    }
}
