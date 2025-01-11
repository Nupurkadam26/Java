
import java.util.*;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Define a list of books with their availability
        String[] books = {"The Great Gatsby", "1984", "To Kill a Mockingbird"};
        boolean[] availability = {true, true, true}; // true means available, false means borrowed

        Scanner scanner = new Scanner(System.in);

        // Show available books
        System.out.println("Available books:");
        for (int i = 0; i < books.length; i++) {
            System.out.println((i + 1) + ". " + books[i] + " (Available: " + availability[i] + ")");
        }

        // Borrow a book
        System.out.print("Enter the number of the book you want to borrow: ");
        int borrowIndex = scanner.nextInt() - 1;
        if (availability[borrowIndex]) {
            availability[borrowIndex] = false;
            System.out.println("You have borrowed: " + books[borrowIndex]);
        } else {
            System.out.println("Sorry, the book is not available.");
        }

        // Return a book
        System.out.print("Enter the number of the book you want to return: ");
        int returnIndex = scanner.nextInt() - 1;
        availability[returnIndex] = true;
        System.out.println("You have returned: " + books[returnIndex]);

        scanner.close();
    }
}
