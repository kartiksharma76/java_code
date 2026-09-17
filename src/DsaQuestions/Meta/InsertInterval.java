package DsaQuestions.Meta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {

    public static int[][] insert(
            int[][] intervals,
            int[] newInterval) {

        List<int[]> result = new ArrayList<>();

        int i = 0;

        // 1. Add intervals before new interval
        while (i < intervals.length &&
                intervals[i][1] < newInterval[0]) {

            result.add(intervals[i]);
            i++;
        }

        // 2. Merge overlapping intervals
        while (i < intervals.length &&
                intervals[i][0] <= newInterval[1]) {

            newInterval[0] =
                    Math.min(newInterval[0], intervals[i][0]);

            newInterval[1] =
                    Math.max(newInterval[1], intervals[i][1]);

            i++;
        }

        // Add merged interval
        result.add(newInterval);

        // 3. Add remaining intervals
        while (i < intervals.length) {

            result.add(intervals[i]);
            i++;
        }

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {

        int[][] intervals = {
                {1, 3},
                {6, 9}
        };

        int[] newInterval = {2, 5};

        int[][] result =
                insert(intervals, newInterval);

        for (int[] interval : result) {
            System.out.println(
                    Arrays.toString(interval)
            );
        }
    }
}