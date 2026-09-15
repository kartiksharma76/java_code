package heapss;

import java.util.*;

public class TaskScheduler {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for (char t : tasks) freq[t - 'A']++;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int f : freq) if (f > 0) maxHeap.add(f);

        int time = 0;
        Queue<int[]> cooldown = new LinkedList<>(); // [count, availableTime]
        while (!maxHeap.isEmpty() || !cooldown.isEmpty()) {
            time++;
            if (!maxHeap.isEmpty()) {
                int cnt = maxHeap.poll() - 1;
                if (cnt > 0) cooldown.add(new int[]{cnt, time + n});
            }
            if (!cooldown.isEmpty() && cooldown.peek()[1] == time) {
                maxHeap.add(cooldown.poll()[0]);
            }
        }
        return time;
    }
}
