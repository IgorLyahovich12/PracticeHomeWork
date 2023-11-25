package edu.igor.hw20;
public class LinkedList<T> implements List<T> {

    private int size;

    private static class Node<T> {
        T value;
        Node<T> previous;
        Node<T> next;

        public Node(T value) {
            this.value = value;
        }

        public void setValue(T value) {
            this.value = value;
        }
    }

    private Node<T> head;
    private Node<T> tail;

    private T moveFromTail(Node<T> temp, int index) {
        for (int i = size - 1; i > index; i--) {
            temp = temp.previous;
        }
        return temp.value;

    }

    private T moveFromHead(Node<T> temp, int index) {
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.value;
    }

    private Node<T> getNode(Node<T> temp, int index) {
        for (int i = 0; i < index; i++) {
            temp = (index <= size / 2) ? temp.next : temp.previous;
        }
        return temp;
    }

    public int size() {
        int count = 0;
        Node<T> current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    @Override
    public void add(T value) {
        Node<T> newNode = new Node<>(value);
        if (size == 0) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
        size++;
    }

    @Override
    public void addAll(T[] array) {
        for (T element : array) {
            add(element);
        }
    }

    @Override
    public void add(Integer index, T element) {
        if (index < 0 || index > size) {
            System.err.println("Invalid index");
            return;
        }

        Node<T> newNode = new Node<>(element);

        if (index == 0) {
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
            if (size == 0) {
                tail = newNode;
            }
        } else if (index == size) {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        } else {
            Node<T> temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            newNode.previous = temp;
            temp.next.previous = newNode;
            temp.next = newNode;
        }

        size++;
    }

    @Override
    public T get(int index) {
        Node<T> temp;
        T result;
        if (index < 0) {
            System.err.println("Index must be positive");
            System.exit(1);
        }

        if (index >= size) {
            System.err.println("Index must be less than size");
            System.exit(1);
        }

        if (index <= size / 2) {
            temp = head;
            result = moveFromHead(temp, index);
        } else {
            temp = tail;
            result = moveFromTail(temp, index);
        }
        return result;
    }

    @Override
    public T get() {
        if (size > 0) {
            return head.value;
        } else {
            System.err.println("List is empty");
            System.exit(1);
            return null;
        }
    }

    @Override
    public T getLast() {
        if (size > 0) {
            return tail.value;
        } else {
            System.err.println("List is empty");
            System.exit(1);
            return null;
        }
    }

    @Override
    public Object[] toArray() {
        Node<T> temp = head;
        Object[] tempArray = new Object[size];
        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = temp.value;
            temp = temp.next;
        }
        return tempArray;
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.err.println("Index out of bounds");
            return;
        }
        // Якщо розмір списку - 1 (список має лише один елемент), то обнулити початок і кінець списку
        if (size == 1) {
            head = tail = null;
        } else if (index == 0) {
            // Якщо індекс - 0, то зсунути початок наступного елементу і обнулити попередній вказівник
            head = head.next;
            head.previous = null;
        } else if (index == size - 1) {
            // Якщо індекс - останній, то зсунути кінець на попередній елемент і обнулити вказівник наступного
            tail = tail.previous;
            tail.next = null;
        } else {
            // Інакше, якщо індекс не на початку і не вкінці, треба пройтися по списку до вказаного індексу
            Node<T> temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            // Видалення елементу з середини: попередній елемент вказує на наступний, а наступний - на попередній
            temp.previous.next = temp.next;
            temp.next.previous = temp.previous;
        }

        size--;
    }

    @Override
    public boolean replace(int index, T newValue) {
        Node<T> temp;

        if (index < 0 || index >= size()) {
            System.out.println("Індекс повинен бути в межах від 0 до " + (size() - 1));
            return false;
        }

        Node<T> current = head;
        if (index <= size / 2) {
            temp = head;
            getNode(temp, index).setValue(newValue);
        } else {
            temp = tail;
            getNode(temp, index).setValue(newValue);
        }
        return true;
    }

    @Override
    public boolean replaceAll(T[] newArray) {
        while (size > 0) {
            remove(0);
        }

        addAll(newArray);

        return true;
    }
}