package edu.igor.hw15.SecondTask;

public class CommissionEmployee extends Employee {//працівників із відсотковою винагородою
    private final double salesAmount;
    private final double commissionRate;

    // Конструктор
    public CommissionEmployee(String name, String ID, String position, long phoneNumber, double salesAmount, double commissionRate) {
        super(name, ID, position, phoneNumber);
        this.salesAmount = salesAmount;
        this.commissionRate = commissionRate;
    }

    // Метод для обчислення зарплати
    @Override
    public double calculateMoney() {
        return salesAmount * commissionRate;
    }
}