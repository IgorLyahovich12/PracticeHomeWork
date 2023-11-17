package edu.igor.hw19.Ex3;

public class Array {

    public static <T> void swap(T[] array, int index1, int index2) {
        if (array == null || index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length || index1 == index2) {
            // Додаткова перевірка на коректність індексів та на різність індексів
            System.out.println("Неправильні індекси або індекси однакові. Обмін не відбувся.");
            return;
        }

        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}