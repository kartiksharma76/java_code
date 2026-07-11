package prefisxsum;

public class FindHighestAltitude {
    public int largestAltitude(int[] gain) {
        int cur = 0, max = 0;
        for (int g : gain) {
            cur += g;
            max = Math.max(max, cur);
        }
        return max;
    }
}
