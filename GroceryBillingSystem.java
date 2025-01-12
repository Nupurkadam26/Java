import java.util.Scanner;

public class GroceryBillingSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of items available in the store: ");
        int numItems = scanner.nextInt();
        scanner.nextLine();

        String[] itemNames = new String[numItems];
        double[] itemPrices = new double[numItems];

        for (int i = 0; i < numItems; i++) {
            System.out.print("Enter the name of item " + (i + 1) + ": ");
            itemNames[i] = scanner.nextLine();
            System.out.print("Enter the price of " + itemNames[i] + ": ₹");
            itemPrices[i] = scanner.nextDouble();
            scanner.nextLine();
        }

        System.out.print("Enter the number of customers: ");
        int numCustomers = scanner.nextInt();
        scanner.nextLine();

        for (int customer = 1; customer <= numCustomers; customer++) {
            double totalBill = 0.0;
            System.out.println("\nProcessing bill for Customer " + customer);

            System.out.println("Available items:");
            for (int i = 0; i < numItems; i++) {
                System.out.println((i + 1) + ". " + itemNames[i] + " - ₹" + itemPrices[i]);
            }

            while (true) {
                System.out.print("Enter the item number to add to the bill (or enter 0 to finish): ");
                int itemNumber = scanner.nextInt();

                if (itemNumber == 0) {
                    break;
                }

                if (itemNumber > 0 && itemNumber <= numItems) {
                    totalBill += itemPrices[itemNumber - 1];
                    System.out.println("Added " + itemNames[itemNumber - 1] + " to the bill.");
                } else {
                    System.out.println("Invalid item number, please try again.");
                }
            }

            System.out.printf("Total bill for Customer %d: ₹%.2f%n", customer, totalBill);
        }

        scanner.close();
    }
}
