package edu.igor.hw20;

public interface Queue<T> {
        void enqueue(T element);
        T dequeue();
        T peek();
        Object[] toArray();
        int size();
    }

