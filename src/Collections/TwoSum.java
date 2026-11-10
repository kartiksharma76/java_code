package Collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[]arr , int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i< arr.length; i++){
            int remaining = target - arr[i];
            if (map.containsKey(remaining)){
                return new int[]{
                        map.get(remaining),i
                };
            }
            map.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[]arr = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }

}
