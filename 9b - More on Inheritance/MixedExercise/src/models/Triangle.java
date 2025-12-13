package models;

/**
 * This class models a triangle object.
 *
 * @author Adam McCarthy
 * @version 1.0 (13-Dec-25)
 * @see Shape
 */
public class Triangle extends Shape{
    /**
     * The first side of the triangle.
     */
    private double firstSide;
    /**
     * The second side of the triangle.
     */
    private double secondSide;
    /**
     * The third side of the triangle.
     */
    private double thirdSide;

    /**
     * Constructs a triangle object
     *
     * @param colour        the colour of the triangle
     * @param filled        whether the triangles colour fills its interior
     * @param firstSide     the first side length of the triangle
     * @param secondSide    the second side length of the triangle
     * @param thirdSide     the third side length of the triangle
     */
    public Triangle(String colour, boolean filled, double firstSide, double secondSide, double thirdSide) {
        super(colour, filled);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }


    /**
     * Calculates the area of the triangle.
     *
     * <p>Using Herons formula:</p>
     * <pre>Area = sqrt(s(s-a)(s-b)(s-c))</pre>
     * <p>where s = semiperimeter and a, b, and c, are the side lengths of the triangle.</p>
     *
     * @return      the area of the triangle
     */
    public double getArea() {
        // use herons formula to find area: Area = sqrt(s(s-a)(s-b)(s-c))
        // where a, b, and c are the three sides and s is the semiperimeter
        double a = firstSide;
        double b = secondSide;
        double c = thirdSide;
        double s = calculateSemiperimeter();

        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    /**
     * Returns the perimeter to the triangle.
     *
     * @return      the perimeter of the triangle
     */
    public double getPerimeter() {
        // Sum all sides to get perimeter
        return firstSide + secondSide + thirdSide;
    }

    /**
     * Returns the semiperimeter of the triangle.
     *
     * <p>Calculates the semiperimeter by halving the perimeter.</p>
     *
     * @return      the semiperimeter of the triangle
     */
    private double calculateSemiperimeter() {
        // calculate semiperimeter to use in herons formula s = (a + b + c) / 2
        return getPerimeter() / 2;
    }
}
