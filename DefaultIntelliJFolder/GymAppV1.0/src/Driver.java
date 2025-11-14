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
        GymMember member = new GymMember("Adam", 179, 85.5, 1234, true);
        System.out.println(member);
    }
    
    /**
     * Creates a new GymMember object
     *
     * @param name              the member's name
     * @param height            the member's height in meters
     * @param weight            the member's weight in kilograms
     * @param membershipNumber  the member's membership number
     * @param currentGymMember  whether the member's gym membership is currently active
     */
    public void addGymMember(String name, double height, double weight, int membershipNumber,
                             boolean currentGymMember) {
        // instantiate an instance of GymMember
        this.member = new GymMember(name, height, weight, membershipNumber, currentGymMember);
    }
}
