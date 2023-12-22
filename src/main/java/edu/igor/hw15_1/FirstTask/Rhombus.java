package edu.igor.hw15_1.FirstTask;


// Похідний клас "Ромб"
public class Rhombus extends Figure {
    private final double diagonal1;
    private final double diagonal2;

    public Rhombus(double x, double y, double diagonal1, double diagonal2) {
        super(x, y);
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    @Override
    public double calculateArea() {
        return (diagonal1 * diagonal2) / 2;
    }
}
