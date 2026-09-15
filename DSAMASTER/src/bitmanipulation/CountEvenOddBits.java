package bitmanipulation;

public class CountEvenOddBits {
    public int[] evenOddBitCount(int n) {
        int even = 0, odd = 0;
        int pos = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                if (pos % 2 == 0) even++;
                else odd++;
            }
            n >>= 1;
            pos++;
        }
        return new int[]{even, odd};
    }
}
