
package BasicCodingQuestion.Arrycodingquestions;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {

        int[] a = {1, 4, 7};
        int[] b = {2, 3, 9};

        int[] r = new int[a.length + b.length];

        int i = 0, j = 0, k = 0;

        // Compare elements of both arrays
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                r[k++] = a[i++];
            } else {
                r[k++] = b[j++];
            }
        }

        // Copy remaining elements of array a
        while (i < a.length) {
            r[k++] = a[i++];
        }

        // Copy remaining elements of array b
        while (j < b.length) {
            r[k++] = b[j++];
        }

        System.out.println(Arrays.toString(r));
    }
}
