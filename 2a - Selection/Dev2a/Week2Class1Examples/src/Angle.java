import java.util.Scanner;

public class Angle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // read in an angle to determine the output
        // I will assume angles are between 0 and 360 degrees only
        System.out.print("Enter the size of an angle: ");
        int angle = input.nextInt();

        System.out.print("The angle " + angle + ",");
        if (angle < 90) {
            System.out.println(" is an acute angle!");
        } else if (angle == 90) {
            System.out.println(" is a right angle!");
        } else if (angle < 180) {
            System.out.println(" is an obtuse angle!");
        } else if (angle == 180) {
            System.out.println(" is a straight angle!");
        } else {
            System.out.println(" is a reflex angle!");
        }

    }
}
