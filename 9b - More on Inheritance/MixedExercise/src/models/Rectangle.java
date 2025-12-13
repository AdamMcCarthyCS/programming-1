package models;

/**
 * A class to model a rectangle
 *
 * @author Adam McCarthy
 * @version 1.0 (11-Dec-25)
 */
public class Rectangle extends Shape {
    private double length;
    private double width;

    /**
     * Constructs a rectangle object.
     *
     * @param colour        the colour of the rectangle
     * @param filled        whether its interior is filled
     * @param length        the length of the rectangle
     * @param width         the width of the rectangle
     */
    public Rectangle(String colour, boolean filled, double length, double width) {
        super(colour, filled);
        this.length = length;
        this.width = width;
    }

    /**
     * Returns the area of the rectangle.
     *
     * <p>The area of a rectangle is calculated using the formula</p>
     * <pre>area = length * width</pre>
     *
     * @return              the area of the rectangle in units squared
     */
    public double getArea() {
        // calculate area
        return length * width;
    }

    /**
     * Returns the perimeter of the rectangle.
     *
     * <p>The perimeter of the rectangle is calculated using the formula</p>
     * <pre>perimeter = 2 * (length + width) = length + length + width + width</pre>
     *
     * @return              the perimeter of the rectangle
     */
    public double getPerimeter() {
        // calculate perimeter by adding the two lengths and widths
        return 2 * (length + width);
    }
}
