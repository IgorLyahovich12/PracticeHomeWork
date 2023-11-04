package edu.igor.hw15.FirstTask;

public class Figure {
    protected double valueX; //значення X для центру фігури
  protected double valueY; //значення Y для центру фігури

    public Figure(double x, double y) {
        this.valueX = x;
        this.valueY = y;
    }

    public double calculateArea() {
        return 0; // Базовий метод для розрахунку площі фігури
    }

    public void displayInfo() {
        System.out.println("Центр фігури: (" + valueX + ", " + valueY + ")");
    }
}

