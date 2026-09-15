package greedyapproach;

import java.util.*;

public class CourseScheduleIII {
    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses, (a, b) -> a[1] - b[1]);
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int time = 0;
        for (int[] c : courses) {
            int duration = c[0], deadline = c[1];
            time += duration;
            maxHeap.add(duration);
            if (time > deadline) {
                time -= maxHeap.poll();
            }
        }
        return maxHeap.size();
    }
}
