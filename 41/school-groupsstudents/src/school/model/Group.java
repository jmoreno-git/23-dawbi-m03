package school.model;


import java.util.List;

public class Group {

    private final String name;
    private final List<Student> students;

    public Group(String name, List<Student> students) {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return name;
    }
}
