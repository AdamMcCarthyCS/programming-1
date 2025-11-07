public class CoffeeCup {
    // fields
    private String type;
    private int capacity; // Amount in millilitres
    private int currentAmount;

    // Constructor
    public CoffeeCup(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
        this.currentAmount = 0;
    }

    // Simple behaviours
    public void fill() {
        currentAmount = capacity;
    }

    public void drink(int amount) {
        if (amount > currentAmount) {
            System.out.println("Not enough coffee left!");
        } else {
            currentAmount -= amount;
        }
    }

    public int checkLevel() {
        return currentAmount;
    }

    public String getType() {
        return type;
    }

    public String displayDetails() {
        return "Type: " + type + ", Capacity: " + capacity
            + "ml, Current: " + currentAmount + "ml";
    }
}
