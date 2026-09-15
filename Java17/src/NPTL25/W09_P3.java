package NPTL25;

import java.util.Scanner;

class SquareThread extends Thread {
    private int begin;
    private int end;

    public SquareThread(int begin, int end) {
        this.begin = begin;
        this.end = end;
    }

    @Override
    public synchronized void run() {
        // If begin > end, print squares in reverse order from begin to end
        if (begin > end) {
            for (int i = begin; i >= end; i--) {
                System.out.println(i * i);
            }
        } else { // Otherwise, print squares from begin to end
            for (int i = begin; i <= end; i++) {
                System.out.println(i * i);
            }
        }
    }
}

public class W09_P3 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int begin = scanner.nextInt();
        int end = scanner.nextInt();
        scanner.close();

        SquareThread thread1 = new SquareThread(begin, end);
        SquareThread thread2 = new SquareThread(end, begin);

        thread1.start();
        thread2.start();
    }
}
