package Singleton;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        University uni = University.getInstance("TotallyLegitUni", false,
                Arrays.asList("Theater", "Arts", "Mass Murder"));
        Student jeremy = new Student("Jeremy", "The Great", 9999, 1000000, uni);
        jeremy.printInfo();
    }
}
