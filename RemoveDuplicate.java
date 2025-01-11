import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Create array and input elements
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Remove duplicates using a LinkedHashSet to maintain insertion order
        Set<Integer> uniqueElements = new LinkedHashSet<>();
        for (int num : array) {
            uniqueElements.add(num);
        }

        // Display unique elements
        System.out.println("Array after removing duplicates:");
        for (int num : uniqueElements) {
            System.out.print(num + " ");
        }

        // Close scanner
        scanner.close();
    }
}


