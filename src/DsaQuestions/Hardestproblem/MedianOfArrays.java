package DsaQuestions.Hardestproblem;

public class MedianOfArrays {
    public static double findMedian(int[] a, int[] b) {
        if (a.length > b.length) {
            return findMedian(b, a);
        }
        int m = a.length, n = b.length;
        int low = 0, high = m;

        while (low <= high) {
            int i = low + (high - low) / 2;
            int j = (m + n + 1) / 2 - i;

            int leftA = i == 0 ? Integer.MIN_VALUE : a[i - 1];
            int rightA = i == m ? Integer.MAX_VALUE : a[i];

            int leftB = j == 0 ? Integer.MIN_VALUE : b[j - 1];
            int rightB = j == n ? Integer.MAX_VALUE : b[j];

            if (leftA <= rightB && leftB <= rightA) {
                if ((m + n) % 2 == 1) {
                    return Math.max(leftA, leftB);
                }
                return ((double) Math.max(leftA, leftB) + Math.min(rightA, rightB)) / 2.0;

            }
            if (leftA > rightB) {
                high = i - 1;
            } else {
                low = i + 1;
            }
        }
        throw new IllegalArgumentException("Arrays must be sorted and not both empty");
    }

    public static void main(String[] args) {
        System.out.println(findMedian(new int[]{1, 3}, new int[]{2}));
    }
}
