import java.util.Scanner;

public class ParkingLotFeeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of vehicles
        System.out.print("Enter the number of vehicles: ");
        int numVehicles = scanner.nextInt();

        // Loop to calculate the parking fee for each vehicle
        for (int i = 1; i <= numVehicles; i++) {
            System.out.println("\nEnter parking details for Vehicle " + i + ":");

            // Get the number of hours the vehicle was parked
            System.out.print("Enter the number of hours parked: ");
            int hoursParked = scanner.nextInt();

            // Calculate the parking fee
            double parkingFee = 0.0;

            if (hoursParked <= 5) {
                // First 5 hours: $2/hour
                parkingFee = hoursParked * 2;
            } else {
                // First 5 hours: $2/hour, Additional hours: $1/hour
                parkingFee = (5 * 2) + ((hoursParked - 5) * 1);
            }

            // Display the calculated fee
            System.out.println("Total parking fee for Vehicle " + i + ": $" + parkingFee);
        }

        scanner.close();
    }
}
