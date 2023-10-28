package edu.igor.hw15.FirstTask;

public class Circle extends Figure {
    private final double radius;
    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
