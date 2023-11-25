package edu.igor.hw19.Ex11;

public class Node<T extends Comparable<T>> implements Comparable<T> {
   private T value;

   public Node(T value) {
      this.value = value;
   }

   public T getValue() {
      return value;
   }

   @Override
   public int compareTo(T obj) {
      return this.value.compareTo(obj);
   }
}