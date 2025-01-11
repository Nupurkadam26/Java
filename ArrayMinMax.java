
import java.util.Scanner;

public class ArrayMinMax {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for number of elements
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Create array and input elements
        int[] numbers = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Initialize min and max with the first element
        int min = numbers[0];
        int max = numbers[0];

        // Loop through the array to find min and max
        for (int i = 1; i < n; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Display results
        System.out.println("Smallest number: " + min);
        System.out.println("Largest number: " + max);

        // Close scanner
        scanner.close();
    }
}
