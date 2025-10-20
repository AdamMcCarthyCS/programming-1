import java.util.Scanner;

public class Examples {
    private Scanner scanner = new Scanner(System.in);

    public void readInput(){
        // Read in users name and age for use in final print statement
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Hello " + name + "! You are " + age + " years old.");
    }

}

