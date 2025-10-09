import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        // create a new scanner instance
        Scanner input = new Scanner(System.in);
        // store the secret number the user will guess
        int secretMeaningOfLife = 42;

        // use a number outside the range to begin the loop
        int guess = -1;

        // read in integers until the user guesses correctly
        while(guess != secretMeaningOfLife) {
            System.out.print("Pick a number between 1 and 50: ");
            guess = input.nextInt();
            // give user a hint if they guessed incorrectly
            if (guess < secretMeaningOfLife) {
                System.out.println("Too low!");
            }

            if (guess > secretMeaningOfLife) {
                System.out.println("Too high!");
            }
        }
        System.out.println("Congratulations, you now know the meaning of life," +
                " the universe, everything!");
    }
}
