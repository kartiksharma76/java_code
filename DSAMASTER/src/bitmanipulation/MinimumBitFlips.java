package bitmanipulation;

public class MinimumBitFlips {
    public int minBitFlips(int start, int goal) {
        int xorVal = start ^ goal;
        return Integer.bitCount(xorVal);
    }
}
