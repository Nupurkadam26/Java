import java.util.Random;

public class SensorDataMonitoring {

    public static void main(String[] args) {
        Random random = new Random();
        int threshold = 80; // The threshold value to stop reading
        int highestValue = 0; // Variable to store the highest sensor reading
        int readingsTaken = 0; // Counter for the number of readings taken

        // Simulate continuous data reading
        while (true) {
            // Generate a random sensor value between 1 and 100
            int sensorValue = random.nextInt(100) + 1;
            readingsTaken++;

            // Update the highest value recorded
            if (sensorValue > highestValue) {
                highestValue = sensorValue;
            }

            // Display the current reading
            System.out.println("Reading " + readingsTaken + ": " + sensorValue);

            // Stop reading when the sensor value exceeds the threshold
            if (sensorValue > threshold) {
                System.out.println("Threshold exceeded! Stopping the sensor monitoring.");
                break;
            }
        }

        // Display the results
        System.out.println("\nTotal Readings Taken: " + readingsTaken);
        System.out.println("Highest Sensor Value Recorded: " + highestValue);
    }
}
