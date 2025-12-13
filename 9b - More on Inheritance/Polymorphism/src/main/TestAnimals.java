package main;

import models.Animal;
import models.Cat;
import models.Cow;
import models.Dog;

/**
 * Demonstrates polymorphism in Java.
 *
 * <p>We store subclass instances in an array of the parent type. Then we call a method of the
 * {@code Animal} class which is overridden in the subclass. Although the static type is {@code
 * Animal}, the method which is called depends on the actual subclass's dynamic type</p>
 */
public class TestAnimals {
    public static void main (String[] args) {
        // Create an array of instances of subclasses of Animal
        Animal[] animals = {new Dog(), new Cat(), new Cow()};

        // For each subclass instance of Animal call the make sound method
        for (Animal animal: animals) {
            animal.makeSound();
        }

    }
}
