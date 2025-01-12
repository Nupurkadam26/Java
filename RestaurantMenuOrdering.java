import java.util.Scanner;

public class RestaurantMenuOrdering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] menuItems = {"Pizza", "Burger", "Pasta", "Salad", "Ice Cream"};
        double[] itemPrices = {200, 150, 120, 80, 50};

        System.out.println("Welcome to the Restaurant!");
        System.out.println("Here's our menu:");

        for (int i = 0; i < menuItems.length; i++) {
            System.out.println((i + 1) + ". " + menuItems[i] + " - ₹" + itemPrices[i]);
        }

        double totalCost = 0.0;
        StringBuilder orderSummary = new StringBuilder();

        while (true) {
            System.out.print("\nEnter the item number to order (or 0 to stop): ");
            int itemNumber = scanner.nextInt();

            if (itemNumber == 0) {
                break;
            }

            if (itemNumber > 0 && itemNumber <= menuItems.length) {
                totalCost += itemPrices[itemNumber - 1];
                orderSummary.append(menuItems[itemNumber - 1]).append(" - ₹").append(itemPrices[itemNumber - 1]).append("\n");
                System.out.println("Added " + menuItems[itemNumber - 1] + " to your order.");
            } else {
                System.out.println("Invalid item number, please try again.");
            }
        }

        System.out.println("\nYour order summary:");
        System.out.println(orderSummary);
        System.out.printf("Total cost: ₹%.2f%n", totalCost);

        scanner.close();
    }
}
