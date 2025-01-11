
    import java.util.Scanner;

public class ArraySearch {
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

        // Prompt user for element to search
        System.out.print("Enter the element to search for: ");
        int searchElement = scanner.nextInt();

        // Search for the element
        int position = -1;
        for (int i = 0; i < n; i++) {
            if (numbers[i] == searchElement) {
                position = i;  // Store position if found
                break;
            }
        }

        // Display result
        if (position != -1) {
            System.out.println("Element " + searchElement + " found at position: " + (position + 1));
        } else {
            System.out.println("Element " + searchElement + " not found in the array.");
        }

        // Close scanner
        scanner.close();
    }
}


