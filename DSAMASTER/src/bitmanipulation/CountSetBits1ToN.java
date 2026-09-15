package bitmanipulation;

public class CountSetBits1ToN {
    public int countSetBits(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) count += Integer.bitCount(i);
        return count;
    }

    // O(log n) approach
    public long countSetBitsFast(long n) {
        long count = 0;
        for (long bit = 1; bit <= n; bit <<= 1) {
            long groupSize = bit << 1;
            long fullGroups = (n + 1) / groupSize;
            count += fullGroups * bit;
            long remainder = (n + 1) % groupSize;
            count += Math.max(0, remainder - bit);
        }
        return count;
    }
}
