import java.util.*;

public class ShoppingCartSystem {

    // Product class
    static class Product {
        String name;
        double price;
        int quantity;

        // Constructor
        public Product(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        // Method to calculate total price for the product
        public double getTotalPrice() {
            return price * quantity;
        }

        // Method to display product details
        public void displayProduct() {
            System.out.println("Product: " + name + ", Price: " + price + ", Quantity: " + quantity + ", Total: " + getTotalPrice());
        }
    }

    // Cart class to manage the shopping cart
    static class Cart {
        List<Product> products;

        // Constructor
        public Cart() {
            products = new ArrayList<>();
        }

        // Method to add a product to the cart
        public void addProduct(Product product) {
            products.add(product);
            System.out.println(product.name + " has been added to the cart.");
        }

        // Method to remove a product from the cart
        public void removeProduct(String productName) {
            Iterator<Product> iterator = products.iterator();
            boolean found = false;
            while (iterator.hasNext()) {
                Product product = iterator.next();
                if (product.name.equalsIgnoreCase(productName)) {
                    iterator.remove();
                    System.out.println(productName + " has been removed from the cart.");
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Product not found in the cart.");
            }
        }

        // Method to calculate total price of all products in the cart
        public double calculateTotalPrice() {
            double totalPrice = 0;
            for (Product product : products) {
                totalPrice += product.getTotalPrice();
            }
            return totalPrice;
        }

        // Method to display all products in the cart
        public void displayCart() {
            if (products.isEmpty()) {
                System.out.println("Your cart is empty.");
            } else {
                System.out.println("\nShopping Cart:");
                for (Product product : products) {
                    product.displayProduct();
                }
            }
        }
    }

    public static void main(String[] args) {
        // Create a Cart object
        Cart cart = new Cart();

        // Create some products
        Product product1 = new Product("Laptop", 50000, 1);
        Product product2 = new Product("Phone", 20000, 2);
        Product product3 = new Product("Headphones", 1500, 3);

        // Add products to the cart
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);

        // Display the cart
        cart.displayCart();

        // Remove a product from the cart
        cart.removeProduct("Phone");

        // Display the updated cart
        cart.displayCart();

        // Calculate the total price of the products in the cart
        double total = cart.calculateTotalPrice();
        System.out.println("\nTotal Price of Products in Cart: " + total);
    }
}
