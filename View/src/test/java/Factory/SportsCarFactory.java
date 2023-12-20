package View.src.test.java.Factory;



public class SportsCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Car("Sports Car", "Yellow", 2023);
    }
}
