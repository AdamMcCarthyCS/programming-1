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

    public void sumFiveNumbers() {
        int sum = 0;
        // read in five integers prompting the user to enter the next one each time
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + " of 5: ");
            int value = scanner.nextInt();
            sum += value;
        }

        System.out.println("The sum of the numbers you entered is " + sum);
    }

}

