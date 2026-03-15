import perAndSem1.Sem1;
import perAndSem1.Semester2.Sem2;

public class Driver {

    public static void main(String[] args) {

        Sem1 s1 = new Sem1(8.5, 9.0);
        s1.set("Arun", "23MCA001");

        Sem2 s2 = new Sem2(8.0, 9.2);
        s2.set("Arun", "23MCA001");

        System.out.println("----- Semester 1 Report -----");
        s1.printGrade();

        System.out.println("\n----- Semester 2 Report -----");
        s2.printGrade();

        double overallCGPA = (s1.CGPA() + s2.CGPA()) / 2;

        System.out.println("\nOverall CGPA : " + overallCGPA);
    }
}