package models;

/**
 * A class which models a dog and inherits from {@code Animal}.
 *
 * @author Adam McCarthy
 * @version 1.0 (13-Dec-25)
 * @see Animal
 */
public class Dog extends Animal{

    /**
     * Prints the sound a dog makes.
     *
     * <p>This method overrides the {@code makeSound} method of the {@code Animal} class</p>
     */
    @Override
    public void makeSound() {
        System.out.println("Dog Barks");
    }
}
