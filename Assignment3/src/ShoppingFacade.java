public class ShoppingFacade {

    private ProductCatalog productCatalog;
    private PaymentProcessor paymentProcessor;
    private InventoryManager inventoryManager;
    private ShippingService shippingService;

    public ShoppingFacade() {
        this.productCatalog = new ProductCatalog();
        this.paymentProcessor = new PaymentProcessor();
        this.inventoryManager = new InventoryManager();
        this.shippingService = new ShippingService();
    }

    public void placeOrder(String productID, String paymentInfo, String shippingAddress) {
        System.out.println("\nPlacing order: " + productID);

        String product = productCatalog.searchProduct(productID);

        if (!inventoryManager.checkInventory(productID)) {
            System.out.println("out of stock");
            return;
        }

        if (!paymentProcessor.processPayment(paymentInfo)) {
            System.out.println("Payment failed");
            return;
        }

        double shippingCost = shippingService.calculateShipping(shippingAddress);
        System.out.println("Shipping cost " + shippingCost);

        shippingService.shipOrder(productID, shippingAddress);

        System.out.println("Order placed successfully:  " + productID);
    }
}
