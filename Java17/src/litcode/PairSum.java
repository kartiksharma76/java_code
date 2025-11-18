package litcode;

import java.util.*;

public class PairSum {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 5, 6, 7, 8, 9};
        int target = 10;
        Set<Integer> seen = new HashSet<>();

        for (int n : arr) {
            int complement = target - n;
            if (seen.contains(complement))
                System.out.println("(" + complement + ", " + n + ")");
            seen.add(n);
        }
    }
}
