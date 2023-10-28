package edu.igor.hw15.SecondTask;

public class SalariedEmployee extends Employee {//щомісячні працівників
    private final double monthlySalary;

    // Конструктор
    public SalariedEmployee(String name, String ID, String position, long phoneNumber, double monthlySalary) {
        super(name, ID, position, phoneNumber);
        this.monthlySalary = monthlySalary;
    }

    // Метод для обчислення зарплати
    @Override
    public double calculateMoney() {
        return monthlySalary;
    }
}