package main;

import models.*;
import util.Utilities;

/**
 * This class is the entry point to the program.
 *
 * <p>The class contains the main method and uses polymorphism to print out the values of the
 * fields of several objects.</p>
 *
 * @author Adam McCarthy
 * @version 1.0 (13-Dec-25)
 * @see models.Shape
 * @see models.Circle
 * @see models.Rectangle
 * @see models.Square
 * @see models.Triangle
 */
public class TestShapes {
    public static void main(String[] args) {

        // create an array of the different types of shape
        Shape[] shapes = {
            new Circle("Red", true, 5.3),
            new Rectangle("White", false, 4.0, 3.0),
            new Square("Blue", true, 6),
            new Triangle("Yellow", false, 3.7, 4.0, 5.0)
        };

        for (Shape shape: shapes) {
            System.out.println(shape.getClass().getSimpleName() + ":");
            System.out.println("\tColour: " + shape.getColour());
            System.out.println("\tFilled: " + shape.isFilled());
            // Round doubles before printing out
            System.out.println("\tArea: " + Utilities.roundDouble(shape.getArea()) + " units " +
                "squared");
            System.out.println("\tPerimeter: " + Utilities.roundDouble(shape.getPerimeter()) + " " +
                "units");
        }
    }
}
