package View.src.hw19.Ex3;

public class Array {

    public static <T> void swap(T[] array, int index1, int index2) {
        if (array == null || index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length || index1 == index2) {
            throw new IllegalArgumentException("Invalid indices for swap: " + index1 + ", " + index2);
        }

        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}