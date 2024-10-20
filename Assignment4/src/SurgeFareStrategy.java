public class SurgeFareStrategy implements FareStrategy {

    @Override
    public double calculateFare(double dist, double time) {
        double perKM = 2.00;
        double perMIN = 0.5;
        double fare = (perKM * dist) + (perMIN * time);
        return Math.max(fare, 10.00);
    }

}
