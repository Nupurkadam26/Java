import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for number of elements
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Check for valid array size
        if (n < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }

        // Create array and input elements
        int[] numbers = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Initialize first and second largest
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Find the largest and second largest elements
        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        // Display result
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }

        // Close scanner
        scanner.close();
    }
}


