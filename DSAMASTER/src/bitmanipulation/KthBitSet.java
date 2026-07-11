package bitmanipulation;

public class KthBitSet {
    public boolean isKthBitSet(int n, int k) {
        return ((n >> (k - 1)) & 1) == 1;
    }
}
