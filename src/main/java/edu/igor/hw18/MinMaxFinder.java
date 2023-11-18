package edu.igor.hw18;

public interface MinMaxFinder<T extends Number> {
    T findMin(T[] array);
    T findMax(T[] array);
}