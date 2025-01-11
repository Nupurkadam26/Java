import java.util.*;

public class ECommerceOrderSystem {

    // Customer class to represent customer details
    static class Customer {
        int customerId;
        String name;
        String address;

        // Constructor to initialize Customer details
        public Customer(int customerId, String name, String address) {
            this.customerId = customerId;
            this.name = name;
            this.address = address;
        }

        // Method to display customer details
        public void displayCustomerDetails() {
            System.out.println("Customer ID: " + customerId);
            System.out.println("Name: " + name);
            System.out.println("Address: " + address);
        }
    }

    // Order class to represent an order made by a customer
    static class Order {
        int orderId;
        String orderDate;
        List<String> items;  // List to store ordered items

        // Constructor to initialize Order details
        public Order(int orderId, String orderDate) {
            this.orderId = orderId;
            this.orderDate = orderDate;
            this.items = new ArrayList<>();
        }

        // Method to add an item to the order
        public void addItem(String item) {
            items.add(item);
        }

        // Method to display order details
        public void displayOrderDetails() {
            System.out.println("Order ID: " + orderId);
            System.out.println("Order Date: " + orderDate);
            System.out.println("Ordered Items: " + items);
        }
    }

    public static void main(String[] args) {
        // Create a customer
        Customer customer = new Customer(101, "Alice", "123 Main St, Wonderland");

        // Display customer details
        customer.displayCustomerDetails();

        // Create an order for the customer
        Order order = new Order(2023, "2025-01-10");

        // Add items to the order
        order.addItem("Laptop");
        order.addItem("Smartphone");
        order.addItem("Headphones");

        // Display order details
        order.displayOrderDetails();
    }
}
