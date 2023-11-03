package edu.igor.hw16;

public class Main {
    public static void main(String[] args) {
        // Створення ноутбуку і виклик методів
        Laptop laptop = new Laptop("Lenovo", "ThinkPad", 1000);
        laptop.buyLaptop();
        laptop.getComputerInfo();
        laptop.buyAccessories();
        laptop.selectAccessories(2500);

        // Створення настільного комп'ютера і виклик методів
        DesktopComputer desktop = new DesktopComputer("Dell", "XPS", 1500);
        desktop.buyComputer();
        desktop.getComputerInfo();
        desktop.buyAccessories();
        desktop.selectAccessories(5000);

        // Створення планшета і виклик методів
        Tablet tablet = new Tablet("Apple", "iPad", 800);
        tablet.buyLaptop();
        tablet.getComputerInfo();
        tablet.buyAccessories();
        tablet.selectAccessories(1000);
    }
}