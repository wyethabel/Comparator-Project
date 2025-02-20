/* Second comparator designed to provide comparison
   functionality for student roll numbers.
 */
import java.util.Comparator;

public class RollSort implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.rollno - b.rollno;
    }
}
