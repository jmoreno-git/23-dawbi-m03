package students;

import java.util.Comparator;

/**
 *
 * @author ProvenSoft
 */
public class StudentComparatorByQualification implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getQualification() - o2.getQualification();
    }
    
}
