import java.util.Scanner;

/**
 * This class runs the application and handles the Product I/O
 *
 * @author Siobhan Drohan, Mairead Meagher
 * @version 1.0
 *
 */
public class Driver{

    private Scanner input = new Scanner(System.in);
    private Store store;

    /**
     * The main method is the starting point for the program.
     * When started, the main method calls the addProduct() method
     * followed by the printProduct() method.
     *
     * @param args  Any arguments for the main method
     */
    public static void main(String[] args) {
		Driver driver = new Driver();
		driver.processOrder();
		driver.printProducts();
        driver.printCurrentProducts();
        driver.printAverageProductPrice();
        driver.printCheapestProduct();
        System.out.print("View the products costing more than this price: ");
        double price = driver.input.nextDouble();
        driver.printProductsAbovePrice();
	}

    //gather the product data from the user and create a new product object.
    private void addProduct(){
    	System.out.print("Enter the Product Name:  ");
        String productName = input.nextLine();
        System.out.print("Enter the Product Code:  ");
        int productCode = input.nextInt();
        System.out.print("Enter the Unit Cost:  ");
        double unitCost = input.nextDouble();
        //Ask the user to type in either a Y or an N.  This is then
        //converted to either a True or a False (i.e. a boolean value).
    	System.out.print("Is this product in your current line (y/n): ");
    	char currentProduct = input.next().charAt(0);
    	boolean inCurrentProductLine = false;
    	if ((currentProduct == 'y') || (currentProduct == 'Y'))
    		inCurrentProductLine = true;
    	
        boolean isAdded = store.add(new Product(productName, productCode, unitCost, inCurrentProductLine));
        if (isAdded) {
            System.out.println("Product Added Successfully");
        } else {
            System.out.println("No product added");
        }
        input.nextLine();
    }

    public void processOrder() {
        store = new Store();
        System.out.print("How many products would you like to have in your store? ");
        int numberOfProducts = input.nextInt();
        input.nextLine();
        for (int i = 0; i < numberOfProducts; i++) {
            addProduct();
            System.out.println();
        }

    }

    /**
     * Prints all products in the store.
     */
    private void printProducts(){
    	System.out.println(store.listProducts());
    }

    /**
     * Prints all products currently in the store.
     */
    private void printCurrentProducts() {
        System.out.println(store.listCurrentProducts());
    }

    /**
     * Prints the average product price in the store
     */
    private void printAverageProductPrice() {
        double averagePrice = store.averageProductPrice();
        if (averagePrice == - 1) {
            System.out.println("There are no products in the store.");
        } else {
            System.out.println("The average product price is: " + averagePrice);
        }
    }

    /**
     * Prints the name of the cheapest product in the store.
     */
    private void printCheapestProduct(){
        Product cheapestProduct = store.cheapestProduct();
        if (cheapestProduct == null) {
            System.out.println("There are no products in the store.");
        } else {
            System.out.println("The cheapest product is: " + cheapestProduct.getProductName() + ".");
        }
    }

    /**
     * Ask user to enter a price then list all products more expensive than that price.
     */
    private void printProductsAbovePrice() {
        System.out.println("Enter a price above which all products are printed: ");
        double price = input.nextDouble();
        input.nextLine();
        System.out.println(store.listProductsAbovePrice(price));
    }

    /**
     * Prints menu options for user and reads in their selection
     *
     * @return      the integer menu option the user selects
     */
    private int mainMenu() {
        System.out.print("""
                Shop Menu
                ---------
                    1) List the Products
                    2) List the Current Products
                    3) Display average product unit cost
                    4) Display cheapest product
                    5) List products that are more expensive than a given price
                    0) Exit
                 ==>>
                """);
        int option = input.nextInt();
        return option;
    }

    private void runMenu() {
        int option = mainMenu();

        // Use a loop to continue asking user for selections until 0 is entered
        while(option != 0) {

            // Call the appropriate method based on the user choice
            switch (option) {
                case 1 -> printProducts();
                case 2 -> printCurrentProducts();
                case 3 -> printAverageProductPrice();
                case 4 -> printCheapestProduct();
                case 5 -> printProductsAbovePrice();
                default -> System.out.println("Invalid option entered " + option);
            }

            // Pause program to allow user to read instructions in terminal
            System.out.println("\nPress enter key to continue...");
            input.nextLine();
            input.nextLine(); // Second read due to bug in scanner

            // Display main menu again
            option = mainMenu();
        }

        // In this path the user chose option 0, so exit the program
        System.out.println("Exiting the program. Goodbye.");
        System.exit(0);
    }
}