public class RideContext {
    private FareStrategy strategy;

    public RideContext(FareStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(FareStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculateFare(double dist, double time, boolean isPeak) {
        if (dist < 0 || time < 0) {
            throw new IllegalArgumentException("dist < 0 and time < 0");
        }

        if (isPeak == true) {
            this.setStrategy(new SurgeFareStrategy());
        }

        return this.strategy.calculateFare(dist, time);
    }
}
