import java.util.Scanner;

/**
 * Contains methods practicing concepts from lab 4a including the
 * use or Arrays and the Scanner class.
 *
 * @author Adam McCarthy
 * @version 1.0
 */
public class ArrayClass {
    public Scanner scanner = new Scanner(System.in);

    /**
     * <p>Reads six integers from the user and prints them in
     * ascending order.</p>
     */
    public void exercise1() {
        // initialise array to store user input
        int[] array = new int[6];

        // fill the array by reading input from user
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter integer " + (i + 1) + "/6: ");
            array[i] = scanner.nextInt();
        }

        // print the values entered to the standard output
        for (int i = 0; i < array.length; i++) {
            System.out.println("Value " + (i + 1) + " is " + array[i]);
        }
    }

    /**
     * <p>Reads six integers from the user and prints them in descending order.</p>
     */
    public void exercise2() {
        // initialise array to store user input
        int[] array = new int[6];

        // fill the array by reading input from user
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter integer " + (i + 1) + "/6: ");
            array[i] = scanner.nextInt();
        }

        // print the values entered to the standard output
        for (int i = 5; i >= 0; i--) {
            System.out.println("Value " + i + " is " + array[i]);
        }
    }
}

