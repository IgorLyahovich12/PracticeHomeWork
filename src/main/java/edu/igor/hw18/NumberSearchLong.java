package edu.igor.hw18;

public class NumberSearchLong implements NumberSearch<Long> {

    @Override
    public Long findMax(Long[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        Long max = array[0];
        for (int i = 1; i < array.length; i++) {
            Long element = array[i];
            if (element > max) {
                max = element;
            }
        }

        return max;
    }

    @Override
    public Long findMin(Long[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        Long min = array[0];
        for (int i = 1; i < array.length; i++) {
            Long element = array[i];
            if (element < min) {
                min = element;
            }
        }

        return min;
    }
}