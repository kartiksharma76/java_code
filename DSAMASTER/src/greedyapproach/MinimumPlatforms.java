package greedyapproach;

import java.util.*;

public class MinimumPlatforms {
    public int findPlatform(int[] arrival, int[] departure) {
        int[] arr = arrival.clone(), dep = departure.clone();
        Arrays.sort(arr);
        Arrays.sort(dep);
        int platforms = 0, maxPlatforms = 0;
        int i = 0, j = 0;
        while (i < arr.length && j < dep.length) {
            if (arr[i] <= dep[j]) { platforms++; i++; maxPlatforms = Math.max(maxPlatforms, platforms); }
            else { platforms--; j++; }
        }
        return maxPlatforms;
    }
}
