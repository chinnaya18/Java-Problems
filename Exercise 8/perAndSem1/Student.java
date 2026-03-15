package perAndSem1;

public class Student {

    protected String name;
    protected String rollno;

    public Student() {}

    public void set(String x, String y) {
        name = x;
        rollno = y;
    }

    public void showStudent() {
        System.out.println("Student Name : " + name);
        System.out.println("Roll No      : " + rollno);
    }
}