package edu.igor.hw15_1SecondTask;

public class Main {
    public static void main(String[] args) {
        // Створення об'єктів різних типів працівників
        HourlyEmployee hourlyEmployee = new HourlyEmployee("John Doe", "001", "Hourly Worker", 1234567890, 15.0, 40);
        SalariedEmployee salariedEmployee = new SalariedEmployee("Alice Smith", "002", "Manager", 876543210, 3000.0);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Bob Johnson", "003", "Sales Rep", 555555555, 50000.0, 0.05);

        // Виведення інформації про працівників
        System.out.println("Hourly Employee:");
        hourlyEmployee.printEmployeeInfo();
        System.out.println("Salary: $" + hourlyEmployee.calculateMoney());

        System.out.println("\nSalaried Employee:");
        salariedEmployee.printEmployeeInfo();
        System.out.println("Salary: $" + salariedEmployee.calculateMoney());

        System.out.println("\nCommission Employee:");
        commissionEmployee.printEmployeeInfo();
        System.out.println("Salary: $" + commissionEmployee.calculateMoney());
    }
}
