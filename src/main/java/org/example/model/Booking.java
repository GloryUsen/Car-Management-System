package org.example.model;

public class Booking {

    private static int bookingIdCounter = 1;
    private int bookingId;
    private User users;
    private Car car;



    public Booking(User users, Car car) {
        this.bookingId = bookingIdCounter++;
        this.users = users;
        this.car = car;
        car.setIsBooked(true);
    }

    public Booking() {

    }


    public static int getBookingIdCounter() {
        return bookingIdCounter;
    }

    public static void setBookingIdCounter(int bookingIdCounter) {
        Booking.bookingIdCounter = bookingIdCounter;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public User getUsers() {
        return users;
    }

    public void setUsers(User users) {
        this.users = users;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", users=" + users +
                ", car=" + car +
                '}';
    }
}
