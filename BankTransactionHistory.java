
import java.util.Scanner;

public class BankTransactionHistory {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = 0.0;
        int choice;

        do {
            System.out.println("\nBank Transaction Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ₹");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println("Deposited ₹" + depositAmount);
                    } else {
                        System.out.println("Invalid deposit amount!");
                    }
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.println("Withdrawn ₹" + withdrawAmount);
                    } else {
                        System.out.println("Invalid withdrawal amount or insufficient balance!");
                    }
                    break;

                case 3:
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
            }

            System.out.println("Current balance: ₹" + balance);

        } while (choice != 3);

        scanner.close();
    }
}
