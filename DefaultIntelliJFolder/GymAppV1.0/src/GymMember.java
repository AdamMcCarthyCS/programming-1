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
    
    public String getName() {
        return name;
    }
    
    public double getHeight() {
        return height;
    }
    
    public double getWeight() {
        return weight;
    }
    
    public int getMemberShipNumber() {
        return membershipNumber;
    }
    
    public boolean isCurrentGymMember() {
        return currentGymMember;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public void setMemberShipNumber(int memberShipNumber) {
        this.membershipNumber = memberShipNumber;
    }
    
    public void setCurrentGymMember(boolean currentGymMember) {
        this.currentGymMember = currentGymMember;
    }
}
