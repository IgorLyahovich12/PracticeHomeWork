package org.example;

import java.util.Comparator;
import java.util.stream.Stream;

public interface Queue<T extends Comparable<T>> extends Iterable<T> {
    void enqueue(T element);
    T dequeue();
    T peek();
    Object[] toArray();
    int size();
    void set(int index, T value);
    void sort(Comparator<? super T> c);
    Stream<T> stream();



}