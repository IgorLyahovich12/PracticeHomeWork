package hw19.Ex6;

public class Ex6 {
    public static <T extends Comparable<T>>
    int findFirstGreaterThan(T[] array, T element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(element) > 0) {
                return i;  // Повертаємо індекс першого елемента, більшого за заданий елемент
            }
        }
        return -1;  // Повертаємо -1, якщо не знайдено жодного елемента, більшого за заданий елемент
    }
}