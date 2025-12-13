package models;

/**
 * A class that models a square.
 *
 * <p>The methods from the rectangle class will suffice to calculate the area and perimter of
 * the square using dynamic method lookup and calling the {@code Rectangle} methods.</p>
 *
 * @author Adam McCarthy
 * @version 1.0 (13-Dec-25)
 * @see Rectangle
 */
public class Square extends Rectangle{

    /**
     * Constructs a square object.
     *
     * @param colour        the colour of the square
     * @param filled        whether the centre of the square is filled
     * @param sideLength    the side length of each of the four sides
     */
    public Square(String colour, boolean filled, double sideLength) {
        super(colour, filled, sideLength, sideLength);
    }
}
