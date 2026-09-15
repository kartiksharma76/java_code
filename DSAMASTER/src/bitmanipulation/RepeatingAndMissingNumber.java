package bitmanipulation;

// Find the repeating and missing number using XOR
public class RepeatingAndMissingNumber {
    public int[] findRepeatingAndMissing(int[] arr) {
        int n = arr.length;
        int xorAll = 0;
        for (int a : arr) xorAll ^= a;
        for (int i = 1; i <= n; i++) xorAll ^= i;

        int diffBit = xorAll & (-xorAll);
        int x = 0, y = 0;
        for (int a : arr) {
            if ((a & diffBit) != 0) x ^= a; else y ^= a;
        }
        for (int i = 1; i <= n; i++) {
            if ((i & diffBit) != 0) x ^= i; else y ^= i;
        }
        // determine which of x,y is the repeating number
        int countX = 0;
        for (int a : arr) if (a == x) countX++;
        if (countX > 0) return new int[]{x, y}; // {repeating, missing}
        return new int[]{y, x};
    }
}
