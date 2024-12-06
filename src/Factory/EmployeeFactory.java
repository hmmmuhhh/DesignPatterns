package Factory;

public class EmployeeFactory {
    public Employee getEmployee(boolean b, String name, String lastName, int id, int age) {
        if (b) {
            return new FullTime(name, lastName, id, age);
        } else {
            return new PartTime(name, lastName, id, age, 0.02, 13000);
        }
    }
}
