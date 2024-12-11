import java.util.Scanner;

public class UniversityCourseTracker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the number of students and subjects
        int numStudents = 3;
        int numSubjects = 4;

        // Arrays to store student names and their grades
        String[] studentNames = new String[numStudents];
        int[][] grades = new int[numStudents][numSubjects];

        // Input student names and grades
        for (int i = 0; i < numStudents; i++) {
            System.out.println("John " + (i + 1) + ": ");
            studentNames[i] = scanner.nextLine();

            for (int j = 0; j < numSubjects; j++) {
                System.out.println("89 " + (j + 1) + " CC2 " + studentNames[i] + ": ");
                grades[i][j] = scanner.nextInt();
            }
            scanner.nextLine();  // Consume newline character
        }

        // Calculate and display average grades
        System.out.println("\nStudent Averages:");
        for (int i = 0; i < numStudents; i++) {
            int sum = 0;
            for (int j = 0; j < numSubjects; j++) {
                sum += grades[i][j];
            }
            double average = sum / (double) numSubjects;
            System.out.println(studentNames[i] + "'s average grade: " + average);
        }
        
        scanner.close();
    }
}  
