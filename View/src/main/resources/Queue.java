package View.src.main.resources;


public interface Queue<T> {
    void enqueue(T element);
    T dequeue();
    T peek();
    Object[] toArray();
    int size();
    void sort();
    void set(int index, T value);


}

