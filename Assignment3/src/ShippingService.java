public class ShippingService {
    public double calculateShipping(String shippingAddress) {
        System.out.println(shippingAddress);
        return 5.99;
    }

    public void shipOrder(String productID, String shippingAddress) {
        System.out.println("Shipping product: " + productID + " to address: " + shippingAddress);
    }
}
