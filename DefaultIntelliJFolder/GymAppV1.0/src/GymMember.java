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
    private int membershipNumber = 99999;
    /**
     * Whether the person is currently a gym member, represented by true or false.
     */
    private boolean currentGymMember = false;
    
    /**
     * Constructs a GymMember object.
     *
     * @param name              the member's full name
     * @param height            the member's height in meters
     * @param weight            the member's weight in kg
     * @param membershipNumber  the membership number
     * @param currentGymMember  whether the membership is currently active
     */
    public GymMember(String name, double height, double weight, int membershipNumber,
                     boolean currentGymMember) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.membershipNumber = membershipNumber;
        this.currentGymMember = currentGymMember;
    }
    
    /**
     * Returns the name of the gym member.
     *
     * @return      the gym member's full name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Returns the height of the gym member.
     *
     * @return      the gym member's height in meters
     */
    public double getHeight() {
        return height;
    }
    
    /**
     * Returns the weight of the gym member.
     *
     * @return      the gym member's weight in kilograms
     */
    public double getWeight() {
        return weight;
    }
    
    /**
     * Returns the membership number of the gym member.
     *
     * @return      the integer membership number of the gym member
     */
    public int getMemberShipNumber() {
        return membershipNumber;
    }
    
    /**
     * Returns whether the person's gym membership is active.
     *
     * @return      the membership status (true/false)
     */
    public boolean isCurrentGymMember() {
        return currentGymMember;
    }
    
    /**
     * Sets a name for the gym member.
     *
     * @param name  the new name of the gym member
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Sets a new height for the gym member.
     *
     * @param height    the new height of the gym member
     */
    public void setHeight(double height) {
        this.height = height;
    }
    
    /**
     * Sets a new weight for the gym member
     *
     * @param weight    the new weight of the gym member
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    /**
     * Sets a new membership number for the gym member.
     *
     * @param memberShipNumber  the new membership number
     */
    public void setMemberShipNumber(int memberShipNumber) {
        this.membershipNumber = memberShipNumber;
    }
    
    /**
     * Set a new value for whether the persons membership is active
     *
     * @param currentGymMember  whether the persons membership is active (true/false)
     */
    public void setCurrentGymMember(boolean currentGymMember) {
        this.currentGymMember = currentGymMember;
    }
}
