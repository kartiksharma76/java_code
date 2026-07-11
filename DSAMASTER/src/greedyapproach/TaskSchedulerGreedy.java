package greedyapproach;

// Task Scheduler (Greedy formula-based approach)
public class TaskSchedulerGreedy {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for (char t : tasks) freq[t - 'A']++;
        int maxFreq = 0;
        for (int f : freq) maxFreq = Math.max(maxFreq, f);
        int maxCount = 0;
        for (int f : freq) if (f == maxFreq) maxCount++;

        int formula = (maxFreq - 1) * (n + 1) + maxCount;
        return Math.max(formula, tasks.length);
    }
}
