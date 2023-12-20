package View.src.test.java.Factory;



public class SUVFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Car("SUV", "Red", 2023);
    }
}
