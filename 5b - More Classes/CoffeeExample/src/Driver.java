public class Driver {
    public static void main(String[] args) {
        // Create an array to hold CoffeeCup objects.
        CoffeeCup[] cups = new CoffeeCup[5];
        
        // Create CoffeeCup instances.
        cups[0] = new CoffeeCup("Latte", 350);
        cups[1] = new CoffeeCup("Espresso", 100);
        cups[2] = new CoffeeCup("Cappuccino", 250);
        cups[4] = new CoffeeCup("Americano", 300);
        cups[5] = new CoffeeCup("Mocha", 400);
    }
}
