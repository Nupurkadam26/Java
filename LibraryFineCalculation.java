import java.util.Scanner;

public class LibraryFineCalculation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of books: ");
        int numBooks = scanner.nextInt();

        for (int i = 1; i <= numBooks; i++) {
            System.out.print("Enter the number of overdue days for book " + i + ": ");
            int overdueDays = scanner.nextInt();

            int fine = 0;
            if (overdueDays <= 7) {
                fine = overdueDays;  // $1 per day for the first 7 days
            } else {
                fine = 7 + (overdueDays - 7) * 2;  // $1 per day for the first 7 days, $2 per day thereafter
            }

            System.out.println("The fine for book " + i + " is: $" + fine);
        }

        scanner.close();
    }
}
