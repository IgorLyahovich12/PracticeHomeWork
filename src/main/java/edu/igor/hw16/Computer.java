package edu.igor.hw16;

public abstract class Computer {
    // Поля для характеристик комп'ютера
    protected String brand;
    protected String model;
    protected double price;

    // Конструктор класу "Комп'ютер"
    public Computer(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    // Абстрактний метод для отримання інформації щодо характеристик комп'ютера
    public abstract void getComputerInfo();

    // Метод для підбору комплектуючих під визначену вартість
    public abstract void selectAccessories(double budget);

    // Внутрішні класи для композиції комплектуючих
    public static class Memory {
        // Реалізація класу для оперативної пам'яті
        protected int capacity; // Обсяг оперативної пам'яті в гігабайтах

        public Memory(int capacity) {
            this.capacity = capacity;
        }
    }

    public static class Processor {
        // Реалізація класу для процесора
        protected String type; // Тип процесора (наприклад, Intel Core i7)

        public Processor(String type) {
            this.type = type;
        }
    }

    public static class StorageDevice {
        // Реалізація класу для пристрою для постійного зберігання даних
        protected String type; // Тип пристрою для зберігання даних (наприклад, SSD або HDD)
        protected int capacity; // Обсяг зберігання в гігабайтах

        public StorageDevice(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }
    }

    public static class Motherboard {
        // Реалізація класу для материнської плати
        protected String chipset; // Чіпсет материнської плати

        public Motherboard(String chipset) {
            this.chipset = chipset;
        }
    }
}