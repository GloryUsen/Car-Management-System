package org.example.servicelmlp;

import org.example.model.Booking;
import org.example.model.Car;
import org.example.model.User;
import org.example.service.CarBookingService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarBookingSystemImp  implements CarBookingService {

    private static List<Car> cars = new ArrayList<>();
    private static List<Booking> bookings = new ArrayList<>();
    private static List<User> users = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    static {
        // Adding initial cars to the list
        cars.add(new Car("Sedan", 120000, "red"));
        cars.add(new Car("SUV", 1300000, "black"));
        cars.add(new Car("Hatchback", 140000000, "blue"));
        cars.add(new Car("Toyota", 1700000, "yellow"));
    }

    @Override
    public void registerUser() {
        System.out.print("Enter your name: ");
        String userName = scanner.next();
        User user = new User(userName);
        users.add(user);
        System.out.println("User registered successfully! Your user ID is: " + user.getUserId());
    }

    @Override
    public void bookCar() {
        System.out.print("Enter your user ID: ");
        int userId = scanner.nextInt();

        User user = getUserById(userId);
        if (user != null) {
            System.out.println("Available cars:");
            displayAvailableCars();

            System.out.print("Enter the car model to be booked: ");
            String carModel = scanner.next();

            Car car = findCarByModel(carModel);
            if (car != null && !car.getIsBooked()) {
                Booking booking = new Booking(user, car);
                bookings.add(booking);
                System.out.println("Car booked successfully!");
                System.out.println("Booking ID: " + booking.getBookingId());
                System.out.println("Car Model: " + car.getCarModel());
                cars.remove(car);
            } else {
                System.out.println("Car not available or already booked.");
            }
        } else {
            System.out.println("User ID does not exist.");
        }
    }

    private User getUserById(int userId) {
        for (User user : users) {
            if (user.getUserId() == userId) {
                System.out.println(user.getUserId());
                return user;

            }

        }
        return null; // User not found
    }
    // Other methods (viewBookings, viewAvailableCars, viewAllUsers) remain unchanged...



    @Override
    public void viewBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No bookings available.");
        } else {
            System.out.println("Bookings:");
            for (Booking booking : bookings) {
                System.out.println("Booking ID: " + booking.getBookingId() +
                        ", Car Model: " + booking.getCar().getCarModel() +
                        ", User: " + booking.getUsers().getUserName());
            }
        }
    }

    @Override
    public void viewAvailableCars() {
        System.out.println("Available cars:");
        for (Car car : cars) {
            if (!car.getIsBooked()) {
                System.out.println(car.getCarModel());
            }
        }
    }

    @Override
    public void viewAllUsers() {
        System.out.println("All Users:");
        for (User user : users) {
            System.out.println("User ID: " + user.getUserId() +
                    ", User Name: " + user.getUserName());
        }
    }

    private static void displayAvailableCars() {
        // Display available cars (for simplicity, assuming some predefined models)
        System.out.println("1. Sedan");
        System.out.println("2. SUV");
        System.out.println("3. Hatchback");
    }

    private Car findCarByModel(String model) {
        for (Car car : cars) {
            if (car.getCarModel().equalsIgnoreCase(model) && !car.getIsBooked()) {
                return car;
            }
        }
        return null;
    }

}
