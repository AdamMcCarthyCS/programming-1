package main;

import models.Circle;
import models.Rectangle;

/**
 * This class is the entry point of the program and contains the main method.
 */
public class Main {
    /**
     * This is the starting point of the program.
     *
     * @param args      a string array of command line arguments (unused)
     */
    public static void main(String[] args) {
        // initialise circle and rectangle objects
        Circle circle = new Circle("red", true, 5.0);
        Rectangle rectangle = new Rectangle("blue", false, 4.0, 6.0);

        // print out the values of the circle area and perimeter
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());
        // print out the values of the rectangle area and perimeter
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
    }
}
