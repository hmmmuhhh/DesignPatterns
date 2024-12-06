package Factory;

public abstract class Employee {
    protected String name;
    protected String lastName;
    protected int id;
    protected int age;

    public Employee(String name, String lastName, int id, int age) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.age = age;
    }

    public abstract double getSalary();

    public void printInfo() {
        System.out.println(name + " " + lastName + " (ID: " + id + ", Age: " + age + "), Salary: " + getSalary());
    }
}
