package Decorator;

public class USDDecorator extends Decorator{
    private final Currency currency;

    public USDDecorator(Currency currency) {
        this.currency = currency;
    }

    @Override
    public String getCurrencyDescription() {
        return currency.getCurrencyDescription() + " (decorated with USD Info ig idk)";
    }

    @Override
    public double cost(double c) {
        return currency.cost(c);
    }
}
