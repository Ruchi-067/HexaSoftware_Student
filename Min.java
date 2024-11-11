
import java.util.Scanner;

public class Min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Classroom classroom = new Classroom();

        System.out.println("Enter number of students:");
        int numStudents = scanner.nextInt();
        scanner.nextLine();  // consume newline

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter name for student " + (i + 1) + ":");
            String name = scanner.nextLine();

            System.out.println("Enter student ID for " + name + ":");
            String studentId = scanner.nextLine();

            System.out.println("Enter the number of grades for " + name + ":");
            int numGrades = scanner.nextInt();
            double[] grades = new double[numGrades];

            System.out.println("Enter the grades (each separated by a space):");
            for (int j = 0; j < numGrades; j++) {
                grades[j] = scanner.nextDouble();
            }
            scanner.nextLine(); // consume newline

            // Create a new student and add to the classroom
            Student student = new Student(name, studentId, grades);
            classroom.addStudent(student);
        }

        // Display information for all students and class average
        classroom.displayAllStudentsInfo();

        scanner.close();
    }
}
