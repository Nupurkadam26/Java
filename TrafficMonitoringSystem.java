import java.util.Scanner;

public class TrafficMonitoringSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalVehicles = 0; // Variable to store total number of vehicles
        int intervals = 12; // Number of 5-minute intervals in an hour (60 minutes / 5 minutes)

        // Loop to record the number of vehicles passing every 5 minutes
        for (int i = 1; i <= intervals; i++) {
            System.out.print("Enter the number of vehicles passing through the toll gate in the " + i + " interval (5 minutes): ");
            int vehiclesInInterval = scanner.nextInt();
            totalVehicles += vehiclesInInterval; // Add to the total vehicle count
        }

        // Calculate the average number of vehicles per interval
        double averageVehicles = (double) totalVehicles / intervals;

        // Display the results
        System.out.println("\nTotal number of vehicles in the hour: " + totalVehicles);
        System.out.println("Average number of vehicles per 5-minute interval: " + averageVehicles);

        scanner.close();
    }
}
