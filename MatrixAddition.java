import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Input matrix dimensions
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Initialize matrices
        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];
        int[][] resultMatrix = new int[rows][columns];

        // Input elements for matrix 1
        System.out.println("Enter elements of Matrix 1:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Input elements for matrix 2
        System.out.println("Enter elements of Matrix 2:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Perform matrix addition
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Display result matrix
        System.out.println("Resultant Matrix (Matrix 1 + Matrix 2):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }

        // Close scanner
        scanner.close();
    }
}
