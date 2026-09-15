package twopointering;

// Maximum Points You Can Obtain from Cards
public class MaxPointsFromCards {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int windowSize = n - k;
        int total = 0;
        for (int c : cardPoints) total += c;
        if (windowSize == 0) return total;
        int windowSum = 0;
        for (int i = 0; i < windowSize; i++) windowSum += cardPoints[i];
        int minWindow = windowSum;
        for (int i = windowSize; i < n; i++) {
            windowSum += cardPoints[i] - cardPoints[i - windowSize];
            minWindow = Math.min(minWindow, windowSum);
        }
        return total - minWindow;
    }
}
