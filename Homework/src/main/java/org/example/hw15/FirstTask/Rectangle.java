package org.example.hw15.FirstTask;


// Похідний клас "Прямокутник"
public class Rectangle extends Figure {
    private final double length;
    private final double width;

    public Rectangle(double x, double y, double length, double width) {
        super(x, y);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}