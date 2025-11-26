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
		driver.printProduct();
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
        System.out.print("Do you want to add a new product? (y/n) ");
        char resp = input.nextLine().toLowerCase().charAt(0);
        while (resp == 'y') {
            addProduct();
            System.out.println("Do you want to add a new product? (y/n)");
            resp = input.nextLine().toLowerCase().charAt(0);
        }

    }

    /**
     * Prints all products in the store.
     */
    private void printProduct(){
    	System.out.println(store.listProducts());
    }

    /**
     * Prints the name of the cheapest product in the store.
     */
    private void printCheapestProduct(){
        Product cheapestProduct = store.cheapestProduct();
        if (cheapestProduct == null) {
            System.out.println("There are no products in the store.");
        } else {
            System.out.println("The cheapest product is: " + cheapestProduct + ".");
        }
    }


}