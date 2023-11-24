package edu.igor.hw21;

@FunctionalInterface
interface ExpressionPrinter<T> {
    void print(T result);
}
