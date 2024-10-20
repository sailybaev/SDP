public class PremiumFareStrategy implements FareStrategy {

    @Override
    public double calculateFare(double dist, double time) {
        double perKM = 2.00;
        double perMIN = 0.25;
        double fare = (perKM * dist) + (perMIN * time);
        return Math.max(fare, 5.00);
    }

}
