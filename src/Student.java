/* Primary managed object, Students are initialized with
   basic attributes with the intent to sort by rollno and name.
 */
public class Student {
    int rollno;
    String name;
    String address;

    public Student() {
        this.rollno = 0;
        this.name = "";
        this.address = "";
    }

    public Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    public int getRollno() {
        return rollno;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
