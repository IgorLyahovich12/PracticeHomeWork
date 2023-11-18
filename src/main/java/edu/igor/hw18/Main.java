package edu.igor.hw18;

public class Main {
    public static void main(String[] args) {

        Integer[] intArray = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};
        MinMaxFinder<Integer> intMinMaxFinder = new NumberSearchImpl<>();
        System.out.println("Min Integer: " + intMinMaxFinder.findMin(intArray));
        System.out.println("Max Integer: " + intMinMaxFinder.findMax(intArray));

        Double[] doubleArray = {3.14, 2.71, 1.618, 0.577, 2.718};
        MinMaxFinder<Double> doubleMinMaxFinder = new NumberSearchImpl<>();
        System.out.println("Min Double: " + doubleMinMaxFinder.findMin(doubleArray));
        System.out.println("Max Double: " + doubleMinMaxFinder.findMax(doubleArray));

        Long[] longArray = {100L, 200L, 300L, 400L, 500L};
        MinMaxFinder<Long> longMinMaxFinder = new NumberSearchImpl<>();
        System.out.println("Min Long: " + longMinMaxFinder.findMin(longArray));
        System.out.println("Max Long: " + longMinMaxFinder.findMax(longArray));
    }
}