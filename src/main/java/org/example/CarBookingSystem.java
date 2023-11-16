package org.example;

import org.example.service.CarBookingService;
import org.example.servicelmlp.CarBookingSystemImp;

import java.util.Scanner;

public class CarBookingSystem{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarBookingService carService = new CarBookingSystemImp();

        while (true) {
            System.out.println("1. Register User");
            System.out.println("2. Book a car");
            System.out.println("3. View bookings");
            System.out.println("4. View available cars");
            System.out.println("5. View all users");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    carService.registerUser();
                    break;
                case 2:
                    carService.bookCar();
                    break;
                case 3:
                    carService.viewBookings();
                    break;
                case 4:
                    carService.viewAvailableCars();
                    break;
                case 5:
                    carService.viewAllUsers();
                    break;
                case 6:
                    System.out.println("Exiting the system. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}