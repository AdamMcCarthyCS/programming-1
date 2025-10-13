import java.util.Scanner;

public class RectangleCalculator {
/*    use a single scanner instance for both methods
I don't like this as it does not allow me to close the input stream */
    private Scanner input = new Scanner(System.in);

    public void printArea(double width, double height) {
        double area = width * height;
        System.out.println("Area: " + area);
    }

    public void printPerimeter(double width, double height) {
        double perimeter = 2 * width + 2 * height;
        System.out.println("Perimeter: " + perimeter);
    }

    public void printArea() {
        // read in the width and height to be used in the calculation
        System.out.print("Enter the width of the rectangle: ");
        double width = input.nextDouble();
        System.out.print("Enter the height of the rectangle: ");
        double height = input.nextDouble();

        // use other implementation to carry out calculation logic
        printArea(width, height);
    }

    public void printPerimeter() {
        // read in the width and height to be used in the calculation
        System.out.print("Enter the width of the rectangle: ");
        double width = input.nextDouble();
        System.out.print("Enter the height of the rectangle: ");
        double height = input.nextDouble();

        // use other implementation to carry out calculation logic
        printPerimeter(width, height);
    }
}
