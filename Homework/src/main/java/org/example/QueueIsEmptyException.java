package org.example;


public class QueueIsEmptyException extends Throwable {
    public QueueIsEmptyException(String message) {
        super(message);
    }
}
