package View.src.test.java;
public class BasicMultithreading {
    private int count = 1;  // Змінна для зберігання поточного числа

    public static void main(String[] args) {
        BasicMultithreading basicMultithreading = new BasicMultithreading();

        // Створення потоків
        Thread thread1 = new Thread(basicMultithreading.new NumberPrinter());
        Thread thread2 = new Thread(basicMultithreading.new NumberPrinter());

        // Запуск потоків
        thread1.start();
        thread2.start();
    }

    private class NumberPrinter implements Runnable {
        @Override
        public void run() {
            // Цикл для друку чисел від 1 до 10
            for (int i = 0; i < 10; i++) {
                // Друк числа та збільшення
                System.out.println(Thread.currentThread().getName() + ": " + count++);
                try {
                    //  для  паралельного виконання
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}