package bitmanipulation;

// Bleak Numbers - a number that cannot be represented as sum of a positive number and its set bit count
public class BleakNumbers {
    public boolean isBleak(int n) {
        for (int i = 1; i <= n; i++) {
            if (i + Integer.bitCount(i) == n) return false;
        }
        return true;
    }
}
