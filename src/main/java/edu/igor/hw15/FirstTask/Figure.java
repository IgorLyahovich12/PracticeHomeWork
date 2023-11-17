package edu.igor.hw15.FirstTask;

public abstract class Figure {
    protected double valueX; // Значення X для центру фігури
    protected double valueY; // Значення Y для центру фігури

    public Figure(double x, double y) {
        this.valueX = x;
        this.valueY = y;
    }

    public abstract double calculateArea(); // Абстрактний метод для розрахунку площі фігури

    public void displayInfo() {
        System.out.println("Центр фігури: (" + valueX + ", " + valueY + ")");
    }
}
