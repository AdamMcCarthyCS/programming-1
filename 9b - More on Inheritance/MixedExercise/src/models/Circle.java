package models;

/**
 * This class represents a Circle.
 *
 * @author Adam McCarthy
 * @version 1.0 (11-Dec-25)
 */
public class Circle extends Shape {
    /**
     * The ratio between the diameter and circumference of a circle.
     */
    private final double pi = Math.PI;
    /**
     * Half the circumference of the circle.
     */
    private double radius;

    /**
     * Constructs a circle object.
     *
     * @param colour        the colour of the circle
     * @param filled        whether the circle's interior is filled
     * @param radius        the radius of the circle
     */
    public Circle(String colour, boolean filled, double radius) {
        super(colour, filled);
        this.radius = radius;
    }

    /**
     * Calculates the Area of the circle
     *
     * <p>The area of a circle is calculated using the formula</p> <pre>area = pi * radius * radius</pre>
     *
     * @return              the area of the circle in units squared
     */
    public double getArea() {
        // Find the area
        return pi * radius * radius;
    }

    /**
     * Calculates the perimeter of a circle
     *
     * <p>The perimeter of a circle is calculated using the formula</p>
     * <pre>perimeter = 2 * pi * radius</pre>
     *
     * @return              the perimeter of the circle
     */
    public double getPerimeter() {
        // Find the perimeter
        return 2 * pi * radius;
    }
}
