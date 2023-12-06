package hw19.Ex10;



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
    //Node< Circle> nc = new Node<>();
    //Node<extends Shape> ns = nc;
    // не скомпілюється  оголошення Node<extends Shape>
    // очікує  будь-який підтип Shape, а не конкретний підтип,
    // такий як Circle. Таке присвоєння не безпечне, і тому код не компілюється.

    Node<Circle> nc = new Node<>();
    Node<? extends Shape> ns = nc;
    //<? extends Shape>, дозволяє вказати, що ns - це Node з параметром типу, який є або Shape, або його підтипом
}