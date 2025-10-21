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

        // print the values entered in reverse to the standard output
        for (int i = 5; i >= 0; i--) {
            System.out.println("Value " + i + " is " + array[i]);
        }
    }

    /**
     * Reads in integers and adds one to them then prints to the standard output
     */
    public void exercise3() {
        // initialise array to store user input
        int[] array = new int[6];

        // fill the array by reading input from user
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter integer " + (i + 1) + "/6: ");
            array[i] = scanner.nextInt();
            // add 1 to the current array element
            array[i]++;
        }

        // print the values entered to the standard output
        for (int i = 5; i >= 0; i--) {
            System.out.println("Value " + i + " is " + array[i]);
        }
    }

    /**
     * Reads in ten wage amounts to an array and then prints its contents to the standard output.
     */
    public void exercise4() {
        double[] wageArray = new double[10];

        // Reads in ten wage amounts from user
        for (int i = 0; i < wageArray.length; i++) {
            System.out.print("Enter wage (" + (i + 1) + "): ");
            wageArray[i] = scanner.nextDouble();
        }

        // print out the values of each wage to the standard output
        for (int i = 0; i < wageArray.length; i++) {
            System.out.println("Wage at index " + i + " is: " + wageArray[i]);

        }
    }

    /**
     * Reads in ten wage amounts to an array and then prints wage amounts greater than 100.
     */
    public void exercise5() {
        double[] wageArray = new double[10];

        // Reads in ten wage amounts from user
        for (int i = 0; i < wageArray.length; i++) {
            System.out.print("Enter wage (" + (i + 1) + "): ");
            wageArray[i] = scanner.nextDouble();
        }

        // print out the values of each wage to the standard output
        for (int i = 0; i < wageArray.length; i++) {
            if (wageArray[i] > 100) {
                System.out.println("Wage at index " + i + " is: " + wageArray[i]);
            }
        }
    }

    /**
     * Reads in ten wage amounts to an array and deducts 10% from amounts over 1000 before printing
     * the contents of the array
     */
    public void exercise6() {
        double[] wageArray = new double[10];

        // reads in ten wage amounts from user
        for (int i = 0; i < wageArray.length; i++) {
            System.out.print("Enter wage (" + (i + 1) + "): ");
            wageArray[i] = scanner.nextDouble();

            // reduce the value of the wage by 10% if above 1000
            if (wageArray[i] > 1000) {
                wageArray[i] *= 0.9;
            }
        }

        // print out the values of each wage to the standard output
        for (int i = 0; i < wageArray.length; i++) {
            System.out.println("Wage at index " + i + " is: " + wageArray[i]);
        }
    }
}

