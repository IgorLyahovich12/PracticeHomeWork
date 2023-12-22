package edu.igor.hw15_1SecondTask;


public abstract class Employee {
    protected String name;
    protected String ID;
    protected String position;
    protected long phoneNumber;

    // Конструктор
    public Employee(String name, String ID, String position, long phoneNumber) {
        this.name = name;
        this.ID = ID;
        this.position = position;
        this.phoneNumber = phoneNumber;
    }

    // Додатковий метод
    public void printEmployeeInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + ID);
        System.out.println("Position: " + position);
        System.out.println("Phone Number: " + phoneNumber);
    }

    public abstract double calculateMoney(); // Абстрактний метод для розрахунку заробітної плати
}