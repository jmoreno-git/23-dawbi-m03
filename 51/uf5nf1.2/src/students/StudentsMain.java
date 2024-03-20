package students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author ProvenSoft
 */
public class StudentsMain {

    private List<Student> students;

    public StudentsMain() {
        students = new LinkedList<>();
    }
    
    public static void main(String[] args) {
        StudentsMain ap = new StudentsMain();
        ap.run();
    }

    private void run() {
        //students = new LinkedList<>();
        //populate list with data
        generateData();
        //show students
        System.out.println(students);
        //find student
        String nameToSearch = "Name66";
        Student stu1 = findStudentByName(nameToSearch);
        if (stu1 == null) {  //not found
            System.out.printf("There is no student with name %s%n", nameToSearch);
        } else {  //found
            System.out.println("Student found: "+stu1);
        }
        //
        List<Student> passList = getStudentsWithQualifGreaterThan(5);
        System.out.println("Number of students that pass: "+passList.size());
        System.out.println("Pass list: "+passList);
        //
        System.out.println("Substract 1 point");
        amendQualif(-1);
        System.out.println(students);
        System.out.println("Add 2 points");
        amendQualif(2);
        System.out.println(students);
        //sort
        System.out.println("Students sorted by qualification");
        students.sort(Comparator.comparing(Student::getQualification));
        System.out.println(students);
        //
        System.out.println("Students sorted by name");
        students.sort(Comparator.comparing(Student::getName));
        System.out.println(students);
        //
        System.out.println("Students sorted by reversed name");
        students.sort(Comparator.comparing(Student::getName).reversed());
        System.out.println(students);        
    }

    private void generateData() {
        //students.add(new Student("Peter", 5));
        Random rnd = new Random();
        for (int i = 0; i < 20; i++) {
            String name = String.format("Name%02d", i+1);
            int qualif = rnd.nextInt(0, 11);
            Student s = new Student(name, qualif);
            students.add(s);
        }
    }
    
    /**
     * finds a student with given name
     * @param name the name to search
     * @return the student found or null if not found
     */
    private Student findStudentByName(String name) {
        Student found = null;
        Student studToSearch = new Student(name);
        int index = students.indexOf(studToSearch);
        if (index >= 0) {
            found = students.get(index);
        }
        return found;
    }

    /**
     * gets all students with qualification greater than or equal to 'qual'
     * @param qual the threshold of qualification
     * @return a list of students with that filter
     */
    private List<Student> getStudentsWithQualifGreaterThan(int qual) {
        List<Student> result = new LinkedList<>();
        for (Student s : students) {
            if (s.getQualification() >= qual) {
                result.add(s);
            }
        }
        return result;
    }
    
    /**
     * adds 'diff' to qualifications of all students
     * Qualifications must not be negative nor greater than 10
     * @param diff the difference of qualifation to apply
     */
    private void amendQualif(int diff) {
        for (Student s : students) {
            int q = s.getQualification();
            q += diff;
            q = (q>10) ? 10 : q;
            q = (q<0) ? 0 : q;
            s.setQualification(q);
        }
    }
    
}
