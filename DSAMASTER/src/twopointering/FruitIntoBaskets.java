package twopointering;

import java.util.*;

public class FruitIntoBaskets {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> count = new HashMap<>();
        int left = 0, best = 0;
        for (int right = 0; right < fruits.length; right++) {
            count.merge(fruits[right], 1, Integer::sum);
            while (count.size() > 2) {
                count.merge(fruits[left], -1, Integer::sum);
                if (count.get(fruits[left]) == 0) count.remove(fruits[left]);
                left++;
            }
            best = Math.max(best, right - left + 1);
        }
        return best;
    }
}
