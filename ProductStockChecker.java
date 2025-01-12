import java.util.Scanner;

public class ProductStockChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Number of products in the warehouse
        System.out.print("Enter the number of products in the warehouse: ");
        int numProducts = scanner.nextInt();

        // Threshold stock level
        System.out.print("Enter the threshold stock level: ");
        int threshold = scanner.nextInt();

        // Loop through each product and check stock levels
        for (int i = 1; i <= numProducts; i++) {
            System.out.print("Enter the stock quantity for product " + i + ": ");
            int stockQuantity = scanner.nextInt();

            if (stockQuantity < threshold) {
                System.out.println("Product " + i + " is below the threshold. Please reorder!");
            } else {
                System.out.println("Product " + i + " is in stock and does not need reordering.");
            }
        }

        scanner.close();
    }
}
