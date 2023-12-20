package View.src.test.java.Factory;



public class SedanFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Car("Sedan", "Blue", 2023);
    }
}
