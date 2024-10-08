class Electronics extends Products {
    private static final double TAX_RATE = 0.15;

    public Electronics(String name, int quantity, double unitPrice) {
        super(name, quantity, unitPrice);
    }

    @Override
    public double totalPriceOfProducts() {
        return unitPrice * quantity * (1 + TAX_RATE);
    }
}