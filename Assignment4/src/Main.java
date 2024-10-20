public class Main {
    public static void main(String[] args) {
        FareStrategy reg = new RegularFareStrategy();
        FareStrategy premka = new PremiumFareStrategy();
        FareStrategy discount = new DiscountFareStrategy();
        FareStrategy surge = new SurgeFareStrategy();


        RideContext ride = new RideContext(reg);
        System.out.println("Regular: " + ride.calculateFare(10, 15, false));

        ride.setStrategy(premka);
        System.out.println("Premium: " + ride.calculateFare(10, 15, false));

        ride.setStrategy(discount);
        System.out.println("Discount: " + ride.calculateFare(10, 15, false));

        ride.setStrategy(reg);
        System.out.println("Peak hour: " + ride.calculateFare(10, 15, true));

        try {
            System.out.println(ride.calculateFare(-5, 15, false));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}