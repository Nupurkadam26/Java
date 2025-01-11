import java.util.Scanner;

public class EmployeePayrollSystem {

    // Employee class
    static class Employee {
        String name;
        int id;
        String designation;
        double basicSalary;

        // Constructor
        public Employee(String name, int id, String designation, double basicSalary) {
            this.name = name;
            this.id = id;
            this.designation = designation;
            this.basicSalary = basicSalary;
        }

        // Method to calculate salary (to be overridden)
        public double calculateSalary() {
            return basicSalary;
        }
    }

    // FullTimeEmployee subclass
    static class FullTimeEmployee extends Employee {
        double hra; // Housing Rent Allowance
        double da;  // Dearness Allowance

        // Constructor
        public FullTimeEmployee(String name, int id, String designation, double basicSalary, double hra, double da) {
            super(name, id, designation, basicSalary);
            this.hra = hra;
            this.da = da;
        }

        // Method to calculate salary for full-time employee
        @Override
        public double calculateSalary() {
            return basicSalary + hra + da;
        }
    }

    // PartTimeEmployee subclass
    static class PartTimeEmployee extends Employee {
        double hourlyWage;
        int hoursWorked;

        // Constructor
        public PartTimeEmployee(String name, int id, String designation, double basicSalary, double hourlyWage, int hoursWorked) {
            super(name, id, designation, basicSalary);
            this.hourlyWage = hourlyWage;
            this.hoursWorked = hoursWorked;
        }

        // Method to calculate salary for part-time employee
        @Override
        public double calculateSalary() {
            return basicSalary + (hourlyWage * hoursWorked);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Full-Time Employee
        System.out.print("Enter name for Full-Time Employee: ");
        String name = scanner.nextLine();
        System.out.print("Enter ID for Full-Time Employee: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.print("Enter designation for Full-Time Employee: ");
        String designation = scanner.nextLine();
        System.out.print("Enter basic salary for Full-Time Employee: ");
        double basicSalary = scanner.nextDouble();
        System.out.print("Enter HRA for Full-Time Employee: ");
        double hra = scanner.nextDouble();
        System.out.print("Enter DA for Full-Time Employee: ");
        double da = scanner.nextDouble();
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(name, id, designation, basicSalary, hra, da);

        // Input for Part-Time Employee
        System.out.print("\nEnter name for Part-Time Employee: ");
        scanner.nextLine();  // Consume newline
        name = scanner.nextLine();
        System.out.print("Enter ID for Part-Time Employee: ");
        id = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.print("Enter designation for Part-Time Employee: ");
        designation = scanner.nextLine();
        System.out.print("Enter basic salary for Part-Time Employee: ");
        basicSalary = scanner.nextDouble();
        System.out.print("Enter hourly wage for Part-Time Employee: ");
        double hourlyWage = scanner.nextDouble();
        System.out.print("Enter hours worked for Part-Time Employee: ");
        int hoursWorked = scanner.nextInt();
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(name, id, designation, basicSalary, hourlyWage, hoursWorked);

        // Display salaries
        System.out.println("\nFull-Time Employee Salary: " + fullTimeEmployee.calculateSalary());
        System.out.println("Part-Time Employee Salary: " + partTimeEmployee.calculateSalary());

        scanner.close();
    }
}
