import java.util.Scanner;

/**
 * A class to hold all exercises from the week 3b lab
 *
 * @author Adam McCarthy
 * @version 1.0
 */
public class Exercises {
    private Scanner scanner = new Scanner(System.in);

    /**
     *  A method which reads in three integers from the user with the Scanner class and then prints their
     *  sum.
     */
    public void addNum() {
        // prompt the user to enter the three integers for the sum
        System.out.print("Enter the first integer: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Enter the third integer: ");
        int thirdNumber = scanner.nextInt();

        // print the sum of the three integers to standard output in the required format
        System.out.println(firstNumber + " + " + secondNumber + " + " + thirdNumber + " = "
            + (firstNumber + secondNumber + thirdNumber));
    }

    /**
     * computes the product of three integer arguments.
     *
     * @param a     the first integer
     * @param b     the second integer
     * @param c     the third integer
     */
    public void product(int a, int b, int c) {
        System.out.println(a + " * " + b + " * " + c + " = " + (a * b * c));
    }

    /**
     * Computes the product of three integers read in from the user with the a Scanner object.
     */
    public void product() {
        // reads the three integers from the user which are used to compute the product
        System.out.print("Enter the first integer: ");
        int firstInteger = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int secondInteger = scanner.nextInt();

        System.out.print("Enter the third integer: ");
        int thirdInteger = scanner.nextInt();

        // Use the original version of the method to compute the product and print to standard output
        product(firstInteger, secondInteger, thirdInteger);
    }
}
