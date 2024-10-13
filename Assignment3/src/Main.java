public class Main {
    public static void main(String[] args) {
        ShoppingFacade facade = new ShoppingFacade();

        String productID = "12345";
        String paymentInfo = "4413430259687789";
        String shippingAddress = "Mangilik el 58";

        facade.placeOrder(productID, paymentInfo, shippingAddress);
    }
}
