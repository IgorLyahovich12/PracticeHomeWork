package edu.igor.hw15.SecondTask;

public class HourlyEmployee extends Employee {//погодинні працівники
    private final double hourlyRate;
    private final int hoursWorked;

    // Конструктор
    public HourlyEmployee(String name, String ID, String position, long phoneNumber, double hourlyRate, int hoursWorked) {
        super(name, ID, position, phoneNumber);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Метод для обчислення зарплати
    @Override
    public double calculateMoney() {
        return hourlyRate * hoursWorked;
    }
}
