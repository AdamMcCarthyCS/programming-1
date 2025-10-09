import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        // create a new scanner instance
        Scanner input = new Scanner(System.in);
        // store the secret number the user will guess
        int secretMeaningOfLife = 42;
        // store number of guesses the user makes
        int guessCounter = 0;
        // use a number outside the range to begin the loop
        int guess = -1;

        // read in integers until the user guesses correctly
        while(guess != secretMeaningOfLife) {
            System.out.print("Pick a number between 1 and 50: ");
            guess = input.nextInt();
            // give user a hint if they guessed incorrectly
            if (guess < secretMeaningOfLife) {
                System.out.println("Too low!");
                guessCounter++;
            }

            if (guess > secretMeaningOfLife) {
                System.out.println("Too high!");
                guessCounter++;
            }
        }
        // Add extra guess for the correct guess
        guessCounter++;

        // Output message showing the program has finished
        System.out.println("Congratulations, you now know the meaning of life," +
                " the universe, everything!");
        if (guessCounter == 1) {
            System.out.println("You only needed 1 guess! Amazing!");
        } else {
            System.out.println("It took you " + guessCounter + " guesses!");
        }
    }
}
