import java.util.*;

public class SchoolManagementSystem {

    // Student class to represent each student
    static class Student {
        String name;
        int rollNumber;
        List<Double> grades;  // List to store grades
        int attendance;  // Attendance count (days attended)

        // Constructor to initialize student details
        public Student(String name, int rollNumber) {
            this.name = name;
            this.rollNumber = rollNumber;
            this.grades = new ArrayList<>();
            this.attendance = 0;
        }

        // Method to display student details
        public void displayDetails() {
            System.out.println("Student Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Attendance: " + attendance + " days");
        }

        // Method to calculate average grade
        public double calculateAverageGrade() {
            if (grades.isEmpty()) {
                return 0;
            }
            double sum = 0;
            for (double grade : grades) {
                sum += grade;
            }
            return sum / grades.size();
        }

        // Method to mark attendance
        public void markAttendance() {
            attendance++;
            System.out.println(name + " has attended today. Total attendance: " + attendance + " days.");
        }

        // Method to add grades
        public void addGrade(double grade) {
            grades.add(grade);
        }
    }

    public static void main(String[] args) {
        // Create a student object
        Student student1 = new Student("John Doe", 101);

        // Add grades
        student1.addGrade(85.5);
        student1.addGrade(90.0);
        student1.addGrade(78.5);

        // Mark attendance
        student1.markAttendance();
        student1.markAttendance();

        // Display student details
        student1.displayDetails();

        // Calculate and display average grade
        double avgGrade = student1.calculateAverageGrade();
        System.out.println("Average Grade: " + avgGrade);
    }
}

