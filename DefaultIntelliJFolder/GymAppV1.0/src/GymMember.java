/**
 * This is a class that represents a gym member.
 *
 * <p>It has the fields: name, height, weight, membership number, and if the person is currently
 * a member. It also has public methods to retrieve and set these fields and print a string
 * representation.</p>
 *
 * @author      Adam McCarthy
 * @version     1.0
 */
public class GymMember {
    /**
     * The gym members full name.
     */
    private String name = "";
    /**
     * The gym members weight in kilograms.
     */
    private double height = 0.5d;
    /**
     * The gym members height in meters.
     */
    private double weight = 25d;
    /**
     * The gym members membership number.
     */
    private int memberShipNumber = 99999;
    /**
     * Whether the person is currently a gym member, represented by true or false.
     */
    private boolean currentGymMember = false;
}
