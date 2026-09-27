package DsaQuestions.uber;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class WeightedRandomSelection {

    private final long[] prefixSum;
    private final long totalWeight;

    public WeightedRandomSelection(int[] weights) {

        prefixSum = new long[weights.length];

        long sum = 0;

        for (int i = 0; i < weights.length; i++) {

            if (weights[i] <= 0) {
                throw new IllegalArgumentException("Weight must be positive");
            }

            sum += weights[i];

            prefixSum[i] = sum;
        }

        totalWeight = sum;
    }

    public static void main(String[] args) {

        int[] weights = {1, 3, 6};

        WeightedRandomSelection obj = new WeightedRandomSelection(weights);

        System.out.println("Weights: " + Arrays.toString(weights));

        System.out.println("Randomly selected index:");

        for (int i = 0; i < 10; i++) {

            System.out.println(obj.pickIndex());
        }
    }

    public int pickIndex() {

        long target = ThreadLocalRandom.current().nextLong(totalWeight) + 1;

        // Find first prefixSum >= target
        int left = 0;
        int right = prefixSum.length - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (prefixSum[mid] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}