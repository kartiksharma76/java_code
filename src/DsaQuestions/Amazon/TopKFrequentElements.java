package DsaQuestions.Amazon;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    public static int[] topKFrequent(int[] nums, int k){
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int num : nums){
            freq.put(
                    num,
                    freq.getOrDefault(num, 0) + 1
            );
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> freq.get(a) - freq.get(b));

        for(int num : freq.keySet()){
            minHeap.offer(num);
            if(minHeap.size() > k ){
                minHeap.poll();
            }
        }
        int[] result = new int[k];
        for(int i = k - 1; i >= 0; i--){
            result[i] = minHeap.poll();
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(nums,k)));
    }
}
