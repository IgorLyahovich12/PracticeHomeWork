package View.src.test.java.Factory;

public class MainFactory {
    public static void main(String[] args) {
        CarFactory sedanFactory = new SedanFactory();
        Car sedan = sedanFactory.createCar();
        System.out.println("Sedan: " + sedan.getModel() + ", " + sedan.getColor() + ", " + sedan.getYear());

        CarFactory suvFactory = new SUVFactory();
        Car suv = suvFactory.createCar();
        System.out.println("SUV: " + suv.getModel() + ", " + suv.getColor() + ", " + suv.getYear());

        CarFactory crossoverFactory = new CrossoverFactory();
        Car crossover = crossoverFactory.createCar();
        System.out.println("Crossover: " + crossover.getModel() + ", " + crossover.getColor() + ", " + crossover.getYear());

        CarFactory sportsCarFactory = new SportsCarFactory();
        Car sportsCar = sportsCarFactory.createCar();
        System.out.println("Sports Car: " + sportsCar.getModel() + ", " + sportsCar.getColor() + ", " + sportsCar.getYear());
    }
}
