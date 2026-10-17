package Multithreading;

class NameThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread Name: " + Thread.currentThread().getName());

        System.out.println("Thread Priority: " + Thread.currentThread().getPriority());
    }
}

public class ThreadNamePriority {
    public static void main(String[] args) {
        NameThread t = new NameThread();
        t.setName("JavaThread");
        t.setPriority(Thread.MAX_PRIORITY);
        t.start();
    }
}
