package Singleton;

public class Student {
    private final String name;
    private final String lastName;
    private final int id;
    private final int age;
    private final University university;

    public Student(String name, String lastName, int id, int age, University university) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.age = age;
        this.university = university;
    }

    public void printInfo() {
        System.out.println("Student: " + name + " " + lastName + ", ID: " + id + ", Age: " + age);
        System.out.println("University: " + university.getName() + ", State Uni: " + university.isStateUniversity());
        System.out.println("Faculties: " + university.getFaculties());
    }
}
