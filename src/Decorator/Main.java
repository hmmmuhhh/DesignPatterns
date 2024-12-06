package Decorator;

public class Main {
    public static void main(String[] args) {
        Currency rupee = new Rupee(0.013);
        Currency dollar = new Dollar(1.0);
        Currency usdDecorator = new USDDecorator(dollar);

        System.out.println(rupee.getCurrencyDescription() + ": " + rupee.cost(1000) + " USD");
        System.out.println(dollar.getCurrencyDescription() + ": " + dollar.cost(100) + " USD");
        System.out.println(usdDecorator.getCurrencyDescription() + ": " + usdDecorator.cost(100) + " USD");
    }
}
