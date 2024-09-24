class FoodProduct implements Product {

    public double price;

    public FoodProduct(double price) {
        this.price = price;
    }

    @Override
    public double getDiscount() {
        return price * 0.1;  // 10% discount for food
    }
}

class ElectronicsProduct implements Product {

    public double price;

    public ElectronicsProduct(double price) {
        this.price = price;
    }

    @Override
    public double getDiscount() {
        return price * 0.05;  // 5% discount for electronics
    }
}

class ClothingProduct implements Product {

    public double price;

    public ClothingProduct(double price) {
        this.price = price;
    }

    @Override
    public double getDiscount() {
        return price * 0.15;  // 15% discount for clothing
    }
}

class DiscountCalculator {
    public double calculateDiscount(Product product) {
        return product.getDiscount();
    }
}




public class Task {
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();

        Product food = new FoodProduct(500);
        Product electronics = new ElectronicsProduct(3000);
        Product clothing = new ClothingProduct(660);

        System.out.println("food " + calculator.calculateDiscount(food));
        System.out.println("electronics " + calculator.calculateDiscount(electronics));
        System.out.println("clothing " + calculator.calculateDiscount(clothing));
    }
}
