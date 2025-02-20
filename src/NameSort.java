/* First of two comparators designed to provide comparison
   functionality for student names.
 */
import java.util.Comparator;

public class NameSort implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.name.compareTo(b.name);
    }
}
