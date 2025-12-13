package models;

/**
 * This is a general class representing a two-dimensional geometrical shape.
 *
 * <p>The class contains state about the colour of the shape and whether it is filled in the
 * center with that colour</p>
 *
 * @author Adam McCarthy
 * @version 1.0 (11-Dec-25)
 */
public class Shape {
    /**
     * The colour of the shape.
     */
    protected String colour;

    /**
     * Whether the shapes interior is filled with its colour.
     */
    protected boolean filled;

    /**
     * Constructs a shape object.
     *
     * @param colour    the colour of the shape
     * @param filled    whether the interior of the shape is filled with its colour
     */
    public Shape(String colour, boolean filled) {
        this.colour = colour;
        this.filled = filled;
    }

    /**
     * Returns the colour of the shape.
     *
     * @return          the colour of the shape
     */
    public String getColour() {
        return colour;
    }

    /**
     * Returns whether the interior of the shape is filled with its colour.
     *
     * @return          true if the interior is filled; false otherwise
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * Sets the colour of the shape.
     *
     * @param colour    the colour of the shape
     */
    public void setColour(String colour) {
        this.colour = colour;
    }

    /**
     * Sets if the shapes interior is filled with its colour
     *
     * @param filled    true if the shapes interior is filled; false otherwise
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}
