package View.src.test.java.Factory;



public class CrossoverFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Car("Crossover", "Green", 2023);
    }
}
