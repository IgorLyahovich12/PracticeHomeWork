package edu.igor.hw19.Ex3;

import java.util.Arrays;

import static edu.igor.hw19.Ex3.Array.swap;

public class main {
    public static void main(String[] args) {
        // Приклад використання
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Початковий масив: " + Arrays.toString(intArray));

        // Обмін позиціями елементів з індексами 1 і 3
        swap(intArray, 1, 3);
        System.out.println("Масив після обміну: " + Arrays.toString(intArray));
    }
}

