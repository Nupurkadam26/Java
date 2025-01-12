import java.util.Scanner;

public class ProductDiscountFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int numProducts = scanner.nextInt(); // Number of products
        scanner.nextLine(); // Consume the newline character

        // Loop to process each product
        for (int i = 1; i <= numProducts; i++) {
            System.out.println("Enter details for Product " + i + ":");

            // Get product price and discount percentage
            System.out.print("Enter the price of the product: ");
            double price = scanner.nextDouble();
            System.out.print("Enter the discount percentage: ");
            double discountPercentage = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character

            // Calculate discounted price
            double discountAmount = (discountPercentage / 100) * price;
            double discountedPrice = price - discountAmount;

            // Display the discounted price
            System.out.println("Original Price: $" + price);
            System.out.println("Discount: " + discountPercentage + "%");
            System.out.println("Discounted Price: $" + discountedPrice);
            System.out.println(); // Blank line between products
        }

        scanner.close();
    }
}
