package org.example.model;

public class Car {
    private String carModel;
    private String carName;
    private double carPrize;
    private String carColor;
    private boolean isBooked;
    private int available;

    public Car(String carModel, double carPrize, String carColor) {
        this.carModel = carModel;
        this.carName = carName;
        this.carPrize = carPrize;
        this.carColor = carColor;
        this.isBooked = isBooked;
        this.available = available;
    }

    public  Car(){

    }

    public Car(String carModel) {
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public double getCarPrize() {
        return carPrize;
    }

    public void setCarPrize(double carPrize) {
        this.carPrize = carPrize;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public boolean getIsBooked() {
        return isBooked;
    }

    public boolean setIsBooked(boolean isBooked) {
      return false;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                ", carName='" + carName + '\'' +
                ", carPrize=" + carPrize +
                ", carColor='" + carColor + '\'' +
                ", isBooked=" + isBooked +
                ", available=" + available +
                '}';
    }
}
