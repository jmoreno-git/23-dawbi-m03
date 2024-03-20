package students;

import java.util.Comparator;

/**
 *
 * @author alumne
 */
public class StudentComparatorByNameLength implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().length() - o2.getName().length();
    }
    
}
