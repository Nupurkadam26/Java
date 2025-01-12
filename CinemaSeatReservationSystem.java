
import java.util.Scanner;

public class CinemaSeatReservationSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a 2D array to represent the cinema seats (5 rows, 5 seats per row)
        String[][] seats = new String[5][5];

        // Initialize all seats as available
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                seats[i][j] = "Available";
            }
        }

        int row, seat;
        int choice;

        do {
            // Display available seats
            System.out.println("\nCinema Seat Reservation System:");
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(seats[i][j] + "\t");
                }
                System.out.println();
            }

            System.out.println("\nSelect a seat to reserve:");
            System.out.print("Enter row number (1-5): ");
            row = scanner.nextInt() - 1; // Adjusting for 0-based index
            System.out.print("Enter seat number (1-5): ");
            seat = scanner.nextInt() - 1; // Adjusting for 0-based index

            // Check if the seat is available
            if (row >= 0 && row < 5 && seat >= 0 && seat < 5) {
                if (seats[row][seat].equals("Available")) {
                    seats[row][seat] = "Reserved";
                    System.out.println("Seat reserved successfully.");
                } else {
                    System.out.println("Sorry, this seat is already reserved.");
                }
            } else {
                System.out.println("Invalid seat selection, please try again.");
            }

            // Ask if the user wants to reserve more seats
            System.out.print("\nDo you want to reserve another seat? (1 for Yes, 2 for No): ");
            choice = scanner.nextInt();

        } while (choice == 1);

        System.out.println("Thank you for using the Cinema Seat Reservation System!");
        scanner.close();
    }
}
