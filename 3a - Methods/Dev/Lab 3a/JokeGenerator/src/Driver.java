import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create an instance of JokeGenerator
        JokeGenerator joker = new JokeGenerator();

        // 1. Tell a joke
        joker.tellJoke();

        // 2. Ask for a name and tell a story
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        joker.tellStory(name);


        // 3. Ask for age and give future self a message
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        String message = joker.ageInTenYears(age);
        System.out.println(message);
    }
}
