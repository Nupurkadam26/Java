import java.util.Scanner;

public class StudentGradingSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        double totalGrade = 0.0;

        for (int i = 1; i <= numStudents; i++) {
            System.out.print("Enter the grade for student " + i + ": ");
            double grade = scanner.nextDouble();

            totalGrade += grade;

            if (grade < 40) {
                System.out.println("Student " + i + " has failed.");
            }
        }

        double averageGrade = totalGrade / numStudents;
        System.out.printf("The average grade for all students is: %.2f%n", averageGrade);

        scanner.close();
    }
}
