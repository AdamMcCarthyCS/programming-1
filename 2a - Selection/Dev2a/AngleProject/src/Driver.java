import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       // create variables to store user input
       String name, address, dateOfBirth;
       int height;

       // Read user details into variables
        System.out.println("Entering details");
        System.out.println("----------------");

        System.out.print("Enter your name:          ");
        name = input.nextLine();

        System.out.print("Enter your address:       ");
        address = input.nextLine();

        System.out.print("Enter your date of birth: ");
        dateOfBirth = input.nextLine();

        System.out.print("Enter your height:        ");
        height = input.nextInt();

        // output details in required format
        System.out.print("User{");
        System.out.print("name='" + name + "', ");
        System.out.print("address='" + address + "', ");
        System.out.print("dateOfBirth:'" + dateOfBirth + "', ");
        System.out.print("height:'" + height + "'}");
    }
}
