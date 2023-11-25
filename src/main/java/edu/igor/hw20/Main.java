package edu.igor.hw20;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> myList = new LinkedList<>();

        // Adding elements
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);
        myList.add(50);
        myList.add(60);

        int elementAtIndex1 = myList.get(1);
        System.out.println("Element at index 1: " + elementAtIndex1);


        int firstElement = myList.get();
        System.out.println("First element: " + firstElement);


        int lastElement = myList.getLast();
        System.out.println("Last element: " + lastElement);

        System.out.println("Initial LinkedList: " + Arrays.toString(myList.toArray()));


        myList.replace(1, 25);


        System.out.println("LinkedList after replacement: " + Arrays.toString(myList.toArray()));


        myList.remove(0);


        System.out.println("LinkedList after removal: " + Arrays.toString(myList.toArray()));


        Integer[] newArray = {40, 50, 60};


        myList.replaceAll(newArray);


        System.out.println("LinkedList after replaceAll: " + Arrays.toString(myList.toArray()));



        NumberQueue<Integer> numberQueue = new NumberQueue<>();


        numberQueue.enqueue(1);
        numberQueue.enqueue(2);
        numberQueue.enqueue(3);
        numberQueue.enqueue(4);


        System.out.println("Initial Queue:");
        System.out.println(numberQueue);


        Integer dequeuedElement = numberQueue.dequeue();
        System.out.println("Dequeued: " + dequeuedElement);


        System.out.println("Peeked: " + numberQueue.peek());


        System.out.println("Updated Queue:");
        System.out.println(numberQueue);


        Object[] array = numberQueue.toArray();
        System.out.println("Array: " + Arrays.toString(array));
    }
}