package hw19.Ex2;

public class Main {
    public static void main(String[] args) {
        Integer intResult = Algorithm.max(5, 10);
        System.out.println("Max of 5 and 10: " + intResult);

        Double doubleResult = Algorithm.max(3.14, 2.71);
        System.out.println("Max of 3.14 and 2.71: " + doubleResult);

        String stringResult = Algorithm.max("apple", "orange");
        System.out.println("Max of 'apple' and 'orange': " + stringResult);
    }
}