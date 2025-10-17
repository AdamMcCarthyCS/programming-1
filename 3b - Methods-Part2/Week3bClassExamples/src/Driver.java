public class Driver {
    public static void main(String[] args){

        // create an instance of the ClassExamples class
        ClassExamples example = new ClassExamples();


        // *** EXAMPLE 1 ***

        // cube the number and output the result
        int numToBeCubed = 4;
        int cubedNumber = example.cubeOfInteger(numToBeCubed);
        System.out.println(numToBeCubed + " cubed is " + cubedNumber);

        // leave a newline between the outputs
        System.out.println();

        // call the parameterless version of the method
        int otherCubedNumber = example.cubeOfInteger();
        System.out.println("The cube of this number is: " + otherCubedNumber);

        // leave a newline between the outputs
        System.out.println();

        // *** EXAMPLE 2 ***

        int num1 = 12;
        int num2 = 4;
        System.out.println("For " + num1 + " and " + num2 + ": ");
        example.addNum(num1, num2);

        // leave a newline between the outputs
        System.out.println();

        double doubleNum1 = 14.8d;
        double doubleNum2 = 89.9d;
        System.out.println("For " + doubleNum1 + " and " + doubleNum2 + ": ");
        example.addNum(doubleNum1, doubleNum2);

        // leave a newline between the outputs
        System.out.println();

        doubleNum1 = 12;
        doubleNum2 = 89.9d; // unnecessary, but included for completeness
        System.out.println("For " + doubleNum1 + " and " + doubleNum2 + ": ");
        example.addNum(doubleNum1, doubleNum2);

        // leave a newline between the outputs
        System.out.println();

        doubleNum1 = 14.8d;
        doubleNum2 = 4;
        System.out.println("For " + doubleNum1 + " and " + doubleNum2 + ": ");
        example.addNum(doubleNum1, doubleNum2);

        // *** EXAMPLE 3 ***

        // leave a newline between the outputs
        System.out.println();

        double temperatureInFahrenheit = 451d;
        double temperatureInCelsius = example.fahrenheitToCelsius(temperatureInFahrenheit);
        System.out.println(temperatureInFahrenheit + " degrees Fahrenheit converts to "
                + temperatureInCelsius + " degrees Celsius");

        // *** EXAMPLE 4 ***

        // leave a newline between the outputs
        System.out.println();

        // read in temperature from user and print Celsius conversion to standard output
        temperatureInCelsius = example.fahrenheitToCelsius();
        System.out.println("This converts to " + temperatureInCelsius + " degrees Celsius");

        // leave a newline between the outputs
        System.out.println();
        int n = 6;
        int factorialResult = example.factorial(n);
        System.out.println("The factorial of " + n + " is " + factorialResult);

        // leave a newline between the outputs
        System.out.println();

        // calculate n! using the loop function using previously defined n
        int loopFactorialResult = example.loopFactorial(n);
        System.out.println("The loop factorial of " + n + " is " + loopFactorialResult);

        // leave a newline between the outputs
        System.out.println();

        int nForFibonacci = 10;
        int fibonacciResult = example.fibonacci(nForFibonacci);
        System.out.println("The " + nForFibonacci + "th term in the fibonacci sequence is "
            + fibonacciResult);
    }
}
