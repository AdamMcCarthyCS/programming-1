import java.util.ArrayList;

public class Store {
    private ArrayList<Product> products;

    public Store() {
        products = new ArrayList<>();
    }

    public boolean add(Product product) {
       boolean addedToProducts = products.add(product);
       return addedToProducts;
    }

    public String listProducts() {
        if (products.isEmpty()) {
            return "No products";
        }
        String productList = "";
        for (Product product: products) {
            productList += " " + product;
        }
        return productList;
    }
}
