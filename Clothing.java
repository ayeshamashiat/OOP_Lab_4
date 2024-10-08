public class Clothing extends Products{
    private static final double TAX_RATE = 0.1;

    public Clothing(String name, int quantity, double unitPrice){
        super(name, quantity, unitPrice);
    }

    public double totalPriceOfProducts() {
        return unitPrice * quantity * (1 + TAX_RATE);
    }
}
