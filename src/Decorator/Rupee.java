package Decorator;

public class Rupee extends Currency{
    private final double value;

    public Rupee(double value) {
        this.description = "Indian Rupee";
        this.value = value;
    }

    @Override
    public double cost(double c) {
        return c * value;
    }
}
