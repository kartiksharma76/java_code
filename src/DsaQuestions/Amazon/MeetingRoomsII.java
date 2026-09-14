package DsaQuestions.Amazon;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MeetingRoomsII {
    public static int minMeetingRooms(
            int[][] intervals) {

        if (intervals.length == 0) {
            return 0;
        }
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int[] interval : intervals) {
            if (!minHeap.isEmpty()
                    && minHeap.peek() <= interval[0]) {

                minHeap.poll();
            }
            minHeap.offer(interval[1]);
        }
        return  minHeap.size();
    }

    public static void main(String[] args) {
        int[][] intervals = {
                {0, 30},
                {5, 10},
                {15, 20}
        };
        System.out.println(minMeetingRooms(intervals));
    }
}
