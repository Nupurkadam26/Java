import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeAttendanceTracker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Create a list to store attendance for multiple employees
        ArrayList<ArrayList<String>> attendanceList = new ArrayList<>();

        // Step 2: Get the number of employees
        System.out.print("Enter the number of employees: ");
        int numEmployees = scanner.nextInt();
        scanner.nextLine(); // Consume newline left over

        // Step 3: Record attendance for each employee
        for (int i = 0; i < numEmployees; i++) {
            ArrayList<String> employeeAttendance = new ArrayList<>();
            System.out.println("Recording attendance for Employee " + (i + 1) + ":");
            
            for (int day = 0; day < 7; day++) {
                System.out.print("Day " + (day + 1) + " (Enter 'Present' or 'Absent'): ");
                String status = scanner.nextLine().trim();
                employeeAttendance.add(status);
            }
            attendanceList.add(employeeAttendance);
        }

        // Step 4: Display the attendance summary without array brackets using for loops
        System.out.println("\nAttendance Summary:");
        for (int i = 0; i < attendanceList.size(); i++) {
            System.out.print("Employee " + (i + 1) + ": ");
            for (int j = 0; j < attendanceList.get(i).size(); j++) {
                System.out.print(attendanceList.get(i).get(j) + " ");
            }
            System.out.println(); // Move to the next line for each employee
        }

        // Close the scanner
        scanner.close();
    }
}
