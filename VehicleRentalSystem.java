import java.util.Scanner;

public class VehicleRentalSystem {

    // Base class Vehicle
    static class Vehicle {
        String vehicleType;
        String numberPlate;
        double rentalPricePerDay;

        // Constructor
        public Vehicle(String vehicleType, String numberPlate, double rentalPricePerDay) {
            this.vehicleType = vehicleType;
            this.numberPlate = numberPlate;
            this.rentalPricePerDay = rentalPricePerDay;
        }

        // Method to calculate rental cost
        public double calculateRentalCost(int days) {
            return rentalPricePerDay * days;
        }
    }

    // Car subclass
    static class Car extends Vehicle {
        int seatCapacity;

        public Car(String vehicleType, String numberPlate, double rentalPricePerDay, int seatCapacity) {
            super(vehicleType, numberPlate, rentalPricePerDay);
            this.seatCapacity = seatCapacity;
        }
    }

    // Bike subclass
    static class Bike extends Vehicle {
        boolean isElectric;

        public Bike(String vehicleType, String numberPlate, double rentalPricePerDay, boolean isElectric) {
            super(vehicleType, numberPlate, rentalPricePerDay);
            this.isElectric = isElectric;
        }
    }

    // Truck subclass
    static class Truck extends Vehicle {
        double cargoCapacity;

        public Truck(String vehicleType, String numberPlate, double rentalPricePerDay, double cargoCapacity) {
            super(vehicleType, numberPlate, rentalPricePerDay);
            this.cargoCapacity = cargoCapacity;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Car
        System.out.print("Enter Car number plate: ");
        String carNumberPlate = scanner.nextLine();
        System.out.print("Enter Car rental price per day: ");
        double carRentalPrice = scanner.nextDouble();
        System.out.print("Enter Car seat capacity: ");
        int carSeatCapacity = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        Car car = new Car("Car", carNumberPlate, carRentalPrice, carSeatCapacity);

        // Input for Bike
        System.out.print("Enter Bike number plate: ");
        String bikeNumberPlate = scanner.nextLine();
        System.out.print("Enter Bike rental price per day: ");
        double bikeRentalPrice = scanner.nextDouble();
        System.out.print("Is the Bike electric (true/false): ");
        boolean isElectric = scanner.nextBoolean();
        scanner.nextLine();  // Consume newline
        Bike bike = new Bike("Bike", bikeNumberPlate, bikeRentalPrice, isElectric);

        // Input for Truck
        System.out.print("Enter Truck number plate: ");
        String truckNumberPlate = scanner.nextLine();
        System.out.print("Enter Truck rental price per day: ");
        double truckRentalPrice = scanner.nextDouble();
        System.out.print("Enter Truck cargo capacity: ");
        double truckCargoCapacity = scanner.nextDouble();
        scanner.nextLine();  // Consume newline
        Truck truck = new Truck("Truck", truckNumberPlate, truckRentalPrice, truckCargoCapacity);

        // Input for rental duration
        System.out.print("\nEnter number of days rented: ");
        int days = scanner.nextInt();

        // Calculate rental costs
        System.out.println("\nCar Rental Cost: " + car.calculateRentalCost(days));
        System.out.println("Bike Rental Cost: " + bike.calculateRentalCost(days));
        System.out.println("Truck Rental Cost: " + truck.calculateRentalCost(days));

        scanner.close();
    }
}

