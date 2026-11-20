package BasicCodingQuestion.Arrycodingquestions;

public class MaxAndMin {
    public static void main(String[] args) {
        int[] arr = {4, 9, 2, 7};

        int max = arr[0], min = arr[0];
        for (int x : arr) {
            if (x > max) max = x;
            if (x < min) min = x;
        }
        System.out.println(" max : " +  max + " " + "min : " + min);
    }
}
