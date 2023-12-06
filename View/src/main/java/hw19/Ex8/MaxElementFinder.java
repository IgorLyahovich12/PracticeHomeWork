package hw19.Ex8;

import java.util.List;

public class MaxElementFinder {
    public static <T extends Comparable<T>> T findMax(List<T> list, int start, int end) {
        if (list == null || list.isEmpty() || start < 0 || end > list.size() || start >= end) {
            System.out.println("Недійсні вхідні параметри");
            return null;
        }

        T max = list.get(start);
        for (int i = start + 1; i < end; i++) {
            T currentElement = list.get(i);
            if (currentElement.compareTo(max) > 0) {
                max = currentElement;
            }
        }

        return max;
    }
}
