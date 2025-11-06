public class Driver {
    public static void main(String[] args) {
        // Create an instance of CoffeeCup class
        CoffeeCup myCup = new CoffeeCup("Latte", 350);
        // Fill the cup
        myCup.fill();
        // Drink from the cup
        myCup.drink(100);
        // Output the remaining amount in the cup
        System.out.println("Coffee left: " + myCup.checkLevel() + "ml");
    }
}
