package View.src;

public class Customer  {
    // У класі Customer визначені два поля: ідентифікатор клієнта та час обслуговування.
    private final int customerId;
    private final long serviceTime;

    // Конструктор класу, який ініціалізує поля при створенні об'єкта класу Customer.
    public Customer(int customerId, long serviceTime) {
        this.customerId = customerId;
        this.serviceTime = serviceTime;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", serviceTime=" + serviceTime +
                '}';
    }



}