package greedyapproach;

import java.util.*;

public class MinArrowsToBurstBalloons {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) return 0;
        Arrays.sort(points, (a, b) -> Long.compare(a[1], b[1]));
        int arrows = 1;
        long end = points[0][1];
        for (int[] p : points) {
            if (p[0] > end) { arrows++; end = p[1]; }
        }
        return arrows;
    }
}
