package Factory;

public class FullTime extends Employee {

    public FullTime(String name, String lastName, int id, int age) {
        super(name, lastName, id, age);
    }

    @Override
    public double getSalary() {
        return Double.MAX_VALUE;
    }
}
