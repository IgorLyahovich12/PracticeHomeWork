package edu.igor.hw19.Ex10;

public class Ex10 {
    //10. Дано наступні класи
    //class shape { /* ... */ }
    //class Circle extends shape { /* ... */ }
    //class Rectangle extends Shape { /* ... */ }
    //class Node { /* ... */ }
    //Чи компілюватиметься наведений нижче код? Якщо ні, то чому?
    //Node nc = new Node<>();
    //Node ns = nc;
    //Не скомпілюється тому , що Node не може приймати різні типи
    //class Shape { /* ... */ }
    //class Circle extends Shape { /* ... */ }
    //class Rectangle extends Shape { /* ... */ }
    //class Node<T> { /* ... */ }
    //Node<Circle> nc = new Node<>();
    //Node<Shape> ns = nc;  // Тепер це буде правильно скомпільовано
}
