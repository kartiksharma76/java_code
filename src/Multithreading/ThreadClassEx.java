package Multithreading;


class MyThread1 extends Thread {

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

public class ThreadClassEx {
    public static void main(String[] args) {
        MyThread1 t = new MyThread1();
        t.start();

    }
}