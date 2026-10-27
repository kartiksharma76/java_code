package DsaQuestions.Hardestproblem;


import java.util.Arrays;

public class JobScheduling {

    public static int jobScheduling(int[] startTime, int[] endTime, int[] profit) {

        int n = startTime.length;
        Job[] jobs = new Job[n];

        for (int i = 0; i < n; i++) {
            jobs[i] = new Job(startTime[i], endTime[i], profit[i]);
        }

        Arrays.sort(jobs, (a, b) -> Integer.compare(a.start, b.start));

        int[] starts = new int[n];
        for (int i = 0; i < n; i++) {
            starts[i] = jobs[i].start;
        }

        int[] dp = new int[n + 1];

        for (int i = n - 1; i >= 0; i--) {
            int next = lowerBound(starts, jobs[i].end, i + 1);

            int take = jobs[i].profit + dp[next];
            int skip = dp[i + 1];

            dp[i] = Math.max(take, skip);
        }

        return dp[0];
    }

    // First index >= target, searching only from 'from'
    private static int lowerBound(int[] arr, int target, int from) {

        int left = from, right = arr.length;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        int[] start = {1, 2, 3, 3};
        int[] end = {3, 4, 5, 6};
        int[] profit = {50, 10, 40, 70};

        System.out.println(jobScheduling(start, end, profit));
        // Output: 120
    }

    static class Job {
        int start, end, profit;

        Job(int start, int end, int profit) {
            this.start = start;
            this.end = end;
            this.profit = profit;
        }
    }
}
