import java.util.*;

public class RestaurantOrderSystem {

    // MenuItem class to represent each menu item
    static class MenuItem {
        String itemName;
        double itemPrice;
        String itemCategory;

        // Constructor to initialize MenuItem
        public MenuItem(String itemName, double itemPrice, String itemCategory) {
            this.itemName = itemName;
            this.itemPrice = itemPrice;
            this.itemCategory = itemCategory;
        }

        // Method to display item details
        public void displayItem() {
            System.out.println(itemName + " (" + itemCategory + ") - " + "Price: " + itemPrice);
        }
    }

    // Restaurant class to manage the menu and orders
    static class Restaurant {
        List<MenuItem> menu;
        Map<MenuItem, Integer> customerOrder;

        // Constructor to initialize the restaurant with an empty menu and order
        public Restaurant() {
            menu = new ArrayList<>();
            customerOrder = new HashMap<>();
        }

        // Method to add a menu item to the menu
        public void addMenuItem(MenuItem item) {
            menu.add(item);
        }

        // Method to display the menu
        public void displayMenu() {
            System.out.println("\n---- Restaurant Menu ----");
            for (MenuItem item : menu) {
                item.displayItem();
            }
            System.out.println("------------------------");
        }

        // Method to take customer orders
        public void takeOrder() {
            Scanner scanner = new Scanner(System.in);
            boolean ordering = true;

            while (ordering) {
                System.out.print("\nEnter the item name to order (or 'done' to finish): ");
                String orderItem = scanner.nextLine();

                if (orderItem.equalsIgnoreCase("done")) {
                    ordering = false;
                    break;
                }

                MenuItem selectedItem = null;
                for (MenuItem item : menu) {
                    if (item.itemName.equalsIgnoreCase(orderItem)) {
                        selectedItem = item;
                        break;
                    }
                }

                if (selectedItem != null) {
                    System.out.print("Enter quantity for " + selectedItem.itemName + ": ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();  // Consume newline character after integer input
                    customerOrder.put(selectedItem, customerOrder.getOrDefault(selectedItem, 0) + quantity);
                    System.out.println(quantity + " " + selectedItem.itemName + "(s) added to your order.");
                } else {
                    System.out.println("Sorry, " + orderItem + " is not in the menu.");
                }
            }
        }

        // Method to calculate and display the bill
        public void displayBill() {
            System.out.println("\n---- Your Bill ----");
            double totalAmount = 0;
            for (Map.Entry<MenuItem, Integer> entry : customerOrder.entrySet()) {
                MenuItem item = entry.getKey();
                int quantity = entry.getValue();
                double itemTotal = item.itemPrice * quantity;
                totalAmount += itemTotal;
                System.out.println(item.itemName + " (" + quantity + " x " + item.itemPrice + ") = " + itemTotal);
            }
            System.out.println("-------------------");
            System.out.println("Total Amount: " + totalAmount);
        }
    }

    public static void main(String[] args) {
        // Create a Restaurant object
        Restaurant restaurant = new Restaurant();

        // Add some menu items to the restaurant
        restaurant.addMenuItem(new MenuItem("Burger", 5.99, "Main Course"));
        restaurant.addMenuItem(new MenuItem("Pizza", 8.99, "Main Course"));
        restaurant.addMenuItem(new MenuItem("Pasta", 6.49, "Main Course"));
        restaurant.addMenuItem(new MenuItem("Coke", 1.99, "Beverage"));
        restaurant.addMenuItem(new MenuItem("Coffee", 2.49, "Beverage"));
        restaurant.addMenuItem(new MenuItem("Ice Cream", 3.99, "Dessert"));

        // Display the menu
        restaurant.displayMenu();

        // Take customer orders
        restaurant.takeOrder();

        // Display the bill
        restaurant.displayBill();
    }
}

