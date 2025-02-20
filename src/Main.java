/* The primary runner class, implemented to store initial
   students and process them for sorting.
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();

        studentList.add(new Student(45, "Timothy", "102 Dawn Lane"));
        studentList.add(new Student(67, "James", "87 Myers Road"));
        studentList.add(new Student(13, "Kate", "15 Main Street"));
        studentList.add(new Student(105, "Blake", "27 Main Street"));
        studentList.add(new Student(22, "Michele", "200 Sleepy Place"));
        studentList.add(new Student(123, "Keighleiy", "73 Night Road"));
        studentList.add(new Student(66, "Brock", "15 Main Street"));
        studentList.add(new Student(9, "Mitch", "1223 Airport Road"));
        studentList.add(new Student(209, "Timothy", "1702 County Road 3"));
        studentList.add(new Student(44, "Rick", "72 Poppy Road"));

        System.out.println("Student list sorted by student name: ");
        MyBubbleSort.myBubbleSort(studentList, new NameSort());
        for (Student i : studentList) {
            System.out.println("Name: " + i.getName() + ", Roll Number: "
                    + i.getRollno() + ", Address: " + i.getAddress());
        }
        System.out.println("-------------------------");
        System.out.println("Student list sorted by roll number: ");
        MyBubbleSort.myBubbleSort(studentList, new RollSort());
        for (Student i : studentList) {
            System.out.println("Roll Number: " + i.getRollno() + ", Name: "
                    + i.getName() + ", Address: " + i.getAddress());
        }
    }
}