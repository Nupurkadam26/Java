import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for number of elements
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Create array and input elements
        int[] numbers = new int[n];
        System.out.println("Enter the elements of the array:");
        int sum = 0;

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];  // Calculate sum during input
        }

        // Calculate average
        double average = (double) sum / n;

        // Display results
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);

        // Close scanner
        scanner.close();
    }
}


