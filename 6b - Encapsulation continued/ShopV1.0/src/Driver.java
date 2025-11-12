import java.util.Scanner;
/**
 * This is where the program starts. It handles all user input and the output to the user
 *
 * @author Adam McCarthy
 * @version 1.0
 */
public class Driver {
    /**
     * A Scanner instance to read in user input.
     */
    private Scanner input = new Scanner(System.in);
    /**
     * A Product instance which will be updated by user input.
     */
    private Product product;
    
    /**
     * This is the entry point to the program.
     *
     * @param args  array of string arguments from command line
     */
    public static void main(String[] args) {
        Driver driver = new Driver();
        driver.addProduct();
        driver.printProduct();
    }
    
    /**
     * Creates a product by reading in information from the user
     *
     * <p>This method reads a product name, code, unit cost, and whether a product is part of
     * the current product line and then instantiates a product instance. This instance
     * instantiated is the one declared as a field in the {@code Driver} class.</p>
     */
    public void addProduct() {
        // Read in the product name, code, and unit cost from the user.
        System.out.print("Enter the product name: ");
        String productName = input.nextLine();
        System.out.print("Enter the Product code: ");
        int productCode = input.nextInt();
        System.out.print("Enter the item unit price: €");
        double unitCost = input.nextDouble();
        
        //Ask the user to type in either a Y or an N.  This is then
        //converted to either a True or a False (i.e. a boolean value).
        System.out.print("Is this product in your current line (y/n): ");
        char currentProduct = input.next().charAt(0);
        boolean inCurrentProductLine = false;
        if ( Character.toLowerCase(currentProduct) == 'y') {
            inCurrentProductLine = true;
        }
        
        product = new Product(productName, productCode, unitCost, inCurrentProductLine);
    }
    
    /**
     * Prints the string representation of a product.
     */
    public void printProduct() {
        // Print the string representation of the product.
        System.out.println(product.toString());
    }
}
