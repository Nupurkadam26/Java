import java.util.Scanner;

public class BankATM {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = 1000;
        int choice;

        while (true) {
            System.out.println("----- ATM Menu -----");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your current balance is: $" + balance);
                    break;

                case 2:
                    System.out.print("Enter the amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    balance += depositAmount;
                    System.out.println("You have successfully deposited: $" + depositAmount);
                    System.out.println("Your new balance is: $" + balance);
                    break;

                case 3:
                    System.out.print("Enter the amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.println("You have successfully withdrawn: $" + withdrawAmount);
                        System.out.println("Your new balance is: $" + balance);
                    } else {
                        System.out.println("Insufficient balance. Please try again.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
