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
     * @param args      a string array of command line arguments (unused)
     */
    public static void main(String[] args) {
        Loops loops = new Loops();
        loops.simpleWhile();
    }

    private void simpleWhile() {
        System.out.println("This method will print 1 to 10 to the console:");

        // Count from 1 to 10 and print each value on a new line
        int i = 1;
        while(i <= 10) {
            System.out.println(i);
            i++;
        }
    }
}
