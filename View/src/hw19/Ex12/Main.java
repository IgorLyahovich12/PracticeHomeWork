package View.src.hw19.Ex12;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Оголошення списку цілих чисел
        List<Integer> integerList = List.of(12, 9, 12, 16, 20, 34, 29, 16, 17);

        // Оголошення діапазону для пошуку
        int begin = 0;
        int end = integerList.size();

        // Виклик методу findFirst з використанням лямбда-виразу
        Integer result = findFirst(integerList, begin, end, x ->
                gcd(x, 13) == 1  //  з яким ви хочете перевірити взаємну простоту
        );

        // Виведення результату
        System.out.println(result);
    }

    // Оголошення методу findFirst
    public static <T> T findFirst(List<T> list, int begin, int end, UnaryPredicate<T> p) {
        for (int i = begin; i < end; i++) {
            if (p.test(list.get(i))) {
                return list.get(i);
            }
        }
        return null;
    }

    // Оголошення функції для знаходження найбільшого спільного дільника (GCD)
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}