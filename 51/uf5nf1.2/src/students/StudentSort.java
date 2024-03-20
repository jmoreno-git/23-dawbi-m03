package students;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ProvenSoft
 */
public class StudentSort {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add( new Student("Peter", 6) );
        students.add( new Student("Anne", 7) );
        students.add( new Student("Lewis", 4) );
        students.add( new Student("Angela", 8) );
        students.add( new Student("John", 5) );
        students.add( new Student("Andrew", 3) );
        System.out.println("Initial list");
        printList(students);
        //sort students with natural criteria
        System.out.println("Students sorted by name");
        students.sort(null);
        printList(students);
        //sort students by qualification
        System.out.println("Students sorted by qualification");
        StudentComparatorByQualification stComp = new StudentComparatorByQualification();
        students.sort( stComp );
        printList(students);
        //
        students.sort( stComp.reversed() );
        printList(students);
        //
        students.sort( new StudentComparatorByNameLength() );
        printList(students);

    }
    
    private static void printList(List<Student> data) {
        for (Student student : data) {
            System.out.println(student);
        }
    }
    
}
