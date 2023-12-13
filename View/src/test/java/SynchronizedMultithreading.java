package View.src.test.java;
public class SynchronizedMultithreading {
    private int count = 1;

    public static void main(String[] args) {
        SynchronizedMultithreading synchronizedMultithreading = new SynchronizedMultithreading();

        // Створення потоків
        Thread thread1 = new Thread(synchronizedMultithreading.new NumberPrinter());
        Thread thread2 = new Thread(synchronizedMultithreading.new NumberPrinter());

        // Запуск потоків
        thread1.start();
        thread2.start();
    }

    private class NumberPrinter implements Runnable {
        @Override
        public void run() {
            // Синхронізація за допомогою блоку
            synchronized (SynchronizedMultithreading.this) {
                // Цикл для друку чисел від 1 до 10
                for (int i = 0; i < 10; i++) {
                    // Друк числа та збільшення
                    System.out.println(Thread.currentThread().getName() + ": " + count++);
                    try {
                        // Очікування іншого потоку
                        SynchronizedMultithreading.this.notify();
                        SynchronizedMultithreading.this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                SynchronizedMultithreading.this.notify();
            }
        }
    }
}
