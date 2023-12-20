package edu.igor.hw20;

public interface List<T> {
    void add(T element);
    void addAll(T[] array);
    void add(Integer index, T element);
    T get(int index);
    T get();
    T getLast();
    void remove(int index);
    Object[] toArray();
    boolean replace(int index,T newValue);
    int size();

    boolean replaceAll(T[] newArray);
}

