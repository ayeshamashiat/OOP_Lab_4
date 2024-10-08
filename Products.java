public abstract class Products {
    protected String name;
    protected int quantity;
    protected double unitPrice;

    public Products(String name, int quantity, double unitPrice){
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public String getName(){
        return name;
    }

    public int getQuantity(){
        return quantity;
    }

    public double getUnitPrice(){
        return unitPrice;
    }

    public abstract double totalPriceOfProducts();
}

