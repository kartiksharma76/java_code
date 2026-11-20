package AdvanceThreading;

public class AlternatingPrinting {
    Object lock = new Object();
    private int max = 0;
    private int number = 1;

    public AlternatingPrinting(int max) {
        this.max = max;
    }

    public static void main(String[] args) {
        int n = 10;
        AlternatingPrinting printer = new AlternatingPrinting(n);
        Thread oddThread = new Thread(printer::printOdd);
        Thread evenThread = new Thread(printer::printEven);
        oddThread.start();
        evenThread.start();

    }

    public void printOdd() {
        synchronized (lock) {
            while (number <= max) {
                if (number % 2 == 1) {
                    System.out.println("threadOdd:" + number++);
                    lock.notifyAll();
                } else {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        e.printStackTrace();
                    }
                }
            }
            lock.notifyAll();
        }
    }

    public void printEven() {
        synchronized (lock) {
            while (number <= max) {
                if (number % 2 == 0) {
                    System.out.println("ThreadEven: " + number++);
                    lock.notifyAll();
                } else {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
            lock.notifyAll();
        }

    }
}
