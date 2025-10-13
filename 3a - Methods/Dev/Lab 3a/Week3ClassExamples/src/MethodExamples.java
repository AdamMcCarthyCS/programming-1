import java.util.Scanner;

public class MethodExamples {
    public void sayHello() {
        System.out.println("Hello!");
    }

    public void greet() {
        Scanner input = new Scanner(System.in);

        // Read in a name and age from the user to include in print statement
        System.out.print("Please enter your first name: ");
        String name = input.nextLine();
        System.out.print("Please enter your age: ");
        int age = input.nextInt();

        // Output a greeting using the user input
        System.out.println("Hello " + name + ", you are "
        + age + " years old.");
    }
}
