/**
 * Represents a product that is in a shops inventory.
 *
 * @author      Adam McCarthy
 * @version     1.0
 */
public class Product {
    /**
     * Name of product initialised to a default empty String.
     */
    private String productName = "";
    /**
     * Numeric product code initialised to default 9999.
     */
    private int productCode = 9999;
    /**
     * Cost per unit of the product initialised to default of 0.
     */
    private double unitCost = 0;
    /**
     * Current product line status initialised to default value false.
     */
    private boolean isCurrentProductLine = false;
    
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
    
    /**
     * Sets the product name.
     *
     * @param productName       a new name for the product
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }
    
    /**
     * Sets the product code.
     *
     * @param productCode       a new numeric code for the product
     */
    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }
    
    /**
     * Sets the unit cost of the product
     *
     * @param unitCost          a new unit cost for the product
     */
    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }
    
    /**
     * Sets if the product is currently in the product line
     *
     * @param isCurrentProductLine  sets whether the product is part of the current product line
     */
    public void setIsCurrentProductLine(boolean isCurrentProductLine) {
        this.isCurrentProductLine = isCurrentProductLine;
    }
    
    /**
     * Prints a string representation of the product
     *
     * @return  a formatted string with the product name, code, price, and product line status
     */
    @Override
    public String toString() {
        return "Product:\n" +
            "\tName: " + productName + "\n"
            + "\tCode: " + productCode + "\n"
            + "\tUnit Price: €" + unitCost + "\n"
            + "\tIn product line: " + isCurrentProductLine;
    }
}
