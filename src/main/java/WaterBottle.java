public class WaterBottle {

    private double volume;
    private final double capacity;

    public WaterBottle(double volume, double capacity) {
        this.volume = volume;
        this.capacity = capacity;
    }

    public double getVolume() {
        return this.volume;
    }

    public void drink(double amount) {
        this.volume -= amount;
    }

    public void empty() {
        this.volume = 0;
    }

    public void refill() {
        this.volume = this.capacity;
    }

}
