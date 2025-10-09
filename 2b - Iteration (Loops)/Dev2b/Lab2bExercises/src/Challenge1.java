import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {

        // initialise scanner instance
        Scanner input = new Scanner(System.in);
        int evenNumberCounter = 0;

        // read in five integers from the user
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter an integer: ");
            int value = input.nextInt();

            // decide what output message is given based on parity
            if (value % 2 == 0) {
                System.out.println(value + " is even");
                evenNumberCounter++;
            } else {
                System.out.println(value + " is odd");
            }
        }

        // separate the final statement from the rest with a new line
        System.out.println();
        // output the number of even integers entered
        System.out.println("You chose " + evenNumberCounter + " even numbers.");
    }
}
