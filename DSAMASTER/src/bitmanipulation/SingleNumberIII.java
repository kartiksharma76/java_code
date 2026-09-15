package bitmanipulation;

// Single Number III - two elements appear once, rest appear twice
public class SingleNumberIII {
    public int[] singleNumber(int[] nums) {
        int xorAll = 0;
        for (int n : nums) xorAll ^= n;
        int diffBit = xorAll & (-xorAll);
        int a = 0, b = 0;
        for (int n : nums) {
            if ((n & diffBit) != 0) a ^= n; else b ^= n;
        }
        return new int[]{a, b};
    }
}
