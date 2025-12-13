package models;

/**
 * A class which models a cow and inherits from {@code Animal}.
 *
 * @author Adam McCarthy
 * @version 1.0 (13-Dec-25)
 * @see Animal
 */
public class Cow extends Animal{

    /**
     * Prints the sound a cow makes.
     *
     * <p>This method overrides the {@code makeSound} method of the {@code Animal} class</p>
     */
    @Override
    public void makeSound() {
        System.out.println("Cow moos");
    }
}

