
package BasicCodingQuestion.Arrycodingquestions;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};

        int j = 0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }

        int[] result = Arrays.copyOf(arr, j + 1);

        System.out.println(Arrays.toString(result));
    }
}
