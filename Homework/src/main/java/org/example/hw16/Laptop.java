package org.example.hw16;

import java.util.ArrayList;
import java.util.List;

public class Laptop extends Computer implements Store {
    private final List<String> selectedAccessories = new ArrayList<>();

    public Laptop(String brand, String model, double price) {
        super(brand, model, price);
    }

    @Override
    public void getComputerInfo() {
        System.out.println("Ноутбук: Бренд - " + brand + ", Модель - " + model + ", Ціна - " + price);
        System.out.println("Характеристики ноутбука:");
        System.out.println("Процесор: " + new Processor("Intel Core i5").type);
        System.out.println("Оперативна пам'ять: " + new Memory(8).capacity + " ГБ");
        System.out.println("Зберігання: " + new StorageDevice("SSD", 256).type + ", " + new StorageDevice("HDD", 1000).capacity + " ГБ");
        System.out.println("Материнська плата: " + new Motherboard("Integrated").chipset);
    }

    @Override
    public void selectAccessories(double budget) {
        if (budget < 300) {
            System.out.println("Недостатній бюджет для підбору комплектуючих.");
            return;
        }

        // Підбір комплектуючих на основі бюджету
        if (budget >= 300 && budget < 500) {
            selectedAccessories.add("Мишка");
        } else if (budget >= 500 && budget < 800) {
            selectedAccessories.add("Мишка");
            selectedAccessories.add("Клавіатура");
        } else {
            selectedAccessories.add("Мишка");
            selectedAccessories.add("Клавіатура");
            selectedAccessories.add("Зовнішній монітор");
        }

    }
    @Override
    public void buyComputer() {
        System.out.println("Покупка ноутбука,з такими характеристиками:");
        getComputerInfo();
    }

    @Override
    public void buyAccessories() {
        System.out.println("Покупка комплектуючих для ноутбука ");
        for (String accessory : selectedAccessories) {
            System.out.println(accessory);
        }


    }
}