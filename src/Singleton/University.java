package Singleton;

import java.util.List;

public class University {
    private static University instance;
    private final String name;
    private final boolean isStateUni;
    private final List<String> faculties;

    private University(String name, boolean isStateUni, List<String> faculties) {
        this.name = name;
        this.isStateUni = isStateUni;
        this.faculties = faculties;
    }

    public static University getInstance(String name, boolean isStateUni, List<String> faculties) {
        if (instance == null) {
            instance = new University(name, isStateUni, faculties);
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public boolean isStateUniversity() {
        return isStateUni;
    }

    public List<String> getFaculties() {
        return faculties;
    }
}