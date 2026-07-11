package twopointering;

import java.util.*;

public class MinConsecutiveCardsToPickUp {
    public int minimumCardPickup(int[] cards) {
        Map<Integer, Integer> lastIndex = new HashMap<>();
        int best = Integer.MAX_VALUE;
        for (int i = 0; i < cards.length; i++) {
            if (lastIndex.containsKey(cards[i])) {
                best = Math.min(best, i - lastIndex.get(cards[i]) + 1);
            }
            lastIndex.put(cards[i], i);
        }
        return best == Integer.MAX_VALUE ? -1 : best;
    }
}
