public class Product {
    private String productName;
    private int productCode;
    private double unitCost;
    private boolean isCurrentProductLine;
    
    public Product(String productName, int productCode, double unitCost,
       boolean isCurrentProductLine) {
        this.productName = productName;
        this.productCode = productCode;
        this.unitCost = unitCost;
        this.isCurrentProductLine = isCurrentProductLine;
    }
}
