package View.lib;

import java.util.*;

public class NumberQueue<T extends Comparable<T>> implements Queue<T> {


    @Override
    public Iterator<T> iterator() {
        return new NumberQueueIterator();
    }

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
                    "value=" + value + "}" +
                    "{" + ", next=" + next +
                    '}';
        }
    }

    private final class NumberQueueIterator implements Iterator<T> {
        private int index;
        Node<T> current;

        public NumberQueueIterator() {
            this.index = 0;
            this.current = front;
        }

        @Override
        public boolean hasNext() {
            if (Objects.isNull(current)) {
                throw new NoSuchElementException("list is empty");
            }
            return Objects.nonNull(current.next);
        }

        @Override
        public T next() {
            if (index == 0) {
                index++;
                return current.value;
            }
            current = current.next;
            index++;
            return current.value;
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

    private void checkListIsEmpty() {
        if (isEmpty()) {
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
        front = rear = null;
        size = 0;
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