package edu.igor.hw18;

public class NumberSearchDouble implements NumberSearch<Double> {

    @Override
    public Double findMax(Double[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        Double max = array[0];
        for (int i = 1; i < array.length; i++) {
            Double element = array[i];
            if (element > max) {
                max = element;
            }
        }

        return max;
    }

    @Override
    public Double findMin(Double[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        Double min = array[0];
        for (int i = 1; i < array.length; i++) {
            Double element = array[i];
            if (element < min) {
                min = element;
            }
        }

        return min;
    }
}