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
}
