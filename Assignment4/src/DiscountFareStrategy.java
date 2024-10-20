public class DiscountFareStrategy implements FareStrategy {

    @Override
    public double calculateFare(double dist, double time) {
        double perKM = 0.5;
        double perMIN = 0.15;
        double fare = (perKM * dist) + (perMIN * time);
        return Math.max(fare, 3.00);
    }

}
