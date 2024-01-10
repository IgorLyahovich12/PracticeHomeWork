package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    private NumberQueue<Integer> testNumberQueue;

    @BeforeEach
    void setup() {
        testNumberQueue = new NumberQueue<>();
        testNumberQueue.enqueue(3);
        testNumberQueue.enqueue(4);
        testNumberQueue.enqueue(5);
        testNumberQueue.enqueue(1);
        testNumberQueue.enqueue(2);
        testNumberQueue.enqueue(8);
        testNumberQueue.enqueue(9);
        testNumberQueue.enqueue(12);
        testNumberQueue.enqueue(6);
    }

    @Test
    void enqueue_EnqueueElementToQueue_NewElement() {
        // Arrange
        final Integer[] arr = {3, 4, 5, 1, 2, 8, 9, 12, 6, 10};
        NumberQueue<Integer> expected = new NumberQueue<>();

        // Act
        for (Integer element : arr) {
            expected.enqueue(element);
        }
        testNumberQueue.enqueue(10);

        // Assert
        assertIterableEquals(expected, testNumberQueue);
    }

    @Test
    void Dequeue_DequeueElementByIndexFromQueue_DeleteLastElement() {
        // Arrange
        final Integer[] arr = {4, 5, 1, 2, 8, 9, 12,6};
        NumberQueue<Integer> expected = new NumberQueue<>();

        // Act
        for (Integer element : arr) {
            expected.enqueue(element);
        }
        testNumberQueue.dequeue();

        // Assert
        assertIterableEquals(expected, testNumberQueue);
    }

    @Test
    void peek_PeekFirstElement_FirstElementInQueue() {
        // Arrange
        Integer expected = 3;

        // Act
        Integer result = testNumberQueue.peek();

        // Assert
        assertEquals(expected, result);
    }

    @Test
    void toArray_ChangedQueueToArray_NewArray() {
        // Arrange
        final Integer[] expectedArray = {3, 4, 5, 1, 2, 8, 9, 12, 6};

        // Act
        Object[] resultArray = testNumberQueue.toArray();

        // Assert
        assertArrayEquals(expectedArray, resultArray);
    }

    @Test
    void size_GetSizeQueue_Size() {
        // Arrange
        int expectedSize = 9;

        // Act
        int resultSize = testNumberQueue.size();

        // Assert
        assertEquals(expectedSize, resultSize);
    }

    @Test
    void set_SettingAnotherValueInTheQueue_NewValue() {
        // Arrange
        final Integer[] arr = {3, 4, 5, 1, 2, 8, 9, 12, 7};
        NumberQueue<Integer> expected = new NumberQueue<>();

        // Act
        for (Integer element : arr) {
            expected.enqueue(element);
        }
        testNumberQueue.set(8, 7);

        // Assert
        assertIterableEquals(expected, testNumberQueue);
    }
    @Test
    void stream_SortingQueue_ReturnsSortedArray() {
        // Arrange
        final Integer[] ExpectedArray = {1, 2, 3, 4, 5, 6, 8, 9, 12};
        // Act
        Integer[] TestArray = testNumberQueue.stream()
                .sorted()
                .toArray(Integer[]::new);
        // Assert
        assertArrayEquals(ExpectedArray, TestArray);
    }
   }
