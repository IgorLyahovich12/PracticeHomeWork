package View.src.hw19.Ex3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Приклад використання
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Початковий масив: " + Arrays.toString(intArray));

        // Обмін позиціями елементів з індексами 1 і 3
        Array.swap(intArray, 1, 3);
        System.out.println("Масив після обміну: " + Arrays.toString(intArray));
    }
}

