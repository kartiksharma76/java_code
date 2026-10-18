package basic2026;


public class Fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1;

        for (int i = 1; i <= 10; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}

