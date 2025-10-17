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
     * Computes the cube of an integer.
     *
     * @param number an integer value
     *
     * @return the cube of the given integer
     */
    public int cubeOfInteger(int number) {
        return number * number * number;
    }

    /**
     * A method that reads in an integer from the user and outputs its cube.
     *
     * @return the cube of the user entered integer
     */
    public int cubeOfInteger() {
        // read in a value from the user
        System.out.print("Enter an integer to be cubed: ");
        int valueToBeCubed = scanner.nextInt();

        // use the parameterised version of the method to carry out the actual calculation.
        return cubeOfInteger(valueToBeCubed);
    }

    /**
     * This method adds two double variables and prints the result.
     *
     * @param num1  the first double in the sum
     * @param num2  the second double in the sum
     */
    public void addNum(double num1, double num2) {
        double result = num1 + num2;
        System.out.println("This is double addNum with result: " + result);
    }

    /**
     * This method adds two integer variables and prints the result.
     *
     * @param num1  the first integer in the sum
     * @param num2  the second integer in the sum
     */
    public void addNum(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("This is int addNum with result: " + result);
    }

    /**
     * Converts a temperature in Fahrenheit to Celsius and prints to standard output.
     *
     * @param   fahrenheit a temperature on the Fahrenheit scale
     * @return  A temperature in degrees Celsius
     */
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32.0) * (5.0/9.0);
    }

    /**
     * Reads a temperature in Fahrenheit from the user and converts it to Celsius.
     * Prints the converted temperature to the standard output.
     *
     * @return  A temperature in degrees Celsius
     */
    public double fahrenheitToCelsius() {
        // read a Fahrenheit temperature in from the user as a double
        System.out.print("Enter a temperature in degrees Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        return fahrenheitToCelsius(fahrenheit);
    }

    /**
     * A recursive function to calculate the factorial of a positive integer n
     * The function uses the formula n! = 1 * 2 * ... * n-1 * n
     *
     * @param n     a positive integer to find the factorial of
     * @return      an integer which is the factorial of n
     */
    public int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    /**
     * A function to use a loop to calculate n factorial
     * n! = 1 * 2 * ... * n-1 * n
     *
     * @param n     a positive integer to find the factorial value of
     * @return      The result of calculating n * n-1 * ... * 2 * 1
     */
    public int loopFactorial(int n) {
        int nFactorial = 1;
        for (int i = 1; i <= n; i++) {
            nFactorial *= i;
        }
        return nFactorial;
    }

    /**
     * A recursive function to calculate the nth value of the fibonacci sequence
     * the nth term Tn is given by Tn = Tn-1 + Tn-2 where n >= 1
     *
     * @param n     a positive integer value
     * @return      the nth term of the fibonacci sequence
     */
    public int fibonacci(int n) {
        int fib1 = 1;
        int fib2 = 1;

        if (n == 1) {
            return fib1;
        }

        if (n == 2) {
            return fib2;
        }


        return fibonacci(n - 1) + fibonacci (n - 2);
    }

}

