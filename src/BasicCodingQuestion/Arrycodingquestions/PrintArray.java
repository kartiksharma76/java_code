package BasicCodingQuestion.Arrycodingquestions;

public class PrintArray {
    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 9};
        for (int x : arr)
            System.out.print(x + " ");
        System.out.println(java.util.Arrays.toString(arr));
    }
}
