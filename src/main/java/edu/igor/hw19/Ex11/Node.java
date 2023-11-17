package edu.igor.hw19.Ex11;

//public class Node<T> implements Comparable<T>{
//   public int compareTo(T obg) {
/* Проблема полягає в тому, що інтерфейс Comparable<T> реалізований у класі Node<T>, а не самому T. */
//Node реалізує Comparable<Node<T>>, оскільки ми порівнюємо екземпляри Node.

   //..
   Node<String> node =new Node<>();
   Comparable<String> comp=node;

