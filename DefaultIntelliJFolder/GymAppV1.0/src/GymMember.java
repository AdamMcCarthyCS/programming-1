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
    private String name = "N/A";
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
     * Constructs a GymMember object where:
     * <ul>
     *     <li>The username is 30 characters or fewer</li>
     * </ul>
     *
     * @param name              the member's full name
     * @param height            the member's height in meters
     * @param weight            the member's weight in kg
     * @param membershipNumber  the membership number
     * @param currentGymMember  whether the membership is currently active
     */
    public GymMember(String name, double height, double weight, int membershipNumber,
                     boolean currentGymMember) {
        if (name.length() <= 30) {
            this.name = name;
        } else {
            this.name = name.substring(0, 30);
        }
        if (height >= 0.5 && height < 3.0) {
            this.height = height;
        }
        if (weight > 25 && weight < 600) {
            this.weight = weight;
        }
        if (membershipNumber >= 1 && membershipNumber < 99999) {
            this.membershipNumber = membershipNumber;
        }
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
     * Sets a name for the gym member if the argument is 30 characters or fewer.
     *
     * @param name  the new name of the gym member
     */
    public void setName(String name) {
        if (name.length() <= 30) {
            this.name = name;
        }
    }
    
    /**
     * Sets a new height for the gym member if the argument is between 0.5m and 3m inclusive
     *
     * @param height    the new height of the gym member
     */
    public void setHeight(double height) {
        if (height >= 0.5 && height < 3.0) {
            this.height = height;
        }
    }
    
    /**
     * Sets a new weight for the gym member if the argument is between 25kg and 600kg inclusive.
     *
     * @param weight    the new weight of the gym member
     */
    public void setWeight(double weight) {
        if (weight > 25 && weight < 600) {
            this.weight = weight;
        }
    }
    
    /**
     * Sets a new membership number for the gym member if the argument is between 1 (inclusive)
     * and 99999 (exclusive).
     *
     * @param memberShipNumber  the new membership number
     */
    public void setMemberShipNumber(int memberShipNumber) {
        if (membershipNumber >= 1 && membershipNumber < 99999) {
            this.membershipNumber = membershipNumber;
        }
    }
    
    /**
     * Set a new value for whether the persons membership is active
     *
     * @param currentGymMember  whether the persons membership is active (true/false)
     */
    public void setCurrentGymMember(boolean currentGymMember) {
        this.currentGymMember = currentGymMember;
    }
    
    /**
     * Returns a string representation of the member's details
     *
     * @return  a formatted version of the members details including the name, height, weight,
     * membership number, and whether the membership is active or not
     */
    @Override
    public String toString() {
        return String.format("Member Details:\n\tName: %s\n\tHeight: %.2fm\n\tWeight: %.2fkg"
            + "\n\tMembership Number: %5d\n\tMembership Active: %b", name, height, weight,
            membershipNumber, currentGymMember);
    }
}
