package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {

private static final Logger LOGGER= LoggerFactory.getLogger("Main class");
    public static void main(String[] args) {

        NumberQueue<Integer> numberQueue = new NumberQueue<>();


        numberQueue.enqueue(12);
        numberQueue.enqueue(5);
        numberQueue.enqueue(535);
        numberQueue.enqueue(24);
        numberQueue.enqueue(17);
        numberQueue.enqueue(5212);
        numberQueue.enqueue(5352);
        numberQueue.enqueue(241);
        System.out.println("Initial Queue:");
        System.out.println(" Queue:" + numberQueue);
        // numberQueue.sort();
        System.out.println("Sort Queue:" + numberQueue);
        System.out.println("Initial Queue:");
        System.out.println(numberQueue);
        numberQueue.set(3, 30);


        Integer dequeuedElement = numberQueue.dequeue();
        System.out.println("Dequeued: " + dequeuedElement);
        NumberQueue<Integer> numberQueue1 = new NumberQueue<>();
        try {
            for (Object o : numberQueue1) {
                System.out.println(o);
            }
        }catch (NoSuchElementException e){
            LOGGER.error("Queue not be empty");
        }

        System.out.println("Peeked: " + numberQueue.peek());


        System.out.println("Updated Queue:");
        System.out.println(numberQueue);


        Object[] array = numberQueue.toArray();
        System.out.println("Array: " + Arrays.toString(array));

        numberQueue.forEach(System.out::println);

        numberQueue.stream()
                .filter(number -> number > 100 && number < 1000)
                .forEach(System.out::println);



    }

}


