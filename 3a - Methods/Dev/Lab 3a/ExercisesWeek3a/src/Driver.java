public class Driver {
    public static void main(String[] args) {
        WarmWelcome greeter = new WarmWelcome();
        // Display program welcome message upon startup
        greeter.printWelcome();
        // put a line between the welcome message and the rectangle calculations

        System.out.println("Hardcoded rectangle calculations:");
        RectangleCalculator calculator = new RectangleCalculator();
        // first, calculate the area and perimeter with hardcoded values
        calculator.printArea(6, 8);
        calculator.printPerimeter(6,8);
        // put a new line before the next part where values are read in
        System.out.println();

        System.out.println("Calculations taking input from user:");
        // read in values and perform area and perimeter calculations
        calculator.printArea();
        calculator.printPerimeter();

        // put line between print statements and goodbye message
        System.out.println();
        // print goodbye message
        greeter.printGoodbye();

    }
}
