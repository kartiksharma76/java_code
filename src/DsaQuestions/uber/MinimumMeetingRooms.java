package DsaQuestions.uber;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MinimumMeetingRooms {
    public static int minMeetingRooms(int[][] meetings) {
        if (meetings == null || meetings.length == 0) {
            return 0;
        }
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int[] meeting : meetings) {

            int start = meeting[0];
            int end = meeting[1];

            // If earliest meeting has ended,
            // reuse that room
            if (!minHeap.isEmpty() && minHeap.peek() <= start) {

                minHeap.poll();
            }

            // Add current meeting's end time
            minHeap.offer(end);
        }
        return minHeap.size();

    }

    public static void main(String[] args) {

        int[][] meetings = {{0, 30}, {5, 10}, {15, 20}};

        int result = minMeetingRooms(meetings);

        System.out.println("Minimum Meeting Rooms = " + result);
    }

}
