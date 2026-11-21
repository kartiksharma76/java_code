package BasicCodingQuestion.Arrycodingquestions;

public class RotateArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int k = 2 % a.length;
        reverse(a, 0, a.length - 1);
        reverse(a, 0, k - 1);
        reverse(a, k, a.length - 1);
        System.out.println(java.util.Arrays.toString(a));
    }

    static void reverse(int[] a, int i, int j) {
        while (i < j) {
            int t = a[i];
            a[i++] = a[j];
            a[j--] = t;
        }
    }
}
