package perAndSem1;

public class Sem1 extends Student implements Header {

    static final int credit1 = 2;
    static final int credit2 = 4;

    double sub1, sub2;

    public Sem1(double x, double y) {
        sub1 = x;
        sub2 = y;
    }

    public double CGPA() {
        return ((sub1 * credit1) + (sub2 * credit2)) / (credit1 + credit2);
    }

    public void printGrade() {

        headPrint();
        showStudent();

        System.out.println("\nSemester 1");
        System.out.println("Subject 1 : " + sub1);
        System.out.println("Subject 2 : " + sub2);

        System.out.println("CGPA of this Semester : " + CGPA());
        System.out.println("-------------------------------");
    }
}