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
}
