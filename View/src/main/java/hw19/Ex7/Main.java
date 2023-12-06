package hw19.Ex7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Створення екземпляру класу Print
        Print<Integer> printer = new Print<>();

        // Створення списку і його заповнення
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // Виклик методу print
        printer.print(numbers);
    }
}