import java.util.Scanner;

public class ArrayClass {
    public Scanner scanner = new Scanner(System.in);

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

