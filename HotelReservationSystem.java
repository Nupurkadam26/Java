import java.util.*;

public class HotelReservationSystem {

    // Room class to represent a room in the hotel
    static class Room {
        int roomNumber;
        String roomType;
        boolean isAvailable;
        double pricePerNight;

        // Constructor to initialize Room
        public Room(int roomNumber, String roomType, double pricePerNight) {
            this.roomNumber = roomNumber;
            this.roomType = roomType;
            this.isAvailable = true; // All rooms are initially available
            this.pricePerNight = pricePerNight;
        }

        // Method to display room details
        public void displayRoomDetails() {
            System.out.println("Room Number: " + roomNumber + ", Type: " + roomType + ", Price: " + pricePerNight + " per night");
        }

        // Method to book the room (mark as unavailable)
        public void bookRoom() {
            if (isAvailable) {
                isAvailable = false;
                System.out.println("Room " + roomNumber + " has been booked.");
            } else {
                System.out.println("Sorry, Room " + roomNumber + " is not available.");
            }
        }

        // Method to check availability of the room
        public boolean isAvailable() {
            return isAvailable;
        }
    }

    // Hotel class to manage rooms and bookings
    static class Hotel {
        List<Room> rooms;

        // Constructor to initialize the hotel with rooms
        public Hotel() {
            rooms = new ArrayList<>();
        }

        // Method to add a room to the hotel
        public void addRoom(Room room) {
            rooms.add(room);
        }

        // Method to display available rooms
        public void displayAvailableRooms() {
            System.out.println("\nAvailable Rooms:");
            for (Room room : rooms) {
                if (room.isAvailable()) {
                    room.displayRoomDetails();
                }
            }
        }

        // Method to book a room by room number
        public void bookRoom(int roomNumber) {
            for (Room room : rooms) {
                if (room.roomNumber == roomNumber) {
                    room.bookRoom();
                    return;
                }
            }
            System.out.println("Room " + roomNumber + " does not exist.");
        }

        // Method to calculate total charges for a room based on the number of nights
        public void calculateTotalCharges(int roomNumber, int nights) {
            for (Room room : rooms) {
                if (room.roomNumber == roomNumber) {
                    if (!room.isAvailable) {
                        double totalCharges = room.pricePerNight * nights;
                        System.out.println("Total charges for Room " + roomNumber + " for " + nights + " night(s): " + totalCharges);
                    } else {
                        System.out.println("Room " + roomNumber + " is not booked yet.");
                    }
                    return;
                }
            }
            System.out.println("Room " + roomNumber + " does not exist.");
        }
    }

    public static void main(String[] args) {
        // Create a Hotel object
        Hotel hotel = new Hotel();

        // Add some rooms to the hotel
        hotel.addRoom(new Room(101, "Single", 50.0));
        hotel.addRoom(new Room(102, "Double", 80.0));
        hotel.addRoom(new Room(103, "Suite", 150.0));

        // Display available rooms
        hotel.displayAvailableRooms();

        // Book a room
        hotel.bookRoom(101);

        // Try to book an already booked room
        hotel.bookRoom(101);

        // Display available rooms again after booking
        hotel.displayAvailableRooms();

        // Calculate total charges for a room
        hotel.calculateTotalCharges(102, 3); // For room 102, 3 nights
    }
}
