import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        // create a scanner object
        Scanner input = new Scanner(System.in);

        // create a FortuneTeller object to call methods on
        FortuneTeller fortuneTeller = new FortuneTeller();

        // output random fortune
        fortuneTeller.sayRandomFortune();

        // read in the users name and print a personal fortune
        System.out.print("Please enter your name: ");
        String name = input.nextLine();
        fortuneTeller.personalFortune(name);

        // read in users age and print future prediction
        System.out.print("Please enter your age: ");
        int age = input.nextInt();
        String message = fortuneTeller.futurePrediction(age);
        System.out.println(message);
    }
}
