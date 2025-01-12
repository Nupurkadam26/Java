import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class LotteryNumberGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for the number of lottery numbers to generate
        System.out.print("Enter the number of lottery numbers to generate: ");
        int n = scanner.nextInt();

        // HashSet to store unique lottery numbers
        HashSet<Integer> lotteryNumbers = new HashSet<>();
        Random random = new Random();

        // Generate random numbers and ensure no duplicates
        while (lotteryNumbers.size() < n) {
            int number = random.nextInt(100) + 1; // Generate a random number between 1 and 100
            lotteryNumbers.add(number);  // HashSet automatically handles duplicates
        }

        // Print the generated lottery numbers
        System.out.println("Generated Lottery Numbers:");
        for (int number : lotteryNumbers) {
            System.out.print(number + " ");
        }

        scanner.close();
    }
}
