package NumberPrograms;

public class PrintPrimeNumInRange {
    public static void main(String[] args) {
        int start = 1;
        int end = 50;

        for (int num = start; num <= end; num++) {
            if (num < 2) {
                continue;
            }
            boolean isPrime = true;
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(num + " ");
            }
        }
    }
}
