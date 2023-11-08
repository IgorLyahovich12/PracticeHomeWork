package edu.igor.hw16;

public class Main {
    public static void main(String[] args) {
        // Створення ноутбуку і виклик методів
        Laptop laptop = new Laptop("Lenovo", "ThinkPad", 1000);
        laptop.buyComputer();
        laptop.selectAccessories(2000);
        laptop.buyAccessories();

        // Створення настільного комп'ютера і виклик методів
        DesktopComputer desktop = new DesktopComputer("Dell", "XPS", 1500);
        desktop.buyComputer();
        desktop.selectAccessories(3000);
        desktop.buyAccessories();

        // Створення планшета і виклик методів
        Tablet tablet = new Tablet("Apple", "iPad", 800);
        tablet.buyComputer();
        tablet.selectAccessories(1000);
        tablet.buyAccessories();
    }
}