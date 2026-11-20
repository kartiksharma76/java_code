package BasicCodingQuestion.Arrycodingquestions;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            int t = arr[start];
            arr[start] = arr[end];
            arr[end] = t;

            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
