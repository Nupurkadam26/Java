import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
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

        // Sort array in ascending order
        Arrays.sort(numbers);

        // Display ascending order
        System.out.println("Array in ascending order: " + Arrays.toString(numbers));

        // Sort array in descending order
        int[] descendingNumbers = new int[n];
        for (int i = 0; i < n; i++) {
            descendingNumbers[i] = numbers[n - i - 1];
        }

        // Display descending order
        System.out.println("Array in descending order: " + Arrays.toString(descendingNumbers));

        // Close scanner
        scanner.close();
    }
}
