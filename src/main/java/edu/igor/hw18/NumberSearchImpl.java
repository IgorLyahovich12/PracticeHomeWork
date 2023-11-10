package edu.igor.hw18;
public class NumberSearchImpl implements NumberSearch<Integer> {
    @Override
    public Integer findMax(Integer[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        Integer max = array[0];
        for (int i = 1; i < array.length; i++) {
            Integer element = array[i];
            if (element > max) {
                max = element;
            }
        }

        return max;
    }

    @Override
    public Integer findMin(Integer[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        Integer min = array[0];
        for (int i = 1; i < array.length; i++) {
            Integer element = array[i];
            if (element < min) {
                min = element;
            }
        }

        return min;
    }
}