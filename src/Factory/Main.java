package Factory;

public class Main {
    public static void main(String[] args) {
        EmployeeFactory factory = new EmployeeFactory();

        Employee partTimer = factory.getEmployee(false, "Some", "Loser", 101, 21);
        Employee jeremy = factory.getEmployee(true, "Jeremy", "The Great", 9999, 1000000);

        partTimer.printInfo();
        jeremy.printInfo();
    }
}
