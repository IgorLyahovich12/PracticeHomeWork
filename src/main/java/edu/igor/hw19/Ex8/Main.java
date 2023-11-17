package edu.igor.hw19.Ex8;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Приклад використання
        List<Integer> integerList = List.of(5, 2, 8, 1, 7, 3, 9, 4, 6);
        int start = 2;
        int end = 7;

        Integer maxInteger = MaxElementFinder.findMax(integerList, start, end);

        if (maxInteger != null) {
            System.out.println("Максимальний елемент у діапазоні [" + start + ", " + end + ") це: " + maxInteger);
        } else {
            System.out.println("Помилка пошуку максимального елемента. Перевірте вхідні параметри.");
        }
    }
}
