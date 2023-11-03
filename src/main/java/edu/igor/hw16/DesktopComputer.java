package edu.igor.hw16;

import java.util.ArrayList;
import java.util.List;

public class DesktopComputer extends Computer implements Store {
    private final List<String> selectedAccessories = new ArrayList<>();

    public DesktopComputer(String brand, String model, double price) {
        super(brand, model, price);
    }

    @Override
    public void getComputerInfo() {
        System.out.println("Настільний комп'ютер: Бренд - " + brand + ", Модель - " + model + ", Ціна - " + price);
        System.out.println("Характеристики комп'ютера:");
        System.out.println("Процесор: " + new Processor("Intel Core i7").type);
        System.out.println("Оперативна пам'ять: " + new Memory(16).capacity + " ГБ");
        System.out.println("Зберігання: " + new StorageDevice("SSD", 512).type + ", " + new StorageDevice("HDD", 2000).capacity + " ГБ");
        System.out.println("Материнська плата: " + new Motherboard("Intel Z490").chipset);
    }

    @Override
    public void selectAccessories(double budget) {
        if (budget < 1200) {
            System.out.println("Недостатній бюджет для підбору комплектуючих.");
            return;
        }

        // Створення об'єктів периферичних пристроїв
        Printer printer = new Printer("Epson");
        Scanner scanner = new Scanner("Canon");
        Router router = new Router("Linksys");

        // Підбір комплектуючих на основі бюджету
        if (budget >= 1200 && budget < 1500) {
            selectedAccessories.add(printer.toString());
        } else if (budget >= 1500 && budget < 5000) {
            selectedAccessories.add(printer.toString());
            selectedAccessories.add(scanner.toString());
        } else {
            selectedAccessories.add(printer.toString());
            selectedAccessories.add(scanner.toString());
            selectedAccessories.add(router.toString());
        }

        System.out.println("Підібрані комплектуючі для Комп'ютера з бюджетом " + budget + ":");
        for (Object accessory : selectedAccessories) {
            if (accessory instanceof String) {
                System.out.println(accessory);
            } else if (accessory instanceof Printer) {
                System.out.println("Принтер " + ((Printer) accessory).getModel());
            } else if (accessory instanceof Scanner) {
                System.out.println("Сканер " + ((Scanner) accessory).getModel());
            } else if (accessory instanceof Router) {
                System.out.println("Роутер " + ((Router) accessory).getModel());
            }
        }
    }

    @Override
    public void buyLaptop() {
        System.out.println("Покупка ноутбука");
    }
    @Override
    public void buyComputer() {
        System.out.println("Покупка комп'ютера");
    }

    @Override
    public void buyAccessories() {
        System.out.println("Покупка комплектуючих");
    }

}