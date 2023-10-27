package edu.igor.hw11;

public class Main {
    public static void main(String[] args) {
        String mainString = "Python Exercises";
        String subString = "se";

        boolean endsWith = checkIfEndsWith(mainString, subString);

        System.out.println("\"" + mainString + "\" закінчується на \"" + subString + "\" // " + endsWith);
    }

    public static boolean checkIfEndsWith(String mainString, String subString) {
        // Використовуємо метод endsWith для перевірки закінчення строки підстрокою
        return mainString.endsWith(subString);
    }
}
