package DsaQuestions.Amazon;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class NextGreaterElement  {
    public static int[] nextGreater(int[] arr){
        int n = arr.length;
        int [] ans = new int[n];
        Arrays.fill(ans,-1);

        Deque<Integer> stack = new ArrayDeque<>();

        for(int i = 0; i < n; i++){
            while(!stack.isEmpty() && arr[i] > arr[stack.peek()]){
                ans[stack.peek()] = arr[i];
                stack.pop();
            }
            stack.push(i);
        }
        return  ans;
    }

    public static void main(String[] args) {
        int[]arr = {4,5,2,25};
        System.out.println(
                Arrays.toString(nextGreater(arr)));
    }
}
