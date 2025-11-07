/**
 * This is the entry point of the program.
 *
 * <p>The main method is used to test the functionality of the {@code Calculator} class.</p>
 *
 * @author Adam McCarthy
 * @version 1.0
 */
public class UseCalculator {
    public static void main(String[] args){
        // declare two values to do the calculations with
        double firstValue = 123.45;
        double secondValue = -67.89;
        
        // create an instance of the Calculator class
        Calculator calculator = new Calculator();
        
        // perform the four operations and store in variables
        double addition = calculator.add(firstValue, secondValue);
        double subtraction = calculator.subtract(firstValue, secondValue);
        double multiplication = calculator.multiply(firstValue, secondValue);
        double division = calculator.divide(firstValue, secondValue);
        
        // print the results
        System.out.println(firstValue + " + " + secondValue + " = " + addition);
        System.out.println(firstValue + " - " + secondValue + " = " + subtraction);
        System.out.println(firstValue + " * " + secondValue + " = " + multiplication);
        System.out.println(firstValue + " + " + secondValue + " = " + division);
        
        // skip a line in output
        System.out.println();
        
        // add third value to test overloaded version of add
        double thirdValue = 1011.12;
        // perform addition with three variables
        double threeValuesAdded = calculator.add(firstValue, secondValue, thirdValue);
        System.out.println(firstValue + " + " + secondValue + " + " + thirdValue + " = "
            + threeValuesAdded);
        
        // skip a line in output
        System.out.println();
        
        // test that dividing by 0 case works correctly
        double zero = 0;
        double zeroDivision = calculator.divide(firstValue, zero);
        // print the result
        System.out.println(firstValue + " / " + zero + " = " + zeroDivision);
        
    }
}
