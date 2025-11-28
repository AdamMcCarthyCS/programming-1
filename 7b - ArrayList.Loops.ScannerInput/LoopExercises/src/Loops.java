import java.util.ArrayList;
import java.util.Scanner;

/**
 * This is the starting point of the program and contains the main method.
 *
 * @author Adam McCarthy
 * @version 1.0
 */
public class Loops {
    /**
     * An array of strings
     */
    ArrayList<String> strings;
    /**
     * An instantiated scanner object to read user input.
     */
    Scanner input = new Scanner(System.in);

    /**
     * This is the entry point to the program. It creates an instance of the class and calls a
     * method to print a loop.
     *
     * @param args a string array of command line arguments (unused)
     */
    public static void main(String[] args) {
        Loops loops = new Loops();
        loops.simpleWhile();
//        // Add newline for readable output
//        System.out.println();
//        loops.exercise_1();
//        // Add newline for readable output
//        System.out.println();
//        loops.exercise_2();
//        // Add newline for readable output
        System.out.println();
        loops.exercise_3();
    }

    private void simpleWhile() {
        System.out.println("This method will print 1 to 10 to the console:");

        // Count from 1 to 10 and print each value on a new line
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    /**
     * This method reads in six strings from the user, stores them in an ArrayList and then
     * prints them out to the standard output.
     */
    private void exercise_1() {
        strings = new ArrayList<>();

        // Sentinel value to begin while loop
        int counter = 1;
        // Prompt user to enter six strings and store in an ArrayList for printing
        while (counter <= 6) {
            System.out.print("Enter string " + counter + "/6 : ");
            strings.add(input.nextLine());
            counter++;
        }
        // Add newline for readable output
        System.out.println();

        // Print the six stored Strings to the standard output
        for (int i = 1; i <= 6; i++) {
            System.out.println("String " + i + ": " + strings.get(i - 1));
        }
    }

    /**
     * This method reads in six strings from the user, stores them in an ArrayList and then
     * prints them out to the standard output.
     */
    private void exercise_2() {
        strings = new ArrayList<>();

        // Prompt user to enter six strings and store in an ArrayList for printing
        for (int i = 1; i <= 6; i++) {
            System.out.print("Enter string " + i + "/6 : ");
            strings.add(input.nextLine());
        }
        // Add newline for readable output
        System.out.println();

        // Print the six stored Strings to the standard output
        System.out.println("You entered:");
        // Add a counter to help with formatting the printed output
        int counter = 1;
        for (String string: strings) {
            System.out.println("String " + counter + ": " + string);
            counter++;
        }
    }

    /**
     * This method reads in strings from the user until they enter the string -end. It then
     * prints any strings that have been entered by the user.
     */
    private void exercise_3() {
        strings = new ArrayList<>();

        // Sentinel value to begin while loop

        // Counter to help with fomatting of user prompt
        int whileCounter = 1;
        // Prompt user to enter strings and store in an ArrayList for printing
        while (whileCounter > 0) {
            System.out.print("Enter string " + whileCounter + "/n : ");
            String userString = input.nextLine();
            // Add user input to ArrayList if it is not the exit keyword, otherwise exit loop.
            if (!(userString.equalsIgnoreCase("-end"))) {
                strings.add(userString);
                whileCounter++;
            } else {
                whileCounter = 0;
            }
        }

        // Add newline for readable output
        System.out.println();

        // Add counter to help with formatting printed output
        int forEachCounter = 1;
        // Print the stored Strings to the standard output
        for (String string: strings) {
            System.out.println("String " + forEachCounter + ": " + string);
            forEachCounter++;
        }
    }
}
