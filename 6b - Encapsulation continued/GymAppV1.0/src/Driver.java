import java.util.Scanner;

/**
 * This is the entry point to the program. It controls all user input and output.
 *
 * @author      Adam McCarthy
 * @version     1.0
 * @see         GymMember
 */
public class Driver {
    /**
     * A {@code Scanner} object used to read in user input.
     */
    private Scanner input = new Scanner(System.in);
    /**
     * A {@code GymMember} object with the user will provide the details for.
     */
    private GymMember member;
    
    /**
     * Program starts here.
     *
     * @param args      a {@code String} array of command line arguments
     */
    public static void main(String[] args) {
        Driver driver = new Driver();
        driver.addGymMember();
        driver.printGymMember();
    }
    
    /**
     * Creates a new GymMember object.
     */
    public void addGymMember() {
        System.out.print("Enter the name of the gym member: ");
        String name = input.nextLine();
        
        System.out.print("Enter the height of the gym member in meters: ");
        double height = input.nextDouble();
        
        System.out.print("Enter the weight of the gym member in kg: ");
        double weight = input.nextDouble();
        
        System.out.print("Enter the integer membership number of the gym member: ");
        int membershipNumber = input.nextInt();
        // skip newline character
        input.nextLine();
        
        System.out.print("Enter whether the gym membership is currently active (y/n): ");
        char currentGymMemberResponse = input.nextLine().toLowerCase().charAt(0);
        boolean currentGymMember = false;
        if (currentGymMemberResponse == 'y') {
            currentGymMember = true;
        }
        
        // instantiate an instance of GymMember
        member = new GymMember(name, height, weight, membershipNumber, currentGymMember);
    }
    
    /**
     * Prints a string representation of the gym member object.
     */
    public void printGymMember() {
        // Print a string representation of the GymMember object by calling its toString method.
        System.out.println(member);
    }
}
