import java.util.Scanner;

/**
 * A collection of methods from the Week 3b lab
 *
 * @author Adam McCarthy
 * @version 1.0
 */
public class ClassExamples {
    private Scanner scanner = new Scanner(System.in);

    /**
     * A method to compute the cube of an integer
     * @param number an integer value
     *
     * @return the cube of the given integer
     */
    public int cubeOfInteger(int number) {
        return number * number * number;
    }

    /**
     * A method that reads in an integer from the user and
     * outputs its cube
     *
     * @return the cube of the user entered integer
     */
    public int cubeOfInteger() {
        // read in a value from the user
        System.out.print("Enter an integer to be cubed: ");
        int valueToBeCubed = scanner.nextInt();

        // use the parameterised version of the method to carry out the actual calculation
        return cubeOfInteger(valueToBeCubed);
    }

    /**
     * This method adds two double variables and prints the result
     *
     * @param num1  the first double in the sum
     * @param num2  the second double in the sum
     */
    public void addNum(double num1, double num2) {
        double result = num1 + num2;
        System.out.println("This is double addNum with result: " + result);
    }

    /**
     * This method adds two integer variables and prints the result
     *
     * @param num1  the first integer in the sum
     * @param num2  the second integer in the sum
     */
    public void addNum(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("This is int addNum with result: " + result);
    }

    /**
     * Converts a temperature in Fahrenheit to Celsius and prints to standard output
     *
     * @param   fahrenheit a temperature on the Fahrenheit scale
     * @return  A temperature in degrees Celsius
     */
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32.0) * (5.0/9.0);
    }
}
