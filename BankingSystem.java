import java.util.Scanner;

public class BankingSystem {

    // Base class BankAccount
    static class BankAccount {
        String accountHolderName;
        String accountNumber;
        double balance;

        // Constructor
        public BankAccount(String accountHolderName, String accountNumber, double initialBalance) {
            this.accountHolderName = accountHolderName;
            this.accountNumber = accountNumber;
            this.balance = initialBalance;
        }

        // Method to deposit money
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited: " + amount);
            } else {
                System.out.println("Invalid deposit amount.");
            }
        }

        // Method to withdraw money (with balance validation)
        public void withdraw(double amount) {
            if (amount > 0 && balance >= amount) {
                balance -= amount;
                System.out.println("Withdrew: " + amount);
            } else if (amount > balance) {
                System.out.println("Insufficient balance.");
            } else {
                System.out.println("Invalid withdrawal amount.");
            }
        }

        // Method to check balance
        public void checkBalance() {
            System.out.println("Balance: " + balance);
        }
    }

    // SavingsAccount subclass with a minimum balance
    static class SavingsAccount extends BankAccount {
        static final double MIN_BALANCE = 1000;

        public SavingsAccount(String accountHolderName, String accountNumber, double initialBalance) {
            super(accountHolderName, accountNumber, initialBalance);
        }

        // Override withdraw method with minimum balance validation
        @Override
        public void withdraw(double amount) {
            if (balance - amount >= MIN_BALANCE) {
                super.withdraw(amount);
            } else {
                System.out.println("Cannot withdraw. Minimum balance of " + MIN_BALANCE + " required.");
            }
        }
    }

    // CurrentAccount subclass with overdraft facility
    static class CurrentAccount extends BankAccount {
        static final double OVERDRAFT_LIMIT = 5000;

        public CurrentAccount(String accountHolderName, String accountNumber, double initialBalance) {
            super(accountHolderName, accountNumber, initialBalance);
        }

        // CurrentAccount allows overdraft
        @Override
        public void withdraw(double amount) {
            if (balance - amount >= -OVERDRAFT_LIMIT) {
                super.withdraw(amount);
            } else {
                System.out.println("Overdraft limit exceeded.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create bank account types
        System.out.print("Enter account holder name: ");
        String accountHolderName = scanner.nextLine();
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        System.out.print("Choose account type (1. Savings 2. Current): ");
        int accountType = scanner.nextInt();
        BankAccount account = null;

        // Create either SavingsAccount or CurrentAccount based on input
        if (accountType == 1) {
            account = new SavingsAccount(accountHolderName, accountNumber, initialBalance);
        } else if (accountType == 2) {
            account = new CurrentAccount(accountHolderName, accountNumber, initialBalance);
        }

        // Bank operations
        while (true) {
            System.out.println("\nChoose an operation: ");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 3:
                    account.checkBalance();
                    break;

                case 4:
                    System.out.println("Exit done");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
