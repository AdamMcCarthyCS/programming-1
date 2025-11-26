import java.util.ArrayList;

/**
 * This is a store class which represents a store containing an inventory of
 * different products
 *
 * @author Adam McCarthy
 * @version 2.1
 */
public class Store {
    /**
     * A list of products sold by the store.
     */
    private ArrayList<Product> products;

    /**
     * Constructs a {@code Store} object
     */
    public Store() {
        products = new ArrayList<>();
    }

    /**
     * Adds a product to the products list.
     *
     * @param product   a product object with a name, id, price, and current availability
     *
     * @return          a boolean representing whether the object was added to the products list
     */
    public boolean add(Product product) {
       boolean addedToProducts = products.add(product);
       return addedToProducts;
    }

    /**
     * Lists the products currently in the store's product list.
     *
     * @return          a string representation of all the product in the stores product list
     */
    public String listProducts() {
        // If the products list is empty immediately return a message stating this
        if (products.isEmpty()) {
            return "No products";
        }
        // empty product list to add to in the loop below
        String productList = "";

        // add each product in the list using its string representation
        for (Product product: products) {
            productList += product + "\n";
        }
        return productList;
    }

    /**
     * Lists the products currently actively sold and also in the store's product list.
     *
     * @return          a string representation of all the currently available products in the stores product list
     */
    public String listCurrentProducts() {
        // If the products list is empty immediately return a message stating this
        if (products.isEmpty()) {
            return "No products in the store";
        }

        // empty product list to add to in the loop below
        String currentProductList = "";

        // add each product in the list using its string representation
        for (Product product: products) {
            if (product.isInCurrentProductLine()) {
                currentProductList += product + "/n";
            }
        }
        return currentProductList;
    }

    public void printAverageProductPrice() {

    }

    /**
     * Calculates the average price of all the products in the store.
     * <p>Algorithm:</p>
     * <ol>
     *     <li>Sum the values of all the products in the store</li>
     *     <li>Divide the sum by the number of products in the store</li>
     *     <li>Return the value of the quotient in (2)</li>
     * </ol>
     *
     * @return      the average price of a product in the store
     */
    public double averageProductPrice() {
        if (products.isEmpty()) {
            return -1;
        }
        double sumOfPrices = 0;
        for (Product product: products) {
            sumOfPrices += product.getUnitCost();
        }
        return sumOfPrices / products.size();
    }

    /**
     * Prints the lowest price product in the store's product list.
     *
     * <p>Algorithm:</p>
     * <ol>
     *     <li>Assume the first object in the product list is the lowest priced</li>
     *     <li>Traverse the list swapping any object found which is lower in price than the current lowest priced object
     *     to be the new lowest price object</li>
     *     <li>When the list has been fully traversed return the current lowest priced object</li>
     * </ol>
     */
    public Product cheapestProduct() {
        if (products.isEmpty()) {
            return null;
        }

        Product cheapestPriceProduct = products.get(0);
        for (int i = 1; i < products.size(); i++) {
            Product currentProduct = products.get(i);
            if (currentProduct.getUnitCost() < cheapestPriceProduct.getUnitCost()) {
                cheapestPriceProduct = currentProduct;
            }
        }
        return cheapestPriceProduct;
    }

    /**
     * Returns a string containing all the products for which the price is above a specified value.
     *
     * @param price     the price above which products will be returned as part of a string.
     *
     * @return          a string containing all the products above the given price.
     */
    public String listProductsAbovePrice(double price) {
        if (products.isEmpty()) {
            return null;
        }

        // Empty string to add products that exceed price to
        String productsOverPrice = "";
        // Check each product and add to string if it exceeds price
        for (Product product: products) {
            if (product.getUnitCost() > price) {
                // Add each product on a new line of the string being returned
                productsOverPrice += product + "\n";
            }
        }
        return productsOverPrice;
    }

}
