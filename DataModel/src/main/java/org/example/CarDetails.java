package org.example;


public class CarDetails {

    private final String brand;
    private String color;
    private final int year;
    private final double mileage;
    private final String bodyType;

    public CarDetails(String brand, String color, int year, double mileage, String bodyType) {
        this.brand = brand;
        this.color = color;
        this.year = year;
        this.mileage = mileage;
        this.bodyType = bodyType;
    }

    public String getBrand() {
        return brand;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }


    @Override
    public String toString() {
        return "CarDetails{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                ", bodyType='" + bodyType + '\'' +
                '}';
    }
}
