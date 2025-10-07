public class SimpleCalculator {
    public static void main(String[] args) {


        // Store two numbers to perform operations on
        double firstNumber = 7;
        double secondNumber = 3;

        // Since the numbers can be floats, decimals, or integers store results in doubles;
        double addition = firstNumber + secondNumber;
        double subtraction = firstNumber - secondNumber;
        double multiplication = firstNumber * secondNumber;
        // no need for casting as we are working with doubles
        double division = firstNumber / secondNumber;

        // output results
        System.out.println(firstNumber + " + " + secondNumber + " = " + addition);
        System.out.println(firstNumber + " - " + secondNumber + " = " + subtraction);
        System.out.println(firstNumber + " * " + secondNumber + " = " + multiplication);
        System.out.println(firstNumber + " / " + secondNumber + " = " + division);
    }
}
