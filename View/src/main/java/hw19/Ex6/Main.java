package hw19.Ex6;

public class Main {
    public static void main(String[] args) {
        // Приклад з числами
        Integer[] intArray = {1, 5, 3, 7, 2};
        int index1 = Ex6.findFirstGreaterThan(intArray, 4);
        System.out.println("Index of first element greater than 4: " + index1);

        // Приклад зі строками
        String[] stringArray = {"apple", "banana", "orange", "grape"};
        int index2 = Ex6.findFirstGreaterThan(stringArray, "cherry");
        System.out.println("Index of first element greater than 'cherry': " + index2);
    }
}
