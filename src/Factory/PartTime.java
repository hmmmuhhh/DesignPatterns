package Factory;

public class PartTime extends Employee{
    private final double dailySalary;
    private final int daysWorked;

    public PartTime(String name, String lastName, int id, int age, double dailySalary, int daysWorked) {
        super(name, lastName, id, age);
        this.dailySalary = dailySalary;
        this.daysWorked = daysWorked;
    }

    @Override
    public double getSalary() {
        return dailySalary * daysWorked;
    }
}
