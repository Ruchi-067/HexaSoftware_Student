
import java.util.Arrays;

public class Student {
    private String name;
    private String studentId;
    private double[] grades;

    public Student(String name, String studentId, double[] grades) {
        this.name = name;
        this.studentId = studentId;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public double[] getGrades() {
        return grades;
    }

    public double calculateAverageGrade() {
        double total = 0;
        for (double grade : grades) {
            total += grade;
        }
        return total / grades.length;
    }

    public boolean hasPassed() {
        return calculateAverageGrade() >= 50;
    }

    public void displayGrades() {
        System.out.println("Grades for " + name + " (" + studentId + "): " + Arrays.toString(grades));
    }

    public void displayStudentInfo() {
        displayGrades();
        System.out.printf("Average grade: %.2f\n", calculateAverageGrade());
        System.out.println("Result: " + (hasPassed() ? "Passed" : "Failed"));
    }
}
