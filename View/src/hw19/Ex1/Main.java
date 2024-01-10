package View.src.hw19.Ex1;
import java.util.Collection;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        // Приклад колекції цілих чисел
        Collection<Integer> integerCollection = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Використання методів для підрахунку кількості простих чисел, паліндромів та непарних чисел
        int primeNumbersCount = CollectionUtils.countElementsWithProperty(integerCollection, CollectionUtils::isPrime);
        int palindromeCount = CollectionUtils.countElementsWithProperty(integerCollection, number -> CollectionUtils.isPalindrome(Integer.toString(number)));
        int oddNumbersCount = CollectionUtils.countElementsWithProperty(integerCollection, CollectionUtils::isOdd);

        System.out.println("Кількість простих чисел: " + primeNumbersCount);
        System.out.println("Кількість паліндромів: " + palindromeCount);
        System.out.println("Кількість непарних чисел: " + oddNumbersCount);
    }
}