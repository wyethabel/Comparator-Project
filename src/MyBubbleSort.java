/* Selected sort method is a bubble sort that seems appropriate
   for the small dataset being used here. This objectively works
   by comparing the first object to it's neighbor and 'bubbling'
   it up in the list each iteration.
 */
import java.util.*;

public class MyBubbleSort {
     public static void myBubbleSort(ArrayList<Student> studentList, Comparator<Student> comparator) {
         int listSize = studentList.size();
         boolean test;
         for (int outer = 0; outer < listSize - 1; outer++) { // For each item
             test = false;
             for (int inner = 0; inner < listSize - 1; inner++) { // Compare to neighbor items
                 if (comparator.compare(studentList.get(inner), studentList.get(inner + 1)) > 0) {
                     Student tempStudent = studentList.get(inner); // Holds the student to be replaced
                     studentList.set(inner, studentList.get(inner + 1));
                     studentList.set(inner + 1, tempStudent);
                     test = true;
                 }
             }
             if (!test) break;
         }
     }
}
