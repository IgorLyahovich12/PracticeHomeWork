package edu.igor.hw19.Ex10;



public class Ex10 {

    static class Shape {
    }

    static class Circle extends Shape {
    }

    static class Rectangle extends Shape {
    }

    static class Node<T> {
    }


    //Чи компілюватиметься наведений нижче код? Якщо ні, то чому?
    Node< Circle> nc = new Node<>();
    //Node<extends Shape> ns = nc;
    }
    //Node<Circle> nc = new Node<>();
    //Node<? extends Shape> ns = nc;