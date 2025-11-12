/**
 * Represents a product that is in a shops inventory.
 *
 * @author      Adam McCarthy
 * @version     1.0
 */
public class Product {
    /**
     * The name of the product.
     */
    private String productName;
    /**
     * The numeric product code.
     */
    private int productCode;
    /**
     * The cost per unit of the product.
     */
    private double unitCost;
    /**
     * Whether the product is part of the current product line.
     */
    private boolean isCurrentProductLine;
    
    /**
     * Constructs a new product with the specified products name, product code, unit cost and if
     * it is currently in the product line of the business.
     *
     * @param productName           the name of the product
     * @param productCode           the numeric product code
     * @param unitCost              the cost per unit of the product
     * @param isCurrentProductLine  whether the product is part of the current product line
     */
    public Product(String productName, int productCode, double unitCost,
       boolean isCurrentProductLine) {
        this.productName = productName;
        this.productCode = productCode;
        this.unitCost = unitCost;
        this.isCurrentProductLine = isCurrentProductLine;
    }
    
    /**
     * Returns the product name.
     *
     * @return      the name of the product
     */
    public String getProductName() {
        return productName;
    }
    
    /**
     * Returns the product code.
     *
     * @return      the numeric code of the product
     */
    public int getProductCode() {
        return productCode;
    }
    
    /**
     * Returns the cost per unit of the product.
     *
     * @return      the cost per unit of the product
     */
    public double getUnitCost() {
        return unitCost;
    }
    
    /**
     * Returns whether the product is part of the current product line.
     *
     *@return       whether the product is part of the current product line
     */
    public boolean getIsCurrentProductLine() {
        return isCurrentProductLine;
    }
    
    
}
