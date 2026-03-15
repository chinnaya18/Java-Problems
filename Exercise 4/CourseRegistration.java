import java.util.Scanner;

class CourseRegistration {

    String studentName;
    String courseName;
    StringBuilder learningGoals;
    String[] modules;

    static Scanner sc = new Scanner(System.in);

    public CourseRegistration(String studentName, String courseName, StringBuilder learningGoals, String[] modules) {
        this.studentName = studentName;
        this.courseName = courseName;
        this.learningGoals = addGoals(learningGoals);
        this.modules = addModules(modules);
    }

    StringBuilder addGoals(StringBuilder learningGoals) {
        System.out.println("Enter your learning goals:");
        learningGoals.append(sc.nextLine());
        return learningGoals;
    }

    String[] addModules(String[] modules) {
        System.out.println("Enter number of modules:");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter module " + (i + 1) + ":");
            modules[i] = sc.nextLine();
        }

        return modules;
    }

    void display() {
        System.out.println("\nStudent Name: " + studentName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Learning Goals: " + learningGoals);

        System.out.print("Modules: ");
        for (String m : modules) {
            if (m != null) {
                System.out.print(m + " ");
            }
        }

    }
}

class Main {
    public static void main(String[] args) {

        CourseRegistration student1 =
                new CourseRegistration("Rahul", "Java Programming", new StringBuilder(), new String[10]);

        student1.display();
    }
}