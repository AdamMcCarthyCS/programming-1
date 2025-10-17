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
     * Computes the sum of three integers
     *
     * @param firstNum      the first integer
     * @param secondNum     the second integer
     * @param thirdNum      the third integer
     *
     * @return              the sum of the three integers
     */
    public int addNum(int firstNum, int secondNum, int thirdNum) {
        return firstNum + secondNum + thirdNum;

    }

    /**
     * computes the product of three integer arguments.
     *
     * @param a     the first integer
     * @param b     the second integer
     * @param c     the third integer
     */
    public int product(int a, int b, int c) {
        return a * b * c;
    }

    /**
     * Computes the product of three integers read in from the user with the a Scanner object.
     */
    public int product() {
        // reads the three integers from the user which are used to compute the product
        System.out.print("Enter the first integer: ");
        int firstInteger = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int secondInteger = scanner.nextInt();

        System.out.print("Enter the third integer: ");
        int thirdInteger = scanner.nextInt();

        // Use the original version of the method to compute the product and print to standard output
        return product(firstInteger, secondInteger, thirdInteger);
    }

    /**
     * Finds the maximum integer of three integers
     *
     * @param firstInteger      the first integer value
     * @param secondInteger     the second integer value
     * @param thirdInteger      the third integer value
     *
     * @return                  the largest of the three integer values
     */
    public int max(int firstInteger, int secondInteger, int thirdInteger) {
        // assume that the first integer is the max
        int max = firstInteger;

        // if the second integer is larger store it as the max
        if (secondInteger > max) {
            max = secondInteger;
        }

        // if the third integer is larger than the max of the first two integers store it as the max
        if (thirdInteger > max) {
            max = thirdInteger;
        }

        return max;
    }


}
