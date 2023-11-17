package edu.igor.hw19.Ex1;

import java.util.Collection;
public class CollectionUtils {

    // Метод для підрахунку кількості елементів колекції, які мають певну властивість
    public static <T> int countElementsWithProperty(Collection<T> collection, PropertyChecker<T> propertyChecker) {
        int count = 0;
        for (T element : collection) {
            if (propertyChecker.checkProperty(element)) {
                count++;
            }
        }
        return count;
    }
    // Метод для перевірки, чи є число простим
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Метод для перевірки, чи є число паліндромом
    public static boolean isPalindrome(String str) {
        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int length = cleanStr.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleanStr.charAt(i) != cleanStr.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    // Метод для перевірки, чи є число непарним
    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }
}
