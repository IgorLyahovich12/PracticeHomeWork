package View.src;


public class BankWindow implements Runnable {
    private final int windowNumber;
    private final BankQueue bankQueue;

    public BankWindow(int windowNumber, BankQueue bankQueue) {
        this.windowNumber = windowNumber;
        this.bankQueue = bankQueue;
    }

    @Override
    public void run() {
        while (bankQueue.size()>0) {
            serveNextCustomer();

        }
    }
    private void serveNextCustomer() {
        Customer nextCustomer = bankQueue.dequeue();
        if (nextCustomer != null) {
            System.out.println("Window " + windowNumber + " serving next customer: " + nextCustomer);
        } else {
            System.out.println("Window " + windowNumber + " is idle. No customer to serve.");
        }
    }
}

