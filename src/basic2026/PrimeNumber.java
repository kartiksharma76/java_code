package basic2026;


public class PrimeNumber {
    public static void main(String[] args) {
        int n = 29;
        boolean prime = n >= 2;

        for (int i = 2; i <= n / i; i++) {
            if (n % i == 0) {
                        prime = false;
                break;
            }
        }

        System.out.println(prime ? "Prime" : "Not prime");
    }
}
