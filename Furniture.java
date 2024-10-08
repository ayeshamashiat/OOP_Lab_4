public class Furniture extends Products{
    private static final double TAX_RATE = 0.08;

    public Furniture(String name, int quantity, double unitPrice){
        super(name, quantity, unitPrice);
    }

    public double totalPriceOfProducts() {
        return unitPrice * quantity * (1 + TAX_RATE);
    }
}
