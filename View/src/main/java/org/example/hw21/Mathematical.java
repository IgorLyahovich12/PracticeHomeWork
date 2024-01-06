package org.example.hw21;

@FunctionalInterface
interface Mathematical<T> {
    T operate(T a, T b);
}
