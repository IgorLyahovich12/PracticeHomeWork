package edu.igor.hw18;

public class Main {
    public static void main(String[] args) {
        // Example for Integer
        NumberSearch<Integer> integerSearch = new NumberSearchImpl();
        Integer[] intArray = {3, 1, 4, 1, 5, 9, 2, 6};
        Integer maxInt = integerSearch.findMax(intArray);
        Integer minInt = integerSearch.findMin(intArray);
        System.out.println("Max Integer: " + maxInt);
        System.out.println("Min Integer: " + minInt);

        // Example for Double
        NumberSearch<Double> doubleSearch = new NumberSearchDouble();
        Double[] doubleArray = {3.14, 2.71, 1.618, 0.577, 2.0, 1.0};
        Double maxDouble = doubleSearch.findMax(doubleArray);
        Double minDouble = doubleSearch.findMin(doubleArray);
        System.out.println("Max Double: " + maxDouble);
        System.out.println("Min Double: " + minDouble);

        // Example for Long
        NumberSearch<Long> longSearch = new NumberSearchLong();
        Long[] longArray = {100L, 42L, 789L, 123L, 56L};
        Long maxLong = longSearch.findMax(longArray);
        Long minLong = longSearch.findMin(longArray);
        System.out.println("Max Long: " + maxLong);
        System.out.println("Min Long: " + minLong);
    }
}