
import java.util.ArrayList;

public class Classroom {
    private ArrayList<Student> students;

    public Classroom() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public double calculateClassAverage() {
        double total = 0;
        for (Student student : students) {
            total += student.calculateAverageGrade();
        }
        return total / students.size();
    }

    public void displayAllStudentsInfo() {
        for (Student student : students) {
            System.out.println("\n--- Student Info ---");
            student.displayStudentInfo();
        }
        System.out.printf("\nClass average grade: %.2f\n", calculateClassAverage());
    }
}
