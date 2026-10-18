package basic2026;


public class ReverseNumber {
    public static void main(String[] args) {
        int n = 12345;
        int reverse = 0;

        while (n != 0) {
            reverse = reverse * 10 + n % 10;
            n /= 10;
        }

        System.out.println(reverse);
    }
}
