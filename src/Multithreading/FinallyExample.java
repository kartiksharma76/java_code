package Multithreading;

class FinallyThread extends Thread {

    @Override
    public void run() {

        try {
            System.out.println("Thread started");
            Thread.sleep(1000);
            System.out.println("Thread is running");

        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
            Thread.currentThread().interrupt();

        } finally {
            System.out.println("Finally block executed");
        }
    }
}

public class FinallyExample {
    public static void main(String[] args) {
        FinallyThread t = new FinallyThread();
        t.start();
    }
}