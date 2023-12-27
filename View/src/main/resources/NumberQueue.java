package View.src.main.resources;

import java.util.*;

public class NumberQueue<T extends Comparable<T>> implements Queue<T> {
    private static final class Node<T> {
        T value;
        Node<T> next;

        public Node(T value) {
            this.value = value;
            this.next = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +"}"+
                    "{"+ ", next=" + next +
                    '}';
        }
    }
    private Comparator<T> reverseQueueComparator() {
        return new ReversedQueueComparator();
    }

    private Comparator<T> QueueComparator() {
        return new QueueComparator();
    }

    private  final class QueueComparator implements Comparator<T> {
            @Override
            public int compare(T obj1, T obj2) {

                return obj1.compareTo(obj2);
            }

            @Override
            public Comparator<T> reversed() {

                return new ReversedQueueComparator();

            }
        }
    private  final class ReversedQueueComparator implements Comparator<T> {
        @Override
        public int compare(T obj1, T obj2) {

            return obj2.compareTo(obj1);
        }

        @Override
        public Comparator<T> reversed() {


            return new QueueComparator();

        }
    }
    private Node<T> front;
    private Node<T> rear;
    private int size;

    public NumberQueue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }



    @Override
    public void enqueue(T element) {
        Node<T> newNode = new Node<>(element);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    private boolean isEmpty() {
        return size == 0;
    }
    private  void  checkListIsEmpty(){
        if(isEmpty()){
            System.out.println("list is empty");
        }
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty. Cannot dequeue.");
        }

        Node<T> temp = front;
        if (size == 1) {
            front = rear = null;
        } else {
            front = front.next;
            temp.next = null;
        }
        size--;

        return temp.value;
    }

    @Override
    public T peek() {
        checkListIsEmpty();
        return front.value;
    }

    @Override
    public Object[] toArray() {
        checkListIsEmpty();
        Object[] result = new Object[size];
        Node<T> temp = front;
        for (int i = 0; i < size; i++) {
            result[i] = temp.value;
            temp = temp.next;
        }
        return result;

    }


    @Override
    public int size() {
        return size;
    }
    @SuppressWarnings("unchecked")
    @Override
    public void sort(Comparator<? super T> c) {
        Object[] elementsArray = toArray();
        Arrays.sort(elementsArray, (Comparator<? super Object>) c);
        for (Object element : elementsArray) {
            enqueue((T) element);
        }
    }
    @Override
    public void set(int index, T value) {
        if (index < 0 || index >= size) {
            return;
        }
        Node<T> current = front;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.value = value;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NumberQueue<?> that)) return false;
        return size == that.size && Objects.equals(front, that.front) && Objects.equals(rear, that.rear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(front, rear, size);
    }

    @Override
    public String toString() {
        return "NumberQueue{" +
                "front=" + front +
                ", rear=" + rear +
                ", size=" + size +
                '}';
    }
}
