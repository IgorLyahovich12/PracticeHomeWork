package View.src;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankQueue {
    private final BlockingDeque<Customer> customerQueue = new LinkedBlockingDeque<>();
    // LOCK для забезпечення синхронізованого доступу  черги.
    private final Lock lock = new ReentrantLock();
    // Умова (Condition) для синхронізації потоків.
    private final Condition customerAvailable = lock.newCondition();
    public void enqueue(Customer customer) {
        // Захоплення LOCK перед доступом до  черги.
        lock.lock();
        try {
            customerQueue.add(customer);
            System.out.println("Customer enqueued. Queue size: " + customerQueue.size());
            // Сповіщення інших потоків, що новий клієнт доступний.
            customerAvailable.signal();
        } finally {
            // Звільнення LOCK після виконання операцій з  чергою.
            lock.unlock();
        }
    }

    public Customer dequeue() {
        // Захоплення LOCK перед доступом до  черги.
        lock.lock();
        try {
            while (customerQueue.isEmpty()) {
                try {
                    customerAvailable.await(); // Звільнення LOCK та чекання сигналу.
                } catch (InterruptedException e) {
                    // Обробка винятку, якщо потік був перерваний під час чекання.
                    Thread.currentThread().interrupt();
                    e.printStackTrace();
                }
            }
            // Видалення та отримання наступного клієнта з черги.
            Customer nextCustomer = customerQueue.poll();
            System.out.println("Customer dequeued. Queue size: " + customerQueue.size());
            return nextCustomer;
        } finally {
            // Звільнення LOCK після виконання операцій з  чергою.
            lock.unlock();
        }
    }
    public int size(){
        return customerQueue.size();

    }

}
