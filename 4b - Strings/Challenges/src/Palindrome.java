import java.util.Scanner;

/**
 * This class contains methods which together check if a user entered string is a palindrome
 *
 * <p>The program works for only strings with alphanumeric only characters</p>
 */
public class Palindrome {
    private Scanner scanner = new Scanner(System.in);

    /**
     * Removes all spaces from a string and changes all characters to lowercase
     *
     * @param sentence  A candidate palindrome string read in from the user
     *
     * @return          The original string with no spaces and lowercase
     */
    private String parseString(String sentence) {
        // remove all spaces in string then convert to lower case
        return sentence.replace(" ", "").toLowerCase();
    }

    /**
     * Checks if a string is a palindrome
     *
     * @param parsedSentence    A string which has had its spaces removed and is lower case
     * @return                  true if the string is a palindrome, otherwise false
     */
    private boolean checkIsPalindrome(String parsedSentence) {
        int stringLength = parsedSentence.length();
        /* check if the first n/2 (integer division) letters match the corresponding last n/2
        characters in reverse order */
        for (int i = 0; i < stringLength/2; i++) {
            // return false if the ith character differs from the length - i - 1 th character
            // middle character doesn't need to be checked (if it exists)!
            if (parsedSentence.charAt(i) != parsedSentence.charAt(stringLength - (i + 1))) {
                return false;
            }
        }
        // if all characters and their counterpart in the string match return true
        return true;
    }

    /**
     * Reads in a user string and prints a message stating if it is a palindrome or not
     * to the standard output
     */
    public void isPalindrome() {
        // read in a string from the user
        System.out.print("Please enter a string: ");
        String userSentence = scanner.nextLine();

        // remove spaces and check if it is a palindrome
        String parsedUserSentence = parseString(userSentence);

        // check if string is a palindrome
        boolean isPalindrome = checkIsPalindrome(parsedUserSentence);

        if (isPalindrome) {
            System.out.println(userSentence + " is a palindrome!");
        } else {
            System.out.println(userSentence + " is NOT a palindrome!");
        }
    }
}
