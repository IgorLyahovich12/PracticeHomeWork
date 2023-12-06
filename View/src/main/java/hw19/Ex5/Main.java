package hw19.Ex5;

public class Main {
    public static void main(String[] args) {
        // Створюємо об'єкт класу Pair зі строковим ключем і цілим значенням
        Pair<String, Integer> myPair = new Pair<>("age", 25);

        // Отримуємо значення за ключем
        String key = myPair.getKey();
        Integer value = myPair.getValue();

        // Виводимо отримані значення
        System.out.println("Key: " + key);
        System.out.println("Value: " + value);

        // Змінюємо значення за ключем
        myPair.setValue(30);

        // Отримуємо змінене значення
        value = myPair.getValue();

        // Виводимо змінене значення
        System.out.println("Updated Value: " + value);
    }
}
