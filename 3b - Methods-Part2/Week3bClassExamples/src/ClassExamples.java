import java.util.Scanner;

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
}
