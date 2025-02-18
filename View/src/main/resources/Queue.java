package View.src.main.resources;

import java.util.Comparator;

public interface Queue<T> {
    void enqueue(T element);
    T dequeue();
    T peek();
    Object[] toArray();
    int size();
    void set(int index, T value);
    void sort(Comparator<? super T> c);

}

