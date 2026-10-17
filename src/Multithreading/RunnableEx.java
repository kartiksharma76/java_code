package Multithreading;

class MyTask implements Runnable {

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}

public class RunnableEx {
    public static void main(String[] args) {
        Thread t = new Thread(new MyTask());
        t.start();
        t.run();
    }
}