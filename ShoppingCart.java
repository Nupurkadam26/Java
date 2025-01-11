import java.util.Scanner;

public class ShoppingCart {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total price of items in the cart: $");
        double totalPrice = scanner.nextDouble();
        
        double discount = 0;

        if (totalPrice > 500) {
            discount = 0.10;  // 10% discount
        } else if (totalPrice >= 200) {
            discount = 0.05;  // 5% discount
        }

        double finalPrice = totalPrice - (totalPrice * discount);

        System.out.println("Total Price: $" + totalPrice);
        System.out.println("Discount: " + (discount * 100) + "%");
        System.out.println("Final Price after discount: $" + finalPrice);

        scanner.close();
    }
}
