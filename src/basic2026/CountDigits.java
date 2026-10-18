package basic2026;


public class CountDigits {
    public static void main(String[] args) {
        int n = 12345;
        int count = 0;

        do {
            count++;
            n /= 10;
        } while (n != 0);

        System.out.println(count);
    }
}
