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


}
