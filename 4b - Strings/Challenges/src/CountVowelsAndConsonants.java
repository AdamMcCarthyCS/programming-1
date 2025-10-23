import java.util.Scanner;

public class CountVowelsAndConsonants {

    /**
     * Removes all spaces from a string and changes all characters to lowercase
     *
     * @param sentence  A sentence, which may contain non-alphanumeric characters
     *
     * @return          The original sentence with no spaces and lowercase
     */
    private String parseSentence(String sentence) {
        // remove all spaces in string then convert to lower case
        // regular expression replaces all characters that are not a-z A-Z or 0-9
        // ie symbols and spaces
        return sentence.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }

    /**
     * Checks if a given character is a vowel
     *
     * @param character     an alphabetic character
     * @return              true if the character is a vowel, otherwise false
     */
    private boolean isVowel(char character) {
        // return true if the character is a vowel
        if (character == 'a'
            || character == 'e'
            || character == 'i'
            || character == 'o'
            || character == 'u') {
            return true;
        }
        // if the character is not found within the vowels return false
        return false;
    }

    /**
     * Counts the number of vowels and consonants in a user entered sentence
     */
    public void countVowelAndConsonant() {
        Scanner scanner = new Scanner(System.in);

        // read in a sentence from the user
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // remove symbols and spaces and convert to lowercase
        String parsedSentence = parseSentence(sentence);

        // variables to store the number of vowels and consonants
        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < parsedSentence.length(); i++) {
            // retrieve the letter at position i in the parsed sentence for checking
            char letter = parsedSentence.charAt(i);
            // if the letter is a vowel and add 1 to vowelCount
            // otherwise add 1 to consonantCount
            if (isVowel(letter)) {
                vowelCount++;
            } else {
                consonantCount++;
            }
        }

        // output the counts for vowels and consonants
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
        System.out.println(parsedSentence);
    }


}
