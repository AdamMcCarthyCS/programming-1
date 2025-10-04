public class RectangleCalculator {
    public static void main(String[] args) {
        int length = 5;
        int width = 3;

        // calculate area using length x width
        int area = length * width;
        // calculate perimeter by adding all the sides
        int perimeter = 2 * length + 2 * width;

        // Output the results
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}
