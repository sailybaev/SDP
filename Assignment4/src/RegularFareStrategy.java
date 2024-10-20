public class RegularFareStrategy implements FareStrategy {

    @Override
    public double calculateFare(double dist, double time) {
        double perKM = 1.00;
        double perMIN = 0.25;
        double fare = (perKM * dist) + (perMIN * time);
        return Math.max(fare, 2.00);
    }

}
