package twopointering;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1, best = 0;
        while (i < j) {
            int area = Math.min(height[i], height[j]) * (j - i);
            best = Math.max(best, area);
            if (height[i] < height[j]) i++;
            else j--;
        }
        return best;
    }
}
