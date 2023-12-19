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
                    "value=" + value +"}"+
                    "{"+ ", next=" + next +
                    '}';
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

    private  final class NumberQueueIterator  implements Iterator<T> {
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
            throw new IllegalStateException("Queue is empty");
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
            if (temp == null) {
                System.out.println("Debug: Unexpected null node at index " + i);
                throw new IllegalStateException("Unexpected null node encountered during toArray");
            }
            result[i] = temp.value;
            temp = temp.next;
        }

        return result;
    }


    @Override
    public int size() {
        return size;
    }
    @Override
    public void sort() {
        if (isEmpty() || size == 1) {
            return;
        }
        Node<T> current = front;
        Node<T> previous = null;
        while (current != null) {
            Node<T> next = current.next;
            Node<T> minNode = current;
            for (Node<T> temp = current.next; temp != null; temp = temp.next) {
                if (minNode.value.compareTo(temp.value) > 0) {
                    minNode = temp;
                }
            }
            if (minNode != current) {
                if (previous == null) {
                    front = minNode;
                } else {
                    previous.next = minNode;
                }

                T tempValue = current.value;
                current.value = minNode.value;
                minNode.value = tempValue;
            }

            previous = current;
            current = next;
        }

        rear = previous;
    }
    @Override
    public void set(int index, T value) {
        if (index < 0 || index >= size) {
            return;
        }
        Node<T> current = front;
        for (int i = 0; i < index; i++) {
            if (current == null) {
                throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
            }
            current = current.next;
        }
        if (current != null) {
            current.value = value;
        } else {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
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

