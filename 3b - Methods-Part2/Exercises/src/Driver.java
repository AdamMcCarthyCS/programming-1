/**
 * The Driver class serves as the main entry point for the program.
 *
 * <p>The class contains the {@code main} method which starts the application</p>
 *
 * @author Adam McCarthy
 * @version 1.0
 */
public class Driver {
    public static void main(String[] args) {

        // create an instance of the exercises class
        Exercises exercise = new Exercises();

        // Exercise 1
        int firstNumber = 15;
        int secondNumber = 25;
        int thirdNumber = 100;
        int answer = exercise.addNum(firstNumber, secondNumber, thirdNumber);
        System.out.println(firstNumber + " + " + secondNumber + " + " + thirdNumber + " = "
            + answer);

        // Add a newline between the exercise outputs
        System.out.println();

        // Exercise 2

        // compute the product using arguments
        exercise.product(10, 20, 30);

        // add a newline
        System.out.println();

        // compute the product by reading in the three integers from the user
        exercise.product();
    }
}
