package utils;

public class Utilities {

    /**
     *  This method returns a string that was passed as a parameter, truncated to a specific length, also
     *  passed as a parameter.  If the original String is less than the passed length, then the original string
     *  is just returned.
     *
     * @param stringToTruncate  The string that will be truncated to a specific length
     * @param length The length to which to truncate the string to
     * @return The string truncated to a specific length
     */
    public static String truncateString(String stringToTruncate, int length){
        if (stringToTruncate.length() <= length) {
            return stringToTruncate;
        }
        else{
            return stringToTruncate.substring(0, length);
        }
    }

    /**
     * This method takes in a string, passed as a parameter and valdiates whether it is less than or equal to
     * a specific length or not.
     *
     * @param strToCheck The string that will be checked to see if it is a specific length
     * @param maxLength The length that the string will be validated against
     * @return True if the string is less than or equal the max length and false otherwise.
     */
    public static boolean validateStringLength(String strToCheck, int maxLength){
        return strToCheck.length() <= maxLength;
    }

    /**
     * Checks if a double is in the closed interval [minimum, maximum]
     *
     * @param doubleToCheck    a double to check
     * @param minimum       the minimum valid value of the double
     * @param maximum       the maximum valid value of the double
     * @return              true if the checked double lies within the interval; false otherwise
     */
    public static boolean isWithinInclusiveRange(double doubleToCheck, double minimum,
                                                 double maximum) {
        if (doubleToCheck >= minimum && doubleToCheck <= maximum) {
            return true;
        }
        return false;
    }

}
