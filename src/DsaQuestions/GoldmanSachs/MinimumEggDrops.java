package DsaQuestions.GoldmanSachs;

public class MinimumEggDrops {

    public static int eggDrop(int eggs, int floors) {

        // No floor = 0 attempts
        if (floors == 0 || floors == 1) {
            return floors;
        }

        // One egg means we have to
        // check every floor sequentially
        if (eggs == 1) {
            return floors;
        }

        int[][] dp = new int[eggs + 1][floors + 1];

        // With 0 floors, 0 attempts
        for (int e = 1; e <= eggs; e++) {
            dp[e][0] = 0;
        }

        // With 1 floor, 1 attempt
        for (int e = 1; e <= eggs; e++) {
            dp[e][1] = 1;
        }

        // With 1 egg
        for (int f = 1; f <= floors; f++) {
            dp[1][f] = f;
        }

        // Calculate for every egg count
        // and floor count
        for (int e = 2; e <= eggs; e++) {

            for (int f = 2; f <= floors; f++) {

                dp[e][f] = Integer.MAX_VALUE;

                // Try dropping egg from
                // every possible floor
                for (int x = 1; x <= f; x++) {

                    int eggBreaks = dp[e - 1][x - 1];

                    int eggSurvives = dp[e][f - x];

                    int worstCase = Math.max(eggBreaks, eggSurvives);

                    int attempts = 1 + worstCase;

                    dp[e][f] = Math.min(dp[e][f], attempts);
                }
            }
        }

        return dp[eggs][floors];
    }

    public static void main(String[] args) {

        int eggs = 2;
        int floors = 10;

        int result = eggDrop(eggs, floors);

        System.out.println("Minimum Egg Drops = " + result);
    }
}