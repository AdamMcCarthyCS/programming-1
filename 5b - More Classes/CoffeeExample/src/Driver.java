public class Driver {
    public static void main(String[] args) {
        // Create an array to hold CoffeeCup objects.
        CoffeeCup[] cups = new CoffeeCup[5];
        
        // Create CoffeeCup instances.
        cups[0] = new CoffeeCup("Latte", 350);
        cups[1] = new CoffeeCup("Espresso", 100);
        cups[2] = new CoffeeCup("Cappuccino", 250);
        cups[3] = new CoffeeCup("Americano", 300);
        cups[4] = new CoffeeCup("Mocha", 400);
        
        // Fill each cup in the array.
        for (int i = 0; i < cups.length; i++) {
            cups[i].fill();
        }
        
        // Print the details of each cup in the array.
        for (int i = 0; i < cups.length; i++) {
            System.out.println(cups[i].displayDetails());
        }
        
        // Drink 100ml from each
        for (int i = 0; i < cups.length; i++) {
            cups[i].drink(100);
        }
        
        // Print a newline for better display
        System.out.println();
        
        // Print how much is left of each type.
        for (int i = 0; i < cups.length; i++) {
            System.out.println(cups[i].getType() + ": " + cups[i].checkLevel() + "ml left");
        }
    }
}
