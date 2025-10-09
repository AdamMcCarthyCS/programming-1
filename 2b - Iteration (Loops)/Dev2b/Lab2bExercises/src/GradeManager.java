import java.util.Scanner;

public class GradeManager {
    public static void main(String[] args) {
        // create a scanner object
        Scanner input = new Scanner(System.in);
        // store the total of the class scores
        int scoreTotal = 0;
        // prompt the user to enter class size
        System.out.print("Please enter the class size: ");
        int classSize = input.nextInt();

        // read in the individual scores and output whether they passed
        for (int i = 1; i <= classSize; i++) {
            System.out.print("Enter the score for student " + i + ": ");
            int score = input.nextInt();

            if (score >= 50 && score <= 100) {
                System.out.println("Pass");
                scoreTotal += score;
            } else if (score >= 0 && score < 50) {
                System.out.println("Fail");
                scoreTotal += score;
            } else {
                System.out.println("Invalid score! Try again!");
                i--;
            }
        }

        // calculate and print the average score
        double average = (double) scoreTotal / classSize;
        System.out.println("The class average is: " + average);
    }
}
