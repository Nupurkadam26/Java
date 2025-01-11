import java.util.Scanner;

public class ArrayRotation {
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

        // Input number of positions to rotate
        System.out.print("Enter the number of positions to rotate: ");
        int positions = scanner.nextInt();

        // Normalize the rotation to handle cases where positions >= n
        positions = positions % n;

        // Rotate the array
        rotateArray(array, positions);

        // Display rotated array
        System.out.println("Array after rotation:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        
        // Close scanner
        scanner.close();
    }

    // Function to rotate an array to the left by given positions
    public static void rotateArray(int[] array, int positions) {
        reverseArray(array, 0, positions - 1);  // Reverse first part
        reverseArray(array, positions, array.length - 1);  // Reverse second part
        reverseArray(array, 0, array.length - 1);  // Reverse entire array
    }

    // Function to reverse elements in an array between two indices
    public static void reverseArray(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}

