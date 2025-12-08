package utils;

/**
 * A class of utility method for use in the project
 *
 * @author Adam McCarthy
 * @version 1.0 (07-Dec-25)
 */
public class Utilities {

    /**
     * Returns a string truncated to a given length if needed.
     *
     * @param stringToTruncate  a string to truncate to a required length
     * @param length            the maximum length of the string to be returned
     * @return                  a string with a maximum length specified by the length argument
     */
    public static String truncateString(String stringToTruncate, int length) {
        if (stringToTruncate.length() <= length) {
            return stringToTruncate;
        } else {
            return stringToTruncate.substring(0, length);
        }
    }

    /**
     * Checks if a string is less than or equal to a maximum length.
     *
     * @param strToCheck        a string whose length will be checked
     * @param maxLength         the maximum allowed length of the string
     * @return                  true if the string is less than or equal to the required length;
     * false otherwise
     */
    public static boolean validateStringLength(String strToCheck, int maxLength) {
        return strToCheck.length() <= maxLength;
    }
}
