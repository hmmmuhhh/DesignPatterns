package Decorator;

public class Dollar extends Currency{
    private final double value;

    public Dollar(double value) {
        this.description = "US Dollar";
        this.value = value;
    }

    @Override
    public double cost(double c) {
        return c * value;
    }
}
