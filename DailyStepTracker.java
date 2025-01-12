import java.util.Scanner;

public class DailyStepTracker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalSteps = 0;  // Variable to store the total number of steps
        int daysInWeek = 7;  // Total number of days in a week

        // Loop to record steps for each day of the week
        for (int i = 1; i <= daysInWeek; i++) {
            System.out.print("Enter the number of steps taken on day " + i + ": ");
            int stepsForDay = scanner.nextInt();
            totalSteps += stepsForDay;  // Add the daily steps to the total
        }

        // Calculate the average number of steps
        double averageSteps = (double) totalSteps / daysInWeek;

        // Display the results
        System.out.println("\nTotal steps for the week: " + totalSteps);
        System.out.println("Average steps per day: " + averageSteps);

        scanner.close();
    }
}
