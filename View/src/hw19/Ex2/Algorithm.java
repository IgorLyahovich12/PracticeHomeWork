package View.src.hw19.Ex2;

public final class Algorithm {
    //Код не скомпілюється
//    public static <T> T max(T x,T y){
//        return x > y ? x : y;
    // Використання оператора порівняння > для типу T може стати проблемою,
    // адже не всі типи даних можуть мати визначене порівняння
    // і тому оператор порівняння може викликати помилку
    // Для  правильності порівняння об'єктів типу T  використовувати потрібно compareTo


    public static <T extends Comparable<T>> T max(T x, T y) {
        return x.compareTo(y) > 0 ? x : y;
    }

}
