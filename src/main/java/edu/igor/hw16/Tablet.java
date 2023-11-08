package edu.igor.hw16;

import java.util.ArrayList;
import java.util.List;

public class Tablet extends Computer implements Store {
    private final List<String> selectedAccessories = new ArrayList<>();
    public Tablet(String brand, String model, double price) {
        super(brand, model, price);
    }

    @Override
    public void getComputerInfo() {
        System.out.println("Планшет: Бренд - " + brand + ", Модель - " + model + ", Ціна - " + price);
        System.out.println("Характеристики планшета:");
        System.out.println("Діагональ екрану: 10.1 дюймів");
        System.out.println("Роздільна здатність екрану: 1920x1200 пікселів");
        System.out.println("Процесор: Qualcomm Snapdragon 855");
        System.out.println("Оперативна пам'ять: 4 ГБ");
        System.out.println("Зберігання: 64 ГБ вбудованої пам'яті");
        System.out.println("Батарея: 6000 мАг");
    }


    @Override
    public void selectAccessories(double budget) {
        if (budget < 300) {
            System.out.println("Недостатній бюджет для підбору комплектуючих.");
            return;
        }

        // Підбір комплектуючих на основі бюджету
        if (budget >= 300 && budget < 1000) {
            selectedAccessories.add("Мишка");
        } else if (budget >= 1000 ) {
            selectedAccessories.add("Мишка");
            selectedAccessories.add("Підставка");
        }

    }

    @Override
    public void buyComputer() {
        System.out.println("Покупка планшета,з такими характеристиками:");
        getComputerInfo();
    }

    @Override
    public void buyAccessories() {
        System.out.println("Покупка комплектуючих для планшета");
        for (String accessory : selectedAccessories) {
            System.out.println(accessory);
        }


    }
}