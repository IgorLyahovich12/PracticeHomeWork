package edu.igor.hw15.FirstTask;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[3];

        figures[0] = new Circle(0, 0, 5.0);
        figures[1] = new Rectangle(0, 0, 4.0, 6.0);
        figures[2] = new Rhombus(0, 0, 3.0, 4.0);

        for (Figure figure : figures) {
            double area = figure.calculateArea();
            figure.displayInfo();
            System.out.println("Площа: " + area);
            System.out.println();
        }
    }
}