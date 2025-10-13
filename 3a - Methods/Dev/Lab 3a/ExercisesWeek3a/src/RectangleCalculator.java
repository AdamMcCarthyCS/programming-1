public class RectangleCalculator {

    public void printArea(double width, double height) {
        double area = width * height;
        System.out.println("Area: " + area);
    }

    public void printPerimeter(double width, double height) {
        double perimeter = 2 * width + 2 * height;
        System.out.println("Perimeter: " + perimeter);
    }
}
