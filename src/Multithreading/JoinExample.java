package Multithreading;

class MyJoinThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread: " + i);
        }
    }
}

public class JoinExample {
    public static void main(String[] args) {
        MyJoinThread t = new MyJoinThread();
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
            Thread.currentThread().interrupt();
        }
        System.out.println("Main thread completed");
    }
}
