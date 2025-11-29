import java.util.Scanner;

/**
 * This class runs the application and handles the Product I/O
 *
 * @author Siobhan Drohan, Mairead Meagher
 * @version 1.0
 *
 */
public class Driver{

    private Store store;

    /**
     * Constructs a Driver object which begins the program by asking the size of the store then entering
     * the looping menu.
     */
    public Driver() {
        processOrder();
        runMenu();
    }

    /**
     * The main method is the starting point for the program.
     * When started, the main method calls the addProduct() method
     * followed by the printProduct() method.
     *
     * @param args  Any arguments for the main method
     */
    public static void main(String[] args) {
		new Driver();
	}

    //gather the product data from the user and create a new product object.
    private void addProduct(){
    	// Read in product name
        String productName = ScannerInput.readNextLine("Enter the Product Name:  ");
        int productCode = ScannerInput.readNextInt("Enter the Product Code:  ");
        double unitCost = ScannerInput.readNextDouble("Enter the Unit Cost:  ");
        //Ask the user to type in either a Y or an N.  This is then
        //converted to either a True or a False (i.e. a boolean value).
    	char currentProduct = ScannerInput.readNextChar("Is this product in your current line (y/n): ");
    	boolean inCurrentProductLine = false;
    	if ((currentProduct == 'y') || (currentProduct == 'Y'))
    		inCurrentProductLine = true;
    	
        boolean isAdded = store.add(new Product(productName, productCode, unitCost, inCurrentProductLine));
        if (isAdded) {
            System.out.println("Product Added Successfully");
        } else {
            System.out.println("No product added");
        }
    }

    public void processOrder() {
        store = new Store();
        // Read in store size from user for product entering loop
        int numberOfProducts = ScannerInput.readNextInt("How many products would you like to " +
                "have in your store? ");
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
        String averagePriceFormated = String.format("%.2f", averagePrice);
        if (averagePrice == - 1) {
            System.out.println("There are no products in the store.");
        } else {
            System.out.println("The average product price is: €" + averagePriceFormated);
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
        double price = ScannerInput.readNextDouble("Enter a price above which all products are " +
                "printed: ");
        System.out.println(store.listProductsAbovePrice(price));
    }

    /**
     * Prints menu options for user and reads in their selection
     *
     * @return      the integer menu option the user selects
     */
    private int mainMenu() {
        int option = ScannerInput.readNextInt("""
                Shop Menu
                ---------
                    1) List the Products
                    2) List the Current Products
                    3) Display average product unit cost
                    4) Display cheapest product
                    5) List products that are more expensive than a given price
                    0) Exit
                 ==>>""" + " ");
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
                default -> System.out.println("Invalid option entered: " + option);
            }

            // Pause program to allow user to read instructions in terminal
            System.out.println();
            ScannerInput.readNextLine("\nPress enter key to continue... ");

            // Display main menu again
            option = mainMenu();
        }

        // In this path the user chose option 0, so exit the program
        System.out.println("Exiting the program. Goodbye.");
        System.exit(0);
    }
}